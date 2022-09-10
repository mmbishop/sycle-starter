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
