package br.ufla.compiladores;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import br.ufla.compiladores.scanner.Scanner;
import br.ufla.compiladores.scanner.table.SymbolTable;

public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {
		Scanner scanner = new Scanner(CharStreams.fromPath(Path.of(Main.class.getResource("Arquivo.jminus").toURI())));
		List<? extends Token> tokens = scanner.getAllTokens();

		SymbolTable table = new SymbolTable();
		table.extractIdentifiers(tokens);
		System.out.println(table);
	}

}
