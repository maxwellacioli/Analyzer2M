package syntactic.grammar;

public class NonTerminal extends Symbol {

	private NonTerminalName name;
	private String tipo;
	private int index;

	public NonTerminal(NonTerminalName name) {
		super(false, name.getNonTerminalValue());
		this.name = name;
	}

	public NonTerminalName getName() {
		return name;
	}
	
	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
