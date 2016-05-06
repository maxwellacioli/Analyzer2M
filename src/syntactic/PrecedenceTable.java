package syntactic;

import java.util.ArrayList;
import java.util.List;

import lexical.TokenCategory;
import syntactic.grammar.OperatorsGrammar;

public class PrecedenceTable {
	private OperatorsGrammar operatorsGrammar;
	private List<Integer> precedenceTableLine;
	private List<ArrayList<Integer>> precedenceTableColumn;

	public PrecedenceTable() {
		operatorsGrammar = OperatorsGrammar.getInstance();
		precedenceTableLine = new ArrayList<Integer>();
		precedenceTableColumn = new ArrayList<ArrayList<Integer>>();

		loadTable();
	}

	private void loadTable() {
		// precedenceTableLine.add(5);

	}

}
