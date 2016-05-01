package syntactic;

import java.util.HashMap;

public class PredectiveTable {
	private HashMap predectiveTableMap;
	private HashMap terminaisMap;

	public PredectiveTable() {
		terminaisMap = new HashMap<Integer, Integer>();
		predectiveTableMap = new HashMap<Integer, HashMap<Integer, Integer>>();
		
		loadPredectiveTableMap();
	}

	//Tabela preditiva
	private void loadPredectiveTableMap() {
		
		terminaisMap.put(TerminalCategory.MAJOR, 1);
		terminaisMap.put(TerminalCategory.ID, 1);
		predectiveTableMap.put(NonTerminalName.PROGRAM, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.MAJOR, 3);
		terminaisMap.put(TerminalCategory.ID, 2);
		predectiveTableMap.put(NonTerminalName.FUNCTIONS, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.MAJOR, 4);
		predectiveTableMap.put(NonTerminalName.MAJORF, terminaisMap);
		terminaisMap.clear();
	
		terminaisMap.put(TerminalCategory.PARAMBEGIN, 5);
		predectiveTableMap.put(NonTerminalName.PARAMS, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.TINT, 7);
		terminaisMap.put(TerminalCategory.TLONG, 7);
		terminaisMap.put(TerminalCategory.TLOGIC, 7);
		terminaisMap.put(TerminalCategory.TCHAR, 7);
		terminaisMap.put(TerminalCategory.TCCHAR, 7);
		terminaisMap.put(TerminalCategory.TDEC, 7);
		terminaisMap.put(TerminalCategory.PARAMEND, 6);
		predectiveTableMap.put(NonTerminalName.PARAMSFAT, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.TINT, 8);
		terminaisMap.put(TerminalCategory.TLONG, 8);
		terminaisMap.put(TerminalCategory.TLOGIC, 8);
		terminaisMap.put(TerminalCategory.TCHAR, 8);
		terminaisMap.put(TerminalCategory.TCCHAR, 8);
		terminaisMap.put(TerminalCategory.TDEC, 8);
		predectiveTableMap.put(NonTerminalName.LISTPARAMS, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.PARAMEND, 10);
		terminaisMap.put(TerminalCategory.SEP1, 9);
		predectiveTableMap.put(NonTerminalName.LISTPARAMSFAT, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.TINT, 11);
		terminaisMap.put(TerminalCategory.TLONG, 12);
		terminaisMap.put(TerminalCategory.TLOGIC, 13);
		terminaisMap.put(TerminalCategory.TCHAR, 14);
		terminaisMap.put(TerminalCategory.TCCHAR, 15);
		terminaisMap.put(TerminalCategory.TDEC, 16);
		predectiveTableMap.put(NonTerminalName.TYPE, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.TEMPTY, 17);
		terminaisMap.put(TerminalCategory.TINT, 18);
		terminaisMap.put(TerminalCategory.TLONG, 18);
		terminaisMap.put(TerminalCategory.TLOGIC, 18);
		terminaisMap.put(TerminalCategory.TCHAR, 18);
		terminaisMap.put(TerminalCategory.TCCHAR, 18);
		terminaisMap.put(TerminalCategory.TDEC, 18);
		predectiveTableMap.put(NonTerminalName.RETURNTYPE, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.ESCBEGIN, 20);
		terminaisMap.put(TerminalCategory.ARRAYBEGIN, 19);
		predectiveTableMap.put(NonTerminalName.RETURNTYPEFAT, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.ID, 21);
		predectiveTableMap.put(NonTerminalName.NAME, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.PARAMEND, 23);
		terminaisMap.put(TerminalCategory.ARRAYBEGIN, 22);
		terminaisMap.put(TerminalCategory.TERM, 23);
		terminaisMap.put(TerminalCategory.SEP1, 23);
		terminaisMap.put(TerminalCategory.OPATRIB, 23);
		terminaisMap.put(TerminalCategory.OPCONC, 23);
		predectiveTableMap.put(NonTerminalName.NAMEFAT, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.ESCBEGIN, 24);
		predectiveTableMap.put(NonTerminalName.ESCOPE, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.ID, 25);
		terminaisMap.put(TerminalCategory.TINT, 25);
		terminaisMap.put(TerminalCategory.TLONG, 25);
		terminaisMap.put(TerminalCategory.TLOGIC, 25);
		terminaisMap.put(TerminalCategory.TCHAR, 25);
		terminaisMap.put(TerminalCategory.TCCHAR, 25);
		terminaisMap.put(TerminalCategory.TDEC, 25);
		terminaisMap.put(TerminalCategory.ESCEND, 26);
		terminaisMap.put(TerminalCategory.PRREADIN, 25);
		terminaisMap.put(TerminalCategory.PRPRINTOUT, 25);
		terminaisMap.put(TerminalCategory.PRIF, 25);
		terminaisMap.put(TerminalCategory.PRITERATOR, 25);
		terminaisMap.put(TerminalCategory.PRDO, 25);
		terminaisMap.put(TerminalCategory.PRWHILE, 25);
		terminaisMap.put(TerminalCategory.PRRETURN, 25);
		predectiveTableMap.put(NonTerminalName.COMMANDS, terminaisMap);
		terminaisMap.clear();
	
		terminaisMap.put(TerminalCategory.ID, 28);
		terminaisMap.put(TerminalCategory.TINT, 27);
		terminaisMap.put(TerminalCategory.TLONG, 27);
		terminaisMap.put(TerminalCategory.TLOGIC, 27);
		terminaisMap.put(TerminalCategory.TCHAR, 27);
		terminaisMap.put(TerminalCategory.TCCHAR, 27);
		terminaisMap.put(TerminalCategory.TDEC, 27);
		terminaisMap.put(TerminalCategory.PRREADIN, 30);
		terminaisMap.put(TerminalCategory.PRPRINTOUT, 29);
		terminaisMap.put(TerminalCategory.PRIF, 31);
		terminaisMap.put(TerminalCategory.PRITERATOR, 34);
		terminaisMap.put(TerminalCategory.PRDO, 33);
		terminaisMap.put(TerminalCategory.PRWHILE, 32);
		terminaisMap.put(TerminalCategory.PRRETURN, 30);
		predectiveTableMap.put(NonTerminalName.CMD, terminaisMap);
		terminaisMap.clear();
	
		terminaisMap.put(TerminalCategory.TINT, 36);
		terminaisMap.put(TerminalCategory.TLONG, 36);
		terminaisMap.put(TerminalCategory.TLOGIC, 36);
		terminaisMap.put(TerminalCategory.TCHAR, 36);
		terminaisMap.put(TerminalCategory.TCCHAR, 36);
		terminaisMap.put(TerminalCategory.TDEC, 36);
		predectiveTableMap.put(NonTerminalName.DECLARATION, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.PARAMBEGIN, 38);
		terminaisMap.put(TerminalCategory.ARRAYBEGIN, 37);
		terminaisMap.put(TerminalCategory.OPATRIB, 37);
		predectiveTableMap.put(NonTerminalName.CMDFAT, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.ARRAYBEGIN, 39);
		terminaisMap.put(TerminalCategory.OPATRIB, 39);
		predectiveTableMap.put(NonTerminalName.ATTRIBUTION, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.ARRAYBEGIN, 40);
		predectiveTableMap.put(NonTerminalName.VALUE, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.ARRAYBEGIN, 41);
		predectiveTableMap.put(NonTerminalName.ARRAY, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.ARRAYEND, 43);
		terminaisMap.put(TerminalCategory.CONSTNUMINT, 42);
		terminaisMap.put(TerminalCategory.CONSTNUMDEC, 42);
		terminaisMap.put(TerminalCategory.CONSTLOGIC, 42);
		terminaisMap.put(TerminalCategory.CONSTCHAR, 42);
		terminaisMap.put(TerminalCategory.CONSTCCHAR, 42);
		predectiveTableMap.put(NonTerminalName.ARRAYFAT, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.CONSTNUMINT, 44);
		terminaisMap.put(TerminalCategory.CONSTNUMDEC, 44);
		terminaisMap.put(TerminalCategory.CONSTLOGIC, 44);
		terminaisMap.put(TerminalCategory.CONSTCHAR, 44);
		terminaisMap.put(TerminalCategory.CONSTCCHAR, 44);
		predectiveTableMap.put(NonTerminalName.ELEMENTS, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.ARRAYEND, 46);
		terminaisMap.put(TerminalCategory.SEP1, 45);
		predectiveTableMap.put(NonTerminalName.ELEMENTSFAT, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.CONSTNUMINT, 47);
		terminaisMap.put(TerminalCategory.CONSTNUMDEC, 48);
		terminaisMap.put(TerminalCategory.CONSTLOGIC, 49);
		terminaisMap.put(TerminalCategory.CONSTCHAR, 50);
		terminaisMap.put(TerminalCategory.CONSTCCHAR, 51);
		predectiveTableMap.put(NonTerminalName.CONSTANT, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.PARAMBEGIN, 52);
		predectiveTableMap.put(NonTerminalName.FUNCCALL, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.ID, 53);
		terminaisMap.put(TerminalCategory.CONSTNUMINT, 53);
		terminaisMap.put(TerminalCategory.CONSTNUMDEC, 53);
		terminaisMap.put(TerminalCategory.CONSTLOGIC, 53);
		terminaisMap.put(TerminalCategory.CONSTCHAR, 53);
		terminaisMap.put(TerminalCategory.CONSTCCHAR, 53);
		predectiveTableMap.put(NonTerminalName.LISTPARAMSCALL, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.PARAMEND, 55);
		terminaisMap.put(TerminalCategory.SEP1, 54);
		predectiveTableMap.put(NonTerminalName.LISTPARAMSCALLFAT, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.ID, 57);
		terminaisMap.put(TerminalCategory.CONSTNUMINT, 56);
		terminaisMap.put(TerminalCategory.CONSTNUMDEC, 56);
		terminaisMap.put(TerminalCategory.CONSTLOGIC, 56);
		terminaisMap.put(TerminalCategory.CONSTCHAR, 56);
		terminaisMap.put(TerminalCategory.CONSTCCHAR, 56);
		predectiveTableMap.put(NonTerminalName.PARAMITEM, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.PRPRINTOUT, 58);
		predectiveTableMap.put(NonTerminalName.PRINTOUT, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.ID, 60);
		terminaisMap.put(TerminalCategory.CONSTCCHAR, 59);
		predectiveTableMap.put(NonTerminalName.MESSAGE, terminaisMap);
		terminaisMap.clear();
	
		terminaisMap.put(TerminalCategory.PARAMEND, 62);
		terminaisMap.put(TerminalCategory.OPCONC, 61);
		predectiveTableMap.put(NonTerminalName.MESSAGEFAT, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.PRREADIN, 63);
		predectiveTableMap.put(NonTerminalName.READIN, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.PRIF, 64);
		predectiveTableMap.put(NonTerminalName.IFELSE, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.PRIF, 65);
		predectiveTableMap.put(NonTerminalName.IF, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.PRELSEIF, 66);
		terminaisMap.put(TerminalCategory.PRELSE, 67);
		predectiveTableMap.put(NonTerminalName.ELSEIF, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.PRELSE, 68);
		terminaisMap.put(TerminalCategory.TERM, 69);
		predectiveTableMap.put(NonTerminalName.ELSE, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.PRWHILE, 70);
		predectiveTableMap.put(NonTerminalName.WHILE, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.PRDO, 71);
		predectiveTableMap.put(NonTerminalName.DOWHILE, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.PRITERATOR, 72);
		predectiveTableMap.put(NonTerminalName.ITERATOR, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.PRRETURN, 73);
		predectiveTableMap.put(NonTerminalName.RETURN, terminaisMap);
		terminaisMap.clear();
		
		terminaisMap.put(TerminalCategory.ID, 75);
		terminaisMap.put(TerminalCategory.CONSTNUMINT, 74);
		terminaisMap.put(TerminalCategory.CONSTNUMDEC, 74);
		terminaisMap.put(TerminalCategory.CONSTLOGIC, 74);
		terminaisMap.put(TerminalCategory.CONSTCHAR, 74);
		terminaisMap.put(TerminalCategory.CONSTCCHAR, 74);
		predectiveTableMap.put(NonTerminalName.RETURNFAT, terminaisMap);
		terminaisMap.clear();
	}

}
