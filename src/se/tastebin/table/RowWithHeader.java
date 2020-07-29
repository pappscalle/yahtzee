package se.tastebin.table;

import java.util.ArrayList;
import java.util.List;

public class RowWithHeader implements Row {
    
    private final Row origin;
    private final Cell cell;

    public RowWithHeader(Row origin, Cell cell) {
        this.origin = origin;
        this.cell = cell;
    }
    
    @Override
    public String render() {
        return cell.render() + "|"+ origin.render();
    }

    @Override
    public List<Integer> widths() {
        List<Integer> widths = new ArrayList<>();
        widths.add(cell.width());
        widths.addAll(origin.widths());
        return widths;
    }
    
    
}
