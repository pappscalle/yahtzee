package se.tastebin;

import se.tastebin.TraditionalDie;
import se.tastebin.Dice;
import se.tastebin.scores.Chance;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class DiceShould {

    @Test
    public void returnSumOfAllDice() {
        Dice dice = new Dice(
            new TraditionalDie(6),
            new TraditionalDie(5),
            new TraditionalDie(4)
        );

        assertEquals(dice.sum(new Chance()), 15);
    }

}