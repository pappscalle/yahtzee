package se.tastebin.table.render;

import java.util.List;
import java.util.stream.Collectors;
import se.tastebin.table.render.Border;
import se.tastebin.table.cell.Cell;
import se.tastebin.table.row.Row;

public class RenderedRow implements Renderable {

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
    
}
