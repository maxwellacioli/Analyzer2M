package lexical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LexicalTable {

	public static Map<String, TokenCategory> lexemMap = new HashMap<>();
	public static Map<String, TokenCategory> delimitadorMap = new HashMap<>();
	public static List<Character> symbolList = new ArrayList<>();

	static {

		// Operadores

		lexemMap.put("+", TokenCategory.OPARITADIT);
		lexemMap.put("-", TokenCategory.OPARITADIT);
		lexemMap.put("*", TokenCategory.OPARITMULT);
		lexemMap.put("/", TokenCategory.OPARITMULT);
		lexemMap.put("^", TokenCategory.OPARITEXP);
		lexemMap.put("+", TokenCategory.OPARITADIT);

		lexemMap.put("<", TokenCategory.OPREL1);
		lexemMap.put(">", TokenCategory.OPREL1);
		lexemMap.put("<=", TokenCategory.OPREL1);
		lexemMap.put(">=", TokenCategory.OPREL1);
		lexemMap.put("==", TokenCategory.OPREL2);
		lexemMap.put("~=", TokenCategory.OPREL2);

		lexemMap.put("=", TokenCategory.OPATRIB);
		lexemMap.put("++", TokenCategory.OPCONC);

		// Delimitadores

		lexemMap.put("(", TokenCategory.PARAMBEGIN);
		lexemMap.put(")", TokenCategory.PARAMEND);
		lexemMap.put("[", TokenCategory.ESCBEGIN);
		lexemMap.put("]", TokenCategory.ESCEND);
		lexemMap.put("{", TokenCategory.ARRAYBEGIN);
		lexemMap.put("}", TokenCategory.ARRAYEND);
		lexemMap.put("/$", TokenCategory.COMMENT);

		// Terminador

		lexemMap.put("#", TokenCategory.TERM);

		// Separador

		lexemMap.put(",", TokenCategory.SEP1);
		lexemMap.put(";", TokenCategory.SEP2);

		// Palavras-reservadas (comandos e operadores)

		lexemMap.put("char", TokenCategory.TCHAR);
		lexemMap.put("cchar", TokenCategory.TCCHAR);
		lexemMap.put("dec", TokenCategory.TDEC);
		lexemMap.put("int", TokenCategory.TINT);
		lexemMap.put("logic", TokenCategory.TLOGIC);
		lexemMap.put("major", TokenCategory.MAJOR);
		lexemMap.put("if", TokenCategory.PRIF);
		lexemMap.put("else", TokenCategory.PRELSE);
		lexemMap.put("elseif", TokenCategory.PRELSEIF);
		lexemMap.put("iterator", TokenCategory.PRITERATOR);
		lexemMap.put("while", TokenCategory.PRWHILE);
		lexemMap.put("do", TokenCategory.PRDO);
		lexemMap.put("truth", TokenCategory.CONSTLOGIC);
		lexemMap.put("false", TokenCategory.CONSTLOGIC);
		lexemMap.put("not", TokenCategory.OPNEGLOGIC);
		lexemMap.put("and", TokenCategory.OPLOGICAND);
		lexemMap.put("or", TokenCategory.OPLOGICOR);
		lexemMap.put("empty", TokenCategory.TEMPTY);
		lexemMap.put("printout", TokenCategory.PRPRINTOUT);
		lexemMap.put("readin", TokenCategory.PRREADIN);
		lexemMap.put("return", TokenCategory.PRRETURN);
		
		// Símbolos que podem indicador próximo token
		symbolList.add(' ');
		symbolList.add(',');
		symbolList.add(';');
		symbolList.add('+');
		symbolList.add('-');
		symbolList.add('*');
		symbolList.add('\\');
		symbolList.add('/');
		symbolList.add('#');
		symbolList.add('$');
		symbolList.add('<');
		symbolList.add('>');
		symbolList.add('=');
		symbolList.add('~');
		symbolList.add('(');
		symbolList.add(')');
		symbolList.add('[');
		symbolList.add(']');
		symbolList.add('{');
		symbolList.add('}');
		symbolList.add('\'');
		symbolList.add('"');

	}

}
