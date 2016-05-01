package syntactic;

import java.util.Stack;

import lexical.LexicalAnalyzer;
import lexical.Token;

public class SyntaticAnalyzer {
	private Token token;
	private LexicalAnalyzer lexicalAnalyzer;
	private String filePath = "file/hello.2m";
	private Grammar grammar;
	private PredectiveAnalyzer predectiveAnalyzer;
	private PredectiveTable predectiveTable;
	
	public SyntaticAnalyzer(LexicalAnalyzer lexicalAnalyzer) {
		
		this.lexicalAnalyzer = lexicalAnalyzer;
		grammar = new Grammar();
		predectiveTable = new PredectiveTable();
		predectiveAnalyzer = new PredectiveAnalyzer(grammar, predectiveTable);
		token = new Token();
		
	}


	
	
}
