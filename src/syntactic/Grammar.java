package syntactic;

import java.util.ArrayList;
import java.util.HashMap;

public class Grammar {
	private HashMap<Integer, ArrayList<Symbol>> grammarMap;

	public Grammar() {

		grammarMap = new HashMap<Integer, ArrayList<Symbol>>();

		ArrayList<Symbol> symbolList = new ArrayList<Symbol>();

		symbolList.add(new Symbol(false, NonTerminal.FUNCTIONS));
		symbolList.add(new Symbol(false, NonTerminal.MAJOR));
		grammarMap.put(1, symbolList);
		
		symbolList.clear();
		
		symbolList.add(new Symbol(true, Terminal.ID));
		symbolList.add(new Symbol(false, NonTerminal.PARAMS));
		symbolList.add(new Symbol(false, NonTerminal.RETURNTYPE));
		symbolList.add(new Symbol(false, NonTerminal.ESCOPE));
		symbolList.add(new Symbol(false, NonTerminal.FUNCTIONS));
		
		symbolList.clear();
		
		symbolList.add(new Symbol(null, null));
		
		grammarMap.put(2, symbolList);
		

	}

	private ArrayList<Symbol> getList() {
		// TODO Auto-generated method stub
		return null;
	}
}
