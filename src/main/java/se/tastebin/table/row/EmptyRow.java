package se.tastebin.table.row;

import java.util.ArrayList;
import java.util.List;
import se.tastebin.table.cell.Cell;

public class EmptyRow implements Row {

    @Override
    public List<Cell> cells() {
        return new ArrayList<>();
    }

    @Override
    public int size() {
        return 0;
    }
    
}
