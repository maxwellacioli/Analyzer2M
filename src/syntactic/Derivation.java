package syntactic;

import java.util.ArrayList;

public class Derivation {
	private ArrayList<Symbol> derivation;

	public Derivation(int derivationNumbe) {
		derivation = new ArrayList<Symbol>();
	}

	public void clearDerivationList() {
		derivation.clear();
	}

	public void addSymbol(Symbol symb1) {
		derivation.add(symb1);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2) {
		addSymbol(symb1);
		derivation.add(symb2);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3) {
		addDerivationSymbols(symb1, symb2);
		derivation.add(symb3);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3,
			Symbol symb4) {
		addDerivationSymbols(symb1, symb2, symb3);
		derivation.add(symb4);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3,
			Symbol symb4, Symbol symb5) {
		addDerivationSymbols(symb1, symb2, symb3, symb4);
		derivation.add(symb5);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3,
			Symbol symb4, Symbol symb5, Symbol symb6) {
		addDerivationSymbols(symb1, symb2, symb3, symb4, symb5);
		derivation.add(symb6);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3,
			Symbol symb4, Symbol symb5, Symbol symb6, Symbol symb7) {
		addDerivationSymbols(symb1, symb2, symb3, symb4, symb5, symb6, symb7);
		derivation.add(symb7);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3,
			Symbol symb4, Symbol symb5, Symbol symb6, Symbol symb7, Symbol symb8) {
		addDerivationSymbols(symb1, symb2, symb3, symb4, symb5, symb6, symb7);
		derivation.add(symb8);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3,
			Symbol symb4, Symbol symb5, Symbol symb6, Symbol symb7,
			Symbol symb8, Symbol symb9, Symbol symb10, Symbol symb11) {
		addDerivationSymbols(symb1, symb2, symb3, symb4, symb5, symb6, symb7,
				symb8);
		derivation.add(symb9);
		derivation.add(symb10);
		derivation.add(symb11);
	}

}
