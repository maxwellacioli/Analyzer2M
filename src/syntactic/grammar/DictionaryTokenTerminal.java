package syntactic.grammar;

import java.util.HashMap;

import lexical.Token;
import lexical.TokenCategory;

public class DictionaryTokenTerminal {
	private HashMap<TokenCategory, TerminalCategory> dictionary;
	private static DictionaryTokenTerminal dictionarySingleton;

	private DictionaryTokenTerminal() {
		dictionary = new HashMap<TokenCategory, TerminalCategory>();

		loadDictionary();
	}

	public static DictionaryTokenTerminal getInstance() {
		if (dictionarySingleton == null) {
			dictionarySingleton = new DictionaryTokenTerminal();
		}
		return dictionarySingleton;
	}

	public Terminal getTerminal(Token token) {
		Terminal terminal = new Terminal(dictionary.get(token.getCategory()));

		return terminal;
	}

	private void loadDictionary() {
		dictionary.put(TokenCategory.MAJOR, TerminalCategory.MAJOR);
		dictionary.put(TokenCategory.ID, TerminalCategory.ID);
		dictionary.put(TokenCategory.TEMPTY, TerminalCategory.TEMPTY);
		dictionary.put(TokenCategory.TINT, TerminalCategory.TINT);
		dictionary.put(TokenCategory.TLONG, TerminalCategory.TLONG);
		dictionary.put(TokenCategory.TLOGIC, TerminalCategory.TLOGIC);
		dictionary.put(TokenCategory.TCHAR, TerminalCategory.TCHAR);
		dictionary.put(TokenCategory.TCCHAR, TerminalCategory.TCCHAR);
		dictionary.put(TokenCategory.TDEC, TerminalCategory.TDEC);
		dictionary.put(TokenCategory.ESCBEGIN, TerminalCategory.ESCBEGIN);
		dictionary.put(TokenCategory.ESCEND, TerminalCategory.ESCEND);
		dictionary.put(TokenCategory.PARAMBEGIN, TerminalCategory.PARAMBEGIN);
		dictionary.put(TokenCategory.PARAMEND, TerminalCategory.PARAMEND);
		dictionary.put(TokenCategory.ARRAYBEGIN, TerminalCategory.ARRAYBEGIN);
		dictionary.put(TokenCategory.ARRAYEND, TerminalCategory.ARRAYEND);
		dictionary.put(TokenCategory.TERM, TerminalCategory.TERM);
		dictionary.put(TokenCategory.SEP1, TerminalCategory.SEP1);
		dictionary.put(TokenCategory.SEP2, TerminalCategory.SEP2);
		dictionary.put(TokenCategory.CONSTNUMINT, TerminalCategory.CONSTNUMINT);
		dictionary.put(TokenCategory.CONSTNUMDEC, TerminalCategory.CONSTNUMDEC);
		dictionary.put(TokenCategory.CONSTLOGIC, TerminalCategory.CONSTLOGIC);
		dictionary.put(TokenCategory.CONSTCHAR, TerminalCategory.CONSTCHAR);
		dictionary.put(TokenCategory.CONSTCCHAR, TerminalCategory.CONSTCCHAR);
		dictionary.put(TokenCategory.PRIF, TerminalCategory.PRIF);
		dictionary.put(TokenCategory.PRELSE, TerminalCategory.PRELSE);
		dictionary.put(TokenCategory.PRELSEIF, TerminalCategory.PRELSEIF);
		dictionary.put(TokenCategory.PRITERATOR, TerminalCategory.PRITERATOR);
		dictionary.put(TokenCategory.PRDO, TerminalCategory.PRDO);
		dictionary.put(TokenCategory.PRWHILE, TerminalCategory.PRWHILE);
		dictionary.put(TokenCategory.PRPRINTOUT, TerminalCategory.PRPRINTOUT);
		dictionary.put(TokenCategory.PRREADIN, TerminalCategory.PRREADIN);
		dictionary.put(TokenCategory.PRRETURN, TerminalCategory.PRRETURN);
		dictionary.put(TokenCategory.OPLOGICAND, TerminalCategory.OPLOGICAND);
		dictionary.put(TokenCategory.OPLOGICOR, TerminalCategory.OPLOGICOR);
		dictionary.put(TokenCategory.OPNEGLOGIC, TerminalCategory.OPNEGLOGIC);
		dictionary.put(TokenCategory.OPARITADIT, TerminalCategory.OPARITADIT);
		dictionary.put(TokenCategory.OPARITMULT, TerminalCategory.OPARITMULT);
		dictionary.put(TokenCategory.OPARITEXP, TerminalCategory.OPARITEXP);
		dictionary.put(TokenCategory.OPNEGUN, TerminalCategory.OPNEGUN);
		dictionary.put(TokenCategory.OPREL1, TerminalCategory.OPREL1);
		dictionary.put(TokenCategory.OPREL2, TerminalCategory.OPREL2);
		dictionary.put(TokenCategory.OPATRIB, TerminalCategory.OPATRIB);
		dictionary.put(TokenCategory.OPCONC, TerminalCategory.OPCONC);
	}
}
