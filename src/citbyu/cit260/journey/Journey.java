package citbyu.cit260.journey;

import java.util.List;
import citbyu.cit260.journey.model.characters.Character;
import citbyu.cit260.journey.control.Dice;
import citbyu.cit260.journey.control.controlPlayer;
import citbyu.cit260.journey.model.Player.Player;

public class Journey {
    
     public static void createCharacter(){
       Character CharacterOne= new Character();
       CharacterOne.setName("Gandalf");
       CharacterOne.setHp(100);
       String playerInfo= CharacterOne.toString();
       System.out.println(playerInfo);
    }
     
     
    
    private List<Character>PlayerList;

    public static void main(String[] args) {
        
            
       //TEST Dice Class
       //  testRollDice();
        // testProbability();
        
       //TEST controlPlayer Class 
         Player p= new Player();
         controlPlayer c= new controlPlayer();
        // testCalculateTime(c);
        // testlookForItem(c);     
       //  testMove(c, p);       
         //testHandleWeight(c, p);   
     //    c.lookForItem(4, 0, true);
           
    }
    
    
    public static void testRollDice(){
        System.out.println("RollDice function:");
        System.out.println("");
        System.out.println("valid inputs:");
        System.out.print("return: " + Dice.rollDice(0)); 
        System.out.println(" expected from 1 to 6");
        System.out.print("return: " + Dice.rollDice(1)); 
        System.out.println(" expected from 1 to 12");
        System.out.print("return: " + Dice.rollDice(2)); 
        System.out.println(" expected from 1 to 18");
        System.out.print("return: " + Dice.rollDice(3)); 
        System.out.println(" expected from 1 to 24");
        System.out.println("");
        System.out.println("invalid inputs:");
        System.out.print("return: " + Dice.rollDice(-5)); 
        System.out.println(" expected -1");
        System.out.print("return: " + Dice.rollDice(-10)); 
        System.out.println(" expected -1");
        System.out.print("return: " + Dice.rollDice(-6)); 
        System.out.println(" expected -1");    
        System.out.println("*************************************");
    }
        
    public static void testProbability(){
        System.out.println("Probability function:");
        System.out.println("");
        System.out.println("valid inputs:");
        System.out.print("return: " + Dice.probability(100)); 
        System.out.println(" expected true");
        System.out.print("return: " + Dice.probability(2)); 
        System.out.println(" expected false");
        System.out.print("return: " + Dice.probability(50)); 
        System.out.println(" expected true or false");     
        System.out.print("return: " + Dice.probability(0)); 
        System.out.println(" expected false");     
        System.out.println("");
        System.out.println("invalid inputs:");
        System.out.print("return: " + Dice.probability(150)); 
        System.out.println(" expected false");
        System.out.print("return: " + Dice.probability(-10)); 
        System.out.println(" expected false");
        System.out.print("return: " + Dice.probability(-25));  
        System.out.println(" expected false");    
        System.out.println("*************************************");
    }
    
    
    //this function test the calculateTime Function
  /*  public static void testCalculateTime(controlPlayer c){      
        System.out.println("CalculateTime function:");
        System.out.println("");
        System.out.println("valid inputs:");
        System.out.print("return: " + c.calculateTime(1, 50)); 
        System.out.println(" expected 10");
        System.out.print("return: " + c.calculateTime(2, 70));
        System.out.println(" expected 5");
        System.out.print("return: " + c.calculateTime(1, 150));
        System.out.println(" expected 30");
        System.out.print("return: " + c.calculateTime(2, 180));
        System.out.println(" expected 12");
        System.out.println("");
        System.out.println("invalid inputs:");
        System.out.print("return: " + c.calculateTime(3, 140));
        System.out.println(" expected -1");
        System.out.print("return: " + c.calculateTime(2, -140));
        System.out.println(" expected -1");
        System.out.print("return: " + c.calculateTime(0, 0)); 
        System.out.println(" expected -1");    
        System.out.println("*************************************");
    }
    
    //this function test the lookForItem Function
   public static void testlookForItem(controlPlayer c){      
        System.out.println("LookForItem function:");
        System.out.println("");
        System.out.println("valid inputs:");
        System.out.print("return: " + c.lookForItem(1, 10)); 
        System.out.println(" expected true");       
        System.out.print("return: " + c.lookForItem(2, 25)); 
        System.out.println(" expected true");
        System.out.print("return: " + c.lookForItem(3, 0)); 
        System.out.println(" expected false");
        System.out.print("return: " + c.lookForItem(1, 50)); 
        System.out.println(" expected true");
        System.out.println("");
        System.out.println("invalid inputs:");
        System.out.print("return: " + c.lookForItem(5, 1)); 
        System.out.println(" expected false");
        System.out.print("return: " + c.lookForItem(15, 10)); 
        System.out.println(" expected false");
        System.out.print("return: " + c.lookForItem(-2, 5)); 
        System.out.println(" expected false");  
        System.out.println("*************************************");
        
    }*/
   
   //this function test the Move Function
   public static void testMove(controlPlayer c, Player p){     
        System.out.println("Move function:");
        System.out.println("");
        System.out.println("valid inputs:");
        System.out.print("return: " + c.move(10, p)); 
        System.out.println(" expected 10");       
        System.out.print("return: " + c.move(25, p)); 
        System.out.println(" expected 25");
        System.out.print("return: " + c.move(7, p)); 
        System.out.println(" expected 7");
        System.out.print("return: " + c.move(14, p)); 
        System.out.println(" expected 14");
        System.out.println("");
        System.out.println("invalid inputs:");
        System.out.print("return: " + c.move(10, null)); 
        System.out.println(" expected -1");  
        System.out.print("return: " + c.move(-5, p)); 
        System.out.println(" expected -1");  
        System.out.print("return: " + c.move(-2, null)); 
        System.out.println(" expected -1"); 
        System.out.println("*************************************");
        
    }
    
    //this function test the Move Function
   public static void testHandleWeight(controlPlayer c, Player p){     
        System.out.print("HandleWeight function:");
        System.out.println("");
        System.out.println("valid inputs:");
         System.out.print(c.handleWeight(20, 0, 0));
        System.out.println(" expected true");       
         System.out.print(c.handleWeight(20, 0, 1));
        System.out.println(" expected true");
         System.out.print(c.handleWeight(20, 7, 2));
        System.out.println(" expected false");
        System.out.print(c.handleWeight(20, 0, 3));
        System.out.println(" expected true");
        System.out.println("");
        System.out.println("invalid inputs:");
         System.out.print(c.handleWeight(-2, 0, 0));
        System.out.println(" expected false");  
         System.out.print(c.handleWeight(20, -4, 0));
        System.out.println(" expected false");  
         System.out.print(c.handleWeight(20, 0, -5));
        System.out.println(" expected false"); 
        System.out.println("*************************************");
        
    }
}
