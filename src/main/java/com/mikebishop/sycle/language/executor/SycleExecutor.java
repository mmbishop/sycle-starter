package com.mikebishop.sycle.language.executor;

import com.mikebishop.sycle.language.parser.SycleBaseListener;
import com.mikebishop.sycle.language.parser.SycleParser;
import com.mikebishop.sycle.memory.SymbolTable;
import org.antlr.v4.runtime.tree.ParseTree;

public class SycleExecutor extends SycleBaseListener {

    private final OperandStack operandStack;
    private final SymbolTable symbolTable;

    public SycleExecutor(SymbolTable symbolTable) {
        this.operandStack = new OperandStack();
        this.symbolTable = symbolTable;
    }

    public Double getResult() {
        return operandStack.popDouble();
    }

    @Override
    public void exitAssignmentExpression(SycleParser.AssignmentExpressionContext ctx) {
        ParseTree identifierNode = ctx.getChild(0);
        symbolTable.store(identifierNode.getText(), operandStack.getDouble());
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
        if (ctx.NUMBER() != null) {
            operandStack.push(Double.valueOf(primaryText));
        }
        else {
            operandStack.push(symbolTable.recall(primaryText));
        }
    }
}
