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

		// Rela��o 'oparitadit' x (todos os terminais)
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

		// Rela��o 'oparitmul' x (todos os terminais)
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

		// Rela��o 'oparitexp' x (todos os terminais)
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

		// Rela��o 'opnegun' x (todos os terminais)
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

		// Rela��o 'opneglogic' x (todos os terminais)
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

		// Rela��o 'parambegin' x (todos os terminais)
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

		// Rela��o 'paramend' x (todos os terminais)
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

		// Rela��o 'oplogicor' x (todos os terminais)
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

		// Rela��o 'oplogicand' x (todos os terminais)
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

		// Rela��o 'oprel1' x (todos os terminais)
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

		// Rela��o 'oprel2' x (todos os terminais)
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

		// Rela��o 'constnumint' x (todos os terminais)
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

		// Rela��o 'constnumdec' x (todos os terminais)
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

		// Rela��o 'constlogic' x (todos os terminais)
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

		// Rela��o 'constchar' x (todos os terminais)
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

		// Rela��o 'constcchar' x (todos os terminais)
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

		// Rela��o 'id' x (todos os terminais)
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

		// Rela��o 'pilha vazia' x (todos os terminais)
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
