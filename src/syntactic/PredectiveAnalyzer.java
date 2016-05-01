package syntactic;

import java.util.Stack;

import syntactic.grammar.Grammar;
import syntactic.grammar.Symbol;
import lexical.LexicalAnalyzer;

public class PredectiveAnalyzer {
	private Grammar grammar;
	private PredectiveTable predectiveTable;
	private Stack stack;
	
	public PredectiveAnalyzer(Grammar grammar, PredectiveTable predectiveTable) {
		this.grammar = grammar;
		this.predectiveTable = predectiveTable;
		stack = new Stack<Symbol>();
	}
	
}
