package com.mikebishop.sycle.functions;

import com.mikebishop.sycle.model.SycleFunction;
import org.springframework.stereotype.Component;

@Component
public class LogarithmicFunctions {

    private final SycleFunction ln = (argumentList -> Math.log(argumentList.get(0)));
    private final SycleFunction log = (argumentList -> Math.log10(argumentList.get(0)));
    private final SycleFunction ex = (argumentList -> Math.exp(argumentList.get(0)));
    private final SycleFunction tenx = (argumentList -> Math.pow(10.0, argumentList.get(0)));

    public LogarithmicFunctions(FunctionRegistry registry) {
        registerFunctions(registry);
    }

    private void registerFunctions(FunctionRegistry registry) {
        registry.registerFunction("ln", ln);
        registry.registerFunction("log", log);
        registry.registerFunction("iln", ex);;
        registry.registerFunction("ilog", tenx);
    }

}
