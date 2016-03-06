package lexical;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Analyzer2M {

	private List<String> linesList = new ArrayList<>();
	private int currentLine, currentColumn, tkBeginColumn = 0;
	
	private static final char LINE_BREAK = '\0';

	public static void main(String[] args) {

		Token token;

		Analyzer2M analyzer2M = new Analyzer2M();

		analyzer2M.readFile();

		while (analyzer2M.hasMoreTokens()) {
			token = analyzer2M.nextToken();
			System.out.println(token);
		}

	}

	private boolean hasMoreTokens() {
		String line = linesList.get(currentLine);

		if (currentColumn < line.length()) {
			return true;
		} else {
			currentLine++;
			currentColumn = 0;

			if (currentLine < linesList.size()) {
				return true;
			}
		}
		return false;
	}

	private void readFile() {

		BufferedReader br;

		try {
			br = new BufferedReader(new FileReader("files/hello.2m"));

			String line = br.readLine();

			while (line != null) {
				linesList.add(line);
				line = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Token nextToken() {

		Token token;

		String line = linesList.get(currentLine);
		char currentChar;
		String tkValue = "";

		tkBeginColumn = currentColumn;

		// Percorre a linha a partir da proxima coluna a ser analisada lendo
		// caracter a caracter
		currentChar = line.charAt(currentColumn);

		// Ignora sequência de espaços vazios
		while (currentChar == ' ') {
			currentChar = nextChar();
			if (currentChar == LINE_BREAK) {
				break;
			}
		}

		// Enquanto nao for encontrado um simbolo especial, os caracteres
		// serao concatenados em uma string que devera ser um token
		// identificador ou palavra chave.
		while (!LexicalTable.symbolList.contains(currentChar)) {
			tkValue += currentChar;

			// Vai para o proximo
			currentChar = nextChar();
			if (currentChar == LINE_BREAK) {
				break;
			}
			
		}

		if (tkValue == "") {

			if (currentChar == '"') {
				tkValue += currentChar;				
				currentChar = nextChar();
				
				while(currentChar != LINE_BREAK) {
					
					tkValue += currentChar;
					currentChar = nextChar();
					
					if(currentChar == '"') {
				
						tkValue += currentChar;
						currentColumn++;
						break;
						
					}
					
				}
					
			} else {
				
				tkValue += currentChar;
				currentColumn++;
				
			}
			
		}

		token = new Token();

		token.setValue(tkValue.trim());
		token.setLine(currentLine);
		token.setColumn(tkBeginColumn);
		token.setCategory(analyzeCategory(tkValue));
		// Reconhecer o tipo do token

		return token;

	}

	private TokenCategory analyzeCategory(String tkValue) {

		
		
		if(LexicalTable.lexemMap.containsKey(tkValue)) {
			return LexicalTable.lexemMap.get(tkValue);
			
		} else {
			
			// TODO Validar constante string, char e numérica
			
		}
		return TokenCategory.UNKNOWN;
	}
	
	

	private char nextChar() {
		
		String line = linesList.get(currentLine);
		currentColumn++;
		
		if(currentColumn < line.length()) {
			return line.charAt(currentColumn);
		} else {
			return LINE_BREAK;
		}
		
	}
	
	private boolean isCchar(String tkValue) {
		if(tkValue.startsWith("\"") && tkValue.endsWith("\"")) {
			return true;
		}
		System.err.println("CCHAR no formato errado");
		return false;
	}
	
	private boolean isChar(String tkValue) {
		if(tkValue.matches("\'.\'")) {
			return true;
		}
		System.err.println("CHAR no formato errado");
		return false;
	}
	
	private boolean isIdentifier() {
		return false;
	}
	
}
