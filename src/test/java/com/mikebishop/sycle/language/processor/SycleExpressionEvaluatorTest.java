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
package com.mikebishop.sycle.language.processor;

import com.mikebishop.sycle.memory.SymbolTable;
import io.github.mmbishop.gwttest.core.GwtTest;
import io.github.mmbishop.gwttest.functions.GwtFunction;
import io.github.mmbishop.gwttest.functions.GwtFunctionWithArgument;
import io.github.mmbishop.gwttest.model.Context;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class SycleExpressionEvaluatorTest {

    private final GwtTest<TestContext> gwt = new GwtTest<>(TestContext.class);

    @Test
    void sycle_adds_two_numbers() {
        gwt.test()
                .given(a_sycle_evaluator)
                .when(evaluating_the_expression, "3.6 + 7.3")
                .then(the_evaluator_returns_the_result, 10.9);
    }

    @Test
    void sycle_substracts_two_numbers() {
        gwt.test()
                .given(a_sycle_evaluator)
                .when(evaluating_the_expression, "12.7 - 7.4")
                .then(the_evaluator_returns_the_result, 5.3);
    }

    @Test
    void sycle_multiplies_two_numbers() {
        gwt.test()
                .given(a_sycle_evaluator)
                .when(evaluating_the_expression, "3.2 * 4.5")
                .then(the_evaluator_returns_the_result, 14.4);
    }

    @Test
    void sycle_divides_two_numbers() {
        gwt.test()
                .given(a_sycle_evaluator)
                .when(evaluating_the_expression, "12.6 / 3")
                .then(the_evaluator_returns_the_result, 4.2);
    }

    @Test
    void sycle_enforces_operator_precedence() {
        gwt.test()
                .given(a_sycle_evaluator)
                .when(evaluating_the_expression, "3 + 5 * 4")
                .then(the_evaluator_returns_the_result, 23.0);
    }

    @Test
    void sycle_supports_overriding_of_operator_precedence() {
        gwt.test()
                .given(a_sycle_evaluator)
                .when(evaluating_the_expression, "(3 + 5) * 4")
                .then(the_evaluator_returns_the_result, 32.0);
    }

    @Test
    void sycle_applies_unary_negative() {
        gwt.test()
                .given(a_sycle_evaluator)
                .when(evaluating_the_expression, "3 + -7")
                .then(the_evaluator_returns_the_result, -4.0);
    }

    @Test
    void sycle_applies_unary_positive() {
        gwt.test()
                .given(a_sycle_evaluator)
                .when(evaluating_the_expression, "3 - +7")
                .then(the_evaluator_returns_the_result, -4.0);
    }

    private final GwtFunction<TestContext> a_sycle_evaluator = context -> context.evaluator = new SycleExpressionEvaluator(new SymbolTable());

    private final GwtFunctionWithArgument<TestContext, String> evaluating_the_expression
            = (context, expression) -> context.result = context.evaluator.evaluateExpression(expression);

    private final GwtFunctionWithArgument<TestContext, Double> the_evaluator_returns_the_result
            = (context, expectedResult) -> assertThat(context.result, closeTo(expectedResult, 0.01));

    public static final class TestContext extends Context {
        Double result;
        SycleExpressionEvaluator evaluator;
    }

}
