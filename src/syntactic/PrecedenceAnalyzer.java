package syntactic;

import java.util.ArrayList;
import java.util.Stack;

import analyzer.Analyzer2M;
import syntactic.grammar.Derivation;
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
	private Stack<Terminal> operatorsStack;
	private Terminal endOfSentence;
	private PrecedenceTable precedenceTable;
	private int paramCount = 0;
	private int tableValue;
	private Token currentToken;
	private int count = 1;

	public PrecedenceAnalyzer(LexicalAnalyzer lexicalAnalyzer) {
		this.lexicalAnalyzer = lexicalAnalyzer;
		operatorsStack = new Stack<Terminal>();
		precedenceTable = PrecedenceTable.getInstance();
		currentToken = new Token();
	}

	public Terminal getEndOfSentence() {
		return endOfSentence;
	}

	private void checkEndOfSentence(Terminal terminal) {
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

	private int getIndexOfTerminalSymbol(Terminal terminal) {
		return OperatorsGrammar.getInstance().getOperatorsGrammarSymbols()
				.indexOf(terminal.getCategory());
	}

	public boolean precedenceAnalysis(Terminal terminal) {
		int tableAux;
		endOfSentence = null;

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
								.get(getIndexOfTerminalSymbol(terminal));

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
							.get(getIndexOfTerminalSymbol(terminal));
				}

				// Verificação da ação

				if (tableValue == 0) { // Ação ELT

					operatorsStack.push(terminal);

					if (lexicalAnalyzer.hasMoreTokens()) {
						currentToken = lexicalAnalyzer.nextToken();
						terminal = new Terminal(currentToken.getCategory());
					}
					checkEndOfSentence(terminal);

				} else if (tableValue > 0) { // Ação Reduz

					operatorsStack.pop();

					ArrayList<Symbol> derivation = OperatorsGrammar
							.getInstance()
							.getOperatorDerivation(tableValue - 1)
							.getSymbolsList();
					Terminal term;
					NonTerminal nonTerm;

					System.out.print(NonTerminalName.EXPRESSION + " = ");

					for (Symbol symbol : derivation) {
						if (symbol.isTerminal()) {
							term = (Terminal) symbol;
							System.out.print(term.getCategory() + " ");
						} else {
							nonTerm = (NonTerminal) symbol;
							System.out.print(nonTerm.getName() + " ");
						}
					}
					System.out.println();

				} else { // Ação ERRO
					SyntaticAnalyzer.printError(currentToken);
					System.exit(1);
				}
			}
		}
	}
}
