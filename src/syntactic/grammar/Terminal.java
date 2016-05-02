package syntactic.grammar;

public class Terminal extends Symbol {

	TerminalCategory category;

	public Terminal(TerminalCategory category) {

		super(true, category.getTerminalValue());
		this.category = category;
	}
	
	public TerminalCategory getCategory() {
		return category;
	}
}
