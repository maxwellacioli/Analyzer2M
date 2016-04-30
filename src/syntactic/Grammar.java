package syntactic;

import java.util.HashMap;

public class Grammar {
	private HashMap<Integer, Derivation> grammarMap;
	private Derivation derivationAux;

	public Grammar() {
		grammarMap = new HashMap<Integer, Derivation>();

		// (1)FUNCTIONS MAJORF
		derivationAux = new Derivation(1);
		derivationAux.addDerivationSymbols(new NonTerminal(
				NonTerminalName.FUNCTIONS), new NonTerminal(
				NonTerminalName.MAJORF));

		grammarPutDerivation(1, derivationAux);

		// (2)‘id’ PARAMS RETURNTYPE ESCOPE FUNCTIONS
		derivationAux.addDerivationSymbols(new Terminal(TerminalCategory.ID),
				new NonTerminal(NonTerminalName.PARAMS), new NonTerminal(
						NonTerminalName.RETURNTYPE), new NonTerminal(
						NonTerminalName.ESCOPE), new NonTerminal(
						NonTerminalName.FUNCTIONS));

		grammarPutDerivation(2, derivationAux);

		// (3)Epsilon
		grammarPutDerivation(3, null);

		// (4)‘major’ ‘paramBegin’ ‘paramEnd’ ‘tEmpty’ ESCOPE
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.MAJOR), new Terminal(
						TerminalCategory.PARAMBEGIN), new Terminal(
						TerminalCategory.PARAMEND), new Terminal(
						TerminalCategory.TEMPTY), new NonTerminal(
						NonTerminalName.ESCOPE));

		grammarPutDerivation(4, derivationAux);

		// (5)‘paramBegin’ PARAMSFAT
		derivationAux.addDerivationSymbols(new Terminal(
				TerminalCategory.PARAMBEGIN), new NonTerminal(
				NonTerminalName.PARAMSFAT));

		grammarPutDerivation(5, derivationAux);

		// (6)‘paramEnd’
		derivationAux.addSymbol(new Terminal(TerminalCategory.PARAMEND));
		grammarPutDerivation(6, derivationAux);

		// (7)LISTPARAMS ‘paramEnd’
		derivationAux.addDerivationSymbols(new NonTerminal(
				NonTerminalName.LISTPARAMS), new Terminal(
				TerminalCategory.PARAMEND));

		grammarPutDerivation(7, derivationAux);
	}

	private void grammarPutDerivation(int key, Derivation derivation) {
		grammarMap.put(key, derivation);
		derivation.clearDerivationList();
	}
}
