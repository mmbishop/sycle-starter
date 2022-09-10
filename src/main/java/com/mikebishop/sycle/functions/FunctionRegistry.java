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
