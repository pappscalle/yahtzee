package com.tastebin.table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RowHeaders implements Column {

    private final List<String> headers;
    
    public RowHeaders() {
        this(new ArrayList<String>());
    }
    
    public RowHeaders(String...headers) {
        this(Arrays.asList(headers));
    }
    
    public RowHeaders(List<String> headers) {
        this.headers = headers;
    }
    
    @Override
    public int width() {
        return headers.stream().mapToInt(String::length).max().orElse(0);
    }
    
    @Override
    public int numberOfRows() {
        return headers.size();
    }

    @Override
    public Cell cell(int row) {
        return new Cell(headers.get(row), width());
    }
    
}
