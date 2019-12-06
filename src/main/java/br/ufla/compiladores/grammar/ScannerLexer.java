// Generated from Scanner.g4 by ANTLR 4.7.2

	package br.ufla.compiladores.grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScannerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, PRIVATE=2, PROTECTED=3, STATIC=4, ABSTRACT=5, INT=6, CHAR=7, 
		BOOLEAN=8, INT_LITERAL=9, VOID=10, BOOLEAN_TRUE=11, BOOLEAN_FALSE=12, 
		EXTENDS=13, CLASS=14, IMPORT=15, PACKAGE=16, SUPER=17, THIS=18, NEW=19, 
		RETURN=20, NULL=21, IF=22, ELSE=23, WHILE=24, INSTANCEOF=25, OPEN_PARENTHESIS=26, 
		CLOSE_PARENTHESIS=27, OPEN_BRACES=28, CLOSE_BRACES=29, OPEN_BRACKETS=30, 
		CLOSE_BRACKETS=31, END_STATEMENT=32, SEMICOLON=33, TWO_POINTS=34, DOT=35, 
		STRING=36, CHAR_LITERAL=37, GREATER_EQUAL=38, GREATER_THAN=39, LESS_EQUAL=40, 
		LESS_THAN=41, EQUAL=42, AND=43, ASSIGN=44, NOT=45, ADD=46, SUB=47, MULT=48, 
		INCREMENT=49, DECREMENT=50, PLUS=51, REMOVE=52, IDENTIFIER=53, LETTER=54, 
		DIGIT=55, NEW_LINE=56, WHITE_SKEEP=57, COMMENTS=58, NOT_IDENTIFIER=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "ABSTRACT", "INT", "CHAR", 
			"BOOLEAN", "INT_LITERAL", "VOID", "BOOLEAN_TRUE", "BOOLEAN_FALSE", "EXTENDS", 
			"CLASS", "IMPORT", "PACKAGE", "SUPER", "THIS", "NEW", "RETURN", "NULL", 
			"IF", "ELSE", "WHILE", "INSTANCEOF", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", 
			"OPEN_BRACES", "CLOSE_BRACES", "OPEN_BRACKETS", "CLOSE_BRACKETS", "END_STATEMENT", 
			"SEMICOLON", "TWO_POINTS", "DOT", "STRING", "CHAR_LITERAL", "GREATER_EQUAL", 
			"GREATER_THAN", "LESS_EQUAL", "LESS_THAN", "EQUAL", "AND", "ASSIGN", 
			"NOT", "ADD", "SUB", "MULT", "INCREMENT", "DECREMENT", "PLUS", "REMOVE", 
			"IDENTIFIER", "LETTER", "DIGIT", "NEW_LINE", "WHITE_SKEEP", "COMMENTS", 
			"NOT_IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'private'", "'protected'", "'static'", "'abstract'", 
			"'int'", "'char'", "'boolean'", null, "'void'", "'true'", "'false'", 
			"'extends'", "'class'", "'import'", "'package'", "'super'", "'this'", 
			"'new'", "'return'", "'null'", "'if'", "'else'", "'while'", "'instanceof'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "':'", "'.'", 
			null, null, "'>='", "'>'", "'<='", "'<'", "'=='", "'&&'", "'='", "'!'", 
			"'+'", "'-'", "'*'", "'++'", "'--'", "'+='", "'-='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "ABSTRACT", "INT", 
			"CHAR", "BOOLEAN", "INT_LITERAL", "VOID", "BOOLEAN_TRUE", "BOOLEAN_FALSE", 
			"EXTENDS", "CLASS", "IMPORT", "PACKAGE", "SUPER", "THIS", "NEW", "RETURN", 
			"NULL", "IF", "ELSE", "WHILE", "INSTANCEOF", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", 
			"OPEN_BRACES", "CLOSE_BRACES", "OPEN_BRACKETS", "CLOSE_BRACKETS", "END_STATEMENT", 
			"SEMICOLON", "TWO_POINTS", "DOT", "STRING", "CHAR_LITERAL", "GREATER_EQUAL", 
			"GREATER_THAN", "LESS_EQUAL", "LESS_THAN", "EQUAL", "AND", "ASSIGN", 
			"NOT", "ADD", "SUB", "MULT", "INCREMENT", "DECREMENT", "PLUS", "REMOVE", 
			"IDENTIFIER", "LETTER", "DIGIT", "NEW_LINE", "WHITE_SKEEP", "COMMENTS", 
			"NOT_IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ScannerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scanner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u0196\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u00b7\n\n\f\n\16\n\u00ba\13\n\5\n\u00bc"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\7%\u0135\n%\f%\16%\u0138\13%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66"+
		"\3\66\5\66\u0168\n\66\3\66\3\66\3\66\7\66\u016d\n\66\f\66\16\66\u0170"+
		"\13\66\3\67\5\67\u0173\n\67\38\38\39\59\u0178\n9\39\39\39\39\3:\6:\u017f"+
		"\n:\r:\16:\u0180\3:\3:\3;\3;\3;\3;\7;\u0189\n;\f;\16;\u018c\13;\3;\3;"+
		"\3<\3<\3<\6<\u0193\n<\r<\16<\u0194\2\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=\3\2\7\4\2$$^^\4\2&&"+
		"aa\4\2C\\c|\4\2\13\13\"\"\4\2\f\f\17\17\2\u01a2\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5\u0080\3\2\2\2\7\u0088"+
		"\3\2\2\2\t\u0092\3\2\2\2\13\u0099\3\2\2\2\r\u00a2\3\2\2\2\17\u00a6\3\2"+
		"\2\2\21\u00ab\3\2\2\2\23\u00bb\3\2\2\2\25\u00bd\3\2\2\2\27\u00c2\3\2\2"+
		"\2\31\u00c7\3\2\2\2\33\u00cd\3\2\2\2\35\u00d5\3\2\2\2\37\u00db\3\2\2\2"+
		"!\u00e2\3\2\2\2#\u00ea\3\2\2\2%\u00f0\3\2\2\2\'\u00f5\3\2\2\2)\u00f9\3"+
		"\2\2\2+\u0100\3\2\2\2-\u0105\3\2\2\2/\u0108\3\2\2\2\61\u010d\3\2\2\2\63"+
		"\u0113\3\2\2\2\65\u011e\3\2\2\2\67\u0120\3\2\2\29\u0122\3\2\2\2;\u0124"+
		"\3\2\2\2=\u0126\3\2\2\2?\u0128\3\2\2\2A\u012a\3\2\2\2C\u012c\3\2\2\2E"+
		"\u012e\3\2\2\2G\u0130\3\2\2\2I\u0132\3\2\2\2K\u013b\3\2\2\2M\u013f\3\2"+
		"\2\2O\u0142\3\2\2\2Q\u0144\3\2\2\2S\u0147\3\2\2\2U\u0149\3\2\2\2W\u014c"+
		"\3\2\2\2Y\u014f\3\2\2\2[\u0151\3\2\2\2]\u0153\3\2\2\2_\u0155\3\2\2\2a"+
		"\u0157\3\2\2\2c\u0159\3\2\2\2e\u015c\3\2\2\2g\u015f\3\2\2\2i\u0162\3\2"+
		"\2\2k\u0167\3\2\2\2m\u0172\3\2\2\2o\u0174\3\2\2\2q\u0177\3\2\2\2s\u017e"+
		"\3\2\2\2u\u0184\3\2\2\2w\u0192\3\2\2\2yz\7r\2\2z{\7w\2\2{|\7d\2\2|}\7"+
		"n\2\2}~\7k\2\2~\177\7e\2\2\177\4\3\2\2\2\u0080\u0081\7r\2\2\u0081\u0082"+
		"\7t\2\2\u0082\u0083\7k\2\2\u0083\u0084\7x\2\2\u0084\u0085\7c\2\2\u0085"+
		"\u0086\7v\2\2\u0086\u0087\7g\2\2\u0087\6\3\2\2\2\u0088\u0089\7r\2\2\u0089"+
		"\u008a\7t\2\2\u008a\u008b\7q\2\2\u008b\u008c\7v\2\2\u008c\u008d\7g\2\2"+
		"\u008d\u008e\7e\2\2\u008e\u008f\7v\2\2\u008f\u0090\7g\2\2\u0090\u0091"+
		"\7f\2\2\u0091\b\3\2\2\2\u0092\u0093\7u\2\2\u0093\u0094\7v\2\2\u0094\u0095"+
		"\7c\2\2\u0095\u0096\7v\2\2\u0096\u0097\7k\2\2\u0097\u0098\7e\2\2\u0098"+
		"\n\3\2\2\2\u0099\u009a\7c\2\2\u009a\u009b\7d\2\2\u009b\u009c\7u\2\2\u009c"+
		"\u009d\7v\2\2\u009d\u009e\7t\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7e\2\2"+
		"\u00a0\u00a1\7v\2\2\u00a1\f\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7p"+
		"\2\2\u00a4\u00a5\7v\2\2\u00a5\16\3\2\2\2\u00a6\u00a7\7e\2\2\u00a7\u00a8"+
		"\7j\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7t\2\2\u00aa\20\3\2\2\2\u00ab\u00ac"+
		"\7d\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7n\2\2\u00af"+
		"\u00b0\7g\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7p\2\2\u00b2\22\3\2\2\2\u00b3"+
		"\u00bc\7\62\2\2\u00b4\u00b8\4\63;\2\u00b5\u00b7\5o8\2\u00b6\u00b5\3\2"+
		"\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00b3\3\2\2\2\u00bb\u00b4\3\2"+
		"\2\2\u00bc\24\3\2\2\2\u00bd\u00be\7x\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0"+
		"\7k\2\2\u00c0\u00c1\7f\2\2\u00c1\26\3\2\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4"+
		"\7t\2\2\u00c4\u00c5\7w\2\2\u00c5\u00c6\7g\2\2\u00c6\30\3\2\2\2\u00c7\u00c8"+
		"\7h\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7u\2\2\u00cb"+
		"\u00cc\7g\2\2\u00cc\32\3\2\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7z\2\2\u00cf"+
		"\u00d0\7v\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7f\2\2"+
		"\u00d3\u00d4\7u\2\2\u00d4\34\3\2\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7"+
		"n\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7u\2\2\u00da\36"+
		"\3\2\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7o\2\2\u00dd\u00de\7r\2\2\u00de"+
		"\u00df\7q\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7v\2\2\u00e1 \3\2\2\2\u00e2"+
		"\u00e3\7r\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7e\2\2\u00e5\u00e6\7m\2\2"+
		"\u00e6\u00e7\7c\2\2\u00e7\u00e8\7i\2\2\u00e8\u00e9\7g\2\2\u00e9\"\3\2"+
		"\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7r\2\2\u00ed\u00ee"+
		"\7g\2\2\u00ee\u00ef\7t\2\2\u00ef$\3\2\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2"+
		"\7j\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7u\2\2\u00f4&\3\2\2\2\u00f5\u00f6"+
		"\7p\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7y\2\2\u00f8(\3\2\2\2\u00f9\u00fa"+
		"\7t\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7w\2\2\u00fd"+
		"\u00fe\7t\2\2\u00fe\u00ff\7p\2\2\u00ff*\3\2\2\2\u0100\u0101\7p\2\2\u0101"+
		"\u0102\7w\2\2\u0102\u0103\7n\2\2\u0103\u0104\7n\2\2\u0104,\3\2\2\2\u0105"+
		"\u0106\7k\2\2\u0106\u0107\7h\2\2\u0107.\3\2\2\2\u0108\u0109\7g\2\2\u0109"+
		"\u010a\7n\2\2\u010a\u010b\7u\2\2\u010b\u010c\7g\2\2\u010c\60\3\2\2\2\u010d"+
		"\u010e\7y\2\2\u010e\u010f\7j\2\2\u010f\u0110\7k\2\2\u0110\u0111\7n\2\2"+
		"\u0111\u0112\7g\2\2\u0112\62\3\2\2\2\u0113\u0114\7k\2\2\u0114\u0115\7"+
		"p\2\2\u0115\u0116\7u\2\2\u0116\u0117\7v\2\2\u0117\u0118\7c\2\2\u0118\u0119"+
		"\7p\2\2\u0119\u011a\7e\2\2\u011a\u011b\7g\2\2\u011b\u011c\7q\2\2\u011c"+
		"\u011d\7h\2\2\u011d\64\3\2\2\2\u011e\u011f\7*\2\2\u011f\66\3\2\2\2\u0120"+
		"\u0121\7+\2\2\u01218\3\2\2\2\u0122\u0123\7}\2\2\u0123:\3\2\2\2\u0124\u0125"+
		"\7\177\2\2\u0125<\3\2\2\2\u0126\u0127\7]\2\2\u0127>\3\2\2\2\u0128\u0129"+
		"\7_\2\2\u0129@\3\2\2\2\u012a\u012b\7=\2\2\u012bB\3\2\2\2\u012c\u012d\7"+
		".\2\2\u012dD\3\2\2\2\u012e\u012f\7<\2\2\u012fF\3\2\2\2\u0130\u0131\7\60"+
		"\2\2\u0131H\3\2\2\2\u0132\u0136\7$\2\2\u0133\u0135\n\2\2\2\u0134\u0133"+
		"\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7$\2\2\u013aJ\3\2\2\2\u013b"+
		"\u013c\7)\2\2\u013c\u013d\n\2\2\2\u013d\u013e\7)\2\2\u013eL\3\2\2\2\u013f"+
		"\u0140\7@\2\2\u0140\u0141\7?\2\2\u0141N\3\2\2\2\u0142\u0143\7@\2\2\u0143"+
		"P\3\2\2\2\u0144\u0145\7>\2\2\u0145\u0146\7?\2\2\u0146R\3\2\2\2\u0147\u0148"+
		"\7>\2\2\u0148T\3\2\2\2\u0149\u014a\7?\2\2\u014a\u014b\7?\2\2\u014bV\3"+
		"\2\2\2\u014c\u014d\7(\2\2\u014d\u014e\7(\2\2\u014eX\3\2\2\2\u014f\u0150"+
		"\7?\2\2\u0150Z\3\2\2\2\u0151\u0152\7#\2\2\u0152\\\3\2\2\2\u0153\u0154"+
		"\7-\2\2\u0154^\3\2\2\2\u0155\u0156\7/\2\2\u0156`\3\2\2\2\u0157\u0158\7"+
		",\2\2\u0158b\3\2\2\2\u0159\u015a\7-\2\2\u015a\u015b\7-\2\2\u015bd\3\2"+
		"\2\2\u015c\u015d\7/\2\2\u015d\u015e\7/\2\2\u015ef\3\2\2\2\u015f\u0160"+
		"\7-\2\2\u0160\u0161\7?\2\2\u0161h\3\2\2\2\u0162\u0163\7/\2\2\u0163\u0164"+
		"\7?\2\2\u0164j\3\2\2\2\u0165\u0168\5m\67\2\u0166\u0168\t\3\2\2\u0167\u0165"+
		"\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u016e\3\2\2\2\u0169\u016d\5m\67\2\u016a"+
		"\u016d\5o8\2\u016b\u016d\t\3\2\2\u016c\u0169\3\2\2\2\u016c\u016a\3\2\2"+
		"\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016fl\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0173\t\4\2\2\u0172"+
		"\u0171\3\2\2\2\u0173n\3\2\2\2\u0174\u0175\4\62;\2\u0175p\3\2\2\2\u0176"+
		"\u0178\7\17\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3"+
		"\2\2\2\u0179\u017a\7\f\2\2\u017a\u017b\3\2\2\2\u017b\u017c\b9\2\2\u017c"+
		"r\3\2\2\2\u017d\u017f\t\5\2\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2"+
		"\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183"+
		"\b:\2\2\u0183t\3\2\2\2\u0184\u0185\7\61\2\2\u0185\u0186\7\61\2\2\u0186"+
		"\u018a\3\2\2\2\u0187\u0189\n\6\2\2\u0188\u0187\3\2\2\2\u0189\u018c\3\2"+
		"\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018d\u018e\b;\2\2\u018ev\3\2\2\2\u018f\u0193\5m\67\2\u0190"+
		"\u0193\5o8\2\u0191\u0193\t\3\2\2\u0192\u018f\3\2\2\2\u0192\u0190\3\2\2"+
		"\2\u0192\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195"+
		"\3\2\2\2\u0195x\3\2\2\2\17\2\u00b8\u00bb\u0136\u0167\u016c\u016e\u0172"+
		"\u0177\u0180\u018a\u0192\u0194\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}