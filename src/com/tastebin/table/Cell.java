package com.tastebin.table;

public class Cell {
    
    private final String value;
    private final int width;

    public Cell(String value, int width) {
        this.value = value;
        this.width = width;
    }

    @Override
    public String toString() {
        return new LeftPaddedString(value, width).toString();
    }
    
}
