package se.tastebin.scores;

import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import se.tastebin.Die;
import se.tastebin.TraditionalDie;

public class TwosShould {

    @Test
    public void returnTheSumOfAllTheTwos() {

        Score score = new Twos();

        List<Die> dice = Arrays.asList(
                new TraditionalDie(5),
                new TraditionalDie(1),
                new TraditionalDie(2)
        );

        assertEquals(score.sum(dice), 2);

    }
}