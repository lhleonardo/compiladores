// Generated from Scanner.g4 by ANTLR 4.7.2

	package br.ufla.compiladores.scanner;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Scanner extends Lexer {
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
		CLOSE_BRACKETS=31, END_STATEMENT=32, SEMICOLON=33, DOT=34, STRING=35, 
		CHAR_LITERAL=36, GREATER_EQUAL=37, GREATER_THAN=38, LESS_EQUAL=39, LESS_THAN=40, 
		EQUAL=41, ASSIGN=42, NOT=43, ADD=44, SUB=45, MULT=46, INCREMENT=47, DECREMENT=48, 
		PLUS=49, REMOVE=50, IDENTIFIER=51, LETTER=52, DIGIT=53, NEW_LINE=54, WHITE_SKEEP=55, 
		COMMENTS=56, NOT_IDENTIFIER=57;
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
			"SEMICOLON", "DOT", "STRING", "CHAR_LITERAL", "GREATER_EQUAL", "GREATER_THAN", 
			"LESS_EQUAL", "LESS_THAN", "EQUAL", "ASSIGN", "NOT", "ADD", "SUB", "MULT", 
			"INCREMENT", "DECREMENT", "PLUS", "REMOVE", "IDENTIFIER", "LETTER", "DIGIT", 
			"NEW_LINE", "WHITE_SKEEP", "COMMENTS", "NOT_IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'private'", "'protected'", "'static'", "'abstract'", 
			"'int'", "'char'", "'boolean'", null, "'void'", "'true'", "'false'", 
			"'extends'", "'class'", "'import'", "'package'", "'super'", "'this'", 
			"'new'", "'return'", "'null'", "'if'", "'else'", "'while'", "'instanceof'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", null, 
			null, "'>='", "'>'", "'<='", "'<'", "'=='", "'='", "'!'", "'+'", "'-'", 
			"'*'", "'++'", "'--'", "'+='", "'-='"
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
			"SEMICOLON", "DOT", "STRING", "CHAR_LITERAL", "GREATER_EQUAL", "GREATER_THAN", 
			"LESS_EQUAL", "LESS_THAN", "EQUAL", "ASSIGN", "NOT", "ADD", "SUB", "MULT", 
			"INCREMENT", "DECREMENT", "PLUS", "REMOVE", "IDENTIFIER", "LETTER", "DIGIT", 
			"NEW_LINE", "WHITE_SKEEP", "COMMENTS", "NOT_IDENTIFIER"
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


	public Scanner(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u018d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\7\n\u00b3\n\n\f\n\16\n\u00b6\13\n\5\n\u00b8\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\7$\u012f"+
		"\n$\f$\16$\u0132\13$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3"+
		")\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\5\64\u015f\n\64\3\64\3\64\3\64"+
		"\7\64\u0164\n\64\f\64\16\64\u0167\13\64\3\65\5\65\u016a\n\65\3\66\3\66"+
		"\3\67\5\67\u016f\n\67\3\67\3\67\3\67\3\67\38\68\u0176\n8\r8\168\u0177"+
		"\38\38\39\39\39\39\79\u0180\n9\f9\169\u0183\139\39\39\3:\3:\3:\6:\u018a"+
		"\n:\r:\16:\u018b\2\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;\3\2\7\4\2$$^^\4\2&&aa\4\2C\\c|\4\2\13\13\"\""+
		"\4\2\f\f\17\17\2\u0199\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5"+
		"|\3\2\2\2\7\u0084\3\2\2\2\t\u008e\3\2\2\2\13\u0095\3\2\2\2\r\u009e\3\2"+
		"\2\2\17\u00a2\3\2\2\2\21\u00a7\3\2\2\2\23\u00b7\3\2\2\2\25\u00b9\3\2\2"+
		"\2\27\u00be\3\2\2\2\31\u00c3\3\2\2\2\33\u00c9\3\2\2\2\35\u00d1\3\2\2\2"+
		"\37\u00d7\3\2\2\2!\u00de\3\2\2\2#\u00e6\3\2\2\2%\u00ec\3\2\2\2\'\u00f1"+
		"\3\2\2\2)\u00f5\3\2\2\2+\u00fc\3\2\2\2-\u0101\3\2\2\2/\u0104\3\2\2\2\61"+
		"\u0109\3\2\2\2\63\u010f\3\2\2\2\65\u011a\3\2\2\2\67\u011c\3\2\2\29\u011e"+
		"\3\2\2\2;\u0120\3\2\2\2=\u0122\3\2\2\2?\u0124\3\2\2\2A\u0126\3\2\2\2C"+
		"\u0128\3\2\2\2E\u012a\3\2\2\2G\u012c\3\2\2\2I\u0135\3\2\2\2K\u0139\3\2"+
		"\2\2M\u013c\3\2\2\2O\u013e\3\2\2\2Q\u0141\3\2\2\2S\u0143\3\2\2\2U\u0146"+
		"\3\2\2\2W\u0148\3\2\2\2Y\u014a\3\2\2\2[\u014c\3\2\2\2]\u014e\3\2\2\2_"+
		"\u0150\3\2\2\2a\u0153\3\2\2\2c\u0156\3\2\2\2e\u0159\3\2\2\2g\u015e\3\2"+
		"\2\2i\u0169\3\2\2\2k\u016b\3\2\2\2m\u016e\3\2\2\2o\u0175\3\2\2\2q\u017b"+
		"\3\2\2\2s\u0189\3\2\2\2uv\7r\2\2vw\7w\2\2wx\7d\2\2xy\7n\2\2yz\7k\2\2z"+
		"{\7e\2\2{\4\3\2\2\2|}\7r\2\2}~\7t\2\2~\177\7k\2\2\177\u0080\7x\2\2\u0080"+
		"\u0081\7c\2\2\u0081\u0082\7v\2\2\u0082\u0083\7g\2\2\u0083\6\3\2\2\2\u0084"+
		"\u0085\7r\2\2\u0085\u0086\7t\2\2\u0086\u0087\7q\2\2\u0087\u0088\7v\2\2"+
		"\u0088\u0089\7g\2\2\u0089\u008a\7e\2\2\u008a\u008b\7v\2\2\u008b\u008c"+
		"\7g\2\2\u008c\u008d\7f\2\2\u008d\b\3\2\2\2\u008e\u008f\7u\2\2\u008f\u0090"+
		"\7v\2\2\u0090\u0091\7c\2\2\u0091\u0092\7v\2\2\u0092\u0093\7k\2\2\u0093"+
		"\u0094\7e\2\2\u0094\n\3\2\2\2\u0095\u0096\7c\2\2\u0096\u0097\7d\2\2\u0097"+
		"\u0098\7u\2\2\u0098\u0099\7v\2\2\u0099\u009a\7t\2\2\u009a\u009b\7c\2\2"+
		"\u009b\u009c\7e\2\2\u009c\u009d\7v\2\2\u009d\f\3\2\2\2\u009e\u009f\7k"+
		"\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7v\2\2\u00a1\16\3\2\2\2\u00a2\u00a3"+
		"\7e\2\2\u00a3\u00a4\7j\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7t\2\2\u00a6"+
		"\20\3\2\2\2\u00a7\u00a8\7d\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7q\2\2\u00aa"+
		"\u00ab\7n\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7p\2\2"+
		"\u00ae\22\3\2\2\2\u00af\u00b8\7\62\2\2\u00b0\u00b4\4\63;\2\u00b1\u00b3"+
		"\5k\66\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00af\3\2"+
		"\2\2\u00b7\u00b0\3\2\2\2\u00b8\24\3\2\2\2\u00b9\u00ba\7x\2\2\u00ba\u00bb"+
		"\7q\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7f\2\2\u00bd\26\3\2\2\2\u00be\u00bf"+
		"\7v\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7g\2\2\u00c2"+
		"\30\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7n\2\2\u00c6"+
		"\u00c7\7u\2\2\u00c7\u00c8\7g\2\2\u00c8\32\3\2\2\2\u00c9\u00ca\7g\2\2\u00ca"+
		"\u00cb\7z\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7p\2\2"+
		"\u00ce\u00cf\7f\2\2\u00cf\u00d0\7u\2\2\u00d0\34\3\2\2\2\u00d1\u00d2\7"+
		"e\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6"+
		"\7u\2\2\u00d6\36\3\2\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7o\2\2\u00d9\u00da"+
		"\7r\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7v\2\2\u00dd"+
		" \3\2\2\2\u00de\u00df\7r\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7e\2\2\u00e1"+
		"\u00e2\7m\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7i\2\2\u00e4\u00e5\7g\2\2"+
		"\u00e5\"\3\2\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7r"+
		"\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7t\2\2\u00eb$\3\2\2\2\u00ec\u00ed"+
		"\7v\2\2\u00ed\u00ee\7j\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7u\2\2\u00f0"+
		"&\3\2\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7y\2\2\u00f4"+
		"(\3\2\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7v\2\2\u00f8"+
		"\u00f9\7w\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7p\2\2\u00fb*\3\2\2\2\u00fc"+
		"\u00fd\7p\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7n\2\2"+
		"\u0100,\3\2\2\2\u0101\u0102\7k\2\2\u0102\u0103\7h\2\2\u0103.\3\2\2\2\u0104"+
		"\u0105\7g\2\2\u0105\u0106\7n\2\2\u0106\u0107\7u\2\2\u0107\u0108\7g\2\2"+
		"\u0108\60\3\2\2\2\u0109\u010a\7y\2\2\u010a\u010b\7j\2\2\u010b\u010c\7"+
		"k\2\2\u010c\u010d\7n\2\2\u010d\u010e\7g\2\2\u010e\62\3\2\2\2\u010f\u0110"+
		"\7k\2\2\u0110\u0111\7p\2\2\u0111\u0112\7u\2\2\u0112\u0113\7v\2\2\u0113"+
		"\u0114\7c\2\2\u0114\u0115\7p\2\2\u0115\u0116\7e\2\2\u0116\u0117\7g\2\2"+
		"\u0117\u0118\7q\2\2\u0118\u0119\7h\2\2\u0119\64\3\2\2\2\u011a\u011b\7"+
		"*\2\2\u011b\66\3\2\2\2\u011c\u011d\7+\2\2\u011d8\3\2\2\2\u011e\u011f\7"+
		"}\2\2\u011f:\3\2\2\2\u0120\u0121\7\177\2\2\u0121<\3\2\2\2\u0122\u0123"+
		"\7]\2\2\u0123>\3\2\2\2\u0124\u0125\7_\2\2\u0125@\3\2\2\2\u0126\u0127\7"+
		"=\2\2\u0127B\3\2\2\2\u0128\u0129\7.\2\2\u0129D\3\2\2\2\u012a\u012b\7\60"+
		"\2\2\u012bF\3\2\2\2\u012c\u0130\7$\2\2\u012d\u012f\n\2\2\2\u012e\u012d"+
		"\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7$\2\2\u0134H\3\2\2\2\u0135"+
		"\u0136\7)\2\2\u0136\u0137\n\2\2\2\u0137\u0138\7)\2\2\u0138J\3\2\2\2\u0139"+
		"\u013a\7@\2\2\u013a\u013b\7?\2\2\u013bL\3\2\2\2\u013c\u013d\7@\2\2\u013d"+
		"N\3\2\2\2\u013e\u013f\7>\2\2\u013f\u0140\7?\2\2\u0140P\3\2\2\2\u0141\u0142"+
		"\7>\2\2\u0142R\3\2\2\2\u0143\u0144\7?\2\2\u0144\u0145\7?\2\2\u0145T\3"+
		"\2\2\2\u0146\u0147\7?\2\2\u0147V\3\2\2\2\u0148\u0149\7#\2\2\u0149X\3\2"+
		"\2\2\u014a\u014b\7-\2\2\u014bZ\3\2\2\2\u014c\u014d\7/\2\2\u014d\\\3\2"+
		"\2\2\u014e\u014f\7,\2\2\u014f^\3\2\2\2\u0150\u0151\7-\2\2\u0151\u0152"+
		"\7-\2\2\u0152`\3\2\2\2\u0153\u0154\7/\2\2\u0154\u0155\7/\2\2\u0155b\3"+
		"\2\2\2\u0156\u0157\7-\2\2\u0157\u0158\7?\2\2\u0158d\3\2\2\2\u0159\u015a"+
		"\7/\2\2\u015a\u015b\7?\2\2\u015bf\3\2\2\2\u015c\u015f\5i\65\2\u015d\u015f"+
		"\t\3\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f\u0165\3\2\2\2\u0160"+
		"\u0164\5i\65\2\u0161\u0164\5k\66\2\u0162\u0164\t\3\2\2\u0163\u0160\3\2"+
		"\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166h\3\2\2\2\u0167\u0165\3\2\2\2"+
		"\u0168\u016a\t\4\2\2\u0169\u0168\3\2\2\2\u016aj\3\2\2\2\u016b\u016c\4"+
		"\62;\2\u016cl\3\2\2\2\u016d\u016f\7\17\2\2\u016e\u016d\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7\f\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0173\b\67\2\2\u0173n\3\2\2\2\u0174\u0176\t\5\2\2\u0175\u0174\3\2\2\2"+
		"\u0176\u0177\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179\u017a\b8\2\2\u017ap\3\2\2\2\u017b\u017c\7\61\2\2\u017c"+
		"\u017d\7\61\2\2\u017d\u0181\3\2\2\2\u017e\u0180\n\6\2\2\u017f\u017e\3"+
		"\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\b9\2\2\u0185r\3\2\2\2\u0186"+
		"\u018a\5i\65\2\u0187\u018a\5k\66\2\u0188\u018a\t\3\2\2\u0189\u0186\3\2"+
		"\2\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018ct\3\2\2\2\17\2\u00b4\u00b7\u0130"+
		"\u015e\u0163\u0165\u0169\u016e\u0177\u0181\u0189\u018b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}