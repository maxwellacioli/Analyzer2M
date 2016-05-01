package syntactic;

import lexical.LexicalAnalyzer;

public class PredectiveAnalyzer {
	private Grammar grammar;
	private PredectiveTable predectiveTable;
	
	public PredectiveAnalyzer(Grammar grammar, PredectiveTable predectiveTable) {
		this.grammar = grammar;
		this.predectiveTable = predectiveTable;
	}
	
}
