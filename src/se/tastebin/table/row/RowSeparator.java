package se.tastebin.table.row;

import java.util.List;
import java.util.stream.Collectors;
import se.tastebin.table.border.Border;
import se.tastebin.table.cell.Cell;

public class RowSeparator implements Row {

    private final Row row;
    private final Border border;    
    private final String newLine;
    
    public RowSeparator(Row row, Border border) {
        this(row, border, System.lineSeparator());
    }
    
    public RowSeparator(Row row, Border border, String newLine) {
        this.row = row;
        this.border = border;
        this.newLine = newLine;                
    }
    
    
    @Override
    public String render() {
        return row.cells().stream()
                .map(cell -> border.horizontalLine().repeat(cell.width()))
                .collect(Collectors.joining(border.middleCross(), border.leftCross(), border.rightCross())) + newLine;
    }

    @Override
    public List<Cell> cells() {
        return row.cells();
    }

    @Override
    public int size() {
        return row.size();
    }
    
}
