package com.tastebin.table;

public class LeftPaddedString {

    private final String str;
    private final int length;
    
    public LeftPaddedString(String str, int length) {
        this.str = str;
        this.length = length; 
    }
    
    @Override
    public String toString() {
        return length == 0 ? str : String.format("%1$" + length + "s", str);
    }
    
}
