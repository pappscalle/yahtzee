package se.tastebin.table.cell;

import se.tastebin.table.utils.LeftPaddedString;

public class DefaultCell implements Cell {
    
    private final String value;
    private final int width;

    public DefaultCell(String value, int width) {
        this.value = value;
        this.width = width;
    }

    @Override
    public String render() {
        return new LeftPaddedString(value, width).toString();
    }
    
    @Override
    public int width() {
        return width;
    }

    @Override
    public String toString() {
        return value;
    }
    
    
}
