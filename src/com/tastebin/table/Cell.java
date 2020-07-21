package com.tastebin.table;

public class Cell {
    
    private final String value;
    private final int width;

    public Cell(String value, int width) {
        this.value = value;
        this.width = width;
    }

    public String render() {
        return new LeftPaddedString(value, width).toString();
    }
    
    public int width() {
        return width;
    }
}
