// Generated from ExpressionGrammar.g4 by ANTLR 4.7.2

package parsers;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionGrammarParser}.
 */
public interface ExpressionGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExpressionGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExpressionGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_Parentheses}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_Parentheses(ExpressionGrammarParser.Xq_ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_Parentheses}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_Parentheses(ExpressionGrammarParser.Xq_ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_String}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_String(ExpressionGrammarParser.Xq_StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_String}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_String(ExpressionGrammarParser.Xq_StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_FLWR}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_FLWR(ExpressionGrammarParser.Xq_FLWRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_FLWR}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_FLWR(ExpressionGrammarParser.Xq_FLWRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_Concat}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_Concat(ExpressionGrammarParser.Xq_ConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_Concat}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_Concat(ExpressionGrammarParser.Xq_ConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_tags}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_tags(ExpressionGrammarParser.Xq_tagsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_tags}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_tags(ExpressionGrammarParser.Xq_tagsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_LetClause}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_LetClause(ExpressionGrammarParser.Xq_LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_LetClause}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_LetClause(ExpressionGrammarParser.Xq_LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_Children}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_Children(ExpressionGrammarParser.Xq_ChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_Children}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_Children(ExpressionGrammarParser.Xq_ChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_Ap}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_Ap(ExpressionGrammarParser.Xq_ApContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_Ap}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_Ap(ExpressionGrammarParser.Xq_ApContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_Descendent}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_Descendent(ExpressionGrammarParser.Xq_DescendentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_Descendent}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_Descendent(ExpressionGrammarParser.Xq_DescendentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_Var}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_Var(ExpressionGrammarParser.Xq_VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_Var}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_Var(ExpressionGrammarParser.Xq_VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(ExpressionGrammarParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(ExpressionGrammarParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(ExpressionGrammarParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(ExpressionGrammarParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(ExpressionGrammarParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(ExpressionGrammarParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(ExpressionGrammarParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(ExpressionGrammarParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond_Empty}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_Empty(ExpressionGrammarParser.Cond_EmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond_Empty}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_Empty(ExpressionGrammarParser.Cond_EmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond_Parentheses}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_Parentheses(ExpressionGrammarParser.Cond_ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond_Parentheses}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_Parentheses(ExpressionGrammarParser.Cond_ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond_XqIs}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_XqIs(ExpressionGrammarParser.Cond_XqIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond_XqIs}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_XqIs(ExpressionGrammarParser.Cond_XqIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond_Not}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_Not(ExpressionGrammarParser.Cond_NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond_Not}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_Not(ExpressionGrammarParser.Cond_NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond_XqEqual}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_XqEqual(ExpressionGrammarParser.Cond_XqEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond_XqEqual}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_XqEqual(ExpressionGrammarParser.Cond_XqEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond_SomeSatisfies}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_SomeSatisfies(ExpressionGrammarParser.Cond_SomeSatisfiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond_SomeSatisfies}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_SomeSatisfies(ExpressionGrammarParser.Cond_SomeSatisfiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond_Or}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_Or(ExpressionGrammarParser.Cond_OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond_Or}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_Or(ExpressionGrammarParser.Cond_OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond_And}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_And(ExpressionGrammarParser.Cond_AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond_And}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_And(ExpressionGrammarParser.Cond_AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ExpressionGrammarParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ExpressionGrammarParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ap_doc}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp_doc(ExpressionGrammarParser.Ap_docContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ap_doc}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp_doc(ExpressionGrammarParser.Ap_docContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ap_Children}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp_Children(ExpressionGrammarParser.Ap_ChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ap_Children}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp_Children(ExpressionGrammarParser.Ap_ChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ap_Descendants}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp_Descendants(ExpressionGrammarParser.Ap_DescendantsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ap_Descendants}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp_Descendants(ExpressionGrammarParser.Ap_DescendantsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Document}
	 * labeled alternative in {@link ExpressionGrammarParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDocument(ExpressionGrammarParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Document}
	 * labeled alternative in {@link ExpressionGrammarParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDocument(ExpressionGrammarParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_text}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_text(ExpressionGrammarParser.Rp_textContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_text}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_text(ExpressionGrammarParser.Rp_textContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_RpDescendant}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_RpDescendant(ExpressionGrammarParser.Rp_RpDescendantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_RpDescendant}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_RpDescendant(ExpressionGrammarParser.Rp_RpDescendantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_Tagname}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_Tagname(ExpressionGrammarParser.Rp_TagnameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_Tagname}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_Tagname(ExpressionGrammarParser.Rp_TagnameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_Self}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_Self(ExpressionGrammarParser.Rp_SelfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_Self}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_Self(ExpressionGrammarParser.Rp_SelfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_Parent}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_Parent(ExpressionGrammarParser.Rp_ParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_Parent}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_Parent(ExpressionGrammarParser.Rp_ParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_Attribute}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_Attribute(ExpressionGrammarParser.Rp_AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_Attribute}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_Attribute(ExpressionGrammarParser.Rp_AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_RpChildren}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_RpChildren(ExpressionGrammarParser.Rp_RpChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_RpChildren}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_RpChildren(ExpressionGrammarParser.Rp_RpChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_Filter}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_Filter(ExpressionGrammarParser.Rp_FilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_Filter}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_Filter(ExpressionGrammarParser.Rp_FilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_Concat}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_Concat(ExpressionGrammarParser.Rp_ConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_Concat}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_Concat(ExpressionGrammarParser.Rp_ConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_Rp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_Rp(ExpressionGrammarParser.Rp_RpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_Rp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_Rp(ExpressionGrammarParser.Rp_RpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_Children}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_Children(ExpressionGrammarParser.Rp_ChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_Children}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_Children(ExpressionGrammarParser.Rp_ChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fltr_not}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFltr_not(ExpressionGrammarParser.Fltr_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fltr_not}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFltr_not(ExpressionGrammarParser.Fltr_notContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fltr_RpIs}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFltr_RpIs(ExpressionGrammarParser.Fltr_RpIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fltr_RpIs}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFltr_RpIs(ExpressionGrammarParser.Fltr_RpIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fltr_And}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFltr_And(ExpressionGrammarParser.Fltr_AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fltr_And}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFltr_And(ExpressionGrammarParser.Fltr_AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fltr_RpEqual}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFltr_RpEqual(ExpressionGrammarParser.Fltr_RpEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fltr_RpEqual}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFltr_RpEqual(ExpressionGrammarParser.Fltr_RpEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fltr_Parenthesis}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFltr_Parenthesis(ExpressionGrammarParser.Fltr_ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fltr_Parenthesis}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFltr_Parenthesis(ExpressionGrammarParser.Fltr_ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fltr_Or}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFltr_Or(ExpressionGrammarParser.Fltr_OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fltr_Or}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFltr_Or(ExpressionGrammarParser.Fltr_OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fltr_RpIsStringConstant}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFltr_RpIsStringConstant(ExpressionGrammarParser.Fltr_RpIsStringConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fltr_RpIsStringConstant}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFltr_RpIsStringConstant(ExpressionGrammarParser.Fltr_RpIsStringConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fltr_Rp}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFltr_Rp(ExpressionGrammarParser.Fltr_RpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fltr_Rp}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFltr_Rp(ExpressionGrammarParser.Fltr_RpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(ExpressionGrammarParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(ExpressionGrammarParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(ExpressionGrammarParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(ExpressionGrammarParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAttName(ExpressionGrammarParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAttName(ExpressionGrammarParser.AttNameContext ctx);
}