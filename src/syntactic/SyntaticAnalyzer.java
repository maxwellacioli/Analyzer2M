package syntactic;

import lexical.LexicalAnalyzer;
import lexical.Token;

public class SyntaticAnalyzer {
	private Token token;
	private LexicalAnalyzer lexicalAnalyzer;
	private Grammar grammar;
	private PredectiveAnalyzer predectiveAnalyzer;
	private PredectiveTable predectiveTable;
	
	public SyntaticAnalyzer(LexicalAnalyzer lexicalAnalyzer) {
		
		this.lexicalAnalyzer = lexicalAnalyzer;
		token = new Token();
		grammar = new Grammar();
		predectiveTable = new PredectiveTable();
		predectiveAnalyzer = new PredectiveAnalyzer(grammar, predectiveTable);
	}

	public void analyze() {
		
		token = lexicalAnalyzer.nextToken();
		System.out.println(token.getCategory());
		
	}


	
	
}
