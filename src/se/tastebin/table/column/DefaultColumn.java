package se.tastebin.table.column;

import java.util.Arrays;
import java.util.List;
import se.tastebin.table.cell.Cell;
import se.tastebin.table.cell.DefaultCell;

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
        return new DefaultCell(cells.get(row), width());
    }

    @Override
    public String toString() {
        return cells.toString();
    }

   
   
}