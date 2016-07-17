package citbyu.cit260.journey.control;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.view.theDiceView;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Dice {
    
    protected final BufferedReader keyboard=Journey.getInFile();
    protected final PrintWriter console=Journey.getOutFile();
       
    //this function roll one dice
     public static int rollDice() {        
       double random = Math.random()*6;
       return (int)random + 1; 
    }
     
      //this function will roll 2 dices 
    public ArrayList<theDiceView> rollDice(int level) {
       int total=0;
       int dice=rollDice();
       ArrayList<theDiceView> list = new ArrayList<>();
       //this.console.println("Dice 1: " + dice);
       total+=dice;
       for(int i=0;i<=level;i++){
           theDiceView Dice = new theDiceView();
           dice=rollDice();
           Dice.setIntDice(dice);
           int num=i+2;
           String stringDice="Dice " + num + ": " + dice;
           Dice.setStringDice(stringDice);
           list.add(Dice);
            //total+=dice;
       }        
        //this.console.println("Total: " + total );
        return list;
    }
     
    //this function will return true or false depending on the probability
    public static boolean probability(int percentage) {
        if(percentage>0 && percentage<101){
        int i = (int) (Math.random() * 100);
        if (i > 0 && i <= percentage) {
            return true;
        } else {
            return false;
        }
        }
        else{
            return false;
        }
    }

    private theDiceView theDiceView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
