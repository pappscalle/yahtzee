
package se.tastebin.table;

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
    
    public String render() {
        return widths.stream().map(w -> "-".repeat(w)).collect(Collectors.joining("+"));
    }
    
}
