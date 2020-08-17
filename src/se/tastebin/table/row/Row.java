package se.tastebin.table.row;

import java.util.List;
import se.tastebin.table.render.Renderable;
import se.tastebin.table.cell.Cell;

public interface Row extends Renderable {

    int size();
    List<Cell> cells();
    
}
