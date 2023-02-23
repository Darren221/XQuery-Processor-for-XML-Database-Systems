// Generated from ExpressionGrammar.g4 by ANTLR 4.4

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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__32=1, T__31=2, T__30=3, T__29=4, T__28=5, T__27=6, T__26=7, T__25=8, 
		T__24=9, T__23=10, T__22=11, T__21=12, T__20=13, T__19=14, T__18=15, T__17=16, 
		T__16=17, T__15=18, T__14=19, T__13=20, T__12=21, T__11=22, T__10=23, 
		T__9=24, T__8=25, T__7=26, T__6=27, T__5=28, T__4=29, T__3=30, T__2=31, 
		T__1=32, T__0=33, EQ=34, IS=35, WORD=36, STRINGCONSTANT=37, WS=38;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'some'", "'text()'", "'return'", "'{'", "'..'", "'='", 
		"'}'", "'for'", "':='", "'\")'", "'$'", "'satisfies'", "'('", "'*'", "','", 
		"'.'", "'</'", "'doc(\"'", "'['", "'<'", "'//'", "']'", "'>'", "'@'", 
		"'or'", "'where'", "'let'", "'in'", "')'", "'and'", "'not'", "'empty('", 
		"EQ", "IS", "WORD", "STRINGCONSTANT", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_xq = 1, RULE_letClause = 2, RULE_forClause = 3, RULE_whereClause = 4, 
		RULE_returnClause = 5, RULE_cond = 6, RULE_var = 7, RULE_ap = 8, RULE_doc = 9, 
		RULE_rp = 10, RULE_filter = 11;
	public static final String[] ruleNames = {
		"prog", "xq", "letClause", "forClause", "whereClause", "returnClause", 
		"cond", "var", "ap", "doc", "rp", "filter"
	};

	@Override
	public String getGrammarFileName() { return "ExpressionGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public TerminalNode EOF() { return getToken(ExpressionGrammarParser.EOF, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); xq(0);
			setState(25); match(EOF);
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
	}
	public static class Xq_FLWRContext extends XqContext {
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
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
	}
	public static class Xq_ConcatContext extends XqContext {
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
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
	}
	public static class Xq_LetClauseContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
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
	}
	public static class Xq_tagsContext extends XqContext {
		public List<TerminalNode> WORD() { return getTokens(ExpressionGrammarParser.WORD); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode WORD(int i) {
			return getToken(ExpressionGrammarParser.WORD, i);
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
	}
	public static class Xq_ChildrenContext extends XqContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
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
	}
	public static class Xq_DescendentContext extends XqContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
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
			setState(67);
			switch (_input.LA(1)) {
			case T__5:
				{
				_localctx = new Xq_LetClauseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(28); letClause();
				setState(29); xq(2);
				}
				break;
			case T__21:
				{
				_localctx = new Xq_VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31); var();
				}
				break;
			case STRINGCONSTANT:
				{
				_localctx = new Xq_StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32); match(STRINGCONSTANT);
				}
				break;
			case T__14:
				{
				_localctx = new Xq_ApContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33); ap();
				}
				break;
			case T__19:
				{
				_localctx = new Xq_ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34); match(T__19);
				setState(35); xq(0);
				setState(36); match(T__3);
				}
				break;
			case T__12:
				{
				_localctx = new Xq_tagsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38); match(T__12);
				setState(39); match(WORD);
				setState(40); match(T__9);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__28) {
					{
					{
					setState(41); match(T__28);
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(47); xq(0);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(48); match(T__25);
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(54); match(T__15);
				setState(55); match(WORD);
				setState(56); match(T__9);
				}
				break;
			case T__24:
				{
				_localctx = new Xq_FLWRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58); forClause();
				setState(60);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(59); letClause();
					}
				}

				setState(63);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(62); whereClause();
					}
				}

				setState(65); returnClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(78);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Xq_ConcatContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(69);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(70); match(T__17);
						setState(71); xq(7);
						}
						break;
					case 2:
						{
						_localctx = new Xq_ChildrenContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(72);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(73); match(T__32);
						setState(74); rp(0);
						}
						break;
					case 3:
						{
						_localctx = new Xq_DescendentContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(75);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(76); match(T__11);
						setState(77); rp(0);
						}
						break;
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
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
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(T__5);
			setState(84); var();
			setState(85); match(T__23);
			setState(86); xq(0);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(87); match(T__17);
				setState(88); var();
				setState(89); match(T__23);
				setState(90); xq(0);
				}
				}
				setState(96);
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
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
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
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(T__24);
			setState(98); var();
			setState(99); match(T__4);
			setState(100); xq(0);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(101); match(T__17);
				setState(102); var();
				setState(103); match(T__4);
				setState(104); xq(0);
				}
				}
				setState(110);
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
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(T__6);
			setState(112); cond(0);
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
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(T__29);
			setState(115); xq(0);
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
	}
	public static class Cond_XqIsContext extends CondContext {
		public TerminalNode IS() { return getToken(ExpressionGrammarParser.IS, 0); }
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public Cond_XqIsContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterCond_XqIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitCond_XqIs(this);
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
	}
	public static class Cond_XqEqualContext extends CondContext {
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
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
	}
	public static class Cond_SomeSatisfiesContext extends CondContext {
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
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
	}
	public static class Cond_OrContext extends CondContext {
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
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
	}
	public static class Cond_AndContext extends CondContext {
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
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
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new Cond_SomeSatisfiesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(118); match(T__31);
				setState(119); var();
				setState(120); match(T__4);
				setState(121); xq(0);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(122); match(T__17);
					setState(123); var();
					setState(124); match(T__4);
					setState(125); xq(0);
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132); match(T__20);
				setState(133); cond(5);
				}
				break;
			case 2:
				{
				_localctx = new Cond_NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135); match(T__1);
				setState(136); cond(1);
				}
				break;
			case 3:
				{
				_localctx = new Cond_XqEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137); xq(0);
				setState(138); match(EQ);
				setState(139); xq(0);
				}
				break;
			case 4:
				{
				_localctx = new Cond_XqIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141); xq(0);
				setState(142); match(IS);
				setState(143); xq(0);
				}
				break;
			case 5:
				{
				_localctx = new Cond_EmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145); match(T__0);
				setState(146); xq(0);
				setState(147); match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new Cond_ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149); match(T__19);
				setState(150); cond(0);
				setState(151); match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new Cond_AndContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(155);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(156); match(T__2);
						setState(157); cond(4);
						}
						break;
					case 2:
						{
						_localctx = new Cond_OrContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(158);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(159); match(T__7);
						setState(160); cond(3);
						}
						break;
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(T__21);
			setState(167); match(WORD);
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
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
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
	}
	public static class Ap_ChildrenContext extends ApContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
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
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ap);
		try {
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Ap_docContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169); doc();
				}
				break;
			case 2:
				_localctx = new Ap_ChildrenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170); doc();
				setState(171); match(T__32);
				setState(172); rp(0);
				}
				break;
			case 3:
				_localctx = new Ap_DescendantsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(174); doc();
				setState(175); match(T__11);
				setState(176); rp(0);
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
		public List<TerminalNode> WORD() { return getTokens(ExpressionGrammarParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ExpressionGrammarParser.WORD, i);
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
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_doc);
		int _la;
		try {
			_localctx = new DocumentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(T__14);
			setState(181); match(WORD);
			setState(184);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(182); match(T__16);
				setState(183); match(WORD);
				}
			}

			setState(186); match(T__22);
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
	}
	public static class Rp_RpDescendantContext extends RpContext {
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
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
	}
	public static class Rp_TagnameContext extends RpContext {
		public TerminalNode WORD() { return getToken(ExpressionGrammarParser.WORD, 0); }
		public Rp_TagnameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterRp_Tagname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitRp_Tagname(this);
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
	}
	public static class Rp_AttributeContext extends RpContext {
		public TerminalNode WORD() { return getToken(ExpressionGrammarParser.WORD, 0); }
		public Rp_AttributeContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterRp_Attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitRp_Attribute(this);
		}
	}
	public static class Rp_RpChildrenContext extends RpContext {
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
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
	}
	public static class Rp_FilterContext extends RpContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
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
	}
	public static class Rp_ConcatContext extends RpContext {
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
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
			setState(200);
			switch (_input.LA(1)) {
			case WORD:
				{
				_localctx = new Rp_TagnameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(189); match(WORD);
				}
				break;
			case T__18:
				{
				_localctx = new Rp_ChildrenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190); match(T__18);
				}
				break;
			case T__16:
				{
				_localctx = new Rp_SelfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191); match(T__16);
				}
				break;
			case T__27:
				{
				_localctx = new Rp_ParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192); match(T__27);
				}
				break;
			case T__30:
				{
				_localctx = new Rp_textContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193); match(T__30);
				}
				break;
			case T__8:
				{
				_localctx = new Rp_AttributeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194); match(T__8);
				setState(195); match(WORD);
				}
				break;
			case T__19:
				{
				_localctx = new Rp_RpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196); match(T__19);
				setState(197); rp(0);
				setState(198); match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new Rp_RpChildrenContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(202);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(203); match(T__32);
						setState(204); rp(5);
						}
						break;
					case 2:
						{
						_localctx = new Rp_RpDescendantContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(205);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(206); match(T__11);
						setState(207); rp(4);
						}
						break;
					case 3:
						{
						_localctx = new Rp_ConcatContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(208);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(209); match(T__17);
						setState(210); rp(2);
						}
						break;
					case 4:
						{
						_localctx = new Rp_FilterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(211);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(212); match(T__13);
						setState(213); filter(0);
						setState(214); match(T__10);
						}
						break;
					}
					} 
				}
				setState(220);
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
	}
	public static class Fltr_RpIsContext extends FilterContext {
		public TerminalNode IS() { return getToken(ExpressionGrammarParser.IS, 0); }
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public Fltr_RpIsContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterFltr_RpIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitFltr_RpIs(this);
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
	}
	public static class Fltr_RpEqualContext extends FilterContext {
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
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
	}
	public static class Fltr_RpIsStringConstantContext extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
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
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new Fltr_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(222); match(T__1);
				setState(223); filter(1);
				}
				break;
			case 2:
				{
				_localctx = new Fltr_RpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224); rp(0);
				}
				break;
			case 3:
				{
				_localctx = new Fltr_RpEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225); rp(0);
				setState(226); match(EQ);
				setState(227); rp(0);
				}
				break;
			case 4:
				{
				_localctx = new Fltr_RpIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229); rp(0);
				setState(230); match(IS);
				setState(231); rp(0);
				}
				break;
			case 5:
				{
				_localctx = new Fltr_RpIsStringConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233); rp(0);
				setState(234); match(T__26);
				setState(235); match(STRINGCONSTANT);
				}
				break;
			case 6:
				{
				_localctx = new Fltr_ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237); match(T__19);
				setState(238); filter(0);
				setState(239); match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(249);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new Fltr_AndContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(243);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(244); match(T__2);
						setState(245); filter(4);
						}
						break;
					case 2:
						{
						_localctx = new Fltr_OrContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(246);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(247); match(T__7);
						setState(248); filter(3);
						}
						break;
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		case 1: return xq_sempred((XqContext)_localctx, predIndex);
		case 6: return cond_sempred((CondContext)_localctx, predIndex);
		case 10: return rp_sempred((RpContext)_localctx, predIndex);
		case 11: return filter_sempred((FilterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean filter_sempred(FilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9: return precpred(_ctx, 3);
		case 10: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);
		case 1: return precpred(_ctx, 5);
		case 2: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 3);
		case 4: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 4);
		case 6: return precpred(_ctx, 3);
		case 7: return precpred(_ctx, 1);
		case 8: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u0101\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\3\3\7\3\64\n\3\f"+
		"\3\16\3\67\13\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\3\5\3B\n\3\3\3\3\3"+
		"\5\3F\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3Q\n\3\f\3\16\3T\13\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4_\n\4\f\4\16\4b\13\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5m\n\5\f\5\16\5p\13\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0082\n\b\f\b\16\b\u0085"+
		"\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u009c\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a4\n"+
		"\b\f\b\16\b\u00a7\13\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00b5\n\n\3\13\3\13\3\13\3\13\5\13\u00bb\n\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00cb\n\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00db\n\f\f\f\16\f\u00de\13"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00f4\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00fc\n\r\f\r\16"+
		"\r\u00ff\13\r\3\r\2\6\4\16\26\30\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2"+
		"\u011f\2\32\3\2\2\2\4E\3\2\2\2\6U\3\2\2\2\bc\3\2\2\2\nq\3\2\2\2\ft\3\2"+
		"\2\2\16\u009b\3\2\2\2\20\u00a8\3\2\2\2\22\u00b4\3\2\2\2\24\u00b6\3\2\2"+
		"\2\26\u00ca\3\2\2\2\30\u00f3\3\2\2\2\32\33\5\4\3\2\33\34\7\2\2\3\34\3"+
		"\3\2\2\2\35\36\b\3\1\2\36\37\5\6\4\2\37 \5\4\3\4 F\3\2\2\2!F\5\20\t\2"+
		"\"F\7\'\2\2#F\5\22\n\2$%\7\20\2\2%&\5\4\3\2&\'\7 \2\2\'F\3\2\2\2()\7\27"+
		"\2\2)*\7&\2\2*.\7\32\2\2+-\7\7\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3"+
		"\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\65\5\4\3\2\62\64\7\n\2\2\63\62\3\2\2"+
		"\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\2"+
		"89\7\24\2\29:\7&\2\2:;\7\32\2\2;F\3\2\2\2<>\5\b\5\2=?\5\6\4\2>=\3\2\2"+
		"\2>?\3\2\2\2?A\3\2\2\2@B\5\n\6\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\5\f\7"+
		"\2DF\3\2\2\2E\35\3\2\2\2E!\3\2\2\2E\"\3\2\2\2E#\3\2\2\2E$\3\2\2\2E(\3"+
		"\2\2\2E<\3\2\2\2FR\3\2\2\2GH\f\b\2\2HI\7\22\2\2IQ\5\4\3\tJK\f\7\2\2KL"+
		"\7\3\2\2LQ\5\26\f\2MN\f\6\2\2NO\7\30\2\2OQ\5\26\f\2PG\3\2\2\2PJ\3\2\2"+
		"\2PM\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\5\3\2\2\2TR\3\2\2\2UV\7\36"+
		"\2\2VW\5\20\t\2WX\7\f\2\2X`\5\4\3\2YZ\7\22\2\2Z[\5\20\t\2[\\\7\f\2\2\\"+
		"]\5\4\3\2]_\3\2\2\2^Y\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\7\3\2\2\2"+
		"b`\3\2\2\2cd\7\13\2\2de\5\20\t\2ef\7\37\2\2fn\5\4\3\2gh\7\22\2\2hi\5\20"+
		"\t\2ij\7\37\2\2jk\5\4\3\2km\3\2\2\2lg\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3"+
		"\2\2\2o\t\3\2\2\2pn\3\2\2\2qr\7\35\2\2rs\5\16\b\2s\13\3\2\2\2tu\7\6\2"+
		"\2uv\5\4\3\2v\r\3\2\2\2wx\b\b\1\2xy\7\4\2\2yz\5\20\t\2z{\7\37\2\2{\u0083"+
		"\5\4\3\2|}\7\22\2\2}~\5\20\t\2~\177\7\37\2\2\177\u0080\5\4\3\2\u0080\u0082"+
		"\3\2\2\2\u0081|\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\17"+
		"\2\2\u0087\u0088\5\16\b\7\u0088\u009c\3\2\2\2\u0089\u008a\7\"\2\2\u008a"+
		"\u009c\5\16\b\3\u008b\u008c\5\4\3\2\u008c\u008d\7$\2\2\u008d\u008e\5\4"+
		"\3\2\u008e\u009c\3\2\2\2\u008f\u0090\5\4\3\2\u0090\u0091\7%\2\2\u0091"+
		"\u0092\5\4\3\2\u0092\u009c\3\2\2\2\u0093\u0094\7#\2\2\u0094\u0095\5\4"+
		"\3\2\u0095\u0096\7 \2\2\u0096\u009c\3\2\2\2\u0097\u0098\7\20\2\2\u0098"+
		"\u0099\5\16\b\2\u0099\u009a\7 \2\2\u009a\u009c\3\2\2\2\u009bw\3\2\2\2"+
		"\u009b\u0089\3\2\2\2\u009b\u008b\3\2\2\2\u009b\u008f\3\2\2\2\u009b\u0093"+
		"\3\2\2\2\u009b\u0097\3\2\2\2\u009c\u00a5\3\2\2\2\u009d\u009e\f\5\2\2\u009e"+
		"\u009f\7!\2\2\u009f\u00a4\5\16\b\6\u00a0\u00a1\f\4\2\2\u00a1\u00a2\7\34"+
		"\2\2\u00a2\u00a4\5\16\b\5\u00a3\u009d\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\17\3\2\2"+
		"\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\16\2\2\u00a9\u00aa\7&\2\2\u00aa\21"+
		"\3\2\2\2\u00ab\u00b5\5\24\13\2\u00ac\u00ad\5\24\13\2\u00ad\u00ae\7\3\2"+
		"\2\u00ae\u00af\5\26\f\2\u00af\u00b5\3\2\2\2\u00b0\u00b1\5\24\13\2\u00b1"+
		"\u00b2\7\30\2\2\u00b2\u00b3\5\26\f\2\u00b3\u00b5\3\2\2\2\u00b4\u00ab\3"+
		"\2\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5\23\3\2\2\2\u00b6"+
		"\u00b7\7\25\2\2\u00b7\u00ba\7&\2\2\u00b8\u00b9\7\23\2\2\u00b9\u00bb\7"+
		"&\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\7\r\2\2\u00bd\25\3\2\2\2\u00be\u00bf\b\f\1\2\u00bf\u00cb\7&\2\2"+
		"\u00c0\u00cb\7\21\2\2\u00c1\u00cb\7\23\2\2\u00c2\u00cb\7\b\2\2\u00c3\u00cb"+
		"\7\5\2\2\u00c4\u00c5\7\33\2\2\u00c5\u00cb\7&\2\2\u00c6\u00c7\7\20\2\2"+
		"\u00c7\u00c8\5\26\f\2\u00c8\u00c9\7 \2\2\u00c9\u00cb\3\2\2\2\u00ca\u00be"+
		"\3\2\2\2\u00ca\u00c0\3\2\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c2\3\2\2\2\u00ca"+
		"\u00c3\3\2\2\2\u00ca\u00c4\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb\u00dc\3\2"+
		"\2\2\u00cc\u00cd\f\6\2\2\u00cd\u00ce\7\3\2\2\u00ce\u00db\5\26\f\7\u00cf"+
		"\u00d0\f\5\2\2\u00d0\u00d1\7\30\2\2\u00d1\u00db\5\26\f\6\u00d2\u00d3\f"+
		"\3\2\2\u00d3\u00d4\7\22\2\2\u00d4\u00db\5\26\f\4\u00d5\u00d6\f\4\2\2\u00d6"+
		"\u00d7\7\26\2\2\u00d7\u00d8\5\30\r\2\u00d8\u00d9\7\31\2\2\u00d9\u00db"+
		"\3\2\2\2\u00da\u00cc\3\2\2\2\u00da\u00cf\3\2\2\2\u00da\u00d2\3\2\2\2\u00da"+
		"\u00d5\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\27\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\b\r\1\2\u00e0\u00e1"+
		"\7\"\2\2\u00e1\u00f4\5\30\r\3\u00e2\u00f4\5\26\f\2\u00e3\u00e4\5\26\f"+
		"\2\u00e4\u00e5\7$\2\2\u00e5\u00e6\5\26\f\2\u00e6\u00f4\3\2\2\2\u00e7\u00e8"+
		"\5\26\f\2\u00e8\u00e9\7%\2\2\u00e9\u00ea\5\26\f\2\u00ea\u00f4\3\2\2\2"+
		"\u00eb\u00ec\5\26\f\2\u00ec\u00ed\7\t\2\2\u00ed\u00ee\7\'\2\2\u00ee\u00f4"+
		"\3\2\2\2\u00ef\u00f0\7\20\2\2\u00f0\u00f1\5\30\r\2\u00f1\u00f2\7 \2\2"+
		"\u00f2\u00f4\3\2\2\2\u00f3\u00df\3\2\2\2\u00f3\u00e2\3\2\2\2\u00f3\u00e3"+
		"\3\2\2\2\u00f3\u00e7\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f4"+
		"\u00fd\3\2\2\2\u00f5\u00f6\f\5\2\2\u00f6\u00f7\7!\2\2\u00f7\u00fc\5\30"+
		"\r\6\u00f8\u00f9\f\4\2\2\u00f9\u00fa\7\34\2\2\u00fa\u00fc\5\30\r\5\u00fb"+
		"\u00f5\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\31\3\2\2\2\u00ff\u00fd\3\2\2\2\27.\65>"+
		"AEPR`n\u0083\u009b\u00a3\u00a5\u00b4\u00ba\u00ca\u00da\u00dc\u00f3\u00fb"+
		"\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}