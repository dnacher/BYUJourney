package citbyu.cit260.journey.control;

import citbyu.cit260.journey.model.Player.Player;
import citbyu.cit260.journey.model.game.Game;
import citbyu.cit260.journey.model.characters.Character;
import citbyu.cit260.journey.view.dialogs.Dialog;
import java.util.Scanner;

public class controlGame {
    
    public static int bringIdPlayer(){
    
        int ret= Game.getInstance().getIdPlayer();
        updateIdPlayer();
    
        return ret;
    }
    
    public static void updateIdPlayer(){
        Game.getInstance().setIdPlayer(Game.getInstance().getIdPlayer() + 1);
    }
    
    public static void createThePlayer(){
        Scanner inFile;
        inFile= new Scanner(System.in);
        controlPlayer c= new controlPlayer();
        String choice= inFile.nextLine(); 
        choice=chooseName(choice);     
        
        int option=chooseRace();
            switch(option){
                case 1:
                   Player p=c.createPlayer(choice, createCharacter(option));         
                   start(p);
                   break;
                case 2:
                   option=chooseRace();
                   p=c.createPlayer(choice, createCharacter(option));         
                   start(p);
                   break; 
            }               
    }
    
    public static String chooseName(String choice){
        Scanner inFile;
        inFile= new Scanner(System.in);
        while(choice.equals(new String("")) || choice.equals(new String(" "))){
            if(choice.equals(new String(""))){
                Dialog.choosePlayerName2();
                choice= inFile.nextLine();        
            }
            else{
                Dialog.choosePlayerName3();
                choice= inFile.nextLine();      
            }
        }
        return choice;
    }
    
    public static int chooseRace(){
        Dialog.chooseRace(); 
        Scanner inFile;
        inFile= new Scanner(System.in);
        int option=0;
        option=checkint(inFile.nextLine());
        while(option==-1){
            System.out.println("Choose a number as an option");  
            Dialog.chooseRace();
            option=checkint(inFile.nextLine());
        }
            option=checkMenu(3, option);
            while(option==-1){
                Dialog.chooseRace2();                
                option=checkMenu(3, inFile.nextInt());
            }
                Character theCharacter=createCharacter(option);
                Dialog.theChoice(theCharacter);                
                option=checkMenu(2, inFile.nextInt());
            while(option==-1){                                
                Dialog.theChoice(theCharacter);
                option=checkMenu(2, inFile.nextInt());
            } 
            return option;
    }
    
    public static Character createCharacter(int id){
        Character myCharacter= new Character(100, 0, 0, "", -1);
        switch(id){
            case 1:
               myCharacter.setName("Human");
               myCharacter.setId(1);
                break;
            case 2:
               myCharacter.setName("Elf");
               myCharacter.setId(2);
                break;
            case 3:
              myCharacter.setName("Wizard");
               myCharacter.setId(3);
                break;
        
        }
        return myCharacter;
    }
    
    public static int checkMenu(int size, int menuChoice){
        if(menuChoice<=size && menuChoice>0){
            return menuChoice;
        }
        else{
            return -1;
        }
    }
    
    public static void start(Player p){
        Dialog.HelloWorld(p);
    }
    
    public static void startGame(){        
        int choice=0;
        do{
        Dialog.StartHelp();
        choice=ChosenOne();
        } 
        while(choice==-1);       
        switch(choice){
            case 1:
            Dialog.choosePlayerName();
            controlGame.createThePlayer();
            Dialog.MainMenu();           
            break;
            case 2:
            System.out.println("");    
            break;           
        }
    }
    
    public static int checkint(String userInput){
        int i=0;        
        try{
            i= Integer.parseInt(userInput);           
        }
        catch(Exception e){
            i=-1;
        }
        return i;
    }
    
    public static int ChosenOne(){    
    Scanner inFile;
    inFile= new Scanner(System.in);
    int option=0;
    option=checkint(inFile.nextLine());    
    return option;
    }
}
