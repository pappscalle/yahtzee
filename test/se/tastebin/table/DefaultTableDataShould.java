package se.tastebin.table;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import se.tastebin.table.column.DefaultColumn;
import se.tastebin.table.row.Row;

public class DefaultTableDataShould {

    @Test
    public void returnTheNumberOfRowsInTheColumns() {
        List rows = new DefaultTableData(
                new DefaultColumn("1", "2", "3"),
                new DefaultColumn("4", "5", "6")
        );
        
        assertEquals(rows.size(), 3);
        
    }

    @Test
    public void haveAllValuesInAnIterator() {
        List data = new DefaultTableData(
                new DefaultColumn("1", "2", "3"),
                new DefaultColumn("4", "5", "6")
        );
        
        Iterator<Row> iter = data.iterator();
         
        List<Row> rows = new ArrayList<>();
        while (iter.hasNext()) {
            rows.add(iter.next());
        }
         
        assertEquals(rows.size(), 3);
        
    }
    
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void failWhenIteratingColumnsWithDifferentSizes() {
        List<Row> data = new DefaultTableData(
                new DefaultColumn("1", "2", "3"),
                new DefaultColumn("4", "5")
        );

        for (Row row : data) {} // iterate the data, should throw an exception
        
    }
    
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void failWhenCheckingTheSizeOnColumnsWithDifferentSizes() {
        List<Row> data = new DefaultTableData(
                new DefaultColumn("1", "2", "3"),
                new DefaultColumn("4", "5")
        );

        assertEquals(data.size(), 3); // should throw an exception
        
    }
    
}
