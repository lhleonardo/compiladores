package br.ufla.compiladores.scanner.table;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import br.ufla.compiladores.scanner.table.MeasureSimilarity;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import br.ufla.compiladores.scanner.Scanner;

import br.ufla.compiladores.scanner.Scanner;

public class LexicalCorrector {

	public static void panicMode(Token token) {
		String t = token.getText();
		boolean valido = false;
		if (Character.isDigit(t.charAt(0))) {
			System.out.print("Identifier cannot iniciate with number\n");
			return;
		}
		String copyT;
		for(int i = 0; i < t.length(); i++) {
			copyT = t.substring(0, i) + t.substring(i+1,t.length());
			Scanner scanner = new Scanner(CharStreams.fromString(copyT));
			Token newToken = scanner.getToken();
			if (newToken != null  && newToken.getType() != Scanner.NOT_IDENTIFIER) {
				valido = true;
				break;
			}
		}
		if (valido == true) {
			System.out.printf("Wrong word, did you mean \"%s\" ?",t);
		}
	}
	
}
