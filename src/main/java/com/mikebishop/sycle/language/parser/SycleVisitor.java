// Generated from /Users/Michael/IdeaProjects/sycle-starter/src/main/java/com/mikebishop/sycle/language/parser/Sycle.g4 by ANTLR 4.10.1
package com.mikebishop.sycle.language.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SycleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SycleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SycleParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SycleParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SycleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SycleParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SycleParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(SycleParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SycleParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(SycleParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SycleParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(SycleParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SycleParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(SycleParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SycleParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SycleParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SycleParser#identifierReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierReference(SycleParser.IdentifierReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SycleParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(SycleParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SycleParser#declaredIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaredIdentifier(SycleParser.DeclaredIdentifierContext ctx);
}