package lexical;

public enum TokenCategory {

	MAJOR(1), 
	ID(2), 
	TEMPTY(3), 
	TINT(4), 
	TLONG(5), 
	TLOGIC(6), 
	TCHAR(7), 
	TCCHAR(8), 
	TDEC(9), 
	ESCBEGIN(10), 
	ESCEND(11),
	PARAMBEGIN(12), 
	PARAMEND(13), 
	ARRAYBEGIN(14), 
	ARRAYEND(15), 
	COMMENT(16), 
	TERM(17), 
	SEP1(18), 
	SEP2(19),
	CONSTNUMINT(20), 
	CONSTNUMDEC(21), 
	CONSTLOGIC(22), 
	CONSTCHAR(23), 
	CONSTCCHAR(24),
	PRIF(25), 
	PRELSE(26), 
	PRELSEIF(27), 
	PRITERATOR(28), 
	PRDO(29), 
	PRWHILE(30), 
	PRPRINTOUT(31), 
	PRREADIN(32),
	PRRETURN(33),
	OPLOGICAND(34), 
	OPLOGICOR(35), 
	OPNEGLOGIC(36),
	OPARITADIT(37), 
	OPARITMULT(38), 
	OPARITEXP(39), 
	OPNEGUN(40), 
	OPREL1(41), 
	OPREL2(42), 
	OPATRIB(43), 
	OPCONC(44), 
	UNKNOWN(45);
	
	private int value;
	
	private TokenCategory(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
