package se.tastebin.table.row;

import java.util.ArrayList;
import java.util.List;
import se.tastebin.table.cell.Cell;

public class EmptyRow implements Row {

    @Override
    public String render() {
        return "";
    }

    @Override
    public List<Cell> cells() {
        return new ArrayList<>();
    }
    
}
