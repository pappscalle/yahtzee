
package com.tastebin.table;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Line {

    private final List<Integer> widths;
    
    public Line(Integer...widths) {
        this(Arrays.asList(widths));
    }
    
    public Line(List<Integer> widths) {
        this.widths = widths;
    }
    
    @Override
    public String toString() {
        if (widths.isEmpty()) {
            return "";
        } else {
            return widths.stream().map(w -> new RepeatedString("-", w).toString()).collect(Collectors.joining("+"));
        }
    }
    
}
