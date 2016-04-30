package syntactic;

import java.util.HashMap;

public class PredectiveTable {
	private HashMap predectiveTableMap;
	private HashMap terminaisMap;

	public PredectiveTable() {
		terminaisMap = new HashMap<Integer, Integer>();
		predectiveTableMap = new HashMap<Integer, HashMap<Integer, Integer>>();
	}

	private void loadPredectiveTableMap() {
		
		terminaisMap.put(TerminalCategory.MAJOR, 1);
		terminaisMap.put(TerminalCategory.ID, 1);
		
		predectiveTableMap.put(NonTerminalName.PROGRAM, terminaisMap);
		
	}

}
