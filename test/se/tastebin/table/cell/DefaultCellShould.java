package se.tastebin.table.cell;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class DefaultCellShould {
    
    @Test
    public void returnLeftPaddedString() {
        Cell cell = new DefaultCell("value", 8);
        assertEquals(cell.render(), "   value");
    }
    
}
