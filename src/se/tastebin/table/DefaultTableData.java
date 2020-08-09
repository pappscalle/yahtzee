package se.tastebin.table;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import se.tastebin.table.column.Column;
import se.tastebin.table.column.ColumnHeaders;
import se.tastebin.table.column.ColumnWithHeader;
import se.tastebin.table.column.RowHeaderColumn;
import se.tastebin.table.row.DefaultRow;
import se.tastebin.table.row.Row;
import se.tastebin.table.row.RowHeaders;
import se.tastebin.utils.MergedList;
import se.tastebin.utils.ZippedList;

public class DefaultTableData extends AbstractList<Row>{

    private final List<Column> columns;

    public DefaultTableData() {
        this(new ArrayList<Column>());
    }
    
    public DefaultTableData(Column...columns) {
        this(Arrays.asList(columns));
    }
    
    public DefaultTableData(RowHeaders rowHeaders, Column...columns) {
        this(rowHeaders, Arrays.asList(columns));
    }
   
    public DefaultTableData(RowHeaders rowHeaders, List<Column> columns) {
        this(
            new MergedList<>(
                new RowHeaderColumn(rowHeaders), 
                columns
            )
        );
    }
   
    public DefaultTableData(ColumnHeaders columnHeaders, Column...columns) {
        this(columnHeaders, Arrays.asList(columns));
    }    
    
    public DefaultTableData(ColumnHeaders columnHeaders, List<Column> columns) {
        this(
           new ZippedList<>(columns, columnHeaders, (column, header) -> new ColumnWithHeader(column, header))      
        );
    }
    
    public DefaultTableData(RowHeaders rowHeaders, ColumnHeaders columnHeaders, Column...columns) {
        this(rowHeaders, columnHeaders, Arrays.asList(columns));
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
                      .collect(Collectors.collectingAndThen(Collectors.toList(), DefaultRow::new));        
    }

    @Override
    public int size() {
        return columns.stream().findFirst().map(column -> column.numberOfRows()).orElse(0);
    }

    @Override
    public String toString() {
        return columns.toString();
    }

}
