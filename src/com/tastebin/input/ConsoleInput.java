package com.tastebin.input;

import java.util.Scanner;

public class ConsoleInput implements Input{
    
    private final Scanner in;

    public ConsoleInput() {
        this(new Scanner(System.in));
    }
    
    public ConsoleInput(Scanner in) {
        this.in = in;
    }
    
    public String readString(String caption) {
        System.out.print(caption);
        return in.nextLine();
    }
    
    public int readInt(String caption) {
        System.out.print(caption);
        int value = in.nextInt();
        in.nextLine();
        return value;
    }
    
}
