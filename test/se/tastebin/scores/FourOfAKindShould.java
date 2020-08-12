package se.tastebin.scores;

import se.tastebin.Die;
import se.tastebin.TraditionalDie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;


public class FourOfAKindShould {

    @Test
    public void returnTheSumOfFourEqualDice() {

        Score score = new FourOfAKind();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(5),
                new TraditionalDie(4),
                new TraditionalDie(4),
                new TraditionalDie(4),
                new TraditionalDie(4)
        );

        assertEquals(score.sum(dice), 16);
    }

    @Test
    public void returnZeroWhenThereAreNoEqualDice() {

        Score score = new FourOfAKind();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(5),
                new TraditionalDie(4),
                new TraditionalDie(3),
                new TraditionalDie(2),
                new TraditionalDie(1)
        );

        assertEquals(score.sum(dice), 0);
    }

}