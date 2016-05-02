package syntactic;

import syntactic.grammar.DictionaryTokenTerminal;
import syntactic.grammar.Grammar;
import syntactic.grammar.NonTerminalName;
import syntactic.grammar.Symbol;
import syntactic.grammar.Terminal;
import syntactic.grammar.TerminalCategory;
import lexical.LexicalAnalyzer;
import lexical.Token;

public class SyntaticAnalyzer {

	private Grammar grammar;
	private DictionaryTokenTerminal dictionary;
	private PredictiveAnalyzer predictiveAnalyzer;
	private PredictiveTable predictiveTable;

	public SyntaticAnalyzer(LexicalAnalyzer lexicalAnalyzer) {

		grammar = Grammar.getInstance();
		dictionary = DictionaryTokenTerminal.getInstance();
		predictiveTable = new PredictiveTable();
		predictiveAnalyzer = new PredictiveAnalyzer(grammar, predictiveTable, lexicalAnalyzer);
		//printTokens(lexicalAnalyzer);
	}

	//TO REMOVE
	private void printTokens(LexicalAnalyzer lexicalAnalyzer) {
		Token token;
		while(lexicalAnalyzer.hasMoreTokens()) {
			token = lexicalAnalyzer.nextToken();
			System.out.print(token.getCategory() + " ");
		}
		System.out.println();
	}
	
	public void analyze() {
		
		predictiveAnalyzer.predictiveAnalyze();

		// for (Symbol symbol :
		// grammar.getGrammarMap().get(75).getSymbolsList()) {
		// System.out.println(symbol);
		// }

		// token = lexicalAnalyzer.nextToken();
		// System.out.println(token.getCategory());

	}
}
