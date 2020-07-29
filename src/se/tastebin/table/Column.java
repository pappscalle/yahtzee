package se.tastebin.table;

public interface Column {
    int width();
    int numberOfRows();
    Cell cell(int row); 
}
