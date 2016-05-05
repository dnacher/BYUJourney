package journey;

import journey.characters.Warrior;
import journey.dialogs.Battle;
import journey.enums.Warriors;

public class Journey {

    public static void main(String[] args) {
        //Characters a1= new Characters(100, 0, "Sword Man  ", 1);
        //Dialog.printBoardVoid();
        //Menus.MainMenu(); 
       // int dice1=Dice.rollDice();
        //int dice2=Dice.rollDice();
       // int total= dice1+ dice2;
       // System.out.println("Dice 1: " + dice1);
      //  System.out.println("Dice 2: " + dice2);
       // System.out.println("Total: " + total);
       // if(total>=8){
      //  System.out.println("you can summon a knight");
      //  }
      //  else{
      //  System.out.println("you cannot summon a knight");
      //  }
      //  int total= 0;
      //  for(int i=0; i<5;i++){            siempre
      //      total +=Dice.roll(i);
      //      System.out.println("Total: " + total);
      //       System.out.println("***************");
     //   }
        
       
        Warrior w1= new Warrior(Warriors.ORC,10);
        Warrior w2= new Warrior(Warriors.EMPTY,-1);
        Battle.printBoardFirst(w1,w2);
    }
    
    
    
}
