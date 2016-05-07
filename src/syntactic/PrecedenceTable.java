package syntactic;

import java.util.ArrayList;
import java.util.List;

import lexical.TokenCategory;
import syntactic.grammar.OperatorsGrammar;

public class PrecedenceTable {
	private OperatorsGrammar operatorsGrammar;
	private ArrayList<Integer> lineTable;
	private ArrayList<ArrayList<Integer>> precedenceTableList;
	private static PrecedenceTable precedenceTableSingleton;
	public static final int AC = 100;

	private PrecedenceTable() {
		operatorsGrammar = OperatorsGrammar.getInstance();
		lineTable = new ArrayList<Integer>();
		precedenceTableList = new ArrayList<ArrayList<Integer>>();

		loadTable();
	}

	public static PrecedenceTable getInstance() {
		if (precedenceTableSingleton == null) {
			precedenceTableSingleton = new PrecedenceTable();
		}
		return precedenceTableSingleton;
	}

	public ArrayList<ArrayList<Integer>> getPrecedenceTableList() {
		return precedenceTableList;
	}

	public OperatorsGrammar getOperatorsGrammar() {
		return operatorsGrammar;
	}

	private void loadTable() {

		// Relação 'oparitadit' x (todos os terminais)
		lineTable.add(5);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(5);
		lineTable.add(5);
		lineTable.add(5);
		lineTable.add(5);
		lineTable.add(5);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(5);
		precedenceTableList.add(lineTable);
		lineTable = new ArrayList<Integer>();

		// Relação 'oparitmul' x (todos os terminais)
		lineTable.add(6);
		lineTable.add(6);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(6);
		lineTable.add(6);
		lineTable.add(6);
		lineTable.add(6);
		lineTable.add(6);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(6);
		precedenceTableList.add(lineTable);
		lineTable = new ArrayList<Integer>();

		// Relação 'oparitexp' x (todos os terminais)
		lineTable.add(9);
		lineTable.add(9);
		lineTable.add(0);
		lineTable.add(9);
		lineTable.add(9);
		lineTable.add(0);
		lineTable.add(9);
		lineTable.add(9);
		lineTable.add(9);
		lineTable.add(9);
		lineTable.add(9);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(9);
		precedenceTableList.add(lineTable);
		lineTable = new ArrayList<Integer>();

		// Relação 'opnegun' x (todos os terminais)
		lineTable.add(7);
		lineTable.add(7);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(7);
		lineTable.add(7);
		lineTable.add(7);
		lineTable.add(7);
		lineTable.add(7);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(7);
		precedenceTableList.add(lineTable);
		lineTable = new ArrayList<Integer>();

		// Relação 'opneglogic' x (todos os terminais)
		lineTable.add(8);
		lineTable.add(8);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(8);
		lineTable.add(8);
		lineTable.add(8);
		lineTable.add(8);
		lineTable.add(8);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(8);
		precedenceTableList.add(lineTable);
		lineTable = new ArrayList<Integer>();

		// Relação 'parambegin' x (todos os terminais)
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(-1);
		precedenceTableList.add(lineTable);
		lineTable = new ArrayList<Integer>();

		// Relação 'paramend' x (todos os terminais)
		lineTable.add(10);
		lineTable.add(10);
		lineTable.add(10);
		lineTable.add(10);
		lineTable.add(10);
		lineTable.add(-1);
		lineTable.add(10);
		lineTable.add(10);
		lineTable.add(10);
		lineTable.add(10);
		lineTable.add(10);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(10);
		precedenceTableList.add(lineTable);
		lineTable = new ArrayList<Integer>();

		// Relação 'oplogicor' x (todos os terminais)
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(1);
		lineTable.add(1);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(1);
		precedenceTableList.add(lineTable);
		lineTable = new ArrayList<Integer>();

		// Relação 'oplogicand' x (todos os terminais)
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(2);
		lineTable.add(2);
		lineTable.add(2);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(2);
		precedenceTableList.add(lineTable);
		lineTable = new ArrayList<Integer>();

		// Relação 'oprel1' x (todos os terminais)
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(4);
		lineTable.add(4);
		lineTable.add(4);
		lineTable.add(4);
		lineTable.add(4);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(4);
		precedenceTableList.add(lineTable);
		lineTable = new ArrayList<Integer>();

		// Relação 'oprel2' x (todos os terminais)
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(3);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(3);
		lineTable.add(3);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(3);
		precedenceTableList.add(lineTable);
		lineTable = new ArrayList<Integer>();

		// Relação 'constnumint' x (todos os terminais)
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(-1);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(11);
		precedenceTableList.add(lineTable);
		lineTable = new ArrayList<Integer>();

		// Relação 'constnumdec' x (todos os terminais)
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(-1);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(11);
		precedenceTableList.add(lineTable);
		lineTable = new ArrayList<Integer>();

		// Relação 'constlogic' x (todos os terminais)
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(-1);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(11);
		precedenceTableList.add(lineTable);
		lineTable = new ArrayList<Integer>();

		// Relação 'constchar' x (todos os terminais)
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(-1);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(11);
		precedenceTableList.add(lineTable);
		lineTable = new ArrayList<Integer>();

		// Relação 'constcchar' x (todos os terminais)
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(-1);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(11);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(11);
		precedenceTableList.add(lineTable);
		lineTable = new ArrayList<Integer>();

		// Relação 'id' x (todos os terminais)
		lineTable.add(12);
		lineTable.add(12);
		lineTable.add(12);
		lineTable.add(12);
		lineTable.add(12);
		lineTable.add(-1);
		lineTable.add(12);
		lineTable.add(12);
		lineTable.add(12);
		lineTable.add(12);
		lineTable.add(12);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(-1);
		lineTable.add(12);
		precedenceTableList.add(lineTable);
		lineTable = new ArrayList<Integer>();

		// Relação 'pilha vazia' x (todos os terminais)
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(-1);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(0);
		lineTable.add(100);
		precedenceTableList.add(lineTable);
		lineTable = new ArrayList<Integer>();
	}
}
