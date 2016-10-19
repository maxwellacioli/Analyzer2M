package syntactic;

import java.util.ArrayList;
import java.util.Stack;

import syntactic.grammar.Grammar;
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
	private Stack<Symbol> operatorsStack;
	private Token endOfSentence;
	private Terminal currentTerm;
	private PrecedenceTable precedenceTable;
	private int paramCount = 0;
	private int arrayCount = 0;

	private Terminal stackTerm;
	private Terminal tapeTerm;

	public PrecedenceAnalyzer(LexicalAnalyzer lexicalAnalyzer) {
		this.lexicalAnalyzer = lexicalAnalyzer;
		operatorsStack = new Stack<Symbol>();
		precedenceTable = PrecedenceTable.getInstance();
	}

	public Token getEndOfSentence() {
		return endOfSentence;
	}

	private void checkEndOfSentence(Token terminal) {
		if (!OperatorsGrammar.getInstance().getOperatorsGrammarSymbols().contains(terminal.getCategory())) {
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

	private int getIndexOfTerminalSymbol(Terminal terminal) {
		return OperatorsGrammar.getInstance().getOperatorsGrammarSymbols().indexOf(terminal.getCategory());
	}

	private void handlerError() {
		System.err.println("Handler invalido para reducao!");
		System.exit(1);
	}

	public boolean precedenceAnalysis(Token token) {
		int tableValue;
		int tableAux;
		int count = 1;
		endOfSentence = null;
		operatorsStack.removeAllElements();

		checkEndOfSentence(token);

		System.out.println();
		while (true) {
			// Se pv e eof no cabeçote => Aceita!

			if ((operatorsStack.size() == 1) && !operatorsStack.peek().isTerminal() && (endOfSentence != null)) {
				System.out.println();
				return true;
			} else {
				if (((operatorsStack.size() == 1) && !operatorsStack.peek().isTerminal()) || (endOfSentence != null)
						|| operatorsStack.isEmpty()) {
					tableAux = OperatorsGrammar.getInstance().getOperatorsGrammarSymbols().size();

					// Se pv e terminal no cabeçote
					if (operatorsStack.isEmpty()
							|| ((operatorsStack.size() == 1) && !operatorsStack.peek().isTerminal())) {
						tapeTerm = new Terminal(token);

						tableValue = precedenceTable.getPrecedenceTableList().get(tableAux)
								.get(getIndexOfTerminalSymbol(tapeTerm));

					} // Se terminal no top da pilha e eof no cabeçote
					else {
						if (!operatorsStack.peek().isTerminal()) {
							stackTerm = (Terminal) operatorsStack.elementAt(operatorsStack.size() - 2);
						} else {
							stackTerm = (Terminal) operatorsStack.peek();
						}

						tableValue = precedenceTable.getPrecedenceTableList().get(getIndexOfTerminalSymbol(stackTerm))
								.get(tableAux);
					}
					// end
				} else {
					if (!operatorsStack.peek().isTerminal()) {
						stackTerm = (Terminal) operatorsStack.elementAt(operatorsStack.size() - 2);
					} else {
						stackTerm = (Terminal) operatorsStack.peek();
					}

					tableValue = precedenceTable.getPrecedenceTableList().get(getIndexOfTerminalSymbol(stackTerm))
							.get(getIndexOfTerminalSymbol(new Terminal(token)));

				}

				// Verificação da ação

				if (tableValue == PrecedenceTable.ELT) { // Ação ELT

					operatorsStack.push(new Terminal(token));

					if (lexicalAnalyzer.hasMoreTokens()) {
						token = lexicalAnalyzer.nextToken();
					}
					checkEndOfSentence(token);

				} else if (tableValue > PrecedenceTable.ELT) { // Ação Reduz

					// Se a produção for 10(9), sera necessario 2 ações pop para
					// tirar o '(' e ')'
					// referente a produção EXPRESSION = PARAMBEGIN EXPRESSION
					// PARAMEND

					if (tableValue >= PrecedenceTable.R11 && tableValue <= PrecedenceTable.R16) {
//						if (operatorsStack.peek().isTerminal()) {
//							if (tableValue == PrecedenceTable.R16) {
								currentTerm = (Terminal) operatorsStack.pop();
//							} else {
//								operatorsStack.pop();
//							}
//						}
						operatorsStack.push(new NonTerminal(NonTerminalName.EXPRESSION));
					} else if (tableValue == PrecedenceTable.R7 || tableValue == PrecedenceTable.R8) {
						if (!operatorsStack.peek().isTerminal()) {
							if (operatorsStack.elementAt(operatorsStack.size() - 2).isTerminal()) {
								operatorsStack.pop();
								operatorsStack.pop();
								operatorsStack.push(new NonTerminal(NonTerminalName.EXPRESSION));
							} else {
								handlerError();
							}
						}
					} else if (tableValue == PrecedenceTable.R17) {
						if (operatorsStack.peek().isTerminal()) {
							if (!operatorsStack.elementAt(operatorsStack.size() - 2).isTerminal()) {
								if (operatorsStack.elementAt(operatorsStack.size() - 3).isTerminal()) {
									if (operatorsStack.elementAt(operatorsStack.size() - 4).isTerminal()) {
										operatorsStack.pop();
										operatorsStack.pop();
										operatorsStack.pop();
										operatorsStack.pop();
										operatorsStack.push(new NonTerminal(NonTerminalName.EXPRESSION));
									} else {
										handlerError();
									}
								} else {
									handlerError();
								}
							} else {
								handlerError();
							}
						} else {
							handlerError();
						}
					} else if (tableValue == PrecedenceTable.R10) {
						if (operatorsStack.size() > 3
								&& (operatorsStack.elementAt(operatorsStack.size() - 4).isTerminal())) {
							Terminal termAux = (Terminal) operatorsStack.elementAt(operatorsStack.size() - 4);

							if (termAux.getCategory() == TokenCategory.ID) {
								tableValue = PrecedenceTable.R18;
							}
						}
						if (operatorsStack.peek().isTerminal()) {
							if (!operatorsStack.elementAt(operatorsStack.size() - 2).isTerminal()) {
								if (operatorsStack.elementAt(operatorsStack.size() - 3).isTerminal()) {
									operatorsStack.pop();
									operatorsStack.pop();
									operatorsStack.pop();

									// Caso seja R18 desempilha o id no indice
									// topo -4
									if (tableValue == PrecedenceTable.R18) {
										currentTerm = ((Terminal) operatorsStack.pop());
									}

									operatorsStack.push(new NonTerminal(NonTerminalName.EXPRESSION));
								} else {
									handlerError();
								}
							} else {
								handlerError();
							}
						} else {
							handlerError();
						}
					} else {
						if (!operatorsStack.peek().isTerminal()) {
							if (operatorsStack.elementAt(operatorsStack.size() - 2).isTerminal()) {
								if ((operatorsStack.size() > 2)
										&& !operatorsStack.elementAt(operatorsStack.size() - 3).isTerminal()) {
									operatorsStack.pop();
									operatorsStack.pop();
									operatorsStack.pop();
									operatorsStack.push(new NonTerminal(NonTerminalName.EXPRESSION));
								} else {
									handlerError();
								}
							} else {
								handlerError();
							}
						} else {
							handlerError();
						}
					}
					
					ArrayList<Symbol> derivation = OperatorsGrammar.getInstance().getOperatorDerivation(tableValue - 1)
							.getSymbolsList();
					TokenCategory term;
					NonTerminal nonTerm;

					System.out.print(NonTerminalName.EXPRESSION + "(" + count++ + ")" + " = ");

					for (Symbol symbol : derivation) {
						if (symbol.isTerminal()) {
							term = ((Terminal) symbol).getCategory();
							if (term.getCategoryValue() >= TokenCategory.CONSTNUMINT.getCategoryValue()
									&& term.getCategoryValue() <= TokenCategory.CONSTCCHAR.getCategoryValue()
									|| term.equals(TokenCategory.ID)) {
								System.out.print(term + "(" + "\"" + currentTerm.getTerminalValue() + "\"" + ")" + " ");
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
