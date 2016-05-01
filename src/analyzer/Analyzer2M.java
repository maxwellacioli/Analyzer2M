package analyzer;


import lexical.LexicalAnalyzer;
import lexical.Token;
import syntactic.SyntaticAnalyzer;

public class Analyzer2M {
	private static LexicalAnalyzer lexicalAnalyzer;
	private static SyntaticAnalyzer syntaticAnalyzer;

	private static String filePath = "files/hello.2m";

	public Analyzer2M() {

	}

	public static void main(String[] args) {

		Token token;

		lexicalAnalyzer = new LexicalAnalyzer();
		syntaticAnalyzer = new SyntaticAnalyzer();

		lexicalAnalyzer.readFile(filePath);

		while (lexicalAnalyzer.hasMoreTokens()) {
			token = lexicalAnalyzer.nextToken();
			//TODO usar analisador sintatico
			if (token != null) {
				System.out.println(token);
			}
		}
	}
}
