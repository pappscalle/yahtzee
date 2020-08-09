package se.tastebin.utils;

import java.util.Objects;

public class LeftPaddedString {

    private final String str;
    private final int length;
    
    public LeftPaddedString(String str, int length) {
        this.str = Objects.requireNonNull(str);
        this.length = Objects.requireNonNull(length); 
    }
    
    @Override
    public String toString() {
        return length == 0 ? str : String.format("%1$" + length + "s", str);
    }
    
}
