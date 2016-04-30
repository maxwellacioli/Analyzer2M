package syntactic;

import java.util.HashMap;

public class Grammar {
	private HashMap<Integer, Derivation> grammarMap;
	private Derivation derivationAux;

	public Grammar() {
		grammarMap = new HashMap<Integer, Derivation>();

		derivationAux = new Derivation(1);
		derivationAux.addDerivationSymbols(new NonTerminal(
				NonTerminalName.FUNCTIONS.getNonTerminalValue()),
				new NonTerminal(NonTerminalName.MAJORF.getNonTerminalValue()));

		grammarMap.put(1, derivationAux);

		derivationAux
				.addDerivationSymbols(
						new Terminal(TerminalCategory.ID.getTerminalCategory()),
						new NonTerminal(NonTerminalName.PARAMS
								.getNonTerminalValue()),
						new NonTerminal(NonTerminalName.RETURNTYPE
								.getNonTerminalValue()),
						new NonTerminal(NonTerminalName.ESCOPE
								.getNonTerminalValue()),
						new NonTerminal(NonTerminalName.FUNCTIONS
								.getNonTerminalValue()));

		putGrammarMapElem(2, derivationAux);
	}

	private void putGrammarMapElem(int key, Derivation derivation) {
		derivation.setDerivationNumber(key);
		grammarMap.put(key, derivation);
		derivation.clearDerivationList();
	}

}
