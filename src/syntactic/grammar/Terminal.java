package syntactic.grammar;

import lexical.TokenCategory;

public class Terminal extends Symbol {

	private TokenCategory category;

	public Terminal(TokenCategory category) {

		super(true, category.getCategoryValue());
		this.category = category;
	}

	public TokenCategory getCategory() {
		return category;
	}
}
