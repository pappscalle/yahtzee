package com.tastebin;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class TraditionalDieShould {

    @Test
    public void returnValueBetweenOneAndSix() {
        Die die = new TraditionalDie();
        die.roll();
        assertTrue(die.value() >= 1 && die.value() <= 6);
    }

    @Test
    public void notRollWhenHold() {
        Die die = new TraditionalDie(4);
        die.hold();
        die.roll();
        assertEquals(die.value(), 4);
    }
    
    @Test(expectedExceptions = IllegalArgumentException.class) 
    public void throwExceptionWhenInitialValueIsLargerThanTheNumberOfSides() {
        Die die = new TraditionalDie(8);      
    }

    @Test(expectedExceptions = IllegalArgumentException.class) 
    public void throwExceptionWhenInitialValueIsLessThanZero() {
        Die die = new TraditionalDie(-1);      
    }
    
}