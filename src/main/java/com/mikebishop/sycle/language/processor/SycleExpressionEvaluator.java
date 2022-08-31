package com.mikebishop.sycle.language.processor;

import com.mikebishop.sycle.language.executor.SycleExecutor;
import com.mikebishop.sycle.language.parser.SycleLexer;
import com.mikebishop.sycle.language.parser.SycleParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.stereotype.Component;

@Component
public class SycleExpressionEvaluator {

    public Double evaluateExpression(String expression) {
        var lexer = new SycleLexer(CharStreams.fromString(expression));
        var tokens = new CommonTokenStream(lexer);
        var parser = new SycleParser(tokens);
        var tree = parser.start();
        var walker = new ParseTreeWalker();
        var executor = new SycleExecutor();
        walker.walk(executor, tree);
        return executor.getResult();
    }

}
