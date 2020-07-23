package com.tastebin.table;

public interface Column {
    int width();
    int numberOfRows();
    DefaultCell cell(int row); 
}
