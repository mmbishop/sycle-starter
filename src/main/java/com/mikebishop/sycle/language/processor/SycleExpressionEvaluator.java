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

import com.mikebishop.sycle.language.executor.SycleExecutor;
import com.mikebishop.sycle.language.parser.SycleLexer;
import com.mikebishop.sycle.language.parser.SycleParser;
import com.mikebishop.sycle.memory.SymbolTable;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SycleExpressionEvaluator {

    private final SymbolTable symbolTable;
    @Autowired
    public SycleExpressionEvaluator(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public Double evaluateExpression(String expression) {
        var lexer = new SycleLexer(CharStreams.fromString(expression));
        var tokens = new CommonTokenStream(lexer);
        var parser = new SycleParser(tokens);
        var tree = parser.start();
        var walker = new ParseTreeWalker();
        var executor = new SycleExecutor(symbolTable);
        walker.walk(executor, tree);
        return executor.getResult();
    }

}
