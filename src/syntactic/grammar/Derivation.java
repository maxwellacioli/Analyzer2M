package syntactic.grammar;

import java.util.ArrayList;

public class Derivation {

	private ArrayList<Symbol> symbolsList;

	public ArrayList<Symbol> getSymbolsList() {
		return symbolsList;
	}

	public Derivation() {
		symbolsList = new ArrayList<Symbol>();
	}

	public void clearDerivationList() {
		symbolsList.clear();
	}

	public void addSymbol(Symbol symb1) {
		symbolsList.add(symb1);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2) {
		addSymbol(symb1);
		symbolsList.add(symb2);

	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3) {
		addDerivationSymbols(symb1, symb2);
		symbolsList.add(symb3);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3,
			Symbol symb4) {
		addDerivationSymbols(symb1, symb2, symb3);
		symbolsList.add(symb4);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3,
			Symbol symb4, Symbol symb5) {
		addDerivationSymbols(symb1, symb2, symb3, symb4);
		symbolsList.add(symb5);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3,
			Symbol symb4, Symbol symb5, Symbol symb6) {
		addDerivationSymbols(symb1, symb2, symb3, symb4, symb5);
		symbolsList.add(symb6);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3,
			Symbol symb4, Symbol symb5, Symbol symb6, Symbol symb7) {
		addDerivationSymbols(symb1, symb2, symb3, symb4, symb5, symb6);
		symbolsList.add(symb7);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3,
			Symbol symb4, Symbol symb5, Symbol symb6, Symbol symb7, Symbol symb8) {
		addDerivationSymbols(symb1, symb2, symb3, symb4, symb5, symb6, symb7);
		symbolsList.add(symb8);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3,
			Symbol symb4, Symbol symb5, Symbol symb6, Symbol symb7,
			Symbol symb8, Symbol symb9, Symbol symb10, Symbol symb11) {
		addDerivationSymbols(symb1, symb2, symb3, symb4, symb5, symb6, symb7,
				symb8);
		symbolsList.add(symb9);
		symbolsList.add(symb10);
		symbolsList.add(symb11);
	}

	public void addDerivationSymbols(Symbol symb1, Symbol symb2, Symbol symb3,
			Symbol symb4, Symbol symb5, Symbol symb6, Symbol symb7,
			Symbol symb8, Symbol symb9, Symbol symb10, Symbol symb11,
			Symbol symb12, Symbol symb13) {
		addDerivationSymbols(symb1, symb2, symb3, symb4, symb5, symb6, symb7,
				symb8, symb9, symb10, symb11);
		symbolsList.add(symb12);
		symbolsList.add(symb13);
	}

	public boolean isEmpty() {
		return symbolsList.isEmpty();
	}
}
