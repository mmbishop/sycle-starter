package com.mikebishop.sycle.functions;

import com.mikebishop.sycle.model.SycleFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrigonometryFunctions {

    private final SycleFunction acos = (argumentList -> Math.acos(argumentList.get(0)));
    private final SycleFunction asin = (argumentList -> Math.asin(argumentList.get(0)));
    private final SycleFunction atan = (argumentList -> Math.atan(argumentList.get(0)));
    private final SycleFunction cos = (argumentList -> Math.cos(argumentList.get(0)));
    private final SycleFunction cosh = (argumentList -> Math.cosh(argumentList.get(0)));
    private final SycleFunction sin = (argumentList -> Math.sin(argumentList.get(0)));
    private final SycleFunction sinh = (argumentList -> Math.sinh(argumentList.get(0)));
    private final SycleFunction tan = (argumentList -> Math.tan(argumentList.get(0)));
    private final SycleFunction tanh = (argumentList -> Math.tanh(argumentList.get(0)));

    @Autowired
    public TrigonometryFunctions(FunctionRegistry registry) {
        registerFunctions(registry);
    }

    private void registerFunctions(FunctionRegistry registry) {
        registry.registerFunction("acos", acos);
        registry.registerFunction("asin", asin);
        registry.registerFunction("atan", atan);
        registry.registerFunction("cos", cos);
        registry.registerFunction("cosh", cosh);
        registry.registerFunction("sin", sin);
        registry.registerFunction("sinh", sinh);
        registry.registerFunction("tan", tan);
        registry.registerFunction("tanh", tanh);
    }

}
