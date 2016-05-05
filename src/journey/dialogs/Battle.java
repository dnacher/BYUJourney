
package journey.dialogs;

import java.util.Scanner;
import journey.characters.Warrior;
import journey.enums.Warriors;

public class Battle {
    
    public static void printBoardFirst(Warrior a, Warrior empty){
             
     System.out.println("            Note: Creature_Name(current HP of the creature)");
     System.out.println("");
     System.out.println("                     A                B                 C");
     System.out.println("");
     System.out.println("           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
     System.out.println("           @                 @                 @                 @");
        WarriorLine(a);
     System.out.println("           @                 @                 @                 @");
     System.out.println("           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
     System.out.println("           @                 @                 @                 @");
        WarriorLine(empty);
     System.out.println("           @                 @                 @                 @");
     System.out.println("           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
     System.out.println("           @                 @                 @                 @");
        WarriorLine(empty);
     System.out.println("           @                 @                 @                 @");
     System.out.println("           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
     System.out.println("");
     BattleDialogFirst();
     int choice=0;
     Scanner inFile= new Scanner(System.in);
     choice= inFile.nextInt();
     choice=optionFirstBoard(choice, inFile);
     afterBattleOption(choice);
    }
    
    public static void BattleDialogFirst(){
        System.out.println("        To summon creatures to the board you will neeed to roll the dice.");
        System.out.println("         The dice will give you Mana; the attribute to summon creatures");
        System.out.println("   Once you have Mana you will have the options of which creatures you can Summon");
        System.out.println("The creatures will appear in A3. then you will be able to move/atack with the creature");
        System.out.println("");        
        System.out.println("                      choose an option:");
        System.out.println("");
        System.out.println("1: Roll a Dice");
        System.out.println("2: Retreat");
    
    }
    
    public static void printBoardFirst(Warrior a1, Warrior a2, Warrior a3,Warrior b1, Warrior b2, Warrior b3,Warrior c1, Warrior c2, Warrior c3 ){
    
        System.out.println("                   A                B                 C");
     System.out.println("");
     System.out.println("           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
     System.out.println("           @                 @                 @                 @");
        WarriorLinefull(a1,a2,a3);
     System.out.println("           @                 @                 @                 @");
     System.out.println("           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
     System.out.println("           @                 @                 @                 @");
        WarriorLinefull(b1,b2,b3);
     System.out.println("           @                 @                 @                 @");
     System.out.println("           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
     System.out.println("           @                 @                 @                 @");
        WarriorLinefull(c1,c2,c3);
     System.out.println("           @                 @                 @                 @");
     System.out.println("           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
     
     BattleDialogWhile();
    }
    
    public static void BattleDialogWhile(){
        System.out.println("choose an option:");
        System.out.println("");
        System.out.println("1: Roll a Dice to Summon your creatures");
        System.out.println("2: type the origin coordinates of your creature to move/fight");
        System.out.println("3: summon a creature");       
        System.out.println("4: Retreat. (you will lose life: total number of your creatures in the board or 50 if you haven´t)");
    }
    
    public static void WarriorLine(Warrior w){
        System.out.println("         1 @ " + w.getWar().getName() + "("+ w.getCurrentHp()+") @ "+ w.getWar().getName() +  "("+w.getCurrentHp()+") @ "+ w.getWar().getName() +"("+ w.getCurrentHp()+") @");
    }
    
    public static void WarriorLinefull(Warrior w1, Warrior w2, Warrior w3){
        System.out.println("         1 @ " + w1.getWar().getName() + "("+ w1.getCurrentHp()+") @ "+ w2.getWar().getName() +  "("+w2.getCurrentHp()+") @ "+ w3.getWar().getName() +"("+ w3.getCurrentHp()+") @");
    }
    
    public static void afterBattleOption(int choice){
        if(choice==1){
             System.out.println("fight");
        }
        else{
            System.out.println("retreat");
        }
    }
    
    public static int optionFirstBoard(int choice,Scanner inFile){
    while(choice!=1 && choice!=2){
       System.out.println("please choose option 1 or 2");
       System.out.println("1: Roll a Dice");
       System.out.println("2: Retreat");
       choice= inFile.nextInt();
     }
    return choice;
    }
}
