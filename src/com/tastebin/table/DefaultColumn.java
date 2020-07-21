package com.tastebin.table;

import java.util.Arrays;
import java.util.List;

public class DefaultColumn implements Column {

    private final List<String> cells;
    
    public DefaultColumn(String...cells) {
        this(Arrays.asList(cells));
    }

    public DefaultColumn(List<String> cells) {
        this.cells = cells;
    }
    
    @Override
    public int width() {
        return cells.stream().mapToInt(String::length).max().orElse(0);
    }

    @Override
    public int numberOfRows() {
        return cells.size();
    }

    @Override
    public Cell cell(int row) {
        return new Cell(cells.get(row), width());
    }
}