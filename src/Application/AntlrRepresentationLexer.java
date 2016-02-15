// Generated from /Developer/Github/Liss-SDE/src/Application/AntlrRepresentation.g4 by ANTLR 4.5.1
package Application;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AntlrRepresentationLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		TER=10, STR=11, WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"TER", "STR", "WS", "COMMENT", "ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC", 
		"HEX_DIGIT", "ACCENT", "SPECIAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'grammar'", "';'", "':'", "'|'", "'('", "')'", "'*'", "'+'", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "TER", "STR", 
		"WS"
	};
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


	public AntlrRepresentationLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AntlrRepresentation.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16\u008a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\6\13D\n"+
		"\13\r\13\16\13E\3\13\3\13\3\f\3\f\7\fL\n\f\f\f\16\fO\13\f\3\r\3\r\5\r"+
		"S\n\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16[\n\16\f\16\16\16^\13\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\7\16f\n\16\f\16\16\16i\13\16\5\16k\n\16\3\17\3"+
		"\17\3\17\3\17\5\17q\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20|\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\\\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\2\35\2\37\2!\2#\2%\2\'\2\3\2\13\3\2))\4\2C\\c|\5\2C\\aac|\5\2\13\f"+
		"\17\17\"\"\4\2\f\f\17\17\n\2$$))^^ddhhppttvv\5\2\62;CHch\6\2\u00c2\u00d8"+
		"\u00db\u00df\u00e2\u00f8\u00fb\u00ff\5\2##.\60AA\u008c\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3)\3"+
		"\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2"+
		"\17;\3\2\2\2\21=\3\2\2\2\23?\3\2\2\2\25A\3\2\2\2\27I\3\2\2\2\31R\3\2\2"+
		"\2\33j\3\2\2\2\35p\3\2\2\2\37{\3\2\2\2!}\3\2\2\2#\u0084\3\2\2\2%\u0086"+
		"\3\2\2\2\'\u0088\3\2\2\2)*\7i\2\2*+\7t\2\2+,\7c\2\2,-\7o\2\2-.\7o\2\2"+
		"./\7c\2\2/\60\7t\2\2\60\4\3\2\2\2\61\62\7=\2\2\62\6\3\2\2\2\63\64\7<\2"+
		"\2\64\b\3\2\2\2\65\66\7~\2\2\66\n\3\2\2\2\678\7*\2\28\f\3\2\2\29:\7+\2"+
		"\2:\16\3\2\2\2;<\7,\2\2<\20\3\2\2\2=>\7-\2\2>\22\3\2\2\2?@\7A\2\2@\24"+
		"\3\2\2\2AC\7)\2\2BD\n\2\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG"+
		"\3\2\2\2GH\7)\2\2H\26\3\2\2\2IM\t\3\2\2JL\t\4\2\2KJ\3\2\2\2LO\3\2\2\2"+
		"MK\3\2\2\2MN\3\2\2\2N\30\3\2\2\2OM\3\2\2\2PS\t\5\2\2QS\5\33\16\2RP\3\2"+
		"\2\2RQ\3\2\2\2ST\3\2\2\2TU\b\r\2\2U\32\3\2\2\2VW\7\61\2\2WX\7,\2\2X\\"+
		"\3\2\2\2Y[\13\2\2\2ZY\3\2\2\2[^\3\2\2\2\\]\3\2\2\2\\Z\3\2\2\2]_\3\2\2"+
		"\2^\\\3\2\2\2_`\7,\2\2`k\7\61\2\2ab\7\61\2\2bc\7\61\2\2cg\3\2\2\2df\n"+
		"\6\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2\2jV\3"+
		"\2\2\2ja\3\2\2\2k\34\3\2\2\2lm\7^\2\2mq\t\7\2\2nq\5!\21\2oq\5\37\20\2"+
		"pl\3\2\2\2pn\3\2\2\2po\3\2\2\2q\36\3\2\2\2rs\7^\2\2st\4\62\65\2tu\4\62"+
		"9\2u|\4\629\2vw\7^\2\2wx\4\629\2x|\4\629\2yz\7^\2\2z|\4\629\2{r\3\2\2"+
		"\2{v\3\2\2\2{y\3\2\2\2| \3\2\2\2}~\7^\2\2~\177\7w\2\2\177\u0080\5#\22"+
		"\2\u0080\u0081\5#\22\2\u0081\u0082\5#\22\2\u0082\u0083\5#\22\2\u0083\""+
		"\3\2\2\2\u0084\u0085\t\b\2\2\u0085$\3\2\2\2\u0086\u0087\t\t\2\2\u0087"+
		"&\3\2\2\2\u0088\u0089\t\n\2\2\u0089(\3\2\2\2\13\2EMR\\gjp{\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}