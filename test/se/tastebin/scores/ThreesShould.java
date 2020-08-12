package se.tastebin.scores;

import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import se.tastebin.Die;
import se.tastebin.TraditionalDie;

public class ThreesShould {

    @Test
    public void returnTheSumOfAllTheThrees() {

        Score score = new Threes();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(3),
                new TraditionalDie(3),
                new TraditionalDie(3)
        );

        assertEquals(score.sum(dice), 9);

    }
}