package lexical;

public class Token {
	
	private String value;
	private TokenCategory category;
	private int line;
	private int column;
	
	public Token() {
		
		
	}
	
	@Override
	public String toString() {
		return "<" + line + "," + column + "> " + category + " = '" + value + "'";
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public TokenCategory getCategory() {
		return category;
	}

	public void setCategory(TokenCategory category) {
		this.category = category;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	
	
}
