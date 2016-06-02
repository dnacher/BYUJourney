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
         
        Dialog.chooseRace();
            int option=inFile.nextInt();
            option=checkMenu(3, option);
            while(option==-1){
                Dialog.chooseRace2();
                option=inFile.nextInt();
                option=checkMenu(3, option);
            }
            
                Player p=c.createPlayer(choice, createCharacter(option));         
                start(p);
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
        if(menuChoice<size && menuChoice>0){
            return menuChoice;
        }
        else{
            return -1;
        }
    }
    
    public static void start(Player p){
        Dialog.HelloWorld(p);
    }
}
