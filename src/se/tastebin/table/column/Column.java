package se.tastebin.table.column;

import se.tastebin.table.cell.Cell;

public interface Column {
    int width();
    int size();
    Cell cell(int row); 
}
