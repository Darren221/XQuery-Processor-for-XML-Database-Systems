// Generated from ExpressionGrammar.g4 by ANTLR 4.4

package parsers;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionGrammarParser}.
 */
public interface ExpressionGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Cond_Empty}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_Empty(@NotNull ExpressionGrammarParser.Cond_EmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond_Empty}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_Empty(@NotNull ExpressionGrammarParser.Cond_EmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_String}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_String(@NotNull ExpressionGrammarParser.Xq_StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_String}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_String(@NotNull ExpressionGrammarParser.Xq_StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(@NotNull ExpressionGrammarParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(@NotNull ExpressionGrammarParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond_XqIs}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_XqIs(@NotNull ExpressionGrammarParser.Cond_XqIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond_XqIs}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_XqIs(@NotNull ExpressionGrammarParser.Cond_XqIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fltr_And}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFltr_And(@NotNull ExpressionGrammarParser.Fltr_AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fltr_And}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFltr_And(@NotNull ExpressionGrammarParser.Fltr_AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fltr_Parenthesis}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFltr_Parenthesis(@NotNull ExpressionGrammarParser.Fltr_ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fltr_Parenthesis}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFltr_Parenthesis(@NotNull ExpressionGrammarParser.Fltr_ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond_Or}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_Or(@NotNull ExpressionGrammarParser.Cond_OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond_Or}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_Or(@NotNull ExpressionGrammarParser.Cond_OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ap_doc}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp_doc(@NotNull ExpressionGrammarParser.Ap_docContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ap_doc}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp_doc(@NotNull ExpressionGrammarParser.Ap_docContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fltr_RpIsStringConstant}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFltr_RpIsStringConstant(@NotNull ExpressionGrammarParser.Fltr_RpIsStringConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fltr_RpIsStringConstant}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFltr_RpIsStringConstant(@NotNull ExpressionGrammarParser.Fltr_RpIsStringConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Document}
	 * labeled alternative in {@link ExpressionGrammarParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDocument(@NotNull ExpressionGrammarParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Document}
	 * labeled alternative in {@link ExpressionGrammarParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDocument(@NotNull ExpressionGrammarParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fltr_Rp}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFltr_Rp(@NotNull ExpressionGrammarParser.Fltr_RpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fltr_Rp}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFltr_Rp(@NotNull ExpressionGrammarParser.Fltr_RpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_RpDescendant}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_RpDescendant(@NotNull ExpressionGrammarParser.Rp_RpDescendantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_RpDescendant}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_RpDescendant(@NotNull ExpressionGrammarParser.Rp_RpDescendantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fltr_RpIs}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFltr_RpIs(@NotNull ExpressionGrammarParser.Fltr_RpIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fltr_RpIs}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFltr_RpIs(@NotNull ExpressionGrammarParser.Fltr_RpIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ap_Descendants}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp_Descendants(@NotNull ExpressionGrammarParser.Ap_DescendantsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ap_Descendants}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp_Descendants(@NotNull ExpressionGrammarParser.Ap_DescendantsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_Tagname}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_Tagname(@NotNull ExpressionGrammarParser.Rp_TagnameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_Tagname}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_Tagname(@NotNull ExpressionGrammarParser.Rp_TagnameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_Self}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_Self(@NotNull ExpressionGrammarParser.Rp_SelfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_Self}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_Self(@NotNull ExpressionGrammarParser.Rp_SelfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond_Not}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_Not(@NotNull ExpressionGrammarParser.Cond_NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond_Not}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_Not(@NotNull ExpressionGrammarParser.Cond_NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ap_Children}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp_Children(@NotNull ExpressionGrammarParser.Ap_ChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ap_Children}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp_Children(@NotNull ExpressionGrammarParser.Ap_ChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_FLWR}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_FLWR(@NotNull ExpressionGrammarParser.Xq_FLWRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_FLWR}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_FLWR(@NotNull ExpressionGrammarParser.Xq_FLWRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_Filter}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_Filter(@NotNull ExpressionGrammarParser.Rp_FilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_Filter}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_Filter(@NotNull ExpressionGrammarParser.Rp_FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(@NotNull ExpressionGrammarParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(@NotNull ExpressionGrammarParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_LetClause}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_LetClause(@NotNull ExpressionGrammarParser.Xq_LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_LetClause}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_LetClause(@NotNull ExpressionGrammarParser.Xq_LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_tags}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_tags(@NotNull ExpressionGrammarParser.Xq_tagsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_tags}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_tags(@NotNull ExpressionGrammarParser.Xq_tagsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_Descendent}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_Descendent(@NotNull ExpressionGrammarParser.Xq_DescendentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_Descendent}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_Descendent(@NotNull ExpressionGrammarParser.Xq_DescendentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond_And}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_And(@NotNull ExpressionGrammarParser.Cond_AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond_And}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_And(@NotNull ExpressionGrammarParser.Cond_AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_text}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_text(@NotNull ExpressionGrammarParser.Rp_textContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_text}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_text(@NotNull ExpressionGrammarParser.Rp_textContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fltr_not}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFltr_not(@NotNull ExpressionGrammarParser.Fltr_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fltr_not}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFltr_not(@NotNull ExpressionGrammarParser.Fltr_notContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond_Parentheses}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_Parentheses(@NotNull ExpressionGrammarParser.Cond_ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond_Parentheses}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_Parentheses(@NotNull ExpressionGrammarParser.Cond_ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond_XqEqual}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_XqEqual(@NotNull ExpressionGrammarParser.Cond_XqEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond_XqEqual}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_XqEqual(@NotNull ExpressionGrammarParser.Cond_XqEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_Parent}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_Parent(@NotNull ExpressionGrammarParser.Rp_ParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_Parent}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_Parent(@NotNull ExpressionGrammarParser.Rp_ParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_Concat}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_Concat(@NotNull ExpressionGrammarParser.Xq_ConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_Concat}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_Concat(@NotNull ExpressionGrammarParser.Xq_ConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fltr_RpEqual}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFltr_RpEqual(@NotNull ExpressionGrammarParser.Fltr_RpEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fltr_RpEqual}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFltr_RpEqual(@NotNull ExpressionGrammarParser.Fltr_RpEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull ExpressionGrammarParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull ExpressionGrammarParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_Rp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_Rp(@NotNull ExpressionGrammarParser.Rp_RpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_Rp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_Rp(@NotNull ExpressionGrammarParser.Rp_RpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fltr_Or}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFltr_Or(@NotNull ExpressionGrammarParser.Fltr_OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fltr_Or}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFltr_Or(@NotNull ExpressionGrammarParser.Fltr_OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_Children}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_Children(@NotNull ExpressionGrammarParser.Rp_ChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_Children}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_Children(@NotNull ExpressionGrammarParser.Rp_ChildrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull ExpressionGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull ExpressionGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_Var}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_Var(@NotNull ExpressionGrammarParser.Xq_VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_Var}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_Var(@NotNull ExpressionGrammarParser.Xq_VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_Parentheses}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_Parentheses(@NotNull ExpressionGrammarParser.Xq_ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_Parentheses}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_Parentheses(@NotNull ExpressionGrammarParser.Xq_ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(@NotNull ExpressionGrammarParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(@NotNull ExpressionGrammarParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_Attribute}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_Attribute(@NotNull ExpressionGrammarParser.Rp_AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_Attribute}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_Attribute(@NotNull ExpressionGrammarParser.Rp_AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_RpChildren}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_RpChildren(@NotNull ExpressionGrammarParser.Rp_RpChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_RpChildren}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_RpChildren(@NotNull ExpressionGrammarParser.Rp_RpChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rp_Concat}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp_Concat(@NotNull ExpressionGrammarParser.Rp_ConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rp_Concat}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp_Concat(@NotNull ExpressionGrammarParser.Rp_ConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_Children}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_Children(@NotNull ExpressionGrammarParser.Xq_ChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_Children}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_Children(@NotNull ExpressionGrammarParser.Xq_ChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond_SomeSatisfies}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond_SomeSatisfies(@NotNull ExpressionGrammarParser.Cond_SomeSatisfiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond_SomeSatisfies}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond_SomeSatisfies(@NotNull ExpressionGrammarParser.Cond_SomeSatisfiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xq_Ap}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq_Ap(@NotNull ExpressionGrammarParser.Xq_ApContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xq_Ap}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq_Ap(@NotNull ExpressionGrammarParser.Xq_ApContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(@NotNull ExpressionGrammarParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(@NotNull ExpressionGrammarParser.ForClauseContext ctx);
}