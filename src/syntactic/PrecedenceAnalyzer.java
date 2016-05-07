package syntactic;

import java.util.Stack;

import syntactic.grammar.OperatorsGrammar;
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

	public PrecedenceAnalyzer(LexicalAnalyzer lexicalAnalyzer) {
		this.lexicalAnalyzer = lexicalAnalyzer;
		operatorsStack = new Stack<Terminal>();
		precedenceTable = PrecedenceTable.getInstance();
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

		while (true) {
			// Se pv e eof no cabeçote > Aceita!
			if (operatorsStack.isEmpty() && (endOfSentence != null)) {
				System.out.println("ACEITA");
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
						terminal = new Terminal(lexicalAnalyzer.nextToken()
								.getCategory());
					}
					checkEndOfSentence(terminal);

				} else if (tableValue > 0) { // Ação Reduz

					operatorsStack.pop();

				} else { // Ação ERRO
					System.out.println("Erro na linha no token "
							+ terminal.getCategory() + "!");
					System.exit(1);
				}
			}
		}
	}
}
