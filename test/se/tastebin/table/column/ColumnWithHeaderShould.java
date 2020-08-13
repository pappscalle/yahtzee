package se.tastebin.table.column;

import se.tastebin.table.column.DefaultColumn;
import se.tastebin.table.column.ColumnWithHeader;
import se.tastebin.table.column.Column;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class ColumnWithHeaderShould {
    
    @Test
    public void returnTheCorrectNumberOfRows() {
        Column column = new ColumnWithHeader(
                            new DefaultColumn("Apa", "Bepa", "Cepa"), 
                            "Header"
                        );
        
        assertEquals(column.size(), 4);
    }
    
   @Test
   public void returnTheLargestWidth() {
       Column column = new ColumnWithHeader(
                            new DefaultColumn("Apa", "Bepa", "Cepa"), 
                            "Header"
                        );
        
        assertEquals(column.width(), 6);
   }
    
}
