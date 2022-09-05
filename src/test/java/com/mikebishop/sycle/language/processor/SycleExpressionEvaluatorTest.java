package com.mikebishop.sycle.language.processor;

import com.mikebishop.sycle.memory.SymbolTable;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class SycleExpressionEvaluatorTest {

    private Double result;
    private SycleExpressionEvaluator evaluator;

    @Test
    void sycle_adds_two_numbers() {
        given_a_sycle_evaluator();
        when_the_evaluator_is_given_the_expression("3.6 + 7.3");
        then_the_result_is(10.9);
    }

    @Test
    void sycle_substracts_two_numbers() {
        given_a_sycle_evaluator();
        when_the_evaluator_is_given_the_expression("12.7 - 7.4");
        then_the_result_is(5.3);
    }

    @Test
    void sycle_multiplies_two_numbers() {
        given_a_sycle_evaluator();
        when_the_evaluator_is_given_the_expression("3.2 * 4.5");
        then_the_result_is(14.4);
    }

    @Test
    void sycle_divides_two_numbers() {
        given_a_sycle_evaluator();
        when_the_evaluator_is_given_the_expression("12.6 / 3");
        then_the_result_is(4.2);
    }

    @Test
    void sycle_enforces_operator_precedence() {
        given_a_sycle_evaluator();
        when_the_evaluator_is_given_the_expression("3 + 5 * 4");
        then_the_result_is(23.0);
    }

    @Test
    void sycle_supports_overriding_of_operator_precedence() {
        given_a_sycle_evaluator();
        when_the_evaluator_is_given_the_expression("(3 + 5) * 4");
        then_the_result_is(32.0);
    }

    @Test
    void sycle_applies_unary_negative() {
        given_a_sycle_evaluator();
        when_the_evaluator_is_given_the_expression("3 + -7");
        then_the_result_is(-4.0);
    }

    @Test
    void sycle_applies_unary_positive() {
        given_a_sycle_evaluator();
        when_the_evaluator_is_given_the_expression("3 - +7");
        then_the_result_is(-4.0);
    }

    private void given_a_sycle_evaluator() {
        evaluator = new SycleExpressionEvaluator(new SymbolTable());
    }

    private void when_the_evaluator_is_given_the_expression(String expression) {
        result = evaluator.evaluateExpression(expression);
    }

    private void then_the_result_is(Double expectedResult) {
        assertThat(result, closeTo(expectedResult, 0.01));
    }
}
