package syntactic;

import java.util.HashMap;
import lexical.TokenCategory;
import syntactic.grammar.NonTerminalName;

public class PredictiveTable {
	private HashMap<NonTerminalName, HashMap<TokenCategory, Integer>> predectiveTableMap;
	private HashMap<TokenCategory, Integer> terminaisMap;

	public PredictiveTable() {
		terminaisMap = new HashMap<TokenCategory, Integer>();
		predectiveTableMap = new HashMap<NonTerminalName, HashMap<TokenCategory, Integer>>();
		
		loadPredectiveTableMap();
	}
	
	public Integer getDerivationNumber(NonTerminalName nonTerminal, TokenCategory terminal) {
		return predectiveTableMap.get(nonTerminal).get(terminal);
	}

	//Tabela preditiva
	private void loadPredectiveTableMap() {
		
		terminaisMap.put(TokenCategory.MAJOR, 1);
		terminaisMap.put(TokenCategory.ID, 1);
		predectiveTableMap.put(NonTerminalName.PROGRAM, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.MAJOR, 3);
		terminaisMap.put(TokenCategory.ID, 2);
		predectiveTableMap.put(NonTerminalName.FUNCTIONS, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.MAJOR, 4);
		predectiveTableMap.put(NonTerminalName.MAJORF, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
	
		terminaisMap.put(TokenCategory.PARAMBEGIN, 5);
		predectiveTableMap.put(NonTerminalName.PARAMS, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.TINT, 7);
		terminaisMap.put(TokenCategory.TLONG, 7);
		terminaisMap.put(TokenCategory.TLOGIC, 7);
		terminaisMap.put(TokenCategory.TCHAR, 7);
		terminaisMap.put(TokenCategory.TCCHAR, 7);
		terminaisMap.put(TokenCategory.TDEC, 7);
		terminaisMap.put(TokenCategory.PARAMEND, 6);
		predectiveTableMap.put(NonTerminalName.PARAMSFAT, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.TINT, 8);
		terminaisMap.put(TokenCategory.TLONG, 8);
		terminaisMap.put(TokenCategory.TLOGIC, 8);
		terminaisMap.put(TokenCategory.TCHAR, 8);
		terminaisMap.put(TokenCategory.TCCHAR, 8);
		terminaisMap.put(TokenCategory.TDEC, 8);
		predectiveTableMap.put(NonTerminalName.LISTPARAMS, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.PARAMEND, 10);
		terminaisMap.put(TokenCategory.SEP1, 9);
		predectiveTableMap.put(NonTerminalName.LISTPARAMSFAT, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.TINT, 11);
		terminaisMap.put(TokenCategory.TLONG, 12);
		terminaisMap.put(TokenCategory.TLOGIC, 13);
		terminaisMap.put(TokenCategory.TCHAR, 14);
		terminaisMap.put(TokenCategory.TCCHAR, 15);
		terminaisMap.put(TokenCategory.TDEC, 16);
		predectiveTableMap.put(NonTerminalName.TYPE, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.TEMPTY, 17);
		terminaisMap.put(TokenCategory.TINT, 18);
		terminaisMap.put(TokenCategory.TLONG, 18);
		terminaisMap.put(TokenCategory.TLOGIC, 18);
		terminaisMap.put(TokenCategory.TCHAR, 18);
		terminaisMap.put(TokenCategory.TCCHAR, 18);
		terminaisMap.put(TokenCategory.TDEC, 18);
		predectiveTableMap.put(NonTerminalName.RETURNTYPE, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.ESCBEGIN, 20);
		terminaisMap.put(TokenCategory.ARRAYBEGIN, 19);
		predectiveTableMap.put(NonTerminalName.RETURNTYPEFAT, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.ID, 21);
		predectiveTableMap.put(NonTerminalName.NAME, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.PARAMEND, 23);
		terminaisMap.put(TokenCategory.ARRAYBEGIN, 22);
		terminaisMap.put(TokenCategory.TERM, 23);
		terminaisMap.put(TokenCategory.SEP1, 23);
		terminaisMap.put(TokenCategory.OPATRIB, 23);
		terminaisMap.put(TokenCategory.OPCONC, 23);
		predectiveTableMap.put(NonTerminalName.NAMEFAT, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.ESCBEGIN, 24);
		predectiveTableMap.put(NonTerminalName.ESCOPE, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.ID, 25);
		terminaisMap.put(TokenCategory.TINT, 25);
		terminaisMap.put(TokenCategory.TLONG, 25);
		terminaisMap.put(TokenCategory.TLOGIC, 25);
		terminaisMap.put(TokenCategory.TCHAR, 25);
		terminaisMap.put(TokenCategory.TCCHAR, 25);
		terminaisMap.put(TokenCategory.TDEC, 25);
		terminaisMap.put(TokenCategory.ESCEND, 26);
		terminaisMap.put(TokenCategory.PRREADIN, 25);
		terminaisMap.put(TokenCategory.PRPRINTOUT, 25);
		terminaisMap.put(TokenCategory.PRIF, 25);
		terminaisMap.put(TokenCategory.PRITERATOR, 25);
		terminaisMap.put(TokenCategory.PRDO, 25);
		terminaisMap.put(TokenCategory.PRWHILE, 25);
		terminaisMap.put(TokenCategory.PRRETURN, 25);
		predectiveTableMap.put(NonTerminalName.COMMANDS, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
	
		terminaisMap.put(TokenCategory.ID, 28);
		terminaisMap.put(TokenCategory.TINT, 27);
		terminaisMap.put(TokenCategory.TLONG, 27);
		terminaisMap.put(TokenCategory.TLOGIC, 27);
		terminaisMap.put(TokenCategory.TCHAR, 27);
		terminaisMap.put(TokenCategory.TCCHAR, 27);
		terminaisMap.put(TokenCategory.TDEC, 27);
		terminaisMap.put(TokenCategory.PRREADIN, 30);
		terminaisMap.put(TokenCategory.PRPRINTOUT, 29);
		terminaisMap.put(TokenCategory.PRIF, 31);
		terminaisMap.put(TokenCategory.PRITERATOR, 34);
		terminaisMap.put(TokenCategory.PRDO, 33);
		terminaisMap.put(TokenCategory.PRWHILE, 32);
		terminaisMap.put(TokenCategory.PRRETURN, 30);
		predectiveTableMap.put(NonTerminalName.CMD, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
	
		terminaisMap.put(TokenCategory.TINT, 36);
		terminaisMap.put(TokenCategory.TLONG, 36);
		terminaisMap.put(TokenCategory.TLOGIC, 36);
		terminaisMap.put(TokenCategory.TCHAR, 36);
		terminaisMap.put(TokenCategory.TCCHAR, 36);
		terminaisMap.put(TokenCategory.TDEC, 36);
		predectiveTableMap.put(NonTerminalName.DECLARATION, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.PARAMBEGIN, 38);
		terminaisMap.put(TokenCategory.ARRAYBEGIN, 37);
		terminaisMap.put(TokenCategory.OPATRIB, 37);
		predectiveTableMap.put(NonTerminalName.CMDFAT, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.ARRAYBEGIN, 39);
		terminaisMap.put(TokenCategory.OPATRIB, 39);
		predectiveTableMap.put(NonTerminalName.ATTRIBUTION, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.ARRAYBEGIN, 40);
		predectiveTableMap.put(NonTerminalName.VALUE, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.ARRAYBEGIN, 41);
		predectiveTableMap.put(NonTerminalName.ARRAY, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.ARRAYEND, 43);
		terminaisMap.put(TokenCategory.CONSTNUMINT, 42);
		terminaisMap.put(TokenCategory.CONSTNUMDEC, 42);
		terminaisMap.put(TokenCategory.CONSTLOGIC, 42);
		terminaisMap.put(TokenCategory.CONSTCHAR, 42);
		terminaisMap.put(TokenCategory.CONSTCCHAR, 42);
		predectiveTableMap.put(NonTerminalName.ARRAYFAT, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.CONSTNUMINT, 44);
		terminaisMap.put(TokenCategory.CONSTNUMDEC, 44);
		terminaisMap.put(TokenCategory.CONSTLOGIC, 44);
		terminaisMap.put(TokenCategory.CONSTCHAR, 44);
		terminaisMap.put(TokenCategory.CONSTCCHAR, 44);
		predectiveTableMap.put(NonTerminalName.ELEMENTS, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.ARRAYEND, 46);
		terminaisMap.put(TokenCategory.SEP1, 45);
		predectiveTableMap.put(NonTerminalName.ELEMENTSFAT, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.CONSTNUMINT, 47);
		terminaisMap.put(TokenCategory.CONSTNUMDEC, 48);
		terminaisMap.put(TokenCategory.CONSTLOGIC, 49);
		terminaisMap.put(TokenCategory.CONSTCHAR, 50);
		terminaisMap.put(TokenCategory.CONSTCCHAR, 51);
		predectiveTableMap.put(NonTerminalName.CONSTANT, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.PARAMBEGIN, 52);
		predectiveTableMap.put(NonTerminalName.FUNCCALL, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.ID, 53);
		terminaisMap.put(TokenCategory.CONSTNUMINT, 53);
		terminaisMap.put(TokenCategory.CONSTNUMDEC, 53);
		terminaisMap.put(TokenCategory.CONSTLOGIC, 53);
		terminaisMap.put(TokenCategory.CONSTCHAR, 53);
		terminaisMap.put(TokenCategory.CONSTCCHAR, 53);
		predectiveTableMap.put(NonTerminalName.LISTPARAMSCALL, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.PARAMEND, 55);
		terminaisMap.put(TokenCategory.SEP1, 54);
		predectiveTableMap.put(NonTerminalName.LISTPARAMSCALLFAT, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.ID, 57);
		terminaisMap.put(TokenCategory.CONSTNUMINT, 56);
		terminaisMap.put(TokenCategory.CONSTNUMDEC, 56);
		terminaisMap.put(TokenCategory.CONSTLOGIC, 56);
		terminaisMap.put(TokenCategory.CONSTCHAR, 56);
		terminaisMap.put(TokenCategory.CONSTCCHAR, 56);
		predectiveTableMap.put(NonTerminalName.PARAMITEM, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.PRPRINTOUT, 58);
		predectiveTableMap.put(NonTerminalName.PRINTOUT, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.ID, 60);
		terminaisMap.put(TokenCategory.CONSTCCHAR, 59);
		predectiveTableMap.put(NonTerminalName.MESSAGE, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
	
		terminaisMap.put(TokenCategory.PARAMEND, 62);
		terminaisMap.put(TokenCategory.OPCONC, 61);
		predectiveTableMap.put(NonTerminalName.MESSAGEFAT, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.PRREADIN, 63);
		predectiveTableMap.put(NonTerminalName.READIN, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.PRIF, 64);
		predectiveTableMap.put(NonTerminalName.IFELSE, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.PRIF, 65);
		predectiveTableMap.put(NonTerminalName.IF, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.PRELSEIF, 66);
		terminaisMap.put(TokenCategory.PRELSE, 67);
		terminaisMap.put(TokenCategory.TERM, 67);
		predectiveTableMap.put(NonTerminalName.ELSEIF, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.PRELSE, 68);
		terminaisMap.put(TokenCategory.TERM, 69);
		predectiveTableMap.put(NonTerminalName.ELSE, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.PRWHILE, 70);
		predectiveTableMap.put(NonTerminalName.WHILE, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.PRDO, 71);
		predectiveTableMap.put(NonTerminalName.DOWHILE, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.PRITERATOR, 72);
		predectiveTableMap.put(NonTerminalName.ITERATOR, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.PRRETURN, 73);
		predectiveTableMap.put(NonTerminalName.RETURN, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
		
		terminaisMap.put(TokenCategory.ID, 75);
		terminaisMap.put(TokenCategory.CONSTNUMINT, 74);
		terminaisMap.put(TokenCategory.CONSTNUMDEC, 74);
		terminaisMap.put(TokenCategory.CONSTLOGIC, 74);
		terminaisMap.put(TokenCategory.CONSTCHAR, 74);
		terminaisMap.put(TokenCategory.CONSTCCHAR, 74);
		predectiveTableMap.put(NonTerminalName.RETURNFAT, terminaisMap);
		terminaisMap = new HashMap<TokenCategory, Integer>();
	}

}
