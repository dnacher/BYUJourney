package citbyu.cit260.journey.view.dialogs;

import java.util.Scanner;
import citbyu.cit260.journey.model.characters.Character;
import citbyu.cit260.journey.model.game.Game;
import citbyu.cit260.journey.view.dialogs.Dialog;

public class Menus {
    
    private static int choice;
  
     public static void MainMenu(){
        Dialog.logo();       
        Dialog.chooseRace();
        Scanner inFile;
        inFile= new Scanner(System.in);
        choice= inFile.nextInt();
        while(choice !=1 && choice !=2 && choice !=3){
        Dialog.chooseRace2();
        inFile= new Scanner(System.in);
        choice= inFile.nextInt();
        }
        
        switch (choice){
           
            case 1:                     
                Dialog.humanChoice();
                break;
            case 2:
                Dialog.elfChoice();
                break;
            case 3:
                Dialog.wizardChoice();
                break;            
        }
        areYouSure();
                
    }
     
     public static void areYouSure(){
        Scanner inFile;
        int answer;
        inFile= new Scanner(System.in);
        answer= inFile.nextInt();
        while(answer !=1 && answer !=2){
            Dialog.youSure();
            inFile= new Scanner(System.in);
            answer= inFile.nextInt();
        }
        if(answer==1){
         Dialog.asterisk();
         Character c;
         if(choice==1){
         c= new Character(100,0,0,"Human",1);
         }
         else if(choice==2){
         c= new Character(150,0,0,"Elf",2);
         }
         else{
         c= new Character(80,0,0,"Wizard",3);
         }  
         Dialog.printInformation(c);
        // Game.begin(c);
                 }
        else{
        MainMenu();
        }
     }
    
}

