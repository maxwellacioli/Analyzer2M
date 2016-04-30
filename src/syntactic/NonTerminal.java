package syntactic;

public class NonTerminal extends Symbol{
	
	public NonTerminal(NonTerminalName terminalName) {
		super(false, terminalName.getNonTerminalValue());
	}
}
