package se.tastebin;

import se.tastebin.scores.Aces;
import se.tastebin.scores.Chance;
import se.tastebin.scores.Fives;
import se.tastebin.scores.FourOfAKind;
import se.tastebin.scores.Fours;
import se.tastebin.scores.FullHouse;
import se.tastebin.scores.LargeStraight;
import se.tastebin.scores.OnePair;
import se.tastebin.scores.Sixes;
import se.tastebin.scores.SmallStraight;
import se.tastebin.scores.ThreeOfAKind;
import se.tastebin.scores.Threes;
import se.tastebin.scores.TwoPairs;
import se.tastebin.scores.Twos;
import se.tastebin.scores.Yahtzee;

public class ScoreBoard {

    private static final Aces ACES = new Aces();
    private static final Twos TWOS = new Twos();
    private static final Threes THREES = new Threes();
    private static final Fours FOURS = new Fours();
    private static final Fives FIVES = new Fives();
    private static final Sixes SIXES = new Sixes();
    private static final TwoPairs TWO_PAIRS = new TwoPairs();
    private static final ThreeOfAKind THREE_OF_A_KIND = new ThreeOfAKind();
    private static final OnePair ONE_PAIR = new OnePair();
    private static final FourOfAKind FOUR_OF_A_KIND = new FourOfAKind();
    private static final FullHouse FULL_HOUSE = new FullHouse();
    private static final SmallStraight SMALL_STRAIGHT = new SmallStraight();
    private static final LargeStraight LARGE_STRAIGHT = new LargeStraight();
    private static final Chance CHANCE = new Chance();
    private static final Yahtzee YAHTZEE = new Yahtzee();


    private final Players players;

    public ScoreBoard(Players players) {
        this.players = players;
    }

    private void p(String s, Object...args) {
        System.out.format(s, args);
    }

    public void print() {

        Player player = players.getPlayer(0);
        Dice dice = player.dice();

        //p(dice.toString()+"\n");
        p("Aces: %d\n", dice.sum(ACES));
        p("Twos: %d\n", dice.sum(TWOS));
        p("Fours: %d\n",  dice.sum(FOURS));
        p("Threes: %d\n", dice.sum(THREES));
        p("Fives: %d\n", dice.sum(FIVES));
        p("Sixes: %d\n", dice.sum(SIXES));
        p("One Pair: %d\n", dice.sum(ONE_PAIR));
        p("Two Pairs: %d\n", dice.sum(TWO_PAIRS));
        p("Three of a kind: %d\n", dice.sum(THREE_OF_A_KIND));
        p("Four of a kind: %d\n", dice.sum(FOUR_OF_A_KIND));
        p("Full House: %d\n", dice.sum(FULL_HOUSE));
        p("Small Straight: %d\n", dice.sum(SMALL_STRAIGHT));
        p("Large Strait: %d\n", dice.sum(LARGE_STRAIGHT));
        p("Chance: %d\n", dice.sum(CHANCE));
        p("Yahtzee: %d\n", dice.sum(YAHTZEE));
    }
}
