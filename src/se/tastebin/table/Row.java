package se.tastebin.table;

import java.util.List;

public interface Row {
    List<Integer> widths();
    String render();
}
