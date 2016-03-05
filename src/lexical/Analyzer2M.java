package lexical;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Analyzer2M {

	private List<String> linesList = new ArrayList<>();
	private int currentLine, currentColumn = 0;

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
		int tkBeginColumn = currentColumn;

		// Percorre a linha a partir da proxima coluna a ser analisada lendo
		// caracter a caracter
		currentChar = line.charAt(currentColumn);

		// Enquanto nao for encontrado um simbolo especial, os caracteres
		// serao
		// concatenados
		// em uma string que devera ser um token identificador ou palavra
		// chave.
		while (!LexicalTable.symbolList.contains(currentChar)) {
			tkValue += currentChar;

			// Vai para o proximo
			currentColumn++;
			if (currentColumn < line.length()) {
				currentChar = line.charAt(currentColumn);
			} else {
				break;
			}
		}

		if(currentChar == ' ') {
			currentColumn++;
			return nextToken();
		}
		else if (tkValue == "") {
			tkValue += currentChar;
			currentColumn++;

			if (currentChar == '"') {
				while(currentColumn < line.length()) {
					currentChar = line.charAt(currentColumn);
					tkValue += currentChar;
					currentColumn++;
					if(currentChar == '"') {
						break;
					}
				}
			}

			// Tratar aspas e alguns operadores, conteudo da string pode ter
			// simbolos
		}

		token = new Token();

		token.setValue(tkValue.trim());
		token.setLine(currentLine);
		token.setColumn(tkBeginColumn);
		token.setCategory(analyzeCategory(tkValue)); // Reconhecer o tipo do
														// token

		return token;

	}

	private TokenCategory analyzeCategory(String tkValue) {

		if (LexicalTable.keyWordMap.containsKey(tkValue)) {
			return LexicalTable.keyWordMap.get(tkValue);
		}
		return null;
	}
}
