package se.tastebin.table;

import java.util.List;
import java.util.stream.Collectors;

public class Row {

    private final List<DefaultCell> cells;
    
    public Row(List<DefaultCell> cells) {
        this.cells = cells;
    }

    @Override
    public String toString() {
        return cells.stream().map(cell -> cell.render()).collect(Collectors.joining("|"));
    }
   
}
