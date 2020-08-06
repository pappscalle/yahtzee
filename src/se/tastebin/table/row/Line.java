
package se.tastebin.table.row;

import java.util.List;
import java.util.stream.Collectors;
import se.tastebin.table.border.Border;


public class Line {

    private final List<Integer> widths;
    private final Border border;    
    
    public Line(List<Integer> widths, Border border) {
        this.widths = widths;
        this.border = border;
    }
    
    public String render() {
        return widths.stream()
                .map(w -> border.horizontalLine().repeat(w))
                .collect(Collectors.joining(border.middleCross(), border.leftCross(), border.rightCross()));
    }
    
}
