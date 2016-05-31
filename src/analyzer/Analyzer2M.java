package analyzer;


import lexical.LexicalAnalyzer;
import syntactic.SyntaticAnalyzer;

public class Analyzer2M {
	private static LexicalAnalyzer lexicalAnalyzer;
	private static SyntaticAnalyzer syntaticAnalyzer;

	private static String filePath = "files/input/hello.2m";

	public Analyzer2M() {

	}

	public static void main(String[] args) {

		lexicalAnalyzer = new LexicalAnalyzer(filePath);
		lexicalAnalyzer.readFile();
		
		syntaticAnalyzer = new SyntaticAnalyzer(lexicalAnalyzer);
		syntaticAnalyzer.analyze();
	}
}
