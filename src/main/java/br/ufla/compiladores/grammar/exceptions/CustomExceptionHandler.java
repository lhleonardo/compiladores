package br.ufla.compiladores.grammar.exceptions;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class CustomExceptionHandler extends BaseErrorListener {

	private static final CustomExceptionHandler instance = new CustomExceptionHandler();
	
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {

		String sourceName = recognizer.getInputStream().getSourceName();
		if (!sourceName.isEmpty()) {
			sourceName = String.format("%s", sourceName);
		}

		System.err.println(sourceName + ":" + line + ":" + charPositionInLine + ": " + msg);

	}
	
	public static CustomExceptionHandler getInstance() {
		return instance;
	}

}
