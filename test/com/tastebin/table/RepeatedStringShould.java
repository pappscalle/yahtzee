package com.tastebin.table;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class RepeatedStringShould {
    
    @Test
    public void returnTheRepeatedString() {
        assertEquals(new RepeatedString("la", 3).toString(), "lalala");        
    }
   
}
