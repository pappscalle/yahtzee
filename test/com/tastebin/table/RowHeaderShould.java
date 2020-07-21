package com.tastebin.table;

import static org.testng.Assert.*;
import org.testng.annotations.Test;


public class RowHeaderShould {
    
    @Test
    public void returnZeroWidthWhenThereAreNoHeaders() {        
        RowHeaders header = new RowHeaders();
        assertEquals(header.width(), 0);
    }
    
    @Test
    public void returnLongestWidth() {
        RowHeaders headers = new RowHeaders("First", "Second");
        assertEquals(headers.width(), 6);
    }
    
}
