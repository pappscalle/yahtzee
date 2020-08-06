package se.tastebin.table.border;


public class AnsiAltBorder implements Border {

    @Override
    public String bottom() {
        return "─";
    }

    @Override
    public String bottomCross() {
        return "┴";
    }

    @Override
    public String bottomLeft() {
        return "└";
    }

    @Override
    public String bottomRight() {
        return "┘";
    }

    @Override
    public String horizontalLine() {
        return "─";
    }

    @Override
    public String verticalLine() {
        return "│";
    }  
    
    @Override
    public String left() {
        return "│";
    }

    @Override
    public String leftCross() {
        return "├";
    }

    @Override
    public String right() {
        return "│";
    }

    @Override
    public String rightCross() {
        return "┤";
    }

    @Override
    public String middleCross() {
        return "┼";
    }    
    
    @Override
    public String top() {
        return "─";
    }

    @Override
    public String topCross() {
        return "┬";
    }

    @Override
    public String topLeft() {
        return "┌";
    }

    @Override
    public String topRight() {
       return "┐";
    }

    @Override
    public String newLine() {
        return System.lineSeparator();
    }

    @Override
    public String padding() {
        return " ";
    }


    
}
