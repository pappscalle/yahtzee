
package se.tastebin.table.row;

import java.util.List;
import java.util.stream.Collectors;
import se.tastebin.table.border.Border;
import se.tastebin.table.cell.Cell;

public class BottomLine implements Row{

    private final Row row;
    private final Border border;       
    
    public BottomLine(Row row, Border border) {
        this.row = row;
        this.border = border;
    }
    
    public String render() {
        return row.cells().stream()
                .map(cell -> border.horizontalLine().repeat(cell.width()))
                .collect(Collectors.joining(border.bottomCross(), border.bottomLeft(), border.bottomRight()));
    }

    @Override
    public List<Cell> cells() {
        return row.cells();
    }
    
}
