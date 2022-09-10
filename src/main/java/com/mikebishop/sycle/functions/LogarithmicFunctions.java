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
