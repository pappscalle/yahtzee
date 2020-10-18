package se.tastebin.scores;

import java.util.Arrays;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import se.tastebin.Die;
import se.tastebin.TraditionalDie;

public class AcesShould {

    @Test
    public void returnTheSumOfAllTheOnes() {

        Score score = new Aces();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(1),
                new TraditionalDie(1),
                new TraditionalDie(4)
        );

        assertEquals(score.sum(dice), 2);

    }
    
    @Test
    public void returnZeroWhenNoDiceHaveValueOne() {

        Score score = new Aces();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(2),
                new TraditionalDie(3),
                new TraditionalDie(4)
        );

        assertEquals(score.sum(dice), 0);

    }
}
