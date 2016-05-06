package syntactic;

import java.util.HashMap;

import lexical.TokenCategory;
import syntactic.grammar.OperatorsGrammar;

public class PrecedenceTable {
	private OperatorsGrammar operatorsGrammar;
	private HashMap<TokenCategory, Integer> precedenceTableLine;
	private HashMap<TokenCategory, HashMap<TokenCategory, Integer>> precedenceTableColumn;

	public PrecedenceTable() {
		operatorsGrammar = OperatorsGrammar.getInstance();
		precedenceTableLine = new HashMap<TokenCategory, Integer>();
		precedenceTableColumn = new HashMap<TokenCategory, HashMap<TokenCategory, Integer>>();

		loadTable();
	}

	public OperatorsGrammar getOperatorsGrammar() {
		return operatorsGrammar;
	}
	
	private void loadTable() {
		// Linha 1
		precedenceTableLine.put(TokenCategory.OPARITADIT, 5);
		precedenceTableLine.put(TokenCategory.OPARITMULT, 0);
		precedenceTableLine.put(TokenCategory.OPARITEXP, 0);
		precedenceTableLine.put(TokenCategory.OPNEGUN, 0);
		precedenceTableLine.put(TokenCategory.OPNEGLOGIC, 0);
		precedenceTableLine.put(TokenCategory.PARAMBEGIN, 0);
		precedenceTableLine.put(TokenCategory.PARAMEND, 5);
		precedenceTableLine.put(TokenCategory.OPLOGICOR, 5);
		precedenceTableLine.put(TokenCategory.OPLOGICAND, 5);
		precedenceTableLine.put(TokenCategory.OPREL1, 5);
		precedenceTableLine.put(TokenCategory.OPREL2, 5);
		precedenceTableLine.put(TokenCategory.CONSTNUMINT, 0);
		precedenceTableLine.put(TokenCategory.CONSTNUMDEC, 0);
		precedenceTableLine.put(TokenCategory.CONSTLOGIC, 0);
		precedenceTableLine.put(TokenCategory.CONSTCHAR, 0);
		precedenceTableLine.put(TokenCategory.CONSTCCHAR, 0);
		precedenceTableLine.put(TokenCategory.ID, 0);
		precedenceTableLine.put(TokenCategory.UNKNOWN, 5);
		precedenceTableColumn
				.put(TokenCategory.OPARITADIT, precedenceTableLine);
		precedenceTableLine = new HashMap<TokenCategory, Integer>();

		// Linha 2
		precedenceTableLine.put(TokenCategory.OPARITADIT, 6);
		precedenceTableLine.put(TokenCategory.OPARITMULT, 6);
		precedenceTableLine.put(TokenCategory.OPARITEXP, 0);
		precedenceTableLine.put(TokenCategory.OPNEGUN, 0);
		precedenceTableLine.put(TokenCategory.OPNEGLOGIC, 0);
		precedenceTableLine.put(TokenCategory.PARAMBEGIN, 0);
		precedenceTableLine.put(TokenCategory.PARAMEND, 6);
		precedenceTableLine.put(TokenCategory.OPLOGICOR, 6);
		precedenceTableLine.put(TokenCategory.OPLOGICAND, 6);
		precedenceTableLine.put(TokenCategory.OPREL1, 6);
		precedenceTableLine.put(TokenCategory.OPREL2, 6);
		precedenceTableLine.put(TokenCategory.CONSTNUMINT, 0);
		precedenceTableLine.put(TokenCategory.CONSTNUMDEC, 0);
		precedenceTableLine.put(TokenCategory.CONSTLOGIC, 0);
		precedenceTableLine.put(TokenCategory.CONSTCHAR, 0);
		precedenceTableLine.put(TokenCategory.CONSTCCHAR, 0);
		precedenceTableLine.put(TokenCategory.ID, 0);
		precedenceTableLine.put(TokenCategory.UNKNOWN, 6);
		precedenceTableColumn
				.put(TokenCategory.OPARITMULT, precedenceTableLine);
		precedenceTableLine = new HashMap<TokenCategory, Integer>();

		// Linha 3
		precedenceTableLine.put(TokenCategory.OPARITADIT, 9);
		precedenceTableLine.put(TokenCategory.OPARITMULT, 9);
		precedenceTableLine.put(TokenCategory.OPARITEXP, 0);
		precedenceTableLine.put(TokenCategory.OPNEGUN, 9);
		precedenceTableLine.put(TokenCategory.OPNEGLOGIC, 9);
		precedenceTableLine.put(TokenCategory.PARAMBEGIN, 0);
		precedenceTableLine.put(TokenCategory.PARAMEND, 9);
		precedenceTableLine.put(TokenCategory.OPLOGICOR, 9);
		precedenceTableLine.put(TokenCategory.OPLOGICAND, 9);
		precedenceTableLine.put(TokenCategory.OPREL1, 9);
		precedenceTableLine.put(TokenCategory.OPREL2, 9);
		precedenceTableLine.put(TokenCategory.CONSTNUMINT, 0);
		precedenceTableLine.put(TokenCategory.CONSTNUMDEC, 0);
		precedenceTableLine.put(TokenCategory.CONSTLOGIC, 0);
		precedenceTableLine.put(TokenCategory.CONSTCHAR, 0);
		precedenceTableLine.put(TokenCategory.CONSTCCHAR, 0);
		precedenceTableLine.put(TokenCategory.ID, 0);
		precedenceTableLine.put(TokenCategory.UNKNOWN, 9);
		precedenceTableColumn.put(TokenCategory.OPARITEXP, precedenceTableLine);
		precedenceTableLine = new HashMap<TokenCategory, Integer>();

		// Linha 4
		precedenceTableLine.put(TokenCategory.OPARITADIT, 7);
		precedenceTableLine.put(TokenCategory.OPARITMULT, 7);
		precedenceTableLine.put(TokenCategory.OPARITEXP, 0);
		precedenceTableLine.put(TokenCategory.OPNEGUN, 0);
		precedenceTableLine.put(TokenCategory.OPNEGLOGIC, 0);
		precedenceTableLine.put(TokenCategory.PARAMBEGIN, 0);
		precedenceTableLine.put(TokenCategory.PARAMEND, 7);
		precedenceTableLine.put(TokenCategory.OPLOGICOR, 7);
		precedenceTableLine.put(TokenCategory.OPLOGICAND, 7);
		precedenceTableLine.put(TokenCategory.OPREL1, 7);
		precedenceTableLine.put(TokenCategory.OPREL2, 7);
		precedenceTableLine.put(TokenCategory.CONSTNUMINT, 0);
		precedenceTableLine.put(TokenCategory.CONSTNUMDEC, 0);
		precedenceTableLine.put(TokenCategory.CONSTLOGIC, 0);
		precedenceTableLine.put(TokenCategory.CONSTCHAR, 0);
		precedenceTableLine.put(TokenCategory.CONSTCCHAR, 0);
		precedenceTableLine.put(TokenCategory.ID, 0);
		precedenceTableLine.put(TokenCategory.UNKNOWN, 7);
		precedenceTableColumn.put(TokenCategory.OPNEGUN, precedenceTableLine);
		precedenceTableLine = new HashMap<TokenCategory, Integer>();

		// Linha 5
		precedenceTableLine.put(TokenCategory.OPARITADIT, 8);
		precedenceTableLine.put(TokenCategory.OPARITMULT, 8);
		precedenceTableLine.put(TokenCategory.OPARITEXP, 0);
		precedenceTableLine.put(TokenCategory.OPNEGUN, 0);
		precedenceTableLine.put(TokenCategory.OPNEGLOGIC, 0);
		precedenceTableLine.put(TokenCategory.PARAMBEGIN, 0);
		precedenceTableLine.put(TokenCategory.PARAMEND, 8);
		precedenceTableLine.put(TokenCategory.OPLOGICOR, 8);
		precedenceTableLine.put(TokenCategory.OPLOGICAND, 8);
		precedenceTableLine.put(TokenCategory.OPREL1, 8);
		precedenceTableLine.put(TokenCategory.OPREL2, 8);
		precedenceTableLine.put(TokenCategory.CONSTNUMINT, 0);
		precedenceTableLine.put(TokenCategory.CONSTNUMDEC, 0);
		precedenceTableLine.put(TokenCategory.CONSTLOGIC, 0);
		precedenceTableLine.put(TokenCategory.CONSTCHAR, 0);
		precedenceTableLine.put(TokenCategory.CONSTCCHAR, 0);
		precedenceTableLine.put(TokenCategory.ID, 0);
		precedenceTableLine.put(TokenCategory.UNKNOWN, 8);
		precedenceTableColumn
				.put(TokenCategory.OPNEGLOGIC, precedenceTableLine);
		precedenceTableLine = new HashMap<TokenCategory, Integer>();

		// Linha 6
		precedenceTableLine.put(TokenCategory.OPARITADIT, 0);
		precedenceTableLine.put(TokenCategory.OPARITMULT, 0);
		precedenceTableLine.put(TokenCategory.OPARITEXP, 0);
		precedenceTableLine.put(TokenCategory.OPNEGUN, 0);
		precedenceTableLine.put(TokenCategory.OPNEGLOGIC, 0);
		precedenceTableLine.put(TokenCategory.PARAMBEGIN, 0);
		precedenceTableLine.put(TokenCategory.PARAMEND, 0);
		precedenceTableLine.put(TokenCategory.OPLOGICOR, 0);
		precedenceTableLine.put(TokenCategory.OPLOGICAND, 0);
		precedenceTableLine.put(TokenCategory.OPREL1, 0);
		precedenceTableLine.put(TokenCategory.OPREL2, 0);
		precedenceTableLine.put(TokenCategory.CONSTNUMINT, 0);
		precedenceTableLine.put(TokenCategory.CONSTNUMDEC, 0);
		precedenceTableLine.put(TokenCategory.CONSTLOGIC, 0);
		precedenceTableLine.put(TokenCategory.CONSTCHAR, 0);
		precedenceTableLine.put(TokenCategory.CONSTCCHAR, 0);
		precedenceTableLine.put(TokenCategory.ID, 0);
		precedenceTableLine.put(TokenCategory.UNKNOWN, null);
		precedenceTableColumn
				.put(TokenCategory.PARAMBEGIN, precedenceTableLine);
		precedenceTableLine = new HashMap<TokenCategory, Integer>();

		// Linha 7
		precedenceTableLine.put(TokenCategory.OPARITADIT, 10);
		precedenceTableLine.put(TokenCategory.OPARITMULT, 10);
		precedenceTableLine.put(TokenCategory.OPARITEXP, 10);
		precedenceTableLine.put(TokenCategory.OPNEGUN, 10);
		precedenceTableLine.put(TokenCategory.OPNEGLOGIC, 10);
		precedenceTableLine.put(TokenCategory.PARAMBEGIN, null);
		precedenceTableLine.put(TokenCategory.PARAMEND, 10);
		precedenceTableLine.put(TokenCategory.OPLOGICOR, 10);
		precedenceTableLine.put(TokenCategory.OPLOGICAND, 10);
		precedenceTableLine.put(TokenCategory.OPREL1, 10);
		precedenceTableLine.put(TokenCategory.OPREL2, 10);
		precedenceTableLine.put(TokenCategory.CONSTNUMINT, null);
		precedenceTableLine.put(TokenCategory.CONSTNUMDEC, null);
		precedenceTableLine.put(TokenCategory.CONSTLOGIC, null);
		precedenceTableLine.put(TokenCategory.CONSTCHAR, null);
		precedenceTableLine.put(TokenCategory.CONSTCCHAR, null);
		precedenceTableLine.put(TokenCategory.ID, null);
		precedenceTableLine.put(TokenCategory.UNKNOWN, 10);
		precedenceTableColumn.put(TokenCategory.PARAMEND, precedenceTableLine);
		precedenceTableLine = new HashMap<TokenCategory, Integer>();

		// Linha 8
		precedenceTableLine.put(TokenCategory.OPARITADIT, 0);
		precedenceTableLine.put(TokenCategory.OPARITMULT, 0);
		precedenceTableLine.put(TokenCategory.OPARITEXP, 0);
		precedenceTableLine.put(TokenCategory.OPNEGUN, 0);
		precedenceTableLine.put(TokenCategory.OPNEGLOGIC, 0);
		precedenceTableLine.put(TokenCategory.PARAMBEGIN, 0);
		precedenceTableLine.put(TokenCategory.PARAMEND, 1);
		precedenceTableLine.put(TokenCategory.OPLOGICOR, 1);
		precedenceTableLine.put(TokenCategory.OPLOGICAND, 0);
		precedenceTableLine.put(TokenCategory.OPREL1, 0);
		precedenceTableLine.put(TokenCategory.OPREL2, 0);
		precedenceTableLine.put(TokenCategory.CONSTNUMINT, 0);
		precedenceTableLine.put(TokenCategory.CONSTNUMDEC, 0);
		precedenceTableLine.put(TokenCategory.CONSTLOGIC, 0);
		precedenceTableLine.put(TokenCategory.CONSTCHAR, 0);
		precedenceTableLine.put(TokenCategory.CONSTCCHAR, 0);
		precedenceTableLine.put(TokenCategory.ID, 0);
		precedenceTableLine.put(TokenCategory.UNKNOWN, 1);
		precedenceTableColumn.put(TokenCategory.OPLOGICOR, precedenceTableLine);
		precedenceTableLine = new HashMap<TokenCategory, Integer>();

		// Linha 9
		precedenceTableLine.put(TokenCategory.OPARITADIT, 0);
		precedenceTableLine.put(TokenCategory.OPARITMULT, 0);
		precedenceTableLine.put(TokenCategory.OPARITEXP, 0);
		precedenceTableLine.put(TokenCategory.OPNEGUN, 0);
		precedenceTableLine.put(TokenCategory.OPNEGLOGIC, 0);
		precedenceTableLine.put(TokenCategory.PARAMBEGIN, 0);
		precedenceTableLine.put(TokenCategory.PARAMEND, 2);
		precedenceTableLine.put(TokenCategory.OPLOGICOR, 2);
		precedenceTableLine.put(TokenCategory.OPLOGICAND, 2);
		precedenceTableLine.put(TokenCategory.OPREL1, 0);
		precedenceTableLine.put(TokenCategory.OPREL2, 0);
		precedenceTableLine.put(TokenCategory.CONSTNUMINT, 0);
		precedenceTableLine.put(TokenCategory.CONSTNUMDEC, 0);
		precedenceTableLine.put(TokenCategory.CONSTLOGIC, 0);
		precedenceTableLine.put(TokenCategory.CONSTCHAR, 0);
		precedenceTableLine.put(TokenCategory.CONSTCCHAR, 0);
		precedenceTableLine.put(TokenCategory.ID, 0);
		precedenceTableLine.put(TokenCategory.UNKNOWN, 2);
		precedenceTableColumn
				.put(TokenCategory.OPLOGICAND, precedenceTableLine);
		precedenceTableLine = new HashMap<TokenCategory, Integer>();

		// Linha 10
		precedenceTableLine.put(TokenCategory.OPARITADIT, 0);
		precedenceTableLine.put(TokenCategory.OPARITMULT, 0);
		precedenceTableLine.put(TokenCategory.OPARITEXP, 0);
		precedenceTableLine.put(TokenCategory.OPNEGUN, 0);
		precedenceTableLine.put(TokenCategory.OPNEGLOGIC, 0);
		precedenceTableLine.put(TokenCategory.PARAMBEGIN, 0);
		precedenceTableLine.put(TokenCategory.PARAMEND, 4);
		precedenceTableLine.put(TokenCategory.OPLOGICOR, 4);
		precedenceTableLine.put(TokenCategory.OPLOGICAND, 4);
		precedenceTableLine.put(TokenCategory.OPREL1, 4);
		precedenceTableLine.put(TokenCategory.OPREL2, 4);
		precedenceTableLine.put(TokenCategory.CONSTNUMINT, 0);
		precedenceTableLine.put(TokenCategory.CONSTNUMDEC, 0);
		precedenceTableLine.put(TokenCategory.CONSTLOGIC, 0);
		precedenceTableLine.put(TokenCategory.CONSTCHAR, 0);
		precedenceTableLine.put(TokenCategory.CONSTCCHAR, 0);
		precedenceTableLine.put(TokenCategory.ID, 0);
		precedenceTableLine.put(TokenCategory.UNKNOWN, 4);
		precedenceTableColumn.put(TokenCategory.OPREL1, precedenceTableLine);
		precedenceTableLine = new HashMap<TokenCategory, Integer>();

		// Linha 11
		precedenceTableLine.put(TokenCategory.OPARITADIT, 0);
		precedenceTableLine.put(TokenCategory.OPARITMULT, 0);
		precedenceTableLine.put(TokenCategory.OPARITEXP, 0);
		precedenceTableLine.put(TokenCategory.OPNEGUN, 0);
		precedenceTableLine.put(TokenCategory.OPNEGLOGIC, 0);
		precedenceTableLine.put(TokenCategory.PARAMBEGIN, 0);
		precedenceTableLine.put(TokenCategory.PARAMEND, 3);
		precedenceTableLine.put(TokenCategory.OPLOGICOR, 0);
		precedenceTableLine.put(TokenCategory.OPLOGICAND, 0);
		precedenceTableLine.put(TokenCategory.OPREL1, 3);
		precedenceTableLine.put(TokenCategory.OPREL2, 3);
		precedenceTableLine.put(TokenCategory.CONSTNUMINT, 0);
		precedenceTableLine.put(TokenCategory.CONSTNUMDEC, 0);
		precedenceTableLine.put(TokenCategory.CONSTLOGIC, 0);
		precedenceTableLine.put(TokenCategory.CONSTCHAR, 0);
		precedenceTableLine.put(TokenCategory.CONSTCCHAR, 0);
		precedenceTableLine.put(TokenCategory.ID, 0);
		precedenceTableLine.put(TokenCategory.UNKNOWN, 3);
		precedenceTableColumn.put(TokenCategory.OPREL2, precedenceTableLine);
		precedenceTableLine = new HashMap<TokenCategory, Integer>();

		// Linha 12
		precedenceTableLine.put(TokenCategory.OPARITADIT, 11);
		precedenceTableLine.put(TokenCategory.OPARITMULT, 11);
		precedenceTableLine.put(TokenCategory.OPARITEXP, 11);
		precedenceTableLine.put(TokenCategory.OPNEGUN, 11);
		precedenceTableLine.put(TokenCategory.OPNEGLOGIC, 11);
		precedenceTableLine.put(TokenCategory.PARAMBEGIN, 11);
		precedenceTableLine.put(TokenCategory.PARAMEND, null);
		precedenceTableLine.put(TokenCategory.OPLOGICOR, 11);
		precedenceTableLine.put(TokenCategory.OPLOGICAND, 11);
		precedenceTableLine.put(TokenCategory.OPREL1, 11);
		precedenceTableLine.put(TokenCategory.OPREL2, 11);
		precedenceTableLine.put(TokenCategory.CONSTNUMINT, null);
		precedenceTableLine.put(TokenCategory.CONSTNUMDEC, null);
		precedenceTableLine.put(TokenCategory.CONSTLOGIC, null);
		precedenceTableLine.put(TokenCategory.CONSTCHAR, null);
		precedenceTableLine.put(TokenCategory.CONSTCCHAR, null);
		precedenceTableLine.put(TokenCategory.ID, null);
		precedenceTableLine.put(TokenCategory.UNKNOWN, 11);
		precedenceTableColumn.put(TokenCategory.CONSTNUMINT,
				precedenceTableLine);
		precedenceTableLine = new HashMap<TokenCategory, Integer>();

		// Linha 13
		precedenceTableLine.put(TokenCategory.OPARITADIT, 11);
		precedenceTableLine.put(TokenCategory.OPARITMULT, 11);
		precedenceTableLine.put(TokenCategory.OPARITEXP, 11);
		precedenceTableLine.put(TokenCategory.OPNEGUN, 11);
		precedenceTableLine.put(TokenCategory.OPNEGLOGIC, 11);
		precedenceTableLine.put(TokenCategory.PARAMBEGIN, 11);
		precedenceTableLine.put(TokenCategory.PARAMEND, null);
		precedenceTableLine.put(TokenCategory.OPLOGICOR, 11);
		precedenceTableLine.put(TokenCategory.OPLOGICAND, 11);
		precedenceTableLine.put(TokenCategory.OPREL1, 11);
		precedenceTableLine.put(TokenCategory.OPREL2, 11);
		precedenceTableLine.put(TokenCategory.CONSTNUMINT, null);
		precedenceTableLine.put(TokenCategory.CONSTNUMDEC, null);
		precedenceTableLine.put(TokenCategory.CONSTLOGIC, null);
		precedenceTableLine.put(TokenCategory.CONSTCHAR, null);
		precedenceTableLine.put(TokenCategory.CONSTCCHAR, null);
		precedenceTableLine.put(TokenCategory.ID, null);
		precedenceTableLine.put(TokenCategory.UNKNOWN, 11);
		precedenceTableColumn.put(TokenCategory.CONSTNUMDEC,
				precedenceTableLine);
		precedenceTableLine = new HashMap<TokenCategory, Integer>();

		// Linha 14
		precedenceTableLine.put(TokenCategory.OPARITADIT, 11);
		precedenceTableLine.put(TokenCategory.OPARITMULT, 11);
		precedenceTableLine.put(TokenCategory.OPARITEXP, 11);
		precedenceTableLine.put(TokenCategory.OPNEGUN, 11);
		precedenceTableLine.put(TokenCategory.OPNEGLOGIC, 11);
		precedenceTableLine.put(TokenCategory.PARAMBEGIN, 11);
		precedenceTableLine.put(TokenCategory.PARAMEND, null);
		precedenceTableLine.put(TokenCategory.OPLOGICOR, 11);
		precedenceTableLine.put(TokenCategory.OPLOGICAND, 11);
		precedenceTableLine.put(TokenCategory.OPREL1, 11);
		precedenceTableLine.put(TokenCategory.OPREL2, 11);
		precedenceTableLine.put(TokenCategory.CONSTNUMINT, null);
		precedenceTableLine.put(TokenCategory.CONSTNUMDEC, null);
		precedenceTableLine.put(TokenCategory.CONSTLOGIC, null);
		precedenceTableLine.put(TokenCategory.CONSTCHAR, null);
		precedenceTableLine.put(TokenCategory.CONSTCCHAR, null);
		precedenceTableLine.put(TokenCategory.ID, null);
		precedenceTableLine.put(TokenCategory.UNKNOWN, 11);
		precedenceTableColumn
				.put(TokenCategory.CONSTLOGIC, precedenceTableLine);
		precedenceTableLine = new HashMap<TokenCategory, Integer>();

		// Linha 15
		precedenceTableLine.put(TokenCategory.OPARITADIT, 11);
		precedenceTableLine.put(TokenCategory.OPARITMULT, 11);
		precedenceTableLine.put(TokenCategory.OPARITEXP, 11);
		precedenceTableLine.put(TokenCategory.OPNEGUN, 11);
		precedenceTableLine.put(TokenCategory.OPNEGLOGIC, 11);
		precedenceTableLine.put(TokenCategory.PARAMBEGIN, 11);
		precedenceTableLine.put(TokenCategory.PARAMEND, null);
		precedenceTableLine.put(TokenCategory.OPLOGICOR, 11);
		precedenceTableLine.put(TokenCategory.OPLOGICAND, 11);
		precedenceTableLine.put(TokenCategory.OPREL1, 11);
		precedenceTableLine.put(TokenCategory.OPREL2, 11);
		precedenceTableLine.put(TokenCategory.CONSTNUMINT, null);
		precedenceTableLine.put(TokenCategory.CONSTNUMDEC, null);
		precedenceTableLine.put(TokenCategory.CONSTLOGIC, null);
		precedenceTableLine.put(TokenCategory.CONSTCHAR, null);
		precedenceTableLine.put(TokenCategory.CONSTCCHAR, null);
		precedenceTableLine.put(TokenCategory.ID, null);
		precedenceTableLine.put(TokenCategory.UNKNOWN, 11);
		precedenceTableColumn.put(TokenCategory.CONSTCHAR, precedenceTableLine);
		precedenceTableLine = new HashMap<TokenCategory, Integer>();

		// Linha 16
		precedenceTableLine.put(TokenCategory.OPARITADIT, 11);
		precedenceTableLine.put(TokenCategory.OPARITMULT, 11);
		precedenceTableLine.put(TokenCategory.OPARITEXP, 11);
		precedenceTableLine.put(TokenCategory.OPNEGUN, 11);
		precedenceTableLine.put(TokenCategory.OPNEGLOGIC, 11);
		precedenceTableLine.put(TokenCategory.PARAMBEGIN, 11);
		precedenceTableLine.put(TokenCategory.PARAMEND, null);
		precedenceTableLine.put(TokenCategory.OPLOGICOR, 11);
		precedenceTableLine.put(TokenCategory.OPLOGICAND, 11);
		precedenceTableLine.put(TokenCategory.OPREL1, 11);
		precedenceTableLine.put(TokenCategory.OPREL2, 11);
		precedenceTableLine.put(TokenCategory.CONSTNUMINT, null);
		precedenceTableLine.put(TokenCategory.CONSTNUMDEC, null);
		precedenceTableLine.put(TokenCategory.CONSTLOGIC, null);
		precedenceTableLine.put(TokenCategory.CONSTCHAR, null);
		precedenceTableLine.put(TokenCategory.CONSTCCHAR, null);
		precedenceTableLine.put(TokenCategory.ID, null);
		precedenceTableLine.put(TokenCategory.UNKNOWN, 11);
		precedenceTableColumn
				.put(TokenCategory.CONSTCCHAR, precedenceTableLine);
		precedenceTableLine = new HashMap<TokenCategory, Integer>();

		// Linha 17
		precedenceTableLine.put(TokenCategory.OPARITADIT, 12);
		precedenceTableLine.put(TokenCategory.OPARITMULT, 12);
		precedenceTableLine.put(TokenCategory.OPARITEXP, 12);
		precedenceTableLine.put(TokenCategory.OPNEGUN, 12);
		precedenceTableLine.put(TokenCategory.OPNEGLOGIC, 12);
		precedenceTableLine.put(TokenCategory.PARAMBEGIN, 12);
		precedenceTableLine.put(TokenCategory.PARAMEND, null);
		precedenceTableLine.put(TokenCategory.OPLOGICOR, 12);
		precedenceTableLine.put(TokenCategory.OPLOGICAND, 12);
		precedenceTableLine.put(TokenCategory.OPREL1, 12);
		precedenceTableLine.put(TokenCategory.OPREL2, 12);
		precedenceTableLine.put(TokenCategory.CONSTNUMINT, null);
		precedenceTableLine.put(TokenCategory.CONSTNUMDEC, null);
		precedenceTableLine.put(TokenCategory.CONSTLOGIC, null);
		precedenceTableLine.put(TokenCategory.CONSTCHAR, null);
		precedenceTableLine.put(TokenCategory.CONSTCCHAR, null);
		precedenceTableLine.put(TokenCategory.ID, null);
		precedenceTableLine.put(TokenCategory.UNKNOWN, 12);
		precedenceTableColumn.put(TokenCategory.ID, precedenceTableLine);
		precedenceTableLine = new HashMap<TokenCategory, Integer>();

		// Linha 18
		precedenceTableLine.put(TokenCategory.OPARITADIT, 0);
		precedenceTableLine.put(TokenCategory.OPARITMULT, 0);
		precedenceTableLine.put(TokenCategory.OPARITEXP, 0);
		precedenceTableLine.put(TokenCategory.OPNEGUN, 0);
		precedenceTableLine.put(TokenCategory.OPNEGLOGIC, 0);
		precedenceTableLine.put(TokenCategory.PARAMBEGIN, 0);
		precedenceTableLine.put(TokenCategory.PARAMEND, null);
		precedenceTableLine.put(TokenCategory.OPLOGICOR, 0);
		precedenceTableLine.put(TokenCategory.OPLOGICAND, 0);
		precedenceTableLine.put(TokenCategory.OPREL1, 0);
		precedenceTableLine.put(TokenCategory.OPREL2, 0);
		precedenceTableLine.put(TokenCategory.CONSTNUMINT, 0);
		precedenceTableLine.put(TokenCategory.CONSTNUMDEC, 0);
		precedenceTableLine.put(TokenCategory.CONSTLOGIC, 0);
		precedenceTableLine.put(TokenCategory.CONSTCHAR, 0);
		precedenceTableLine.put(TokenCategory.CONSTCCHAR, 0);
		precedenceTableLine.put(TokenCategory.ID, 0);
		precedenceTableLine.put(TokenCategory.UNKNOWN, 1000);
		precedenceTableColumn.put(TokenCategory.UNKNOWN, precedenceTableLine);
		precedenceTableLine = new HashMap<TokenCategory, Integer>();
	}

}
