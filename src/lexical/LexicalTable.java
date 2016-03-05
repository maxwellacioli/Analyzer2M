package lexical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LexicalTable {

	public static Map<String, TokenCategory> keyWordMap = new HashMap<>();
	public static List<Character> symbolList = new ArrayList<>();
	
	static {
		
		keyWordMap.put("char", TokenCategory.TCHAR);
		keyWordMap.put("cchar", TokenCategory.TCCHAR);
		keyWordMap.put("dec", TokenCategory.TDEC);
		keyWordMap.put("int", TokenCategory.TINT);
		keyWordMap.put("logic", TokenCategory.TLOGIC);
		keyWordMap.put("major", TokenCategory.MAJOR);
		keyWordMap.put("if", TokenCategory.PRIF);
		keyWordMap.put("else", TokenCategory.PRELSE);
		keyWordMap.put("elseif", TokenCategory.PRELSEIF);
		keyWordMap.put("iterator", TokenCategory.PRITERATOR);
		keyWordMap.put("while", TokenCategory.PRWHILE);
		keyWordMap.put("do", TokenCategory.PRDO);
		keyWordMap.put("truth", TokenCategory.OPLOGIC);
		keyWordMap.put("false", TokenCategory.OPLOGIC);
		keyWordMap.put("not", TokenCategory.OPNEGLOGIC);
		keyWordMap.put("and", TokenCategory.OPLOGIC);
		keyWordMap.put("or", TokenCategory.OPLOGIC);
		keyWordMap.put("empty", TokenCategory.TEMPTY);
				
		symbolList.add(' ');
		symbolList.add(',');
		symbolList.add(';');		
		symbolList.add('+');
		symbolList.add('-');
		symbolList.add('*');
		symbolList.add('\\');
		symbolList.add('/');
		symbolList.add('_');
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
