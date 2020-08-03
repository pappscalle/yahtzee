package se.tastebin.table;

import se.tastebin.table.column.ColumnHeaders;
import se.tastebin.table.column.ColumnWithHeader;
import se.tastebin.table.column.Column;
import se.tastebin.table.row.RowHeaders;
import se.tastebin.table.column.RowHeaderColumn;
import se.tastebin.table.row.RowDefault;
import se.tastebin.table.row.Row;
import java.util.AbstractList;
import se.tastebin.utils.ZippedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import se.tastebin.utils.MergedList;

public class DefaultTableData extends AbstractList<Row>{

    private final List<Column> columns;

    public DefaultTableData() {
        this(new ArrayList<Column>());
    }
    
    public DefaultTableData(Column...columns) {
        this(Arrays.asList(columns));
    }
    
    public DefaultTableData(RowHeaders rowHeaders, List<Column> columns) {
        this(
            new MergedList<>(
                new RowHeaderColumn(rowHeaders), 
                columns
            )
        );
    }
        
    public DefaultTableData(ColumnHeaders columnHeaders, List<Column> columns) {
        this(
           new ZippedList<>(columns, columnHeaders, (column, header) -> new ColumnWithHeader(column, header))      
        );
    }
    
    public DefaultTableData(RowHeaders rowHeaders, ColumnHeaders columnHeaders, List<Column> columns) {
        this(
            new MergedList<>(
                new ColumnWithHeader(new RowHeaderColumn(rowHeaders), ""), 
                new ZippedList<>(columns, columnHeaders, (column, header) -> new ColumnWithHeader(column, header))    
            )
        );
    }   
       
    public DefaultTableData(List<Column> columns) {
        this.columns = columns;
    }

    @Override
    public Row get(int index) {  
        return columns.stream()
                      .map(column -> column.cell(index))
                      .collect(Collectors.collectingAndThen(Collectors.toList(), RowDefault::new));        
    }

    @Override
    public int size() {
        return columns.size();
    }

}
