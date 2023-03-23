// Generated from ExpressionGrammar.g4 by ANTLR 4.7.2

package parsers;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExpressionGrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xq_Parentheses}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_Parentheses(ExpressionGrammarParser.Xq_ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xq_String}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_String(ExpressionGrammarParser.Xq_StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xq_FLWR}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_FLWR(ExpressionGrammarParser.Xq_FLWRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xq_Concat}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_Concat(ExpressionGrammarParser.Xq_ConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xq_tags}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_tags(ExpressionGrammarParser.Xq_tagsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xq_LetClause}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_LetClause(ExpressionGrammarParser.Xq_LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xq_Children}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_Children(ExpressionGrammarParser.Xq_ChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xq_Ap}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_Ap(ExpressionGrammarParser.Xq_ApContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xq_Descendent}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_Descendent(ExpressionGrammarParser.Xq_DescendentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xq_Var}
	 * labeled alternative in {@link ExpressionGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_Var(ExpressionGrammarParser.Xq_VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(ExpressionGrammarParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(ExpressionGrammarParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(ExpressionGrammarParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(ExpressionGrammarParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cond_Empty}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_Empty(ExpressionGrammarParser.Cond_EmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cond_Parentheses}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_Parentheses(ExpressionGrammarParser.Cond_ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cond_XqIs}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_XqIs(ExpressionGrammarParser.Cond_XqIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cond_Not}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_Not(ExpressionGrammarParser.Cond_NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cond_XqEqual}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_XqEqual(ExpressionGrammarParser.Cond_XqEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cond_SomeSatisfies}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_SomeSatisfies(ExpressionGrammarParser.Cond_SomeSatisfiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cond_Or}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_Or(ExpressionGrammarParser.Cond_OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cond_And}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_And(ExpressionGrammarParser.Cond_AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ExpressionGrammarParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ap_doc}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp_doc(ExpressionGrammarParser.Ap_docContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ap_Children}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp_Children(ExpressionGrammarParser.Ap_ChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ap_Descendants}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp_Descendants(ExpressionGrammarParser.Ap_DescendantsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Document}
	 * labeled alternative in {@link ExpressionGrammarParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(ExpressionGrammarParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rp_text}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_text(ExpressionGrammarParser.Rp_textContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rp_RpDescendant}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_RpDescendant(ExpressionGrammarParser.Rp_RpDescendantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rp_Tagname}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_Tagname(ExpressionGrammarParser.Rp_TagnameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rp_Self}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_Self(ExpressionGrammarParser.Rp_SelfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rp_Parent}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_Parent(ExpressionGrammarParser.Rp_ParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rp_Attribute}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_Attribute(ExpressionGrammarParser.Rp_AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rp_RpChildren}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_RpChildren(ExpressionGrammarParser.Rp_RpChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rp_Filter}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_Filter(ExpressionGrammarParser.Rp_FilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rp_Concat}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_Concat(ExpressionGrammarParser.Rp_ConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rp_Rp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_Rp(ExpressionGrammarParser.Rp_RpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rp_Children}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_Children(ExpressionGrammarParser.Rp_ChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fltr_not}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFltr_not(ExpressionGrammarParser.Fltr_notContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fltr_RpIs}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFltr_RpIs(ExpressionGrammarParser.Fltr_RpIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fltr_And}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFltr_And(ExpressionGrammarParser.Fltr_AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fltr_RpEqual}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFltr_RpEqual(ExpressionGrammarParser.Fltr_RpEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fltr_Parenthesis}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFltr_Parenthesis(ExpressionGrammarParser.Fltr_ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fltr_Or}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFltr_Or(ExpressionGrammarParser.Fltr_OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fltr_RpIsStringConstant}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFltr_RpIsStringConstant(ExpressionGrammarParser.Fltr_RpIsStringConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fltr_Rp}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFltr_Rp(ExpressionGrammarParser.Fltr_RpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(ExpressionGrammarParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(ExpressionGrammarParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#attName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttName(ExpressionGrammarParser.AttNameContext ctx);
}