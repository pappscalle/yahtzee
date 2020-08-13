
package se.tastebin.table.row;

import java.util.List;
import java.util.stream.Collectors;
import se.tastebin.table.border.Border;
import se.tastebin.table.cell.Cell;

public class TableEnd implements Row{

    private final Row row;
    private final Border border;       
    private final String newLine;
    
    public TableEnd(Row row, Border border) {
        this(row, border, System.lineSeparator());
    }
    
    public TableEnd(Row row, Border border, String newLine) {
        this.row = row;
        this.border = border;
        this.newLine = newLine;                
    }
    
    public String render() {
        return row.cells().stream()
                .map(cell -> border.horizontalLine().repeat(cell.width()))
                .collect(Collectors.joining(border.bottomCross(), border.bottomLeft(), border.bottomRight())) + newLine;
    }

    @Override
    public List<Cell> cells() {
        return row.cells();
    }
    
}
