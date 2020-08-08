package se.tastebin.table.row;

import java.util.List;
import se.tastebin.table.cell.Cell;

public interface Row {

    public String render();
    public List<Cell> cells();
    
}
