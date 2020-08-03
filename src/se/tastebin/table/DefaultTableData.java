package se.tastebin.table;

import se.tastebin.utils.ZippedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import se.tastebin.utils.MergedList;

public class DefaultTableData {

        private final static String BORDER_TOP = "-";
    private final static String BORDER_TOP_LEFT = "+";
    private final static String BORDER_TOP_RIGHT = "+";
    private final static String BORDER_TOP_CROSS = "+";
    private final static String BORDER_LEFT = "|";
    private final static String BORDER_LEFT_CROSS = "+";
    private final static String BORDER_RIGHT = "|";
    private final static String BORDER_RIGHT_CROSS = "+";
    private final static String BORDER_BOTTOM = "-";
    private final static String BORDER_BOTTOM_LEFT = "+";
    private final static String BORDER_BOTTOM_RIGHT = "+";
    private final static String BORDER_BOTTOM_CROSS = "+";
    
    private final static String NEW_LINE = "\n";
    
    private final static String PADDING = " ";
    
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
    
    private int numberOfRows() {
        return columns.size() > 0 ? columns.get(0).numberOfRows() : 0; 
    }
    
    private RowDefault row(int r) {
        List<Cell> row = new ArrayList<>();
        columns.forEach(column -> row.add(column.cell(r)));
        return new RowDefault(row);
    }
    
    public List<RowDefault> rows() {
        List<RowDefault> rows = new ArrayList<>();
        for (int i=0; i < numberOfRows(); i++) {
            rows.add(row(i));
        }
        return rows;
    }
    
    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();
    
//        List<Column> data; 
//        if (!rowHeaders.isEmpty()) {
//            data = new MergedList<>(new RowHeaderColumn(rowHeaders), columns);
//        } else {
//            data = columns;
//        }
//        
//        
//        if (!columnHeaders.isEmpty()) {
//            data = new ZippedList<>(columns, columnHeaders, (column, header) -> new ColumnWithHeader(column, header));
//        } else {
//            data = columns;
//        }
//        
        
//        List<Integer> widths = columnsFinal.stream().mapToInt(c-> c.width()).boxed().collect(Collectors.toList());
//        Line line = new Line(widths);
        
        // TOP LINE
        
        Row topRow = rows().stream().findFirst().get();
        
        result.append(BORDER_LEFT_CROSS);
        result.append(new Line(topRow.widths()).render()); 
        result.append(BORDER_RIGHT_CROSS);
        result.append(NEW_LINE);
        
        // THE DATA
        
        
        
        
        rows().stream().forEach(row -> {
            result.append(BORDER_LEFT);
            result.append(row.render()); 
            result.append(BORDER_RIGHT);
            result.append(NEW_LINE);
            result.append(BORDER_LEFT_CROSS);
            result.append(new Line(row.widths()).render()); 
            result.append(BORDER_RIGHT_CROSS);
            result.append(NEW_LINE);
        });
        
        return result.toString();
    }

}
