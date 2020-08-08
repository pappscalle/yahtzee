package se.tastebin.table.row;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

public class RowHeaders extends AbstractList<String>{

    private final List<String> headers;
    
    public RowHeaders(String... headers) {
        this(Arrays.asList(headers));
    }
    
    public RowHeaders(List<String> headers) {
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

    @Override
    public String toString() {
        return headers.toString();
    }
    
    
}
