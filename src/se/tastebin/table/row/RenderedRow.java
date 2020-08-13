package se.tastebin.table.row;

import java.util.List;
import java.util.stream.Collectors;
import se.tastebin.table.border.Border;
import se.tastebin.table.cell.Cell;

public class RenderedRow implements Row {

    private final Row row;
    private final Border border;    
    private final String newLine;
    
    public RenderedRow(Row row, Border border) {
        this(row, border, System.lineSeparator());
    }
    
    public RenderedRow(Row row, Border border, String newLine) {
        this.row = row;
        this.border = border;
        this.newLine = newLine;                
    }
    
    
    @Override
    public String render() {
        return row.cells().stream()
                .map(cell -> cell.render())
                .collect(Collectors.joining(border.verticalLine(), border.left(), border.right())) + newLine;
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
