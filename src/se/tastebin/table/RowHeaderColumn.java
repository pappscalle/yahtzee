package se.tastebin.table;

import java.util.List;

public class RowHeaderColumn implements Column {

    private final List<String> headers;
        
//    public RowHeaderColumn() {
//        this(new ArrayList<String>());
//    }
//    
//    public RowHeaderColumn(String...headers) {
//        this(Arrays.asList(headers));
//    }
//    
    
    public RowHeaderColumn(List<String> headers) {                
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
    public DefaultCell cell(int row) {
        return new DefaultCell(headers.get(row), width());
    }
    
}
