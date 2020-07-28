package se.tastebin.table;

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
    
    
}
