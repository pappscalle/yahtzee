package se.tastebin.table.column;

import se.tastebin.table.cell.DefaultCell;

public class ColumnWithHeader implements Column {

    private final Column origin;
    private final String header;
    
    public ColumnWithHeader(Column column, String header) {
        this.origin = column;
        this.header = header;
    }

    @Override
    public int width() {
        return Math.max(origin.width(), header.length());
    }

    @Override
    public int numberOfRows() {
        return origin.numberOfRows() + 1;
    }

    @Override
    public DefaultCell cell(int row) {
        if (row == 0) {
            return new DefaultCell(header, width());
        } else {
            return new DefaultCell(origin.cell(row - 1).render(), width());
        } 
    }

    @Override
    public String toString() {
        return "["+header+"]" + origin.toString();
    }
    
    
}
