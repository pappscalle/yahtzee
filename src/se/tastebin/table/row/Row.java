package se.tastebin.table.row;

import java.util.List;
import se.tastebin.table.cell.Cell;

public interface Row {

    String render();
    int size();
    List<Cell> cells();
    
}
