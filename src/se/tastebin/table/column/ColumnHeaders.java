package se.tastebin.table.column;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

public class ColumnHeaders extends AbstractList<String>{

    private final List<String> headers;
    
    public ColumnHeaders(String... headers) {
        this(Arrays.asList(headers));
    }
    
    public ColumnHeaders(List<String> headers) {
        this.headers = headers;
    }
    
    @Override
    public String get(int index) {
        return headers.get(index);        
    }

    @Override
    public int size() {        
        return headers.size();
    }
    
}
