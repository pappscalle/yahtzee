package se.tastebin.table;

import java.util.stream.Collectors;
import se.tastebin.table.border.AsciiBorder;
import se.tastebin.table.border.Border;
import se.tastebin.table.row.BottomLine;
import se.tastebin.table.row.Line;
import se.tastebin.table.row.DefaultRow;
import se.tastebin.table.row.Row;
import se.tastebin.table.row.RowLine;
import se.tastebin.table.row.TopLine;

public class TextTable {
    
    private final DefaultTableData data; 
    private final Border gfx;
    
    public TextTable(DefaultTableData data) {
        this(data, new AsciiBorder());
    }       

    public TextTable(DefaultTableData data, Border graphics) {
        this.data = data;
        this.gfx = graphics;
    }
            
    @Override
    public String toString() {
        
        Row topRow = data.stream().findFirst().get();
        
        String topLine = new TopLine(topRow, gfx).render() + gfx.newLine();
        String line = new Line(topRow, gfx).render() + gfx.newLine();
        String bottomLine = new BottomLine(topRow, gfx).render() + gfx.newLine();
        
        // THE DATA          
        
        String text = data.stream().map(row -> {
            return new RowLine(row, gfx).render() +
            gfx.newLine();
        }).collect(Collectors.joining(line, topLine, bottomLine));
        
       
        return text;
    }
    
        
}
