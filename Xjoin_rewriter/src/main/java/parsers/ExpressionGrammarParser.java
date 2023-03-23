// Generated from ExpressionGrammar.g4 by ANTLR 4.7.2

package parsers;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, DOC=31, EQ=32, 
		IS=33, WORD=34, STRINGCONSTANT=35, WS=36;
	public static final int
		RULE_prog = 0, RULE_xq = 1, RULE_letClause = 2, RULE_forClause = 3, RULE_whereClause = 4, 
		RULE_returnClause = 5, RULE_cond = 6, RULE_var = 7, RULE_ap = 8, RULE_doc = 9, 
		RULE_rp = 10, RULE_filter = 11, RULE_fileName = 12, RULE_tagName = 13, 
		RULE_attName = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "xq", "letClause", "forClause", "whereClause", "returnClause", 
			"cond", "var", "ap", "doc", "rp", "filter", "fileName", "tagName", "attName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'/'", "'//'", "'<'", "'>'", "'{'", "'}'", 
			"'</'", "'let'", "':='", "'for'", "'in'", "'where'", "'return'", "'empty'", 
			"'some'", "'satisfies'", "'and'", "'or'", "'not'", "'$'", "'*'", "'.'", 
			"'..'", "'text()'", "'@'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "DOC", "EQ", "IS", "WORD", 
			"STRINGCONSTANT", "WS"
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

	@Override
	public String getGrammarFileName() { return "ExpressionGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExpressionGrammarParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			xq(0);
			setState(31);
			match(EOF);
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

	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Xq_ParenthesesContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Xq_ParenthesesContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterXq_Parentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitXq_Parentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitXq_Parentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_StringContext extends XqContext {
		public TerminalNode STRINGCONSTANT() { return getToken(ExpressionGrammarParser.STRINGCONSTANT, 0); }
		public Xq_StringContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterXq_String(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitXq_String(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitXq_String(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_FLWRContext extends XqContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public Xq_FLWRContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterXq_FLWR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitXq_FLWR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitXq_FLWR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_ConcatContext extends XqContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public Xq_ConcatContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterXq_Concat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitXq_Concat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitXq_Concat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_tagsContext extends XqContext {
		public List<TagNameContext> tagName() {
			return getRuleContexts(TagNameContext.class);
		}
		public TagNameContext tagName(int i) {
			return getRuleContext(TagNameContext.class,i);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Xq_tagsContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterXq_tags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitXq_tags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitXq_tags(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_LetClauseContext extends XqContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Xq_LetClauseContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterXq_LetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitXq_LetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitXq_LetClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_ChildrenContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Xq_ChildrenContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterXq_Children(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitXq_Children(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitXq_Children(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_ApContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public Xq_ApContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterXq_Ap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitXq_Ap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitXq_Ap(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_DescendentContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Xq_DescendentContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterXq_Descendent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitXq_Descendent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitXq_Descendent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_VarContext extends XqContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Xq_VarContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterXq_Var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitXq_Var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitXq_Var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				{
				_localctx = new Xq_VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(34);
				var();
				}
				break;
			case STRINGCONSTANT:
				{
				_localctx = new Xq_StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(STRINGCONSTANT);
				}
				break;
			case DOC:
				{
				_localctx = new Xq_ApContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				ap();
				}
				break;
			case T__0:
				{
				_localctx = new Xq_ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(T__0);
				setState(38);
				xq(0);
				setState(39);
				match(T__1);
				}
				break;
			case T__5:
				{
				_localctx = new Xq_tagsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(T__5);
				setState(42);
				tagName();
				setState(43);
				match(T__6);
				setState(44);
				match(T__7);
				setState(45);
				xq(0);
				setState(46);
				match(T__8);
				setState(47);
				match(T__9);
				setState(48);
				tagName();
				setState(49);
				match(T__6);
				}
				break;
			case T__10:
				{
				_localctx = new Xq_LetClauseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				letClause();
				setState(52);
				xq(2);
				}
				break;
			case T__12:
				{
				_localctx = new Xq_FLWRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				forClause();
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(55);
					letClause();
					}
				}

				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(58);
					whereClause();
					}
				}

				setState(61);
				returnClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(74);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Xq_ConcatContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(65);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(66);
						match(T__2);
						setState(67);
						xq(7);
						}
						break;
					case 2:
						{
						_localctx = new Xq_ChildrenContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(68);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(69);
						match(T__3);
						setState(70);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new Xq_DescendentContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(71);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(72);
						match(T__4);
						setState(73);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class LetClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__10);
			setState(80);
			var();
			setState(81);
			match(T__11);
			setState(82);
			xq(0);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(83);
				match(T__2);
				setState(84);
				var();
				setState(85);
				match(T__11);
				setState(86);
				xq(0);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ForClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__12);
			setState(94);
			var();
			setState(95);
			match(T__13);
			setState(96);
			xq(0);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(97);
				match(T__2);
				setState(98);
				var();
				setState(99);
				match(T__13);
				setState(100);
				xq(0);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__14);
			setState(108);
			cond(0);
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

	public static class ReturnClauseContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__15);
			setState(111);
			xq(0);
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

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Cond_EmptyContext extends CondContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Cond_EmptyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterCond_Empty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitCond_Empty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitCond_Empty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_ParenthesesContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Cond_ParenthesesContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterCond_Parentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitCond_Parentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitCond_Parentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_XqIsContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode IS() { return getToken(ExpressionGrammarParser.IS, 0); }
		public Cond_XqIsContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterCond_XqIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitCond_XqIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitCond_XqIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_NotContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Cond_NotContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterCond_Not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitCond_Not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitCond_Not(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_XqEqualContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode EQ() { return getToken(ExpressionGrammarParser.EQ, 0); }
		public Cond_XqEqualContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterCond_XqEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitCond_XqEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitCond_XqEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_SomeSatisfiesContext extends CondContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Cond_SomeSatisfiesContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterCond_SomeSatisfies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitCond_SomeSatisfies(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitCond_SomeSatisfies(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_OrContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public Cond_OrContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterCond_Or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitCond_Or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitCond_Or(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_AndContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public Cond_AndContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterCond_And(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitCond_And(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitCond_And(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new Cond_XqEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(114);
				xq(0);
				setState(115);
				match(EQ);
				setState(116);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new Cond_XqIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				xq(0);
				setState(119);
				match(IS);
				setState(120);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new Cond_EmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(T__16);
				setState(123);
				match(T__0);
				setState(124);
				xq(0);
				setState(125);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new Cond_SomeSatisfiesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(T__17);
				setState(128);
				var();
				setState(129);
				match(T__13);
				setState(130);
				xq(0);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(131);
					match(T__2);
					setState(132);
					var();
					setState(133);
					match(T__13);
					setState(134);
					xq(0);
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
				match(T__18);
				setState(142);
				cond(5);
				}
				break;
			case 5:
				{
				_localctx = new Cond_ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(T__0);
				setState(145);
				cond(0);
				setState(146);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new Cond_NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(T__21);
				setState(149);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(158);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Cond_AndContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(152);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(153);
						match(T__19);
						setState(154);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new Cond_OrContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(155);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(156);
						match(T__20);
						setState(157);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ExpressionGrammarParser.WORD, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__22);
			setState(164);
			match(WORD);
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

	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Ap_DescendantsContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Ap_DescendantsContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterAp_Descendants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitAp_Descendants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitAp_Descendants(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ap_ChildrenContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Ap_ChildrenContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterAp_Children(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitAp_Children(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitAp_Children(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ap_docContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public Ap_docContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterAp_doc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitAp_doc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitAp_doc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ap);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Ap_docContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				doc();
				}
				break;
			case 2:
				_localctx = new Ap_ChildrenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				doc();
				setState(168);
				match(T__3);
				setState(169);
				rp(0);
				}
				break;
			case 3:
				_localctx = new Ap_DescendantsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				doc();
				setState(172);
				match(T__4);
				setState(173);
				rp(0);
				}
				break;
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

	public static class DocContext extends ParserRuleContext {
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
	 
		public DocContext() { }
		public void copyFrom(DocContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DocumentContext extends DocContext {
		public TerminalNode DOC() { return getToken(ExpressionGrammarParser.DOC, 0); }
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public DocumentContext(DocContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_doc);
		try {
			_localctx = new DocumentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(DOC);
			setState(178);
			match(T__0);
			setState(179);
			fileName();
			setState(180);
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

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Rp_textContext extends RpContext {
		public Rp_textContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterRp_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitRp_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitRp_text(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_RpDescendantContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public Rp_RpDescendantContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterRp_RpDescendant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitRp_RpDescendant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitRp_RpDescendant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_TagnameContext extends RpContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public Rp_TagnameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterRp_Tagname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitRp_Tagname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitRp_Tagname(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_SelfContext extends RpContext {
		public Rp_SelfContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterRp_Self(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitRp_Self(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitRp_Self(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_ParentContext extends RpContext {
		public Rp_ParentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterRp_Parent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitRp_Parent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitRp_Parent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_AttributeContext extends RpContext {
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public Rp_AttributeContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterRp_Attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitRp_Attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitRp_Attribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_RpChildrenContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public Rp_RpChildrenContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterRp_RpChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitRp_RpChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitRp_RpChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_FilterContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public Rp_FilterContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterRp_Filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitRp_Filter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitRp_Filter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_ConcatContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public Rp_ConcatContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterRp_Concat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitRp_Concat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitRp_Concat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_RpContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Rp_RpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterRp_Rp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitRp_Rp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitRp_Rp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_ChildrenContext extends RpContext {
		public Rp_ChildrenContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterRp_Children(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitRp_Children(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitRp_Children(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				{
				_localctx = new Rp_TagnameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(183);
				tagName();
				}
				break;
			case T__23:
				{
				_localctx = new Rp_ChildrenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(T__23);
				}
				break;
			case T__24:
				{
				_localctx = new Rp_SelfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(T__24);
				}
				break;
			case T__25:
				{
				_localctx = new Rp_ParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(T__25);
				}
				break;
			case T__26:
				{
				_localctx = new Rp_textContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(T__26);
				}
				break;
			case T__27:
				{
				_localctx = new Rp_AttributeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(T__27);
				setState(189);
				attName();
				}
				break;
			case T__0:
				{
				_localctx = new Rp_RpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(T__0);
				setState(191);
				rp(0);
				setState(192);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new Rp_RpChildrenContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(196);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(197);
						match(T__3);
						setState(198);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new Rp_RpDescendantContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(199);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(200);
						match(T__4);
						setState(201);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new Rp_ConcatContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(202);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(203);
						match(T__2);
						setState(204);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new Rp_FilterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(205);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(206);
						match(T__28);
						setState(207);
						filter(0);
						setState(208);
						match(T__29);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class FilterContext extends ParserRuleContext {
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
	 
		public FilterContext() { }
		public void copyFrom(FilterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Fltr_notContext extends FilterContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public Fltr_notContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterFltr_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitFltr_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitFltr_not(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Fltr_RpIsContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode IS() { return getToken(ExpressionGrammarParser.IS, 0); }
		public Fltr_RpIsContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterFltr_RpIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitFltr_RpIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitFltr_RpIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Fltr_AndContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public Fltr_AndContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterFltr_And(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitFltr_And(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitFltr_And(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Fltr_RpEqualContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode EQ() { return getToken(ExpressionGrammarParser.EQ, 0); }
		public Fltr_RpEqualContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterFltr_RpEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitFltr_RpEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitFltr_RpEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Fltr_ParenthesisContext extends FilterContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public Fltr_ParenthesisContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterFltr_Parenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitFltr_Parenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitFltr_Parenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Fltr_OrContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public Fltr_OrContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterFltr_Or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitFltr_Or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitFltr_Or(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Fltr_RpIsStringConstantContext extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode EQ() { return getToken(ExpressionGrammarParser.EQ, 0); }
		public TerminalNode STRINGCONSTANT() { return getToken(ExpressionGrammarParser.STRINGCONSTANT, 0); }
		public Fltr_RpIsStringConstantContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterFltr_RpIsStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitFltr_RpIsStringConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitFltr_RpIsStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Fltr_RpContext extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Fltr_RpContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterFltr_Rp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitFltr_Rp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitFltr_Rp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		return filter(0);
	}

	private FilterContext filter(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FilterContext _localctx = new FilterContext(_ctx, _parentState);
		FilterContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_filter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new Fltr_RpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(216);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new Fltr_RpEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				rp(0);
				setState(218);
				match(EQ);
				setState(219);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new Fltr_RpIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				rp(0);
				setState(222);
				match(IS);
				setState(223);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new Fltr_RpIsStringConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				rp(0);
				setState(226);
				match(EQ);
				setState(227);
				match(STRINGCONSTANT);
				}
				break;
			case 5:
				{
				_localctx = new Fltr_ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(T__0);
				setState(230);
				filter(0);
				setState(231);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new Fltr_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				match(T__21);
				setState(234);
				filter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new Fltr_AndContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(237);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(238);
						match(T__19);
						setState(239);
						filter(4);
						}
						break;
					case 2:
						{
						_localctx = new Fltr_OrContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(240);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(241);
						match(T__20);
						setState(242);
						filter(3);
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class FileNameContext extends ParserRuleContext {
		public TerminalNode STRINGCONSTANT() { return getToken(ExpressionGrammarParser.STRINGCONSTANT, 0); }
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(STRINGCONSTANT);
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

	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ExpressionGrammarParser.WORD, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(WORD);
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

	public static class AttNameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ExpressionGrammarParser.WORD, 0); }
		public AttNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterAttName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitAttName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitAttName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttNameContext attName() throws RecognitionException {
		AttNameContext _localctx = new AttNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(WORD);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 6:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 10:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 11:
			return filter_sempred((FilterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean filter_sempred(FilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0101\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3;\n\3\3\3\5\3>\n\3\3\3\3\3\5\3B\n\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3M\n\3\f\3\16\3P\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5i\n\5\f\5\16\5l\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u008b\n\b\f\b\16\b\u008e\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0099\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a1\n\b\f\b\16\b\u00a4\13"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b2\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00c5\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00d5\n\f\f\f\16\f\u00d8\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ee\n\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u00f6\n\r\f\r\16\r\u00f9\13\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\2\6\4\16\26\30\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2"+
		"\2\2\u0119\2 \3\2\2\2\4A\3\2\2\2\6Q\3\2\2\2\b_\3\2\2\2\nm\3\2\2\2\fp\3"+
		"\2\2\2\16\u0098\3\2\2\2\20\u00a5\3\2\2\2\22\u00b1\3\2\2\2\24\u00b3\3\2"+
		"\2\2\26\u00c4\3\2\2\2\30\u00ed\3\2\2\2\32\u00fa\3\2\2\2\34\u00fc\3\2\2"+
		"\2\36\u00fe\3\2\2\2 !\5\4\3\2!\"\7\2\2\3\"\3\3\2\2\2#$\b\3\1\2$B\5\20"+
		"\t\2%B\7%\2\2&B\5\22\n\2\'(\7\3\2\2()\5\4\3\2)*\7\4\2\2*B\3\2\2\2+,\7"+
		"\b\2\2,-\5\34\17\2-.\7\t\2\2./\7\n\2\2/\60\5\4\3\2\60\61\7\13\2\2\61\62"+
		"\7\f\2\2\62\63\5\34\17\2\63\64\7\t\2\2\64B\3\2\2\2\65\66\5\6\4\2\66\67"+
		"\5\4\3\4\67B\3\2\2\28:\5\b\5\29;\5\6\4\2:9\3\2\2\2:;\3\2\2\2;=\3\2\2\2"+
		"<>\5\n\6\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\5\f\7\2@B\3\2\2\2A#\3\2\2\2"+
		"A%\3\2\2\2A&\3\2\2\2A\'\3\2\2\2A+\3\2\2\2A\65\3\2\2\2A8\3\2\2\2BN\3\2"+
		"\2\2CD\f\b\2\2DE\7\5\2\2EM\5\4\3\tFG\f\7\2\2GH\7\6\2\2HM\5\26\f\2IJ\f"+
		"\6\2\2JK\7\7\2\2KM\5\26\f\2LC\3\2\2\2LF\3\2\2\2LI\3\2\2\2MP\3\2\2\2NL"+
		"\3\2\2\2NO\3\2\2\2O\5\3\2\2\2PN\3\2\2\2QR\7\r\2\2RS\5\20\t\2ST\7\16\2"+
		"\2T\\\5\4\3\2UV\7\5\2\2VW\5\20\t\2WX\7\16\2\2XY\5\4\3\2Y[\3\2\2\2ZU\3"+
		"\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\7\3\2\2\2^\\\3\2\2\2_`\7\17\2"+
		"\2`a\5\20\t\2ab\7\20\2\2bj\5\4\3\2cd\7\5\2\2de\5\20\t\2ef\7\20\2\2fg\5"+
		"\4\3\2gi\3\2\2\2hc\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\t\3\2\2\2lj"+
		"\3\2\2\2mn\7\21\2\2no\5\16\b\2o\13\3\2\2\2pq\7\22\2\2qr\5\4\3\2r\r\3\2"+
		"\2\2st\b\b\1\2tu\5\4\3\2uv\7\"\2\2vw\5\4\3\2w\u0099\3\2\2\2xy\5\4\3\2"+
		"yz\7#\2\2z{\5\4\3\2{\u0099\3\2\2\2|}\7\23\2\2}~\7\3\2\2~\177\5\4\3\2\177"+
		"\u0080\7\4\2\2\u0080\u0099\3\2\2\2\u0081\u0082\7\24\2\2\u0082\u0083\5"+
		"\20\t\2\u0083\u0084\7\20\2\2\u0084\u008c\5\4\3\2\u0085\u0086\7\5\2\2\u0086"+
		"\u0087\5\20\t\2\u0087\u0088\7\20\2\2\u0088\u0089\5\4\3\2\u0089\u008b\3"+
		"\2\2\2\u008a\u0085\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\25"+
		"\2\2\u0090\u0091\5\16\b\7\u0091\u0099\3\2\2\2\u0092\u0093\7\3\2\2\u0093"+
		"\u0094\5\16\b\2\u0094\u0095\7\4\2\2\u0095\u0099\3\2\2\2\u0096\u0097\7"+
		"\30\2\2\u0097\u0099\5\16\b\3\u0098s\3\2\2\2\u0098x\3\2\2\2\u0098|\3\2"+
		"\2\2\u0098\u0081\3\2\2\2\u0098\u0092\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u00a2\3\2\2\2\u009a\u009b\f\5\2\2\u009b\u009c\7\26\2\2\u009c\u00a1\5"+
		"\16\b\6\u009d\u009e\f\4\2\2\u009e\u009f\7\27\2\2\u009f\u00a1\5\16\b\5"+
		"\u00a0\u009a\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\17\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a6\7\31\2\2\u00a6\u00a7\7$\2\2\u00a7\21\3\2\2\2\u00a8\u00b2\5\24\13"+
		"\2\u00a9\u00aa\5\24\13\2\u00aa\u00ab\7\6\2\2\u00ab\u00ac\5\26\f\2\u00ac"+
		"\u00b2\3\2\2\2\u00ad\u00ae\5\24\13\2\u00ae\u00af\7\7\2\2\u00af\u00b0\5"+
		"\26\f\2\u00b0\u00b2\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1"+
		"\u00ad\3\2\2\2\u00b2\23\3\2\2\2\u00b3\u00b4\7!\2\2\u00b4\u00b5\7\3\2\2"+
		"\u00b5\u00b6\5\32\16\2\u00b6\u00b7\7\4\2\2\u00b7\25\3\2\2\2\u00b8\u00b9"+
		"\b\f\1\2\u00b9\u00c5\5\34\17\2\u00ba\u00c5\7\32\2\2\u00bb\u00c5\7\33\2"+
		"\2\u00bc\u00c5\7\34\2\2\u00bd\u00c5\7\35\2\2\u00be\u00bf\7\36\2\2\u00bf"+
		"\u00c5\5\36\20\2\u00c0\u00c1\7\3\2\2\u00c1\u00c2\5\26\f\2\u00c2\u00c3"+
		"\7\4\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00b8\3\2\2\2\u00c4\u00ba\3\2\2\2\u00c4"+
		"\u00bb\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00bd\3\2\2\2\u00c4\u00be\3\2"+
		"\2\2\u00c4\u00c0\3\2\2\2\u00c5\u00d6\3\2\2\2\u00c6\u00c7\f\6\2\2\u00c7"+
		"\u00c8\7\6\2\2\u00c8\u00d5\5\26\f\7\u00c9\u00ca\f\5\2\2\u00ca\u00cb\7"+
		"\7\2\2\u00cb\u00d5\5\26\f\6\u00cc\u00cd\f\3\2\2\u00cd\u00ce\7\5\2\2\u00ce"+
		"\u00d5\5\26\f\4\u00cf\u00d0\f\4\2\2\u00d0\u00d1\7\37\2\2\u00d1\u00d2\5"+
		"\30\r\2\u00d2\u00d3\7 \2\2\u00d3\u00d5\3\2\2\2\u00d4\u00c6\3\2\2\2\u00d4"+
		"\u00c9\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d5\u00d8\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\27\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d9\u00da\b\r\1\2\u00da\u00ee\5\26\f\2\u00db\u00dc\5\26\f\2"+
		"\u00dc\u00dd\7\"\2\2\u00dd\u00de\5\26\f\2\u00de\u00ee\3\2\2\2\u00df\u00e0"+
		"\5\26\f\2\u00e0\u00e1\7#\2\2\u00e1\u00e2\5\26\f\2\u00e2\u00ee\3\2\2\2"+
		"\u00e3\u00e4\5\26\f\2\u00e4\u00e5\7\"\2\2\u00e5\u00e6\7%\2\2\u00e6\u00ee"+
		"\3\2\2\2\u00e7\u00e8\7\3\2\2\u00e8\u00e9\5\30\r\2\u00e9\u00ea\7\4\2\2"+
		"\u00ea\u00ee\3\2\2\2\u00eb\u00ec\7\30\2\2\u00ec\u00ee\5\30\r\3\u00ed\u00d9"+
		"\3\2\2\2\u00ed\u00db\3\2\2\2\u00ed\u00df\3\2\2\2\u00ed\u00e3\3\2\2\2\u00ed"+
		"\u00e7\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f7\3\2\2\2\u00ef\u00f0\f\5"+
		"\2\2\u00f0\u00f1\7\26\2\2\u00f1\u00f6\5\30\r\6\u00f2\u00f3\f\4\2\2\u00f3"+
		"\u00f4\7\27\2\2\u00f4\u00f6\5\30\r\5\u00f5\u00ef\3\2\2\2\u00f5\u00f2\3"+
		"\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\31\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7%\2\2\u00fb\33\3\2\2\2\u00fc"+
		"\u00fd\7$\2\2\u00fd\35\3\2\2\2\u00fe\u00ff\7$\2\2\u00ff\37\3\2\2\2\24"+
		":=ALN\\j\u008c\u0098\u00a0\u00a2\u00b1\u00c4\u00d4\u00d6\u00ed\u00f5\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}