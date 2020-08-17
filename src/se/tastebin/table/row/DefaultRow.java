package se.tastebin.table.row;

import java.util.List;
import java.util.stream.Collectors;
import se.tastebin.table.cell.Cell;

public class DefaultRow implements Row {

    private final List<Cell> cells;
    
    public DefaultRow(List<Cell> cells) {
        this.cells = cells;
    }    

//    @Override
//    public String render() {
//        return cells().stream().map(cell -> cell.render()).collect(Collectors.joining("-"));
//    }

    @Override
    public List<Cell> cells() {
        return cells;
    }

    @Override
    public String toString() {
        return cells.toString();
    }

    @Override
    public int size() {
        return cells.size();
    }
   
    
    
    
}
