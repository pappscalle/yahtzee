package com.tastebin.table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefaultTableData implements TableData {

    private final List<Column> columns;

    public DefaultTableData() {
        this(new ArrayList<Column>());
    }

    public DefaultTableData(Column...columns) {
        this(Arrays.asList(columns));
    }

    public DefaultTableData(List<Column> columns) {
        this.columns = columns;
    }   
    
    @Override
    public int numberOfColumns() {
        return columns.size();
    }

    @Override
    public int numberOfRows() {
        return columns.size() > 0 ? columns.get(0).numberOfRows() : 0;
    }

    @Override
    public String value(int row, int column) {
        if (numberOfColumns() > 0 && numberOfRows() > 0) {
            return columns.get(column).value(row);
        } else {
            return "";
        }
    }

    @Override
    public int columnWidth(int column) {
        return columns.get(column).width();
    }

    public Row row(int row) {
        List<Cell> row = new ArrayList<>();
        columns.forEach(column -> row.add(column.cell(row))));
        return new Row(row);
    }
    
    public List<Row> rows() {
        List<Row> rows = new ArrayList<>();
        for (int i=0; i<numberOfRows(); i++) {
            rows.add(row(i));
        }
    }
    
}
