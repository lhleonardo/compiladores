package br.ufla.compiladores;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import br.ufla.compiladores.scanner.ScannerLexer;
import br.ufla.compiladores.scanner.ScannerParser;
import br.ufla.compiladores.scanner.exceptions.CustomExceptionHandler;
import br.ufla.compiladores.scanner.listeners.ClassListener;
import br.ufla.compiladores.scanner.listeners.CompilationUnitListener;

public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {
		ScannerLexer scanner = new ScannerLexer(
				CharStreams.fromPath(Path.of(Main.class.getResource("Arquivo.jminus").toURI())));
		CommonTokenStream tokenStream = new CommonTokenStream(scanner);
		ScannerParser parser = new ScannerParser(tokenStream);

		parser.addParseListener(new ClassListener());
		parser.addParseListener(new CompilationUnitListener());

		scanner.removeErrorListeners();
		parser.removeErrorListeners();

		scanner.addErrorListener(CustomExceptionHandler.getInstance());
		parser.addErrorListener(CustomExceptionHandler.getInstance());

		parser.compilationUnit();
	}

}
