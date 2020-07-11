package com.tastebin;

import com.tastebin.input.ConsoleInput;
import com.tastebin.input.Input;
import com.tastebin.scores.Aces;
import com.tastebin.scores.Chance;
import com.tastebin.scores.Fives;
import com.tastebin.scores.FourOfAKind;
import com.tastebin.scores.Fours;
import com.tastebin.scores.FullHouse;
import com.tastebin.scores.LargeStraight;
import com.tastebin.scores.OnePair;
import com.tastebin.scores.Sixes;
import com.tastebin.scores.SmallStraight;
import com.tastebin.scores.ThreeOfAKind;
import com.tastebin.scores.Threes;
import com.tastebin.scores.TwoPairs;
import com.tastebin.scores.Twos;
import com.tastebin.scores.Yahtzee;

public class Main {

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
    
    public static void main(String[] args) {

        ConsoleInput input = new ConsoleInput();
        
        int numberOfPlayers = input.readInt("Number of players: ");
        String player1Name = input.readString("Name of player one: ");
        String player2Name = input.readString("Name of player two: ");
        
        Dice dice = new Dice(
                new TraditionalDie(6),
                new TraditionalDie(5),
                new TraditionalDie(6),
                new TraditionalDie(4),
                new TraditionalDie(6)
        );

        printScores(dice);
        
        dice.roll();
        printScores(dice);

        dice.hold(3);
        dice.hold(4);

        dice.roll();
        printScores(dice);

        dice.roll();
        printScores(dice);

        dice.roll();
        printScores(dice);

        dice.releaseAll();
        dice.roll();
        printScores(dice);

    }

    private static void printScores(Dice dice) {
        System.out.println(dice.toString());
        System.out.format("Aces: %d\n", dice.sum(ACES));
        System.out.format("Twos: %d\n", dice.sum(TWOS));
        System.out.format("Threes: %d\n", dice.sum(THREES));
        System.out.format("Fours: %d\n",  dice.sum(FOURS));
        System.out.format("Fives: %d\n", dice.sum(FIVES));
        System.out.format("Sixes: %d\n", dice.sum(SIXES));
        
        System.out.format("One Pair: %d\n", dice.sum(ONE_PAIR));
        System.out.format("Two Pairs: %d\n", dice.sum(TWO_PAIRS));
        System.out.format("Three of a kind: %d\n", dice.sum(THREE_OF_A_KIND));
        System.out.format("Four of a kind: %d\n", dice.sum(FOUR_OF_A_KIND));
        
        System.out.format("Full House: %d\n", dice.sum(FULL_HOUSE));
        System.out.format("Small Straight: %d\n", dice.sum(SMALL_STRAIGHT));
        System.out.format("Large Strait: %d\n", dice.sum(LARGE_STRAIGHT));
        System.out.format("Chance: %d\n", dice.sum(CHANCE));
        System.out.format("Yahtzee: %d\n", dice.sum(YAHTZEE));
    }
}
