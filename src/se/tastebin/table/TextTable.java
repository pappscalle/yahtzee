package se.tastebin.table;

import java.util.stream.Collectors;

public class TextTable {
    
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
    
    private final DefaultTableData data; 
      
    public TextTable(DefaultTableData data) {
        this.data = data; 
    }       
    
    @Override
    public String toString() {
        
        StringBuilder result = new StringBuilder();
       
        Row topRow = data.stream().findFirst().get();
        
        result.append(BORDER_LEFT_CROSS);
        result.append(new Line(topRow.widths()).render()); 
        result.append(BORDER_RIGHT_CROSS);
        result.append(NEW_LINE);
        
        // THE DATA          
        
        data.stream().forEach(row -> {
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
