package br.ufla.compiladores;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import br.ufla.compiladores.scanner.ScannerLexer;
import br.ufla.compiladores.scanner.ScannerParser;
import br.ufla.compiladores.scanner.exceptions.CustomExceptionHandler;
import br.ufla.compiladores.scanner.listeners.CustomListener;

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

		CustomListener listener = new CustomListener();
		walker.walk(listener, tree);
	}

}
