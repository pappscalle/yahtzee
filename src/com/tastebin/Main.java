package com.tastebin;

import com.tastebin.sums.ThreeOfAKind;

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
        System.out.println(dice.sum());

        dice.hold(3);
        dice.hold(4);

        dice.roll();
        System.out.println(dice.toString());
        System.out.println(dice.sum());

        dice.roll();
        System.out.println(dice.toString());
        System.out.println(dice.sum());

        dice.roll();
        System.out.println(dice.toString());
        System.out.println(dice.sum());

        dice.releaseAll();
        dice.roll();
        System.out.println(dice.toString());
        System.out.println(dice.sum());


        dice.setSum(new ThreeOfAKind());
        System.out.println(dice.sum());

    }
}
