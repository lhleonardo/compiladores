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
		MODIFIERS=1, LITERAL_TYPES=2, INTEGER=3, VOID=4, BOOLEAN_VALUE=5, EXTENDS=6, 
		CLASS=7, IMPORT=8, PACKAGE=9, SUPER=10, THIS=11, NEW=12, RETURN=13, NULL=14, 
		IF=15, ELSE=16, WHILE=17, INSTANCEOF=18, OPEN_PARENTHESIS=19, CLOSE_PARENTHESIS=20, 
		OPEN_BRACES=21, CLOSE_BRACES=22, OPEN_BRACKETS=23, CLOSE_BRACKETS=24, 
		END_STATEMENT=25, SEMICOLON=26, DOT=27, STRING=28, CHAR=29, RELATIONAL_OPERATOR=30, 
		ARITHMETIC_OPERATOR=31, IDENTIFIER=32, LETTER=33, DIGIT=34, NEW_LINE=35, 
		WHITE_SKEEP=36, COMMENTS=37, NOT_IDENTIFIER=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MODIFIERS", "LITERAL_TYPES", "INTEGER", "VOID", "BOOLEAN_VALUE", "EXTENDS", 
			"CLASS", "IMPORT", "PACKAGE", "SUPER", "THIS", "NEW", "RETURN", "NULL", 
			"IF", "ELSE", "WHILE", "INSTANCEOF", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", 
			"OPEN_BRACES", "CLOSE_BRACES", "OPEN_BRACKETS", "CLOSE_BRACKETS", "END_STATEMENT", 
			"SEMICOLON", "DOT", "STRING", "CHAR", "RELATIONAL_OPERATOR", "ARITHMETIC_OPERATOR", 
			"IDENTIFIER", "LETTER", "DIGIT", "NEW_LINE", "WHITE_SKEEP", "COMMENTS", 
			"NOT_IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'void'", null, "'extends'", "'class'", "'import'", 
			"'package'", "'super'", "'this'", "'new'", "'return'", "'null'", "'if'", 
			"'else'", "'while'", "'instanceof'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MODIFIERS", "LITERAL_TYPES", "INTEGER", "VOID", "BOOLEAN_VALUE", 
			"EXTENDS", "CLASS", "IMPORT", "PACKAGE", "SUPER", "THIS", "NEW", "RETURN", 
			"NULL", "IF", "ELSE", "WHILE", "INSTANCEOF", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", 
			"OPEN_BRACES", "CLOSE_BRACES", "OPEN_BRACKETS", "CLOSE_BRACKETS", "END_STATEMENT", 
			"SEMICOLON", "DOT", "STRING", "CHAR", "RELATIONAL_OPERATOR", "ARITHMETIC_OPERATOR", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0156\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2t\n\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0084\n\3\3\4\3\4\3\4"+
		"\7\4\u0089\n\4\f\4\16\4\u008c\13\4\5\4\u008e\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009e\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\7\35\u0105\n\35\f\35\16\35\u0108\13\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u0119\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0124\n \3!\3!\5!\u0128"+
		"\n!\3!\3!\3!\7!\u012d\n!\f!\16!\u0130\13!\3\"\5\"\u0133\n\"\3#\3#\3$\5"+
		"$\u0138\n$\3$\3$\3$\3$\3%\6%\u013f\n%\r%\16%\u0140\3%\3%\3&\3&\3&\3&\7"+
		"&\u0149\n&\f&\16&\u014c\13&\3&\3&\3\'\3\'\3\'\6\'\u0153\n\'\r\'\16\'\u0154"+
		"\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(\3\2\t\4\2$$^^\4\2##??\4\2,-//\4\2&&aa\4\2C\\"+
		"c|\4\2\13\13\"\"\4\2\f\f\17\17\2\u0172\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\3s\3\2\2\2\5\u0083\3\2\2\2\7\u008d\3\2\2\2\t\u008f\3\2\2\2\13\u009d"+
		"\3\2\2\2\r\u009f\3\2\2\2\17\u00a7\3\2\2\2\21\u00ad\3\2\2\2\23\u00b4\3"+
		"\2\2\2\25\u00bc\3\2\2\2\27\u00c2\3\2\2\2\31\u00c7\3\2\2\2\33\u00cb\3\2"+
		"\2\2\35\u00d2\3\2\2\2\37\u00d7\3\2\2\2!\u00da\3\2\2\2#\u00df\3\2\2\2%"+
		"\u00e5\3\2\2\2\'\u00f0\3\2\2\2)\u00f2\3\2\2\2+\u00f4\3\2\2\2-\u00f6\3"+
		"\2\2\2/\u00f8\3\2\2\2\61\u00fa\3\2\2\2\63\u00fc\3\2\2\2\65\u00fe\3\2\2"+
		"\2\67\u0100\3\2\2\29\u0102\3\2\2\2;\u010b\3\2\2\2=\u0118\3\2\2\2?\u0123"+
		"\3\2\2\2A\u0127\3\2\2\2C\u0132\3\2\2\2E\u0134\3\2\2\2G\u0137\3\2\2\2I"+
		"\u013e\3\2\2\2K\u0144\3\2\2\2M\u0152\3\2\2\2OP\7r\2\2PQ\7w\2\2QR\7d\2"+
		"\2RS\7n\2\2ST\7k\2\2Tt\7e\2\2UV\7r\2\2VW\7t\2\2WX\7k\2\2XY\7x\2\2YZ\7"+
		"c\2\2Z[\7v\2\2[t\7g\2\2\\]\7r\2\2]^\7t\2\2^_\7q\2\2_`\7v\2\2`a\7g\2\2"+
		"ab\7e\2\2bc\7v\2\2cd\7g\2\2dt\7f\2\2ef\7u\2\2fg\7v\2\2gh\7c\2\2hi\7v\2"+
		"\2ij\7k\2\2jt\7e\2\2kl\7c\2\2lm\7d\2\2mn\7u\2\2no\7v\2\2op\7t\2\2pq\7"+
		"c\2\2qr\7e\2\2rt\7v\2\2sO\3\2\2\2sU\3\2\2\2s\\\3\2\2\2se\3\2\2\2sk\3\2"+
		"\2\2t\4\3\2\2\2uv\7k\2\2vw\7p\2\2w\u0084\7v\2\2xy\7e\2\2yz\7j\2\2z{\7"+
		"c\2\2{\u0084\7t\2\2|}\7d\2\2}~\7q\2\2~\177\7q\2\2\177\u0080\7n\2\2\u0080"+
		"\u0081\7g\2\2\u0081\u0082\7c\2\2\u0082\u0084\7p\2\2\u0083u\3\2\2\2\u0083"+
		"x\3\2\2\2\u0083|\3\2\2\2\u0084\6\3\2\2\2\u0085\u008e\7\62\2\2\u0086\u008a"+
		"\4\63;\2\u0087\u0089\5E#\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u0085\3\2\2\2\u008d\u0086\3\2\2\2\u008e\b\3\2\2\2\u008f\u0090"+
		"\7x\2\2\u0090\u0091\7q\2\2\u0091\u0092\7k\2\2\u0092\u0093\7f\2\2\u0093"+
		"\n\3\2\2\2\u0094\u0095\7v\2\2\u0095\u0096\7t\2\2\u0096\u0097\7w\2\2\u0097"+
		"\u009e\7g\2\2\u0098\u0099\7h\2\2\u0099\u009a\7c\2\2\u009a\u009b\7n\2\2"+
		"\u009b\u009c\7u\2\2\u009c\u009e\7g\2\2\u009d\u0094\3\2\2\2\u009d\u0098"+
		"\3\2\2\2\u009e\f\3\2\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7z\2\2\u00a1\u00a2"+
		"\7v\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7f\2\2\u00a5"+
		"\u00a6\7u\2\2\u00a6\16\3\2\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7n\2\2\u00a9"+
		"\u00aa\7c\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7u\2\2\u00ac\20\3\2\2\2\u00ad"+
		"\u00ae\7k\2\2\u00ae\u00af\7o\2\2\u00af\u00b0\7r\2\2\u00b0\u00b1\7q\2\2"+
		"\u00b1\u00b2\7t\2\2\u00b2\u00b3\7v\2\2\u00b3\22\3\2\2\2\u00b4\u00b5\7"+
		"r\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7m\2\2\u00b8\u00b9"+
		"\7c\2\2\u00b9\u00ba\7i\2\2\u00ba\u00bb\7g\2\2\u00bb\24\3\2\2\2\u00bc\u00bd"+
		"\7u\2\2\u00bd\u00be\7w\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7g\2\2\u00c0"+
		"\u00c1\7t\2\2\u00c1\26\3\2\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7j\2\2\u00c4"+
		"\u00c5\7k\2\2\u00c5\u00c6\7u\2\2\u00c6\30\3\2\2\2\u00c7\u00c8\7p\2\2\u00c8"+
		"\u00c9\7g\2\2\u00c9\u00ca\7y\2\2\u00ca\32\3\2\2\2\u00cb\u00cc\7t\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7t\2\2"+
		"\u00d0\u00d1\7p\2\2\u00d1\34\3\2\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7"+
		"w\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7n\2\2\u00d6\36\3\2\2\2\u00d7\u00d8"+
		"\7k\2\2\u00d8\u00d9\7h\2\2\u00d9 \3\2\2\2\u00da\u00db\7g\2\2\u00db\u00dc"+
		"\7n\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7g\2\2\u00de\"\3\2\2\2\u00df\u00e0"+
		"\7y\2\2\u00e0\u00e1\7j\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7n\2\2\u00e3"+
		"\u00e4\7g\2\2\u00e4$\3\2\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2\2\u00e7"+
		"\u00e8\7u\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7p\2\2"+
		"\u00eb\u00ec\7e\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef"+
		"\7h\2\2\u00ef&\3\2\2\2\u00f0\u00f1\7*\2\2\u00f1(\3\2\2\2\u00f2\u00f3\7"+
		"+\2\2\u00f3*\3\2\2\2\u00f4\u00f5\7}\2\2\u00f5,\3\2\2\2\u00f6\u00f7\7\177"+
		"\2\2\u00f7.\3\2\2\2\u00f8\u00f9\7]\2\2\u00f9\60\3\2\2\2\u00fa\u00fb\7"+
		"_\2\2\u00fb\62\3\2\2\2\u00fc\u00fd\7=\2\2\u00fd\64\3\2\2\2\u00fe\u00ff"+
		"\7.\2\2\u00ff\66\3\2\2\2\u0100\u0101\7\60\2\2\u01018\3\2\2\2\u0102\u0106"+
		"\7$\2\2\u0103\u0105\n\2\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0109\u010a\7$\2\2\u010a:\3\2\2\2\u010b\u010c\7)\2\2\u010c\u010d"+
		"\n\2\2\2\u010d\u010e\7)\2\2\u010e<\3\2\2\2\u010f\u0119\7@\2\2\u0110\u0111"+
		"\7@\2\2\u0111\u0119\7?\2\2\u0112\u0119\7>\2\2\u0113\u0114\7>\2\2\u0114"+
		"\u0119\7?\2\2\u0115\u0119\t\3\2\2\u0116\u0117\7?\2\2\u0117\u0119\7?\2"+
		"\2\u0118\u010f\3\2\2\2\u0118\u0110\3\2\2\2\u0118\u0112\3\2\2\2\u0118\u0113"+
		"\3\2\2\2\u0118\u0115\3\2\2\2\u0118\u0116\3\2\2\2\u0119>\3\2\2\2\u011a"+
		"\u0124\t\4\2\2\u011b\u011c\7-\2\2\u011c\u0124\7-\2\2\u011d\u011e\7/\2"+
		"\2\u011e\u0124\7/\2\2\u011f\u0120\7-\2\2\u0120\u0124\7?\2\2\u0121\u0122"+
		"\7/\2\2\u0122\u0124\7?\2\2\u0123\u011a\3\2\2\2\u0123\u011b\3\2\2\2\u0123"+
		"\u011d\3\2\2\2\u0123\u011f\3\2\2\2\u0123\u0121\3\2\2\2\u0124@\3\2\2\2"+
		"\u0125\u0128\5C\"\2\u0126\u0128\t\5\2\2\u0127\u0125\3\2\2\2\u0127\u0126"+
		"\3\2\2\2\u0128\u012e\3\2\2\2\u0129\u012d\5C\"\2\u012a\u012d\5E#\2\u012b"+
		"\u012d\t\5\2\2\u012c\u0129\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2"+
		"\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"B\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0133\t\6\2\2\u0132\u0131\3\2\2\2"+
		"\u0133D\3\2\2\2\u0134\u0135\4\62;\2\u0135F\3\2\2\2\u0136\u0138\7\17\2"+
		"\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a"+
		"\7\f\2\2\u013a\u013b\3\2\2\2\u013b\u013c\b$\2\2\u013cH\3\2\2\2\u013d\u013f"+
		"\t\7\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\b%\2\2\u0143J\3\2\2\2\u0144"+
		"\u0145\7\61\2\2\u0145\u0146\7\61\2\2\u0146\u014a\3\2\2\2\u0147\u0149\n"+
		"\b\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\b&"+
		"\2\2\u014eL\3\2\2\2\u014f\u0153\5C\"\2\u0150\u0153\5E#\2\u0151\u0153\t"+
		"\5\2\2\u0152\u014f\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155N\3\2\2\2"+
		"\24\2s\u0083\u008a\u008d\u009d\u0106\u0118\u0123\u0127\u012c\u012e\u0132"+
		"\u0137\u0140\u014a\u0152\u0154\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}