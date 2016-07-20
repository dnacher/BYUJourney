package citbyu.cit260.journey.control;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.model.theDice;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Dice {
    
    protected final BufferedReader keyboard=Journey.getInFile();
          
    //this function roll one dice
     public static int rollDice() {        
       double random = Math.random()*6;
       return (int)random + 1; 
    }
     
      //this function will roll 2 dices 
    public static ArrayList<theDice> rollDice(int level) {
       int total=0;
       int dice=rollDice();
       ArrayList<theDice> list = new ArrayList<>();    
       total+=dice;
       for(int i=0;i<=level;i++){
           theDice Dice = new theDice();
           dice=rollDice();
           Dice.setIntDice(dice);
           int num=i+2;
           String stringDice="Dice " + num + ": " + dice;
           Dice.setStringDice(stringDice);
           list.add(Dice);
          
       }                
        return list;
    }
    
    public static int CalculateTotalDices(ArrayList<theDice> list){
        int total=0;
        for(theDice d: list){
            total+=d.getIntDice();
        }
        return total;
    }
    
    public static String createStringDice(ArrayList<theDice> list){
        String str="";
         for(theDice d: list){
            str+="\n" + d.getStringDice();
        }
         return str;
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

    private theDice theDiceView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
