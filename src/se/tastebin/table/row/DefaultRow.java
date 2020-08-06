package se.tastebin.table.row;

import se.tastebin.table.cell.Cell;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultRow implements Row {

    private final List<Cell> cells;
    
    public DefaultRow(List<Cell> cells) {
        this.cells = cells;
    }    

    @Override
    public String render() {
        return cells().stream().map(cell -> cell.render()).collect(Collectors.joining("-"));
    }

    @Override
    public List<Cell> cells() {
        return cells;
    }
   
    
    
}
