package syntactic.grammar;

import lexical.Token;
import lexical.TokenCategory;

public class Terminal extends Symbol {

	private TokenCategory category;

	// private Token token;

	public Terminal(TokenCategory category) {

		super(true, category.getCategoryValue());
		this.category = category;
	}

	public TokenCategory getCategory() {
		return category;
	}
}
