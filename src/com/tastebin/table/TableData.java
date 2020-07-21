package com.tastebin.table;

import java.util.List;

public interface TableData {

    int numberOfColumns();

    int numberOfRows();

//    String value(int row, int column);
//    
//    List<String> row(int row);
//     
    int columnWidth(int column);
    
}
