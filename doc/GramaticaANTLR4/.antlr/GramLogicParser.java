// Generated from c:\Users\danilo.saraiva\Desktop\GramLogic\doc\GramaticaANTLR4\GramLogic.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramLogicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WHITESPACE=10, PRED=11;
	public static final int
		RULE_form = 0, RULE_arg = 1;
	public static final String[] ruleNames = {
		"form", "arg"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'|-'", "','", "'^'", "'v'", "'->'", "'<->'", "'~'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "WHITESPACE", 
		"PRED"
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
	public String getGrammarFileName() { return "GramLogic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramLogicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FormContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode EOF() { return getToken(GramLogicParser.EOF, 0); }
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_form);
		int _la;
		try {
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case PRED:
				enterOuterAlt(_localctx, 1);
				{
				setState(4);
				arg(0);
				setState(5);
				match(T__0);
				setState(6);
				arg(0);
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(8);
					match(T__1);
					setState(9);
					arg(0);
					}
					}
					setState(14);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(15);
				match(T__0);
				setState(16);
				arg(0);
				setState(17);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode PRED() { return getToken(GramLogicParser.PRED, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	}

	public final ArgContext arg() throws RecognitionException {
		return arg(0);
	}

	private ArgContext arg(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgContext _localctx = new ArgContext(_ctx, _parentState);
		ArgContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_arg, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(22);
						match(T__6);
						}
						} 
					}
					setState(27);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(28);
				match(PRED);
				}
				break;
			case 2:
				{
				setState(29);
				match(T__7);
				setState(30);
				arg(0);
				setState(31);
				match(T__8);
				}
				break;
			case 3:
				{
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(33);
						match(T__6);
						}
						} 
					}
					setState(38);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(39);
				match(T__7);
				setState(40);
				arg(0);
				setState(41);
				match(T__8);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arg);
					setState(45);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(46);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(47);
					arg(5);
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return arg_sempred((ArgContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arg_sempred(ArgContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r8\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\2\3\2\3\2\7\2\r\n\2\f\2\16\2\20\13\2\3\2\3\2\3\2\3\2"+
		"\5\2\26\n\2\3\3\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3%\n\3\f\3\16\3(\13\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\3\3\3\3\3\7\3\63"+
		"\n\3\f\3\16\3\66\13\3\3\3\4\33&\3\4\4\2\4\2\3\3\2\5\b\2<\2\25\3\2\2\2"+
		"\4-\3\2\2\2\6\7\5\4\3\2\7\b\7\3\2\2\b\t\5\4\3\2\t\26\3\2\2\2\n\13\7\4"+
		"\2\2\13\r\5\4\3\2\f\n\3\2\2\2\r\20\3\2\2\2\16\f\3\2\2\2\16\17\3\2\2\2"+
		"\17\21\3\2\2\2\20\16\3\2\2\2\21\22\7\3\2\2\22\23\5\4\3\2\23\24\7\2\2\3"+
		"\24\26\3\2\2\2\25\6\3\2\2\2\25\16\3\2\2\2\26\3\3\2\2\2\27\33\b\3\1\2\30"+
		"\32\7\t\2\2\31\30\3\2\2\2\32\35\3\2\2\2\33\34\3\2\2\2\33\31\3\2\2\2\34"+
		"\36\3\2\2\2\35\33\3\2\2\2\36.\7\r\2\2\37 \7\n\2\2 !\5\4\3\2!\"\7\13\2"+
		"\2\".\3\2\2\2#%\7\t\2\2$#\3\2\2\2%(\3\2\2\2&\'\3\2\2\2&$\3\2\2\2\')\3"+
		"\2\2\2(&\3\2\2\2)*\7\n\2\2*+\5\4\3\2+,\7\13\2\2,.\3\2\2\2-\27\3\2\2\2"+
		"-\37\3\2\2\2-&\3\2\2\2.\64\3\2\2\2/\60\f\6\2\2\60\61\t\2\2\2\61\63\5\4"+
		"\3\7\62/\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\5\3\2\2"+
		"\2\66\64\3\2\2\2\b\16\25\33&-\64";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}