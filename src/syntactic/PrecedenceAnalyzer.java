package syntactic;

import java.util.ArrayList;
import java.util.Stack;

import syntactic.grammar.NonTerminal;
import syntactic.grammar.NonTerminalName;
import syntactic.grammar.OperatorsGrammar;
import syntactic.grammar.Symbol;
import syntactic.grammar.Terminal;
import lexical.LexicalAnalyzer;
import lexical.Token;
import lexical.TokenCategory;

public class PrecedenceAnalyzer {
	private LexicalAnalyzer lexicalAnalyzer;
	private Stack<Token> operatorsStack;
	private Token endOfSentence;
	private Token currentToken;
	private PrecedenceTable precedenceTable;
	private int paramCount = 0;
	private int arrayCount = 0;

	public PrecedenceAnalyzer(LexicalAnalyzer lexicalAnalyzer) {
		this.lexicalAnalyzer = lexicalAnalyzer;
		operatorsStack = new Stack<Token>();
		precedenceTable = PrecedenceTable.getInstance();
	}

	public Token getEndOfSentence() {
		return endOfSentence;
	}

	private void checkEndOfSentence(Token terminal) {
		if (!OperatorsGrammar.getInstance().getOperatorsGrammarSymbols()
				.contains(terminal.getCategory())) {
			endOfSentence = terminal;
		} else if (terminal.getCategory().equals(TokenCategory.PARAMBEGIN)) {
			paramCount++;
		} else if (terminal.getCategory().equals(TokenCategory.PARAMEND)) {
			if (paramCount == 0) {
				endOfSentence = terminal;
			} else {
				paramCount--;
			}
		} else if (terminal.getCategory().equals(TokenCategory.ARRAYBEGIN)) {
			arrayCount++;
		} else if (terminal.getCategory().equals(TokenCategory.ARRAYEND)) {
			if (arrayCount == 0) {
				endOfSentence = terminal;
			} else {
				arrayCount--;
			}
		}
	}

	private int getIndexOfTerminalSymbol(Token terminal) {
		return OperatorsGrammar.getInstance().getOperatorsGrammarSymbols()
				.indexOf(terminal.getCategory());
	}

	public boolean precedenceAnalysis(Token token) {
		int tableValue;
		int tableAux;
		int count = 1;
		endOfSentence = null;

		checkEndOfSentence(token);

		System.out.println();
		while (true) {
			// Se pv e eof no cabeçote > Aceita!
			if (operatorsStack.isEmpty() && (endOfSentence != null)) {
				System.out.println();
				return true;
			} else {
				if (operatorsStack.isEmpty() || (endOfSentence != null)) {
					tableAux = OperatorsGrammar.getInstance()
							.getOperatorsGrammarSymbols().size();

					// Se pv e terminal no cabeçote
					if (operatorsStack.isEmpty()) {
						tableValue = precedenceTable.getPrecedenceTableList()
								.get(tableAux)
								.get(getIndexOfTerminalSymbol(token));

					} // Se terminal no top da pilha e eof no cabeçote
					else {
						tableValue = precedenceTable
								.getPrecedenceTableList()
								.get(getIndexOfTerminalSymbol(operatorsStack
										.peek())).get(tableAux);
					}
				} else {
					tableValue = precedenceTable
							.getPrecedenceTableList()
							.get(getIndexOfTerminalSymbol(operatorsStack.peek()))
							.get(getIndexOfTerminalSymbol(token));

				}

				// Verificação da ação

				if (tableValue == PrecedenceTable.ELT) { // Ação ELT

					operatorsStack.push(token);

					if (lexicalAnalyzer.hasMoreTokens()) {
						token = lexicalAnalyzer.nextToken();
					}
					checkEndOfSentence(token);

				} else if (tableValue > PrecedenceTable.ELT) { // Ação Reduz

					// Se a produção for 10(9), sera necessario 2 ações pop para
					// tirar o '(' e ')'
					// referente a produção EXPRESSION = PARAMBEGIN EXPRESSION
					// PARAMEND

					if (tableValue != PrecedenceTable.R10
							&& tableValue != PrecedenceTable.R17) {
						currentToken = operatorsStack.pop();
					} else {
						if (tableValue == PrecedenceTable.R10) {
							if (operatorsStack.size() >= 3) {
								if (operatorsStack
										.elementAt(operatorsStack.size() - 3)
										.getCategory().equals(TokenCategory.ID)) {
									tableValue = PrecedenceTable.R18;
								}
							}
						}

						operatorsStack.pop();
						operatorsStack.pop();
						if (tableValue == PrecedenceTable.R17
								|| tableValue == PrecedenceTable.R18) {
							currentToken = operatorsStack.pop();
						}
					}

					ArrayList<Symbol> derivation = OperatorsGrammar
							.getInstance()
							.getOperatorDerivation(tableValue - 1)
							.getSymbolsList();
					TokenCategory term;
					NonTerminal nonTerm;

					System.out.print(NonTerminalName.EXPRESSION + "(" + count++
							+ ")" + " = ");

					for (Symbol symbol : derivation) {
						if (symbol.isTerminal()) {
							term = ((Terminal) symbol).getCategory();
							if (term.getCategoryValue() >= TokenCategory.CONSTNUMINT
									.getCategoryValue()
									&& term.getCategoryValue() <= TokenCategory.CONSTCCHAR
											.getCategoryValue()
									|| term.equals(TokenCategory.ID)) {
								System.out.print(term + "(" + "\""
										+ currentToken.getValue() + "\"" + ")"
										+ " ");
							} else {

								System.out.print(term + " ");
							}
						} else {
							nonTerm = (NonTerminal) symbol;
							System.out.print(nonTerm.getName() + " ");
						}
					}
					System.out.println();

				} else { // Ação ERRO
					SyntaticAnalyzer.printError(token);
					System.exit(1);
				}
			}
		}
	}
}
