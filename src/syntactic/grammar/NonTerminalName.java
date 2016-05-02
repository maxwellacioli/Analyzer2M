package syntactic.grammar;

public enum NonTerminalName {
	
	PROGRAM(1), 
	FUNCTIONS(2),
	MAJORF(3),
	PARAMS(4),
	PARAMSFAT(5),
	LISTPARAMS(6),
	LISTPARAMSFAT(7),
	TYPE(8),
	RETURNTYPE(9),
	RETURNTYPEFAT(10),
	NAME(11),
	NAMEFAT(12),
	ESCOPE(13),
	COMMANDS(14),
	CMD(15),
	DECLARATION(16),
	CMDFAT(17),
	ATTRIBUTION(18),
	VALUE(19),
	ARRAY(20),
	ARRAYFAT(21),
	ELEMENTS(22),
	ELEMENTSFAT(23),
	CONSTANT(24),
	FUNCCALL(25),
	LISTPARAMSCALL(26),
	LISTPARAMSCALLFAT(27),
	PARAMITEM(28),
	PRINTOUT(29),
	MESSAGE(30),
	MESSAGEFAT(31),
	READIN(32),
	IFELSE(33),
	IF(34),
	ELSEIF(35),
	ELSE(36),
	WHILE(37),
	DOWHILE(38),
	ITERATOR(39),
	RETURN(40),
	RETURNFAT(41),
	EXPRESSION(42);
	
	private int nonTerminalValue;
	
	private NonTerminalName(int value) {
		this.nonTerminalValue = value;
	}
	
	public int getNonTerminalValue() {
		return nonTerminalValue;
	}
}
