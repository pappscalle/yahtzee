package se.tastebin.scores;

import se.tastebin.Die;
import se.tastebin.TraditionalDie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;


public class ChanceShould {

    @Test
    public void returnTheSumOfAllDice() {

        Score score = new Chance();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(3),
                new TraditionalDie(5),
                new TraditionalDie(4)
        );

        assertEquals(score.sum(dice), 12);
    }

}