package com.mikebishop.sycle.service;

import com.mikebishop.sycle.language.processor.SycleExpressionEvaluator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SycleEvaluationService {

    private final SycleExpressionEvaluator evaluator;

    @Autowired
    public SycleEvaluationService(SycleExpressionEvaluator evaluator) {
        this.evaluator = evaluator;
    }

    public Double evaluateExpression(String expression) {
        return evaluator.evaluateExpression(expression);
    }

}
