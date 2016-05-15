package syntactic.grammar;

import java.util.ArrayList;
import java.util.List;

import lexical.TokenCategory;

public class OperatorsGrammar {
	private List<Derivation> operatorGrammarArray;
	private Derivation operatorDerivation;
	private List<TokenCategory> operatorsGrammarSymbols;
	private static OperatorsGrammar operatorsGrammarSingleton;

	private OperatorsGrammar() {
		operatorGrammarArray = new ArrayList<Derivation>();
		operatorsGrammarSymbols = new ArrayList<TokenCategory>();

		loadOperatorGrammar();
		loadOperatorsGrammarSymbols();
	}

	public List<TokenCategory> getOperatorsGrammarSymbols() {
		return operatorsGrammarSymbols;
	}

	private void loadOperatorsGrammarSymbols() {
		operatorsGrammarSymbols.add(TokenCategory.OPARITADIT);
		operatorsGrammarSymbols.add(TokenCategory.OPARITMULT);
		operatorsGrammarSymbols.add(TokenCategory.OPARITEXP);
		operatorsGrammarSymbols.add(TokenCategory.OPNEGUN);
		operatorsGrammarSymbols.add(TokenCategory.OPNEGLOGIC);
		operatorsGrammarSymbols.add(TokenCategory.PARAMBEGIN);
		operatorsGrammarSymbols.add(TokenCategory.PARAMEND);
		operatorsGrammarSymbols.add(TokenCategory.OPLOGICOR);
		operatorsGrammarSymbols.add(TokenCategory.OPLOGICAND);
		operatorsGrammarSymbols.add(TokenCategory.OPREL1);
		operatorsGrammarSymbols.add(TokenCategory.OPREL2);
		operatorsGrammarSymbols.add(TokenCategory.CONSTNUMINT);
		operatorsGrammarSymbols.add(TokenCategory.CONSTNUMDEC);
		operatorsGrammarSymbols.add(TokenCategory.CONSTLOGIC);
		operatorsGrammarSymbols.add(TokenCategory.CONSTCHAR);
		operatorsGrammarSymbols.add(TokenCategory.CONSTCCHAR);
		operatorsGrammarSymbols.add(TokenCategory.ID);
		operatorsGrammarSymbols.add(TokenCategory.ARRAYBEGIN);
		operatorsGrammarSymbols.add(TokenCategory.ARRAYEND);
	}

	public static OperatorsGrammar getInstance() {
		if (operatorsGrammarSingleton == null) {
			operatorsGrammarSingleton = new OperatorsGrammar();
		}
		return operatorsGrammarSingleton;
	}

	public Derivation getOperatorDerivation(int index) {
		return operatorGrammarArray.get(index);
	}

	private void loadOperatorGrammar() {
		// (0)EXPRESSION = EXPRESSION OPLOGICOR EXPRESSION
		operatorDerivation = new Derivation();
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorDerivation.addSymbol(new Terminal(TokenCategory.OPLOGICOR));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorGrammarArray.add(operatorDerivation);

		// (1)EXPRESSION = EXPRESSION OPLOGICAND EXPRESSION
		operatorDerivation = new Derivation();
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorDerivation.addSymbol(new Terminal(TokenCategory.OPLOGICAND));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorGrammarArray.add(operatorDerivation);

		// (2)EXPRESSION = EXPRESSION OPREL2 EXPRESSION
		operatorDerivation = new Derivation();
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorDerivation.addSymbol(new Terminal(TokenCategory.OPREL2));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorGrammarArray.add(operatorDerivation);

		// (3)EXPRESSION = EXPRESSION OPREL1 EXPRESSION
		operatorDerivation = new Derivation();
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorDerivation.addSymbol(new Terminal(TokenCategory.OPREL1));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorGrammarArray.add(operatorDerivation);

		// (4)EXPRESSION = EXPRESSION OPARITADIT EXPRESSION
		operatorDerivation = new Derivation();
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorDerivation.addSymbol(new Terminal(TokenCategory.OPARITADIT));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorGrammarArray.add(operatorDerivation);

		// (5)EXPRESSION = EXPRESSION OPARITMULT EXPRESSION
		operatorDerivation = new Derivation();
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorDerivation.addSymbol(new Terminal(TokenCategory.OPARITMULT));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorGrammarArray.add(operatorDerivation);

		// (6)EXPRESSION = EXPRESSION OPNEGUN EXPRESSION
		operatorDerivation = new Derivation();
		operatorDerivation.addSymbol(new Terminal(TokenCategory.OPNEGUN));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorGrammarArray.add(operatorDerivation);

		// (7)EXPRESSION = EXPRESSION OPNEGLOGIC EXPRESSION
		operatorDerivation = new Derivation();
		operatorDerivation.addSymbol(new Terminal(TokenCategory.OPNEGLOGIC));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorGrammarArray.add(operatorDerivation);

		// (8)EXPRESSION = EXPRESSION OPARITEXP EXPRESSION
		operatorDerivation = new Derivation();
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorDerivation.addSymbol(new Terminal(TokenCategory.OPARITEXP));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorGrammarArray.add(operatorDerivation);

		// (9)EXPRESSION = PARAMBEGIN EXPRESSION PARAMEND
		operatorDerivation = new Derivation();
		operatorDerivation.addSymbol(new Terminal(TokenCategory.PARAMBEGIN));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorDerivation.addSymbol(new Terminal(TokenCategory.PARAMEND));
		operatorGrammarArray.add(operatorDerivation);

		// (10)EXPRESSION = CONSTNUMINT
		operatorDerivation = new Derivation();
		operatorDerivation.addSymbol(new Terminal(TokenCategory.CONSTNUMINT));
		operatorGrammarArray.add(operatorDerivation);

		// (11)EXPRESSION = CONSTNUMDEC
		operatorDerivation = new Derivation();
		operatorDerivation.addSymbol(new Terminal(TokenCategory.CONSTNUMDEC));
		operatorGrammarArray.add(operatorDerivation);

		// (12)EXPRESSION = CONSTLOGIC
		operatorDerivation = new Derivation();
		operatorDerivation.addSymbol(new Terminal(TokenCategory.CONSTLOGIC));
		operatorGrammarArray.add(operatorDerivation);

		// (13)EXPRESSION = CONSTCHAR
		operatorDerivation = new Derivation();
		operatorDerivation.addSymbol(new Terminal(TokenCategory.CONSTCHAR));
		operatorGrammarArray.add(operatorDerivation);

		// (14)EXPRESSION = CONSTCCHAR
		operatorDerivation = new Derivation();
		operatorDerivation.addSymbol(new Terminal(TokenCategory.CONSTCCHAR));
		operatorGrammarArray.add(operatorDerivation);

		// (15)EXPRESSION = ID
		operatorDerivation = new Derivation();
		operatorDerivation.addSymbol(new Terminal(TokenCategory.ID));
		operatorGrammarArray.add(operatorDerivation);

		// (16)EXPRESSION = ID ARRAYBEGIN EXPRESSION ARRAYEND
		operatorDerivation = new Derivation();
		operatorDerivation.addSymbol(new Terminal(TokenCategory.ID));
		operatorDerivation.addSymbol(new Terminal(TokenCategory.ARRAYBEGIN));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorDerivation.addSymbol(new Terminal(TokenCategory.ARRAYEND));
		operatorGrammarArray.add(operatorDerivation);
	}

}
