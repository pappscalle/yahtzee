package se.tastebin.table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    public DefaultTableData(List<Column> columns) {
        
        this.columns = columns.stream().map(c -> new ColumnWithHeader(c, "abc123")).collect(Collectors.toList());    
    }   
    
    private int numberOfRows() {
        return columns.size() > 0 ? columns.get(0).numberOfRows() : 0; 
    }
    
    private Row row(int r) {
        List<DefaultCell> row = new ArrayList<>();
        columns.forEach(column -> row.add(column.cell(r)));
        return new Row(row);
    }
    
    public List<Row> rows() {
        List<Row> rows = new ArrayList<>();
        for (int i=0; i < numberOfRows(); i++) {
            rows.add(row(i));
        }
        return rows;
    }
   
    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        List<Integer> widths = columns.stream().mapToInt(c-> c.width()).boxed().collect(Collectors.toList());
        Line line = new Line(widths);
        
        columns.forEach(column -> {
            
        });
        
        // TOP LINE
        
        result.append(BORDER_LEFT_CROSS);
        result.append(line.toString()); 
        result.append(BORDER_RIGHT_CROSS);
        result.append(NEW_LINE);
        
        // THE DATA
        
        rows().forEach(row -> {
            result.append(BORDER_LEFT);
            result.append(row.toString()); 
            result.append(BORDER_RIGHT);
            result.append(NEW_LINE);
            result.append(BORDER_LEFT_CROSS);
            result.append(line.toString()); 
            result.append(BORDER_RIGHT_CROSS);
            result.append(NEW_LINE);
        });
        
        return result.toString();
    }

}
