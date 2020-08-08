package se.tastebin.table;

import se.tastebin.utils.LeftPaddedString;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class LeftPaddedStringShould {
    
    @Test
    public void shouldPadToTheLeft() {
        assertEquals(new LeftPaddedString("abc", 6).toString(), "   abc");
    }
    
    @Test
    public void shouldPadEmptyStrings() {
        assertEquals(new LeftPaddedString("", 6).toString(), "      ");
    }
    
    @Test
    public void shouldReturnStringWhenPaddingIsZero() {
        assertEquals(new LeftPaddedString("abc", 0).toString(), "abc");
    }
    
    
}
