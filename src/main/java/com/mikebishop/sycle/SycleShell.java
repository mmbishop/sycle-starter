package com.mikebishop.sycle;

import com.mikebishop.sycle.service.SycleEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

@Component
public class SycleShell {

    private final SycleEvaluationService service;

    @Autowired
    public SycleShell(SycleEvaluationService service) {
        this.service = service;
    }

    public void runShell() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("> ");
        String expression = br.readLine();
        while (!Objects.equals(expression, "exit")) {
            try {
                Double result = service.evaluateExpression(expression);
                System.out.printf("%.6f%n", result);
            }
            catch (Exception e) {
                System.out.println("Can't evaluate expression");
            }
            System.out.print("> ");
            expression = br.readLine();
        }
    }

}
