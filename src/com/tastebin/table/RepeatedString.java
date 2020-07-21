package com.tastebin.table;

public class RepeatedString {

    private final String str;
    private final int times;
    
    public RepeatedString(String str, int times) {
        this.str = str;
        this.times = times;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++ ) {
            result.append(str);
        }
        return result.toString();
    }

    
}
