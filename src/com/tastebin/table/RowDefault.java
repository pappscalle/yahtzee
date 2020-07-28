package com.tastebin.table;

import java.util.List;
import java.util.stream.Collectors;

public class RowDefault implements Row {

    private final List<DefaultCell> cells;
    
    public RowDefault(List<DefaultCell> cells) {
        this.cells = cells;
    }

    @Override
    public String render() {
        return cells.stream().map(cell -> cell.render()).collect(Collectors.joining("|"));
    }
   
}
