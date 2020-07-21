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
    private final TableData data; 
    
    public TextTable() {
        this(new RowHeaders(), new ColumnHeaders(), new DefaultTableData());
    }
    
    public TextTable(RowHeaders rowHeaders) {
        this(rowHeaders, new ColumnHeaders(), new DefaultTableData());
    }

    public TextTable(ColumnHeaders columnHeaders) {
        this(new RowHeaders(), columnHeaders, new DefaultTableData());
    }
    
    public TextTable(TableData data) {
        this(new RowHeaders(), new ColumnHeaders(), data);
    }
    
    
    public TextTable(RowHeaders rowHeaders, ColumnHeaders columnHeaders, TableData data) {
        this.columnHeaders = columnHeaders;
        this.rowHeaders = rowHeaders;
        this.data = data; 
    }       
    
    @Override
    public String toString() {
        return "apa";
    }
    
//    @Override
//    public String toString() {
//
//        StringBuilder result = new StringBuilder();
//        
//        // TOP LINE
//        
//        result.append(BORDER_TOP_LEFT);
//        result.append(BORDER_TOP_RIGHT);
//        result.append(NEW_LINE);
//
//        for (int i=0; i<data.numberOfRows(); i++) {
//            result.append(BORDER_LEFT);
//            String s = data.row(i)
//                            .stream()
//                            .collect(Collectors.joining("|"));
//            result.append(s);
//            result.append(BORDER_RIGHT);
//            result.append(NEW_LINE);
//        }
//    }
    
}
