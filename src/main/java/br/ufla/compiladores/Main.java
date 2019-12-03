package br.ufla.compiladores;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import br.ufla.compiladores.scanner.Scanner;
import br.ufla.compiladores.scanner.table.LexicalCorrector;
import br.ufla.compiladores.scanner.table.SymbolTable;

public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {
		Scanner scanner = new Scanner(CharStreams.fromPath(Path.of(Main.class.getResource("Arquivo.jminus").toURI())));
		List<? extends Token> tokens = scanner.getAllTokens();
		for (Token token : tokens) {
			if (token.getType() == Scanner.NOT_IDENTIFIER) {
				LexicalCorrector.panicMode(token);
			}
		}
		SymbolTable table = new SymbolTable();
		System.out.println(table);
	}

}
