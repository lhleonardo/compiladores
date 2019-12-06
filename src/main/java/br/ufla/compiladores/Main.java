package br.ufla.compiladores;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import br.ufla.compiladores.grammar.ScannerLexer;
import br.ufla.compiladores.grammar.ScannerParser;
import br.ufla.compiladores.grammar.exceptions.CustomExceptionHandler;
import br.ufla.compiladores.grammar.listeners.CustomListener;
import br.ufla.compiladores.grammar.table.TabelaSimbolos;

public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {
		ScannerLexer scanner = new ScannerLexer(
				CharStreams.fromPath(Path.of(Main.class.getResource("Arquivo.jminus").toURI())));
		scanner.removeErrorListeners();
		scanner.addErrorListener(CustomExceptionHandler.getInstance());

		CommonTokenStream tokenStream = new CommonTokenStream(scanner);
		ScannerParser parser = new ScannerParser(tokenStream);

		ParseTree tree = parser.compilationUnit();

		ParseTreeWalker walker = new ParseTreeWalker();

		TabelaSimbolos table = new TabelaSimbolos();
		CustomListener listener = new CustomListener(table);

		walker.walk(listener, tree);

		System.out.println(table);
	}

}
