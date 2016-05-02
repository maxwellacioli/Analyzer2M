package syntactic.grammar;

import java.util.HashMap;

public class Grammar {
	
	private static Grammar grammarSingleton;
	
	private Grammar() { 
		
		grammarMap = new HashMap<Integer, Derivation>();
		loadGrammar();
		
	}

    public static Grammar getInstance() {
        if (grammarSingleton == null ) {
        	grammarSingleton = new Grammar();
        }
        return grammarSingleton;
    }
	
	private HashMap<Integer, Derivation> grammarMap;
	private Derivation derivationAux;

	public HashMap<Integer, Derivation> getGrammarMap() {
		return grammarMap;
	}
	
	private void loadGrammar() {
		
		// (1)FUNCTIONS MAJORF
		derivationAux = new Derivation();
		derivationAux.addDerivationSymbols(
				new NonTerminal(NonTerminalName.FUNCTIONS),
				new NonTerminal(NonTerminalName.MAJORF));		
		grammarPutDerivation(1, derivationAux);

		// (2)‘id’ PARAMS RETURNTYPE ESCOPE FUNCTIONS
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.ID),
				new NonTerminal(NonTerminalName.PARAMS),
				new NonTerminal(NonTerminalName.RETURNTYPE),
				new NonTerminal(NonTerminalName.ESCOPE),
				new NonTerminal(NonTerminalName.FUNCTIONS));
		grammarPutDerivation(2, derivationAux);

		// (3)Epsilon
		grammarPutDerivation(3, null);

		// (4)‘major’ ‘paramBegin’ ‘paramEnd’ ‘tEmpty’ ESCOPE
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.MAJOR), 
				new Terminal(TerminalCategory.PARAMBEGIN),
				new Terminal(TerminalCategory.PARAMEND),
				new Terminal(TerminalCategory.TEMPTY),
				new NonTerminal(NonTerminalName.ESCOPE));
		grammarPutDerivation(4, derivationAux);

		// (5)‘paramBegin’ PARAMSFAT
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.PARAMBEGIN),
				new NonTerminal(NonTerminalName.PARAMSFAT));
		grammarPutDerivation(5, derivationAux);

		// (6)‘paramEnd’
		derivationAux.addSymbol(new Terminal(TerminalCategory.PARAMEND));		
		grammarPutDerivation(6, derivationAux);

		// (7)LISTPARAMS ‘paramEnd’
		derivationAux.addDerivationSymbols(
				new NonTerminal(NonTerminalName.LISTPARAMS),
				new Terminal(TerminalCategory.PARAMEND));
		grammarPutDerivation(7, derivationAux);

		// (8)TYPE NAME LISTPARAMSFAT
		derivationAux.addDerivationSymbols(
				new NonTerminal(NonTerminalName.TYPE),
				new NonTerminal(NonTerminalName.NAME),
				new NonTerminal(NonTerminalName.LISTPARAMSFAT));
		grammarPutDerivation(8, derivationAux);
		
		// (9)‘sep1’ LISTPARAMS 
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.SEP1),
				new NonTerminal(NonTerminalName.LISTPARAMS));
		grammarPutDerivation(9, derivationAux);
		
		// (10)Epsilon
		grammarPutDerivation(10, null);
		
		// (11)‘tInt’ 
		derivationAux.addSymbol(new Terminal(TerminalCategory.TINT));		
		grammarPutDerivation(11, derivationAux);
		
		// (12)‘tLong’ 
		derivationAux.addSymbol(new Terminal(TerminalCategory.TLONG));		
		grammarPutDerivation(12, derivationAux);
		
		// (13)‘tLogic’ 
		derivationAux.addSymbol(new Terminal(TerminalCategory.TLOGIC));		
		grammarPutDerivation(13, derivationAux);
		
		// (14)‘tChar’ 
		derivationAux.addSymbol(new Terminal(TerminalCategory.TCHAR));		
		grammarPutDerivation(14, derivationAux);

		// (15)‘tCchar’ 
		derivationAux.addSymbol(new Terminal(TerminalCategory.TCCHAR));		
		grammarPutDerivation(15, derivationAux);

		// (16)‘tDec’ 
		derivationAux.addSymbol(new Terminal(TerminalCategory.TDEC));		
		grammarPutDerivation(16, derivationAux);

		// (17)‘tEmpty’ 
		derivationAux.addSymbol(new Terminal(TerminalCategory.TEMPTY));		
		grammarPutDerivation(17, derivationAux);

		// (18)TYPE RETURNTYPEFAT
		derivationAux.addDerivationSymbols(
				new NonTerminal(NonTerminalName.TYPE),
				new NonTerminal(NonTerminalName.RETURNTYPEFAT));
		grammarPutDerivation(18, derivationAux);

		// (19)‘arrayBegin’ ‘arrayEnd’
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.ARRAYBEGIN),
				new Terminal(TerminalCategory.ARRAYEND));
		grammarPutDerivation(19, derivationAux);

		// (20)Epsilon
		grammarPutDerivation(20, null);
				
		// (21)‘id’ NAMEFAT 
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.ID),
				new NonTerminal(NonTerminalName.NAMEFAT));
		grammarPutDerivation(21, derivationAux);
		
		// (22)‘arrayBegin’ ‘constNumInt’ ‘arrayEnd’
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.ARRAYBEGIN),
				new Terminal(TerminalCategory.CONSTNUMINT),
				new Terminal(TerminalCategory.ARRAYEND));
		grammarPutDerivation(22, derivationAux);
		
		// (23)Epsilon
		grammarPutDerivation(23, null);
		
		// (24)‘escBegin’ COMMANDS ‘escEnd’ ‘term’
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.ESCBEGIN),
				new NonTerminal(NonTerminalName.COMMANDS),
				new Terminal(TerminalCategory.ESCEND),
				new Terminal(TerminalCategory.TERM));
		grammarPutDerivation(24, derivationAux);
		
		// (25)CMD ‘term’ COMMANDS 
		derivationAux.addDerivationSymbols(
				new NonTerminal(NonTerminalName.CMD),
				new Terminal(TerminalCategory.TERM),
				new NonTerminal(NonTerminalName.COMMANDS));
		grammarPutDerivation(25, derivationAux);
		
		// (26)Epsilon
		grammarPutDerivation(26, null);
		
		// (27)DECLARATION
		derivationAux.addSymbol(new NonTerminal(NonTerminalName.DECLARATION));
		grammarPutDerivation(27, derivationAux);
		
		// (28)‘id’ CMDFAT 
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.ID),
				new NonTerminal(NonTerminalName.CMDFAT));
		grammarPutDerivation(28, derivationAux);
		
		// (29)PRINTOUT
		derivationAux.addSymbol(new NonTerminal(NonTerminalName.PRINTOUT));
		grammarPutDerivation(29, derivationAux);
		
		// (30)READIN
		derivationAux.addSymbol(new NonTerminal(NonTerminalName.READIN));
		grammarPutDerivation(30, derivationAux);
		
		// (31)IFELSE
		derivationAux.addSymbol(new NonTerminal(NonTerminalName.IFELSE));
		grammarPutDerivation(31, derivationAux);
		
		// (32)WHILE
		derivationAux.addSymbol(new NonTerminal(NonTerminalName.WHILE));
		grammarPutDerivation(32, derivationAux);
		
		// (33)DOWHILE
		derivationAux.addSymbol(new NonTerminal(NonTerminalName.DOWHILE));
		grammarPutDerivation(33, derivationAux);
		
		// (34)ITERATOR
		derivationAux.addSymbol(new NonTerminal(NonTerminalName.ITERATOR));
		grammarPutDerivation(34, derivationAux);

		// (35)RETURN
		derivationAux.addSymbol(new NonTerminal(NonTerminalName.RETURN));
		grammarPutDerivation(35, derivationAux);
		
		// (36)TYPE NAME
		derivationAux.addDerivationSymbols(
				new NonTerminal(NonTerminalName.TYPE),
				new NonTerminal(NonTerminalName.NAME));
		grammarPutDerivation(36, derivationAux);
		
		// (37)ATTRIBUTION
		derivationAux.addSymbol(new NonTerminal(NonTerminalName.ATTRIBUTION));
		grammarPutDerivation(37, derivationAux);
		
		// (38)FUNCCALL
		derivationAux.addSymbol(new NonTerminal(NonTerminalName.FUNCCALL));
		grammarPutDerivation(38, derivationAux);
		
		// (39)NAMEFAT ‘opAtrib’ VALUE 
		derivationAux.addDerivationSymbols(
				new NonTerminal(NonTerminalName.NAMEFAT),
				new Terminal(TerminalCategory.OPATRIB),
				new NonTerminal(NonTerminalName.VALUE));
		grammarPutDerivation(39, derivationAux);
		
		// (40)ATTRIBUTION
		derivationAux.addSymbol(new NonTerminal(NonTerminalName.ARRAY));
		grammarPutDerivation(40, derivationAux);
		
		// (41)‘arrayBegin’ ARRAYFAT
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.ARRAYBEGIN),
				new NonTerminal(NonTerminalName.ARRAYFAT));
		grammarPutDerivation(41, derivationAux);
		
		// (42)ELEMENTS ‘arrayEnd’ 
		derivationAux.addDerivationSymbols(
				new NonTerminal(NonTerminalName.ELEMENTS),
				new Terminal(TerminalCategory.ARRAYEND));
		grammarPutDerivation(42, derivationAux);		
		
		// (43)‘arrayEnd’ 
		derivationAux.addSymbol(new Terminal(TerminalCategory.ARRAYEND));		
		grammarPutDerivation(43, derivationAux);
		
		// (44)CONSTANT ELEMENTSFAT 
		derivationAux.addDerivationSymbols(
				new NonTerminal(NonTerminalName.CONSTANT),
				new NonTerminal(NonTerminalName.ELEMENTSFAT));
		grammarPutDerivation(44, derivationAux);
		
		// (45)‘sep1’ ELEMENTS  
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.SEP1),
				new NonTerminal(NonTerminalName.ELEMENTS));
		grammarPutDerivation(45, derivationAux);
		
		// (46)Epsilon
		grammarPutDerivation(46, null);		
		
		// (47)‘constNumInt’ 
		derivationAux.addSymbol(new Terminal(TerminalCategory.CONSTNUMINT));		
		grammarPutDerivation(47, derivationAux);
		
		// (48)‘constNumDec’ 
		derivationAux.addSymbol(new Terminal(TerminalCategory.CONSTNUMDEC));		
		grammarPutDerivation(48, derivationAux);
		
		// (49)‘constLogic’
		derivationAux.addSymbol(new Terminal(TerminalCategory.CONSTLOGIC));		
		grammarPutDerivation(49, derivationAux);
		
		// (50)‘constChar’
		derivationAux.addSymbol(new Terminal(TerminalCategory.CONSTCHAR));		
		grammarPutDerivation(50, derivationAux);
		
		// (51)‘constCchar’ 
		derivationAux.addSymbol(new Terminal(TerminalCategory.CONSTCCHAR));		
		grammarPutDerivation(51, derivationAux);
		
		// (52)‘paramBegin’ LISTPARAMSCALL ‘paramEnd’
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.PARAMBEGIN),
				new NonTerminal(NonTerminalName.LISTPARAMSCALL),
				new Terminal(TerminalCategory.PARAMEND));
		grammarPutDerivation(52, derivationAux);
		
		// (53)PARAMITEM LISTPARAMSCALLFAT  
		derivationAux.addDerivationSymbols(
				new NonTerminal(NonTerminalName.PARAMITEM),
				new NonTerminal(NonTerminalName.LISTPARAMSCALLFAT));
		grammarPutDerivation(53, derivationAux);
		
		// (54)‘sep1’ LISTPARAMSCALL
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.SEP1),
				new NonTerminal(NonTerminalName.LISTPARAMSCALL));
		grammarPutDerivation(54, derivationAux);
		
		// (55)Epsilon
		grammarPutDerivation(55, null);
		
		// (56)CONSTANT
		derivationAux.addSymbol(new NonTerminal(NonTerminalName.CONSTANT));
		grammarPutDerivation(56, derivationAux);
		
		// (57)NAME
		derivationAux.addSymbol(new NonTerminal(NonTerminalName.NAME));
		grammarPutDerivation(57, derivationAux);
		
		// (58)‘prPrintout’ ‘paramBegin’ MESSAGE ‘paramEnd’
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.PRPRINTOUT),
				new Terminal(TerminalCategory.PARAMBEGIN),
				new NonTerminal(NonTerminalName.MESSAGE),
				new Terminal(TerminalCategory.PARAMEND));
		grammarPutDerivation(58, derivationAux);
		
		// (59)‘constCchar’ MESSAGEFAT
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.CONSTCCHAR),
				new NonTerminal(NonTerminalName.MESSAGEFAT));
		grammarPutDerivation(59, derivationAux);
		
		// (60)NAME MESSAGEFAT
		derivationAux.addDerivationSymbols(
				new NonTerminal(NonTerminalName.NAME),
				new NonTerminal(NonTerminalName.MESSAGEFAT));
		grammarPutDerivation(60, derivationAux);

		// (61)‘opConc’ MESSAGE
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.OPCONC),
				new NonTerminal(NonTerminalName.MESSAGE));
		grammarPutDerivation(61, derivationAux);
		
		// (62)Epsilon
		grammarPutDerivation(62, null);
		
		// (63)‘prReadin’ ‘paramBegin’ TYPE ‘sep1’ NAME ‘paramEnd’
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.PRREADIN),
				new Terminal(TerminalCategory.PARAMBEGIN),
				new NonTerminal(NonTerminalName.TYPE),
				new Terminal(TerminalCategory.SEP1),
				new NonTerminal(NonTerminalName.NAME),
				new Terminal(TerminalCategory.PARAMEND));
		grammarPutDerivation(63, derivationAux);
		
		// (64)IF ELSEIF ELSE
		derivationAux.addDerivationSymbols(
				new NonTerminal(NonTerminalName.IF),
				new NonTerminal(NonTerminalName.ELSEIF),
				new NonTerminal(NonTerminalName.ELSE));
		grammarPutDerivation(64, derivationAux);
		
		// (65)‘prIf’ ‘paramBegin’ EXPRESSION ‘paramEnd’ ‘escBegin’ COMMANDS ‘escEnd’
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.PRIF),
				new Terminal(TerminalCategory.PARAMBEGIN),
				new NonTerminal(NonTerminalName.EXPRESSION),
				new Terminal(TerminalCategory.PARAMEND),
				new Terminal(TerminalCategory.ESCBEGIN),
				new NonTerminal(NonTerminalName.COMMANDS),
				new Terminal(TerminalCategory.ESCEND));
		grammarPutDerivation(65, derivationAux);
		
		//(66)‘prElseIf’ paramBegin’ EXPRESSION ‘paramEnd’ ‘escBegin’ COMMANDS ‘escEnd’ ELSEIF
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.PRELSEIF), 
				new Terminal(TerminalCategory.PARAMBEGIN), 
				new NonTerminal(NonTerminalName.EXPRESSION), 
				new Terminal(TerminalCategory.PARAMEND), 
				new Terminal(TerminalCategory.ESCBEGIN), 
				new NonTerminal(NonTerminalName.COMMANDS), 
				new Terminal(TerminalCategory.ESCEND), 
				new NonTerminal(NonTerminalName.ELSEIF));
		grammarPutDerivation(66, derivationAux);
		
		// (67) Epsilon
		grammarPutDerivation(67, null);
		
		// (68)‘prElse’  ‘escBegin’ COMMANDS ‘escEnd’
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.PRELSE), 
				new Terminal(TerminalCategory.ESCBEGIN), 
				new NonTerminal(NonTerminalName.COMMANDS), 
				new Terminal(TerminalCategory.ESCEND));
		grammarPutDerivation(68, derivationAux);
		
		// (69) Epsilon
		grammarPutDerivation(69, null);
		
		//  (70)‘prWhile’ ‘paramBegin’ EXPRESSION ‘paramEnd’ ‘escBegin’ COMMANDS ‘escEnd’
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.PRWHILE), 
				new Terminal(TerminalCategory.PARAMBEGIN), 
				new NonTerminal(NonTerminalName.EXPRESSION), 
				new Terminal(TerminalCategory.PARAMEND), 
				new Terminal(TerminalCategory.ESCBEGIN), 
				new NonTerminal(NonTerminalName.COMMANDS), 
				new Terminal(TerminalCategory.ESCEND));
		grammarPutDerivation(70, derivationAux);
		
		// (71)‘prDo’ ‘escBegin’ COMMANDS ‘escEnd’ ‘prWhile’ ‘paramBegin’ EXPRESSION ‘paramEnd’
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.PRDO), 
				new Terminal(TerminalCategory.ESCBEGIN), 
				new NonTerminal(NonTerminalName.COMMANDS), 
				new Terminal(TerminalCategory.ESCEND), 
				new Terminal(TerminalCategory.PRWHILE), 
				new Terminal(TerminalCategory.PARAMBEGIN), 
				new NonTerminal(NonTerminalName.EXPRESSION), 
				new Terminal(TerminalCategory.PARAMEND));
		grammarPutDerivation(71, derivationAux);
		
		//  (72)‘prIterator’ ‘paramBegin’ ATTRIBUTION ‘sep2’ EXPRESSION ‘sep2’ ATTRIBUTION 
	    // ‘paramEnd’ ‘escBegin’ COMMANDS ‘escEnd’
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.PRITERATOR), 
				new Terminal(TerminalCategory.ESCBEGIN), 
				new NonTerminal(NonTerminalName.ATTRIBUTION), 
				new Terminal(TerminalCategory.SEP2), 
				new NonTerminal(NonTerminalName.EXPRESSION), 
				new Terminal(TerminalCategory.SEP2), 
				new NonTerminal(NonTerminalName.ATTRIBUTION), 
				new Terminal(TerminalCategory.PARAMEND), 
				new Terminal(TerminalCategory.ESCBEGIN), 
				new NonTerminal(NonTerminalName.COMMANDS), 
				new Terminal(TerminalCategory.ESCEND));
		grammarPutDerivation(72, derivationAux);
		
		//  (73)‘prReturn’ RETURNFAT
		derivationAux.addDerivationSymbols(
				new Terminal(TerminalCategory.PRRETURN), 
				new NonTerminal(NonTerminalName.RETURNFAT));
		grammarPutDerivation(73, derivationAux);
		
		// (74)CONSTANT
		derivationAux.addSymbol(new NonTerminal(NonTerminalName.CONSTANT));
		grammarPutDerivation(74, derivationAux);
		
		// (75)NAME
		derivationAux.addSymbol(new NonTerminal(NonTerminalName.NAME));
		grammarPutDerivation(75, derivationAux);
	}

	private void grammarPutDerivation(int key, Derivation derivation) {		
		grammarMap.put(key, derivation);		
		if(derivation != null) {			
			derivationAux = new Derivation();
		}
	}	
	
}
