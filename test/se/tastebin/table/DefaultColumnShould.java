package se.tastebin.table;

import se.tastebin.table.column.DefaultColumn;
import se.tastebin.table.column.Column;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class DefaultColumnShould {
    
    @Test
    public void returnTheCorrectNumberOfRows() {
        Column column = new DefaultColumn("Apa", "Bepa", "Cepa");
        assertEquals(column.numberOfRows(), 3);
    }
    
   @Test
   public void returnTheLargestWidth() {
        Column column =  new DefaultColumn("Apa", "BepaBepa", "Cepa"); 
        assertEquals(column.width(), 8);
   }
    
}
