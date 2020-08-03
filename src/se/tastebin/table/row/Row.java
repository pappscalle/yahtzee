package se.tastebin.table.row;

import java.util.List;

public interface Row {
    List<Integer> widths();
    String render();
}
