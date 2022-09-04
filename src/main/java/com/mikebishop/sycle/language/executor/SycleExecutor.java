package com.mikebishop.sycle.language.executor;

import com.mikebishop.sycle.language.parser.SycleBaseListener;
import com.mikebishop.sycle.language.parser.SycleParser;
import org.antlr.v4.runtime.tree.ParseTree;

public class SycleExecutor extends SycleBaseListener {

    private final OperandStack operandStack;

    public SycleExecutor() {
        this.operandStack = new OperandStack();
    }

    public Double getResult() {
        return operandStack.popDouble();
    }

    @Override
    public void exitAdditiveExpression(SycleParser.AdditiveExpressionContext ctx) {
        if (ctx.getChildCount() == 3) {
            Double operand2 = operandStack.popDouble();
            Double operand1 = operandStack.popDouble();
            String operator = ctx.getChild(1).getText();
            switch (operator) {
                case "+" -> operandStack.push(operand1 + operand2);
                case "-" -> operandStack.push(operand1 - operand2);
                default -> {
                }
            }
        }
    }

    @Override
    public void exitMultiplicativeExpression(SycleParser.MultiplicativeExpressionContext ctx) {
        if (ctx.getChildCount() == 3) {
            Double operand2 = operandStack.popDouble();
            Double operand1 = operandStack.popDouble();
            String operator = ctx.getChild(1).getText();
            switch (operator) {
                case "*" -> operandStack.push(operand1 * operand2);
                case "/" -> operandStack.push(operand1 / operand2);
                default -> {
                }
            }
        }
    }

    @Override
    public void exitUnaryExpression(SycleParser.UnaryExpressionContext ctx) {
        if (ctx.getChildCount() == 2) {
            Double operand = operandStack.popDouble();
            ParseTree signNode = ctx.getChild(0);
            String sign = signNode.getText();
            switch (sign) {
                case "+" -> operandStack.push(operand);
                case "-" -> operandStack.push(-operand);
                default -> {
                }
            }
        }
    }

    @Override
    public void exitLiteral(SycleParser.LiteralContext ctx) {
        ParseTree child = ctx.getChild(0);
        String primaryText = child.getText();
        operandStack.push(Double.valueOf(primaryText));
    }
}
