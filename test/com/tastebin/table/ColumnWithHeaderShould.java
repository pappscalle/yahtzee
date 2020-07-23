package com.tastebin.table;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class ColumnWithHeaderShould {
    
    @Test
    public void returnTheCorrectNumberOfRows() {
        Column column = new ColumnWithHeader(
                            new DefaultColumn("Apa", "Bepa", "Cepa"), 
                            "Header"
                        );
        
        assertEquals(column.numberOfRows(), 4);
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
