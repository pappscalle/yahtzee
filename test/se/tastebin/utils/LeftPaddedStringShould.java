package se.tastebin.utils;

import se.tastebin.table.utils.LeftPaddedString;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class LeftPaddedStringShould {
    
    @Test
    public void padToTheLeft() {
        assertEquals(new LeftPaddedString("abc", 6).toString(), "   abc");
    }
    
    @Test
    public void padEmptyStrings() {
        assertEquals(new LeftPaddedString("", 6).toString(), "      ");
    }
    
    @Test
    public void returnOriginalStringWhenPaddingIsZero() {
        assertEquals(new LeftPaddedString("abc", 0).toString(), "abc");
    }
    
    
}
