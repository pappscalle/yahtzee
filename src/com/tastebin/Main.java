package com.tastebin;

import com.tastebin.sums.Aces;
import com.tastebin.sums.OnePair;
import com.tastebin.sums.Sixes;
import com.tastebin.sums.ThreeOfAKind;
import com.tastebin.sums.Threes;
import com.tastebin.sums.Yahtzee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dice dice = new Dice(
                new TraditionalDie(6),
                new TraditionalDie(5),
                new TraditionalDie(6),
                new TraditionalDie(4),
                new TraditionalDie(6)
        );


        Scanner input = new Scanner(System.in);




        dice.roll();
        System.out.println(dice.toString());
        System.out.println(dice.sum(new Aces()));

        dice.hold(3);
        dice.hold(4);

        dice.roll();
        System.out.println(dice.toString());
        System.out.println(dice.sum(new OnePair()));

        dice.roll();
        System.out.println(dice.toString());
        System.out.println(dice.sum(new Sixes()));

        dice.roll();
        System.out.println(dice.toString());
        System.out.println(dice.sum(new Threes()));

        dice.releaseAll();
        dice.roll();
        System.out.println(dice.toString());
        System.out.println(dice.sum(new ThreeOfAKind()));
        System.out.println(dice.sum(new Yahtzee()));

    }
}
