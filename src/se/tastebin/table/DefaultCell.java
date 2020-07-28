package se.tastebin.table;

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
}
