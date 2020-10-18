
package se.tastebin.table.render;

import java.util.stream.Collectors;
import se.tastebin.table.row.Row;

public class TableEnd implements Renderable {

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
    
    @Override
    public String render() {
        return row.cells().stream()
                .map(cell -> border.horizontalLine().repeat(cell.width()))
                .collect(Collectors.joining(border.bottomCross(), border.bottomLeft(), border.bottomRight())) + newLine;
    }

}
