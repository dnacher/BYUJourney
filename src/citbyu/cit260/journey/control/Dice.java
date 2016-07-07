package citbyu.cit260.journey.control;

import citbyu.cit260.journey.Journey;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class Dice {
    
    protected final BufferedReader keyboard=Journey.getInFile();
    protected final PrintWriter console=Journey.getOutFile();

    /*public static int rollDice(int level) {
        double random = Math.random() * 100;
       level=level+6;
        int per=100/level;
        for (int i = 1; i <= level; i++) {
            if (random >= per && random < (per * i)) {
                return i;
            }
        }
        return 1;
    }*/
        
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
     
     //this function will control the total mana for each roll of dices
     public int roll(int time, int level) {
        int ret = 0;
        if (time > 0 && time % 2 == 0) {
            if (probability(60)) {
                ret = rollDices(level) - 5;
                this.console.println("you lose 5 points of your mana");
            }
        } else {
            ret = rollDices(level);
        }
        return ret;
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
