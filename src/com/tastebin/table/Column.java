package com.tastebin.table;

interface Column {
    int width();
    int numberOfRows();
    Cell cell(int row); 
}
