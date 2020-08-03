package se.tastebin.table.row;

import se.tastebin.table.cell.DefaultCell;
import java.util.List;
import se.tastebin.table.column.Column;

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
    public int numberOfRows() {
        return headers.size();
    }

    @Override
    public DefaultCell cell(int row) {
        return new DefaultCell(headers.get(row), width());
    }
    
}
