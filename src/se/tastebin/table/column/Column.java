package se.tastebin.table.column;

import se.tastebin.table.cell.Cell;

public interface Column {
    int width();
    int numberOfRows();
    Cell cell(int row); 
}
