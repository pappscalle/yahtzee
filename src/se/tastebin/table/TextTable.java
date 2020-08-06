package se.tastebin.table;

import se.tastebin.table.border.AsciiBorder;
import se.tastebin.table.border.Border;
import se.tastebin.table.row.Line;
import se.tastebin.table.row.Row;
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
        
        StringBuilder result = new StringBuilder();
       
        Row topRow = data.stream().findFirst().get();
        
        
        
        //result.append(gfx.topLeft());
        result.append(new TopLine(topRow.widths(), gfx).render()); 
        //result.append(gfx.topRight());
        result.append(gfx.newLine());
        
        // THE DATA          
        
        data.stream().forEach(row -> {
            result.append(gfx.left());
            result.append(row.render()); 
            result.append(gfx.right());
            result.append(gfx.newLine());
            result.append(new Line(row.widths(), gfx).render()); 
            result.append(gfx.newLine());
        });
        
        return result.toString();
    }
    
        
}
