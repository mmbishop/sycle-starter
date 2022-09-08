package com.mikebishop.sycle.model;

import java.util.ArrayList;
import java.util.List;

public class ArgumentList {

    private final List<Double> arguments;

    public ArgumentList() {
        arguments = new ArrayList<>();
    }

    public void add(Double argument) {
        arguments.add(0, argument);
    }

    public Double get(int index) {
        return arguments.get(index);
    }

    public int size() {
        return arguments.size();
    }
}
