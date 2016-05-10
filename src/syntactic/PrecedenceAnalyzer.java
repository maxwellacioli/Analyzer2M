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
			// Se pv e eof no cabe�ote > Aceita!
			if (operatorsStack.isEmpty() && (endOfSentence != null)) {
				System.out.println();
				return true;
			} else {
				if (operatorsStack.isEmpty() || (endOfSentence != null)) {
					tableAux = OperatorsGrammar.getInstance()
							.getOperatorsGrammarSymbols().size();

					// Se pv e terminal no cabe�ote
					if (operatorsStack.isEmpty()) {
						tableValue = precedenceTable.getPrecedenceTableList()
								.get(tableAux)
								.get(getIndexOfTerminalSymbol(token));

					} // Se terminal no top da pilha e eof no cabe�ote
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

				// Verifica��o da a��o

				if (tableValue == 0) { // A��o ELT

					operatorsStack.push(token);

					if (lexicalAnalyzer.hasMoreTokens()) {
						token = lexicalAnalyzer.nextToken();
					}
					checkEndOfSentence(token);

				} else if (tableValue > 0) { // A��o Reduz

					// Se a produ��o for 10(9), sera necessario 2 a��es pop para
					// tirar o '(' e ')'
					// referente a produ��o EXPRESSION = PARAMBEGIN EXPRESSION
					// PARAMEND
					if (tableValue != 10) {
						currentToken = operatorsStack.pop();
					} else {
						operatorsStack.pop();
						operatorsStack.pop();
					}

					ArrayList<Symbol> derivation = OperatorsGrammar
							.getInstance()
							.getOperatorDerivation(tableValue - 1)
							.getSymbolsList();
					Terminal term;
					NonTerminal nonTerm;

					System.out.print(NonTerminalName.EXPRESSION + "(" + count++
							+ ")" + " = ");

					for (Symbol symbol : derivation) {
						if (symbol.isTerminal()) {
							term = (Terminal) symbol;
							if (tableValue >= 11 && tableValue <= 16) {
								System.out.print(term.getCategory() + "("
										+ "\"" + currentToken.getValue() + "\""
										+ ")" + " ");
							} else {

								System.out.print(term.getCategory() + " ");
							}
						} else {
							nonTerm = (NonTerminal) symbol;
							System.out.print(nonTerm.getName() + " ");
						}
					}
					System.out.println();

				} else { // A��o ERRO
					SyntaticAnalyzer.printError(token);
					System.exit(1);
				}
			}
		}
	}
}
