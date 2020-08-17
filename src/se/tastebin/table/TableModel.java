package se.tastebin.table;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import se.tastebin.table.column.Column;
import se.tastebin.table.headers.ColumnHeaders;
import se.tastebin.table.column.ColumnWithHeader;
import se.tastebin.table.column.RowHeaderColumn;
import se.tastebin.table.row.DefaultRow;
import se.tastebin.table.row.Row;
import se.tastebin.table.headers.RowHeaders;
import se.tastebin.utils.MergedList;
import se.tastebin.utils.ZippedList;

public class TableModel extends AbstractList<Row>{

    private final List<Column> columns;

    public TableModel() {
        this(new ArrayList<Column>());
    }
    
    public TableModel(Column...columns) {
        this(Arrays.asList(columns));
    }
    
    public TableModel(RowHeaders rowHeaders, Column...columns) {
        this(rowHeaders, Arrays.asList(columns));
    }
   
    public TableModel(RowHeaders rowHeaders, List<Column> columns) {
        this(
            new MergedList<>(
                new RowHeaderColumn(rowHeaders), 
                columns
            )
        );
    }
   
    public TableModel(ColumnHeaders columnHeaders, Column...columns) {
        this(columnHeaders, Arrays.asList(columns));
    }    
    
    public TableModel(ColumnHeaders columnHeaders, List<Column> columns) {
        this(
           new ZippedList<>(columns, columnHeaders, (column, header) -> new ColumnWithHeader(column, header))      
        );
    }
    
    public TableModel(RowHeaders rowHeaders, ColumnHeaders columnHeaders, Column...columns) {
        this(rowHeaders, columnHeaders, Arrays.asList(columns));
    }        
    
    public TableModel(RowHeaders rowHeaders, ColumnHeaders columnHeaders, List<Column> columns) {
        this(
            new MergedList<>(
                new ColumnWithHeader(new RowHeaderColumn(rowHeaders), ""), 
                new ZippedList<>(columns, columnHeaders, (column, header) -> new ColumnWithHeader(column, header))    
            )
        );
    }   
       
    public TableModel(List<Column> columns) {
        this.columns = columns;
    }

    @Override
    public Row get(int index) {  
        validate();
        return columns.stream()
                      .map(column -> column.cell(index))
                      .collect(Collectors.collectingAndThen(Collectors.toList(), DefaultRow::new));        
    }

    @Override
    public int size() {
        validate();
        return columns.stream().findFirst().map(column -> column.size()).orElse(0);
    }

    @Override
    public String toString() {
        return columns.toString();
    }

    private void validate() {
        if (columns.stream().map(column -> column.size()).distinct().count() > 1) {
            throw new IllegalArgumentException("The columns do not have the same number of rows");
        }
    }
}
