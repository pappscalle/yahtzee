package se.tastebin.table.row;

import java.util.List;
import java.util.stream.Collectors;
import se.tastebin.table.border.Border;
import se.tastebin.table.cell.Cell;

public class RowLine implements Row {

    private final DefaultRow row;
    private final Border border;    
    
    public RowLine(DefaultRow row, Border border) {
        this.row = row;
        this.border = border;
    }
    
    @Override
    public String render() {
        return row.cells().stream()
                .map(cell -> cell.render())
                .collect(Collectors.joining(border.verticalLine(), border.left(), border.right()));
    }
    
    @Override
    public List<Cell> cells() {
        return row.cells();
    }
    
}
