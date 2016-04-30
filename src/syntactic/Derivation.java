package syntactic;

import java.util.ArrayList;

public class Derivation {
	private int derivationNumber;
	private ArrayList<Symbol> derivation;

	public Derivation(int derivationNumbe) {
		derivation = new ArrayList<Symbol>();
		this.derivationNumber = derivationNumbe;
	}

	public int getDerivationNumber() {
		return derivationNumber;
	}

	public void setDerivationNumber(int derivationNumber) {
		this.derivationNumber = derivationNumber;
	}
	
	public void clearDerivationList() {
		derivation.clear();
	}

	public void addSymbol(Symbol symb1) {
		derivation.add(symb1);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2) {
		derivation.add(symb1);
		derivation.add(symb2);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3) {
		derivation.add(symb1);
		derivation.add(symb2);
		derivation.add(symb3);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3, Symbol symb4) {
		derivation.add(symb1);
		derivation.add(symb2);
		derivation.add(symb3);
		derivation.add(symb4);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3,
			Symbol symb4, Symbol symb5) {
		derivation.add(symb1);
		derivation.add(symb2);
		derivation.add(symb3);
		derivation.add(symb4);
		derivation.add(symb5);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3,
			Symbol symb4, Symbol symb5, Symbol symb6) {
		derivation.add(symb1);
		derivation.add(symb2);
		derivation.add(symb3);
		derivation.add(symb4);
		derivation.add(symb5);
		derivation.add(symb6);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3,
			Symbol symb4, Symbol symb5, Symbol symb6, Symbol symb7) {
		derivation.add(symb1);
		derivation.add(symb2);
		derivation.add(symb3);
		derivation.add(symb4);
		derivation.add(symb5);
		derivation.add(symb6);
		derivation.add(symb7);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3,
			Symbol symb4, Symbol symb5, Symbol symb6, Symbol symb7, Symbol symb8) {
		derivation.add(symb1);
		derivation.add(symb2);
		derivation.add(symb3);
		derivation.add(symb4);
		derivation.add(symb5);
		derivation.add(symb6);
		derivation.add(symb7);
		derivation.add(symb8);
	}
}
