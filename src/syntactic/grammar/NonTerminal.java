package syntactic.grammar;


public class NonTerminal extends Symbol{
	
	public NonTerminal(NonTerminalName name) {
		super(false, name.getNonTerminalValue());
	}
}