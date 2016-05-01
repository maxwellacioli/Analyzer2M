package syntactic.grammar;


public class Terminal extends Symbol {

	public Terminal(TerminalCategory category) {
		super(true, category.getTerminalValue());
	}
		
}
