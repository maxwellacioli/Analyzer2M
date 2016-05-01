package syntactic;

import syntactic.grammar.Grammar;
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
		grammar = Grammar.getInstance();
		predectiveTable = new PredectiveTable();
		predectiveAnalyzer = new PredectiveAnalyzer(grammar, predectiveTable);
	}

	public void analyze() {
		
		
//		for (Symbol symbol : grammar.getGrammarMap().get(75).getSymbolsList()) {
//			System.out.println(symbol);
//		}
		
//		token = lexicalAnalyzer.nextToken();
//		System.out.println(token.getCategory());
		
	}


	
	
}
