package com.mikebishop.sycle.functions;

import com.mikebishop.sycle.model.SycleFunction;
import org.springframework.stereotype.Component;

@Component
public class BasicFunctions {

    private final SycleFunction recip = (argumentList -> 1.0 / argumentList.get(0));
    private final SycleFunction sqr = (argumentList -> Math.pow(argumentList.get(0), 2));
    private final SycleFunction sqrt = (argumentList -> Math.sqrt(argumentList.get(0)));
    private final SycleFunction xexpy = (argumentList -> Math.pow(argumentList.get(0), argumentList.get(1)));
    private final SycleFunction xrooty = (argumentList -> Math.pow(argumentList.get(0), 1.0 / argumentList.get(1)));

    public BasicFunctions(FunctionRegistry registry) {
        registerFunctions(registry);
    }

    private void registerFunctions(FunctionRegistry registry) {
        registry.registerFunction("recip", recip);
        registry.registerFunction("sqr", sqr);
        registry.registerFunction("sqrt", sqrt);
        registry.registerFunction("xexpy", xexpy);
        registry.registerFunction("xrooty", xrooty);
    }
}
