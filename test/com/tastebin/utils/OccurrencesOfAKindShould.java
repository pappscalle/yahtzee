package com.tastebin.utils;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class OccurrencesOfAKindShould {

    @Test
    public void returnTheLargestPair() {

        List<Integer> values = Arrays.asList(
            1, 3, 3, 5, 6
        );

        assertEquals(new OccurrencesOfAKind(values, 2).value(), 3);
    }
}