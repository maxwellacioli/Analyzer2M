package syntactic.grammar;

public class NonTerminal extends Symbol {

	private NonTerminalName name;

	public NonTerminal(NonTerminalName name) {
		super(false, name.getNonTerminalValue());
		this.name = name;
	}

	public NonTerminalName getName() {
		return name;
	}
}
