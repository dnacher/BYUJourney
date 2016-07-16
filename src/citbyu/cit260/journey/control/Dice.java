package citbyu.cit260.journey.control;

import citbyu.cit260.journey.Journey;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class Dice {
    
    protected final BufferedReader keyboard=Journey.getInFile();
    protected final PrintWriter console=Journey.getOutFile();
       
    //this function roll one dice
     public static int rollDice() {        
       double random = Math.random()*6;
       return (int)random + 1; 
    }
     
      //this function will roll 2 dices 
    public int rollDices(int level) {
       int total=0;
       int dice=rollDice();
       this.console.println("Dice 1: " + dice);
       total+=dice;
       for(int i=0;i<=level;i++){
           dice=rollDice();
           int num=i+2;
           this.console.println("Dice " + num + ": " + dice);
           total+=dice;
       }        
        this.console.println("Total: " + total );
        return total;
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
}
