package com.mikebishop.sycle.language.executor;

import org.springframework.stereotype.Component;

import java.util.Stack;

@Component
class OperandStack {

    private Stack<Double> operandStack;

    public OperandStack() {
        operandStack = new Stack<>();
    }

    public void push(Double operand) {
        operandStack.push(operand);
    }

    public Double popDouble() {
        return operandStack.pop();
    }

    public Double getDouble() {
        return operandStack.peek();
    }

}
