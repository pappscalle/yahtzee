package se.tastebin.table;

import java.util.stream.Collectors;
import se.tastebin.table.border.AsciiBorder;
import se.tastebin.table.border.Border;
import se.tastebin.table.row.BottomLine;
import se.tastebin.table.row.Line;
import se.tastebin.table.row.EmptyRow;
import se.tastebin.table.row.Row;
import se.tastebin.table.row.RowLine;
import se.tastebin.table.row.TopLine;

public class TextTable {
    
    private final DefaultTableData data; 
    private final Border border;
    
    public TextTable(DefaultTableData data) {
        this(data, new AsciiBorder());
    }       

    public TextTable(DefaultTableData data, Border border) {
        this.data = data;
        this.border = border;
    }
            
    @Override
    public String toString() {
        
        data.validate();
        
        Row topRow = data.stream().findFirst().orElse(new EmptyRow());

        String topLine = new TopLine(topRow, border).render() + border.newLine();
        String line = new Line(topRow, border).render() + border.newLine();
        String bottomLine = new BottomLine(topRow, border).render() + border.newLine();
        
        return data.stream().map(row -> {
                    return new RowLine(row, border).render() + border.newLine();
                }).collect(Collectors.joining(line, topLine, bottomLine));
        
    }
    
        
}
