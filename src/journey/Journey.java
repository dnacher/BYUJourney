package journey;

import journey.characters.Characters;
import journey.dialogs.Dialog;
import journey.game.dice.Dice;

public class Journey {

    public static void main(String[] args) {
        //Characters a1= new Characters(100, 0, "Sword Man  ", 1);
        //Dialog.printBoardVoid();
        //Menus.MainMenu(); 
        int dice1=Dice.rollDice();
        int dice2=Dice.rollDice();
        int total= dice1+ dice2;
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
        System.out.println("Total: " + total);
    }
    
}
