package syntactic;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import syntactic.grammar.Derivation;
import syntactic.grammar.DictionaryTokenTerminal;
import syntactic.grammar.Grammar;
import syntactic.grammar.NonTerminal;
import syntactic.grammar.NonTerminalName;
import syntactic.grammar.Symbol;
import syntactic.grammar.Terminal;
import syntactic.grammar.TerminalCategory;
import lexical.LexicalAnalyzer;
import lexical.Token;
import lexical.TokenCategory;

public class PredictiveAnalyzer {

	private Grammar grammar;
	private PredictiveTable predictiveTable;
	private LexicalAnalyzer lexicalAnalyzer;
	private DictionaryTokenTerminal dictionary;

	private Stack<Symbol> stack;
	private Derivation derivation;

	// TODO não passar referencia e sim chamar pela instancia singleton
	public PredictiveAnalyzer(Grammar grammar, PredictiveTable predictiveTable,
			LexicalAnalyzer lexicalAnalyzer) {

		this.grammar = grammar;
		this.predictiveTable = predictiveTable;
		this.lexicalAnalyzer = lexicalAnalyzer;

		dictionary = DictionaryTokenTerminal.getInstance();

		stack = new Stack<Symbol>();
		derivation = new Derivation();
	}

	public void predictiveAnalyze() {

		Symbol topSymbol;
		Token token = new Token();
		Terminal terminal;
		NonTerminal topNonTerminal;
		Integer derivationNumber;

		if (lexicalAnalyzer.hasMoreTokens()) {
			token = lexicalAnalyzer.nextToken();

			terminal = dictionary.getTerminal(token);
			stack.push(new NonTerminal(NonTerminalName.PROGRAM));

			while (!stack.isEmpty()) {

				topSymbol = stack.peek();

				if (topSymbol.isTerminal()) {

					if (topSymbol.getValue() == terminal.getValue()) {
						stack.pop();
						if (lexicalAnalyzer.hasMoreTokens()) {
							token = lexicalAnalyzer.nextToken();
							terminal = dictionary.getTerminal(token);
						}

					} else {
						System.out.println("ERROR!");
					}

				} else {

					topNonTerminal = (NonTerminal) topSymbol;
					derivationNumber = predictiveTable.getDerivationNumber(
							topNonTerminal.getName(), terminal.getCategory());

					if (derivationNumber != null) {
						derivation = grammar.getGrammarMap().get(
								derivationNumber);

						if (derivation != null) {
							System.out.print(topNonTerminal.getName() + " = ");
							stack.pop();
							// TO REMOVE
							Symbol symb;
							Terminal term;
							NonTerminal nonTerm;

							for (int i = derivation.getSymbolsList().size() - 1; i >= 0; i--) {

								symb = derivation.getSymbolsList().get(i);
								if (symb.isTerminal()) {
									term = (Terminal) symb;
									System.out.print(term.getCategory().toString().toLowerCase() + " ");
								} else {
									nonTerm = (NonTerminal) symb;
									System.out.print(nonTerm.getName() + " ");
								}

								stack.push(symb);
							}
							System.out.println();
						} else {
							System.out.println(topNonTerminal.getName() + " = Epsilon");
							stack.pop();
						}

					} else {
						System.out.println("ERROR");
					}
				}
			}
		}
	}
}
