
package se.tastebin.table.row;

import java.util.List;
import java.util.stream.Collectors;
import se.tastebin.table.border.Border;


public class TopLine {

    private final List<Integer> widths;
    private final Border border;    
    
    public TopLine(List<Integer> widths, Border border) {
        this.widths = widths;
        this.border = border;
    }
    
    public String render() {
        return widths.stream()
                .map(w -> border.horizontalLine().repeat(w))
                .collect(Collectors.joining(border.topCross(), border.topLeft(), border.topRight()));
    }
    
}
