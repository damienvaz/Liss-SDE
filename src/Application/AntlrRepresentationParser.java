// Generated from /Developer/Github/Liss-SDE/src/Application/AntlrRepresentation.g4 by ANTLR 4.5.1
package Application;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AntlrRepresentationParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		TER=10, STR=11, WS=12;
	public static final int
		RULE_grammarContextFree = 0, RULE_gramarline = 1, RULE_startsymbol = 2, 
		RULE_sentences = 3, RULE_sentence = 4, RULE_lhs = 5, RULE_rhs = 6, RULE_recursivity = 7, 
		RULE_nonterminal = 8, RULE_multiplicity = 9, RULE_terminal = 10, RULE_nameofnonterminal = 11;
	public static final String[] ruleNames = {
		"grammarContextFree", "gramarline", "startsymbol", "sentences", "sentence", 
		"lhs", "rhs", "recursivity", "nonterminal", "multiplicity", "terminal", 
		"nameofnonterminal"
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

	@Override
	public String getGrammarFileName() { return "AntlrRepresentation.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AntlrRepresentationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GrammarContextFreeContext extends ParserRuleContext {
		public GramarlineContext gramarline() {
			return getRuleContext(GramarlineContext.class,0);
		}
		public StartsymbolContext startsymbol() {
			return getRuleContext(StartsymbolContext.class,0);
		}
		public GrammarContextFreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarContextFree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).enterGrammarContextFree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).exitGrammarContextFree(this);
		}
	}

	public final GrammarContextFreeContext grammarContextFree() throws RecognitionException {
		GrammarContextFreeContext _localctx = new GrammarContextFreeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grammarContextFree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			gramarline();
			setState(25);
			startsymbol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GramarlineContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(AntlrRepresentationParser.STR, 0); }
		public GramarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gramarline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).enterGramarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).exitGramarline(this);
		}
	}

	public final GramarlineContext gramarline() throws RecognitionException {
		GramarlineContext _localctx = new GramarlineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_gramarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__0);
			setState(28);
			match(STR);
			setState(29);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartsymbolContext extends ParserRuleContext {
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public StartsymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startsymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).enterStartsymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).exitStartsymbol(this);
		}
	}

	public final StartsymbolContext startsymbol() throws RecognitionException {
		StartsymbolContext _localctx = new StartsymbolContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_startsymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			sentences();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentencesContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public SentencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentences; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).enterSentences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).exitSentences(this);
		}
	}

	public final SentencesContext sentences() throws RecognitionException {
		SentencesContext _localctx = new SentencesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				sentence();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STR );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			lhs();
			setState(39);
			match(T__2);
			setState(40);
			rhs();
			setState(41);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LhsContext extends ParserRuleContext {
		public NonterminalContext nonterminal() {
			return getRuleContext(NonterminalContext.class,0);
		}
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).enterLhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).exitLhs(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			nonterminal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RhsContext extends ParserRuleContext {
		public NonterminalContext nt;
		public TerminalContext t;
		public RecursivityContext recursivity() {
			return getRuleContext(RecursivityContext.class,0);
		}
		public List<RhsContext> rhs() {
			return getRuleContexts(RhsContext.class);
		}
		public RhsContext rhs(int i) {
			return getRuleContext(RhsContext.class,i);
		}
		public List<NonterminalContext> nonterminal() {
			return getRuleContexts(NonterminalContext.class);
		}
		public NonterminalContext nonterminal(int i) {
			return getRuleContext(NonterminalContext.class,i);
		}
		public List<TerminalContext> terminal() {
			return getRuleContexts(TerminalContext.class);
		}
		public TerminalContext terminal(int i) {
			return getRuleContext(TerminalContext.class,i);
		}
		public RhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).enterRhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).exitRhs(this);
		}
	}

	public final RhsContext rhs() throws RecognitionException {
		RhsContext _localctx = new RhsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rhs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TER || _la==STR) {
				{
				setState(49);
				switch (_input.LA(1)) {
				case STR:
					{
					setState(45);
					((RhsContext)_localctx).nt = nonterminal();
					}
					break;
				case TER:
					{
					setState(46);
					((RhsContext)_localctx).t = terminal();
					System.out.println("NonTerminal: "+(((RhsContext)_localctx).nt!=null?_input.getText(((RhsContext)_localctx).nt.start,((RhsContext)_localctx).nt.stop):null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			recursivity();
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55);
					match(T__3);
					setState(56);
					rhs();
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecursivityContext extends ParserRuleContext {
		public NonterminalContext nt;
		public TerminalContext t;
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public List<NonterminalContext> nonterminal() {
			return getRuleContexts(NonterminalContext.class);
		}
		public NonterminalContext nonterminal(int i) {
			return getRuleContext(NonterminalContext.class,i);
		}
		public List<TerminalContext> terminal() {
			return getRuleContexts(TerminalContext.class);
		}
		public TerminalContext terminal(int i) {
			return getRuleContext(TerminalContext.class,i);
		}
		public RecursivityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursivity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).enterRecursivity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).exitRecursivity(this);
		}
	}

	public final RecursivityContext recursivity() throws RecognitionException {
		RecursivityContext _localctx = new RecursivityContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_recursivity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(62);
				match(T__4);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TER || _la==STR) {
					{
					setState(67);
					switch (_input.LA(1)) {
					case STR:
						{
						setState(63);
						((RecursivityContext)_localctx).nt = nonterminal();
						}
						break;
					case TER:
						{
						setState(64);
						((RecursivityContext)_localctx).t = terminal();
						System.out.println("NonTerminalRecursivity: "+(((RecursivityContext)_localctx).nt!=null?_input.getText(((RecursivityContext)_localctx).nt.start,((RecursivityContext)_localctx).nt.stop):null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(T__5);
				setState(73);
				multiplicity();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonterminalContext extends ParserRuleContext {
		public NameofnonterminalContext nameofnonterminal() {
			return getRuleContext(NameofnonterminalContext.class,0);
		}
		public MultiplicityContext multiplicity() {
			return getRuleContext(MultiplicityContext.class,0);
		}
		public NonterminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonterminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).enterNonterminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).exitNonterminal(this);
		}
	}

	public final NonterminalContext nonterminal() throws RecognitionException {
		NonterminalContext _localctx = new NonterminalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nonterminal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			nameofnonterminal();
			setState(78);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				setState(77);
				multiplicity();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicityContext extends ParserRuleContext {
		public MultiplicityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).enterMultiplicity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).exitMultiplicity(this);
		}
	}

	public final MultiplicityContext multiplicity() throws RecognitionException {
		MultiplicityContext _localctx = new MultiplicityContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiplicity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminalContext extends ParserRuleContext {
		public TerminalNode TER() { return getToken(AntlrRepresentationParser.TER, 0); }
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).exitTerminal(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_terminal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(TER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameofnonterminalContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(AntlrRepresentationParser.STR, 0); }
		public NameofnonterminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameofnonterminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).enterNameofnonterminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrRepresentationListener ) ((AntlrRepresentationListener)listener).exitNameofnonterminal(this);
		}
	}

	public final NameofnonterminalContext nameofnonterminal() throws RecognitionException {
		NameofnonterminalContext _localctx = new NameofnonterminalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nameofnonterminal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(STR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16Y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\6\5%\n\5\r\5\16"+
		"\5&\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b\64\n\b\f\b\16\b\67"+
		"\13\b\3\b\3\b\3\b\7\b<\n\b\f\b\16\b?\13\b\3\t\3\t\3\t\3\t\3\t\7\tF\n\t"+
		"\f\t\16\tI\13\t\3\t\3\t\5\tM\n\t\3\n\3\n\5\nQ\n\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2\t\13T\2\32\3\2"+
		"\2\2\4\35\3\2\2\2\6!\3\2\2\2\b$\3\2\2\2\n(\3\2\2\2\f-\3\2\2\2\16\65\3"+
		"\2\2\2\20L\3\2\2\2\22N\3\2\2\2\24R\3\2\2\2\26T\3\2\2\2\30V\3\2\2\2\32"+
		"\33\5\4\3\2\33\34\5\6\4\2\34\3\3\2\2\2\35\36\7\3\2\2\36\37\7\r\2\2\37"+
		" \7\4\2\2 \5\3\2\2\2!\"\5\b\5\2\"\7\3\2\2\2#%\5\n\6\2$#\3\2\2\2%&\3\2"+
		"\2\2&$\3\2\2\2&\'\3\2\2\2\'\t\3\2\2\2()\5\f\7\2)*\7\5\2\2*+\5\16\b\2+"+
		",\7\4\2\2,\13\3\2\2\2-.\5\22\n\2.\r\3\2\2\2/\64\5\22\n\2\60\61\5\26\f"+
		"\2\61\62\b\b\1\2\62\64\3\2\2\2\63/\3\2\2\2\63\60\3\2\2\2\64\67\3\2\2\2"+
		"\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\28=\5\20\t\29:\7"+
		"\6\2\2:<\5\16\b\2;9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\17\3\2\2\2"+
		"?=\3\2\2\2@G\7\7\2\2AF\5\22\n\2BC\5\26\f\2CD\b\t\1\2DF\3\2\2\2EA\3\2\2"+
		"\2EB\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\b\2"+
		"\2KM\5\24\13\2L@\3\2\2\2LM\3\2\2\2M\21\3\2\2\2NP\5\30\r\2OQ\5\24\13\2"+
		"PO\3\2\2\2PQ\3\2\2\2Q\23\3\2\2\2RS\t\2\2\2S\25\3\2\2\2TU\7\f\2\2U\27\3"+
		"\2\2\2VW\7\r\2\2W\31\3\2\2\2\n&\63\65=EGLP";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}