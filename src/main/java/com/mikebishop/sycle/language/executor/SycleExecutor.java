//<editor-fold desc="Copyright (c) 2022 Michael Bishop">
// The file is part of Sycle-Starter
//
// Sycle-Starter is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License
// as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
//
// Sycle-Starter is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
// of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License along with Sycle-Starter. If not, see
// <https://www.gnu.org/licenses/>.
//</editor-fold>
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
            if ("-".equals(sign)) {
                operandStack.push(-operand);
            }
        }
    }

    @Override
    public void exitLiteral(SycleParser.LiteralContext ctx) {
        ParseTree child = ctx.getChild(0);
        String primaryText = child.getText();
        operandStack.push(Double.valueOf(primaryText));
    }

    @Override
    public void exitIdentifierReference(SycleParser.IdentifierReferenceContext ctx) {
        ParseTree child = ctx.getChild(0);
        String primaryText = child.getText();
        operandStack.push(symbolTable.recall(primaryText));
    }
}
