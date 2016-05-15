package syntactic;

import syntactic.grammar.Grammar;
import lexical.LexicalAnalyzer;
import lexical.Token;

public class SyntaticAnalyzer {

	private Grammar grammar;
	private PredictiveAnalyzer predictiveAnalyzer;
	private PredictiveTable predictiveTable;

	public SyntaticAnalyzer(LexicalAnalyzer lexicalAnalyzer) {

		grammar = Grammar.getInstance();
		predictiveTable = new PredictiveTable();
		predictiveAnalyzer = new PredictiveAnalyzer(grammar, predictiveTable,
				lexicalAnalyzer);

		// TEST
		// printTokens(lexicalAnalyzer);

	}

	// TEST
	private void printTokens(LexicalAnalyzer lexicalAnalyzer) {
		Token token;
		while (lexicalAnalyzer.hasMoreTokens()) {
			token = lexicalAnalyzer.nextToken();
			System.out.println(token.toString());
		}
		System.out.println();
		System.out.println();
		lexicalAnalyzer.readFile();
	}

	public void analyze() {
		predictiveAnalyzer.predictiveAnalyze();
	}

	public static void printError(Token token) {
		System.err.println("Erro no token " + token.getCategory() + "("
				+ token.getValue() + ")," + " na linha " + token.getLine()
				+ " e coluna " + token.getColumn() + ".");
	}
}
