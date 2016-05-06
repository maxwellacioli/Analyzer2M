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
		operatorDerivation = new Derivation();
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorDerivation.addSymbol(new Terminal(TerminalCategory.OPLOGICOR));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorGrammarArray.add(operatorDerivation);

		operatorDerivation = new Derivation();
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorDerivation.addSymbol(new Terminal(TerminalCategory.OPLOGICAND));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorGrammarArray.add(operatorDerivation);

		operatorDerivation = new Derivation();
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorDerivation.addSymbol(new Terminal(TerminalCategory.OPREL2));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorGrammarArray.add(operatorDerivation);

		operatorDerivation = new Derivation();
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorDerivation.addSymbol(new Terminal(TerminalCategory.OPREL1));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorGrammarArray.add(operatorDerivation);

		operatorDerivation = new Derivation();
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorDerivation.addSymbol(new Terminal(TerminalCategory.OPARITADIT));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorGrammarArray.add(operatorDerivation);

		operatorDerivation = new Derivation();
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorDerivation.addSymbol(new Terminal(TerminalCategory.OPARITMULT));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorGrammarArray.add(operatorDerivation);

		operatorDerivation = new Derivation();
		operatorDerivation.addSymbol(new Terminal(TerminalCategory.OPNEGUN));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorGrammarArray.add(operatorDerivation);

		operatorDerivation = new Derivation();
		operatorDerivation.addSymbol(new Terminal(TerminalCategory.OPNEGLOGIC));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorGrammarArray.add(operatorDerivation);

		operatorDerivation = new Derivation();
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorDerivation.addSymbol(new Terminal(TerminalCategory.OPARITEXP));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorGrammarArray.add(operatorDerivation);

		operatorDerivation = new Derivation();
		operatorDerivation.addSymbol(new Terminal(TerminalCategory.PARAMBEGIN));
		operatorDerivation
				.addSymbol(new NonTerminal(NonTerminalName.EXPRESSION));
		operatorDerivation.addSymbol(new Terminal(TerminalCategory.PARAMEND));
		operatorGrammarArray.add(operatorDerivation);

		operatorDerivation = new Derivation();
		operatorDerivation.addSymbol(new NonTerminal(NonTerminalName.CONSTANT));
		operatorGrammarArray.add(operatorDerivation);

		operatorDerivation = new Derivation();
		operatorDerivation.addSymbol(new NonTerminal(NonTerminalName.NAME));
		operatorGrammarArray.add(operatorDerivation);
	}
}
