package com.mikebishop.sycle.functions;

import com.mikebishop.sycle.model.ArgumentList;
import com.mikebishop.sycle.model.SycleFunction;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;

@Component
public class FunctionRegistry {

    private final Map<String, SycleFunction> functionMap;

    public FunctionRegistry() {
        functionMap = new TreeMap<>();
    }

    public void registerFunction(String name, SycleFunction function) {
        functionMap.put(name, function);
    }

    public Set<String> getFunctionNames() {
        return functionMap.keySet();
    }

    public Double invokeFunction(String name, ArgumentList argumentList) {
        Optional<SycleFunction> function = Optional.ofNullable(functionMap.get(name));
        if (function.isPresent()) {
            return function.get().apply(argumentList);
        }
        throw new IllegalArgumentException("Undefined function " + name);
    }

}
