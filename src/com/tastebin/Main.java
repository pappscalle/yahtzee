package com.tastebin;

import com.tastebin.table.DefaultColumn;
import com.tastebin.input.ConsoleInput;
import com.tastebin.table.ColumnHeaders;
import com.tastebin.table.DefaultTableData;
import com.tastebin.table.RowHeaders;
import com.tastebin.table.TextTable;
import java.util.List;

public class Main {

    
    
    public static void main(String[] args) {

        ConsoleInput input = new ConsoleInput();
        

       
//        String player1Name = input.readString("Name of player one: ");
//        Player p1 = new Player(0, 
//                               player1Name, 
//                               new Dice(new TraditionalDie(),
//                                        new TraditionalDie(),
//                                        new TraditionalDie(),
//                                        new TraditionalDie(),
//                                        new TraditionalDie()
//                                    )
//                               );
//        
//        String player2Name = input.readString("Name of player two: ");
//        Player p2 = new Player(1, 
//                               player1Name, 
//                               new Dice(new TraditionalDie(),
//                                        new TraditionalDie(),
//                                        new TraditionalDie(),
//                                        new TraditionalDie(),
//                                        new TraditionalDie()
//                                    )
//                               );
//        
//        Players players = new Players(p1, p2);
//    
//        ScoreBoard scores = new ScoreBoard(players);
//        
////        Dice dice = new Dice(
////            new TraditionalDie(6),
////            new TraditionalDie(5),
////            new TraditionalDie(6),
////            new TraditionalDie(4),
////            new TraditionalDie(6)
////        );
//
//        scores.print();
        
        
        System.out.println(
                new TextTable(
//                    new RowHeaders("Ettor", "Tvåor", "Treor"), 
//                    new ColumnHeaders("Calle", "Karin", "Elvira"), 
                    new DefaultTableData(
                        new DefaultColumn()
                    );
                ).toString()
        );
        
//        
//        dice.roll();
//        scores.print(dice);
//
//        dice.hold(3);
//        dice.hold(4);
//
//        dice.roll();
//        scores.print(dice);
//
//        dice.roll();
//        scores.print(dice);
//
//        dice.roll();
//        scores.print(dice);
//
//        dice.releaseAll();
//        dice.roll();
//        scores.print(dice);

    }

}
