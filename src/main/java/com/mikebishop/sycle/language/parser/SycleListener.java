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
	 * Enter a parse tree produced by {@link SycleParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(SycleParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SycleParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(SycleParser.UnaryExpressionNotPlusMinusContext ctx);
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
}