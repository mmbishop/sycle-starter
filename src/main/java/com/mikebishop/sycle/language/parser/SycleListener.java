// Generated from /Users/Michael/IdeaProjects/sycle-starter/src/main/java/com/mikebishop/sycle/language/parser/Sycle.g4 by ANTLR 4.10.1
package com.mikebishop.sycle.language.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SycleParser}.
 */
public interface SycleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SycleParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SycleParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SycleParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SycleParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SycleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SycleParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SycleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SycleParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SycleParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(SycleParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SycleParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(SycleParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SycleParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(SycleParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SycleParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(SycleParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SycleParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(SycleParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SycleParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(SycleParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SycleParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(SycleParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SycleParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(SycleParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SycleParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SycleParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SycleParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SycleParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SycleParser#identifierReference}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierReference(SycleParser.IdentifierReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SycleParser#identifierReference}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierReference(SycleParser.IdentifierReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SycleParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(SycleParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SycleParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(SycleParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SycleParser#declaredIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclaredIdentifier(SycleParser.DeclaredIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SycleParser#declaredIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclaredIdentifier(SycleParser.DeclaredIdentifierContext ctx);
}