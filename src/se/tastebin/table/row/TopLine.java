package se.tastebin.table.row;

import java.util.List;
import java.util.stream.Collectors;
import se.tastebin.table.border.Border;
import se.tastebin.table.cell.Cell;

public class TopLine implements Row {

    private final Row row;
    private final Border border;    
    
    public TopLine(Row row, Border border) {
        this.row = row;
        this.border = border;
    }
    
    @Override
    public String render() {
        return row.cells().stream()
                .map(cell -> border.horizontalLine().repeat(cell.width()))
                .collect(Collectors.joining(border.topCross(), border.topLeft(), border.topRight()));
    }

    @Override
    public List<Cell> cells() {
        return row.cells();
    }
    
}
