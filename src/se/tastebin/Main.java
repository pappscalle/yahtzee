package se.tastebin;

import se.tastebin.table.headers.RowHeaders;
import se.tastebin.table.column.DefaultColumn;
import se.tastebin.input.ConsoleInput;
import se.tastebin.table.TableModel;
import se.tastebin.table.TextTable;
import se.tastebin.table.border.AnsiAltBorder;
import se.tastebin.table.headers.ColumnHeaders;

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

        System.out.println(new TextTable(
                new TableModel(
                    new RowHeaders("Ettor", "Tvåor", "Femmor"), 
                    new ColumnHeaders("Calle", "Karin", "Elvira"), 
                    new DefaultColumn("2", "4", "6"),
                    new DefaultColumn("3", "6", "9"), 
                    new DefaultColumn("4", "8", "12") 
                ),
                new AnsiAltBorder()
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
