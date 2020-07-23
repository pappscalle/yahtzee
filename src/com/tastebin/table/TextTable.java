package com.tastebin.table;

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
    
    private final RowHeaders rowHeaders; 
    private final ColumnHeaders columnHeaders; 
    private final DefaultTableData data; 
      
    public TextTable(DefaultTableData data, ColumnHeaders columnHeaders, RowHeaders rowHeaders) {
        this.columnHeaders = columnHeaders;
        this.rowHeaders = rowHeaders;
        this.data = data; 
    }       
    
    @Override
    public String toString() {
        
        StringBuilder result = new StringBuilder();
       
        // THE DATA
        
        result.append(data.toString());
        
        return result.toString();
    }
    
        
}
