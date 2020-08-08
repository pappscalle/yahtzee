package se.tastebin.table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import se.tastebin.table.column.DefaultColumn;
import se.tastebin.table.row.Row;

public class DefaultTableDataShould {

    @Test
    public void hello() {
        List data = new DefaultTableData(
                new DefaultColumn("1", "2", "3"),
                new DefaultColumn("4", "5", "6")
        );

        System.out.println(data);
        
        assertEquals(data.size(), 2);
        
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
    
}
