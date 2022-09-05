package com.mikebishop.sycle.memory;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SymbolTable {

    private final Map<String, Double> symbolMap;

    public SymbolTable() {
        symbolMap = new HashMap<>();
    }

    public void store(String symbol, Double value) {
        symbolMap.put(symbol, value);
    }

    public Double recall(String symbol) {
        return symbolMap.get(symbol);
    }

}
