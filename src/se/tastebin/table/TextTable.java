package se.tastebin.table;

import java.util.stream.Collectors;
import se.tastebin.table.render.AsciiBorder;
import se.tastebin.table.render.Border;
import se.tastebin.table.render.Renderable;
import se.tastebin.table.render.TableEnd;
import se.tastebin.table.render.RowSeparator;
import se.tastebin.table.row.EmptyRow;
import se.tastebin.table.row.Row;
import se.tastebin.table.render.RenderedRow;
import se.tastebin.table.render.TableStart;

public class TextTable implements Renderable {
    
    private final TableModel data; 
    private final Border border;
    
    public TextTable(TableModel data) {
        this(data, new AsciiBorder());
    }       

    public TextTable(TableModel data, Border border) {
        this.data = data;
        this.border = border;
    }
            
    @Override
    public String render() {
        
        Row topRow = data.stream().findFirst().orElse(new EmptyRow());

        String tableStart = new TableStart(topRow, border).render();
        String rowSeparator = new RowSeparator(topRow, border).render();
        String tableEnd = new TableEnd(topRow, border).render();
        
        return data.stream().map(row -> {
                    return new RenderedRow(row, border).render();
                }).collect(Collectors.joining(rowSeparator, tableStart, tableEnd));
        
    }
    
        
}
