package se.tastebin.table;

import java.util.List;
import java.util.stream.Collectors;

public class RowDefault implements Row {

    private final List<Cell> cells;
    
    public RowDefault(List<Cell> cells) {
        this.cells = cells;
    }

    @Override
    public String render() {
        return cells.stream().map(cell -> cell.render()).collect(Collectors.joining("|"));
    }

    @Override
    public List<Integer> widths() {
        return cells.stream().mapToInt(cell -> cell.width()).boxed().collect(Collectors.toList());
    }
   
}
