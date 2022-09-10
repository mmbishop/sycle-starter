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
