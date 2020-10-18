package se.tastebin.table.column;


import java.util.List;
import se.tastebin.table.cell.Cell;
import se.tastebin.table.cell.DefaultCell;

public class RowHeaderColumn implements Column {

    private final List<String> headers; 
    
    public RowHeaderColumn(List<String> headers) {                
        this.headers = headers;
    }
    
    @Override
    public int width() {
        return headers.stream().mapToInt(String::length).max().orElse(0);
    }
    
    @Override
    public int size() {
        return headers.size();
    }

    @Override
    public Cell cell(int row) {
        return new DefaultCell(headers.get(row), width());
    }

    @Override
    public String toString() {
        return headers.toString();
    }
    
    
}
