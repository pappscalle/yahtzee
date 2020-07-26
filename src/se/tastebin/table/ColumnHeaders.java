package se.tastebin.table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColumnHeaders {
    
    private final List<String> headers;

    public ColumnHeaders() {
        this(new ArrayList<String>());
    }
    
    public ColumnHeaders(String...headers) {
        this(Arrays.asList(headers));
    }
    
    public ColumnHeaders(List<String> headers) {
        this.headers = headers;
    }
    
    public int width(int column) {
        if (column < 0 || column > headers.size()) {
            throw new IllegalArgumentException();
        }
        return headers.get(column).length();
    }
    
    public int width() {
        return headers.stream().mapToInt(String::length).sum();
    }
 
    public int numberOfColumns() {
        return headers.size();
    }
    
    public String value(int column) {
        if (headers.size() != 0 ) {
            return headers.get(column);
        } else {
            return "";
        }
    }
    
}
