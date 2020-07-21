package com.tastebin.table;

import java.util.List;
import java.util.stream.Collectors;

public class Row {

    private final List<Cell> cells;
    
    public Row(List<Cell> cells) {
        this.cells = cells;
    }

    @Override
    public String toString() {
        return cells.stream().map(s -> s.toString()).collect(Collectors.joining("|"));
    }
    
}
