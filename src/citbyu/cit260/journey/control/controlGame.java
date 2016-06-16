package citbyu.cit260.journey.control;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.model.Player;
import citbyu.cit260.journey.model.game.Game;
import citbyu.cit260.journey.model.characters.Character;
import citbyu.cit260.journey.model.characters.enums.Warriors;
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
    
    public static void createThePlayer(String name){      
        if(name==null){
            System.out.println("The Name cannot be null");
        }
        Player player= new Player();
        Character ch= new Character(100, 0, 0,"Human", 1);
        player.setMyCharacter(ch);
        player.setName(name);  
        player.setCurrentPlace(3);
        player.setCurrentPlace(3);
        Journey.setPlayer(player);       
        createString(player.getMyCharacter().getId());
    }
    
    public static void createString(int Character){
        switch(Character){
            case 1:
                Journey.setSummonCreatures("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Summon Creature Menu            |"
                 +"\n----------------------------------"
                 +"\n--Creature            Mana Needed-"
                 +"\nS Sword Man                   " + Warriors.SWORD_MAN.getMana()
                 +"\nA Spear Man                   " + Warriors.SPEAR_MAN.getMana()
                 +"\nW Knight                      " + Warriors.KNIGHT.getMana()
                 +"\nD Dragon                      " + Warriors.DRAGON.getMana()
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu"
                 +"\n");
                break;
            case 2:
                Journey.setSummonCreatures("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Summon Creature Menu            |"
                 +"\n----------------------------------"
                 +"\n--Creature            Mana Needed-"
                 +"\nS Elf bow                     " + Warriors.ELF_BOW.getMana()
                 +"\nA Spear Elf                   " + Warriors.SPEAR_ELF.getMana()
                 +"\nW Horse Elf                   " + Warriors.HORSE_ELF.getMana()
                 +"\nD Dragon                      " + Warriors.DRAGON.getMana()
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu"
                 +"\n");
                break;
            case 3:
                Journey.setSummonCreatures("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Summon Creature Menu            |"
                 +"\n----------------------------------"
                 +"\n--Creature            Mana Needed-"
                 +"\nS Wizard                      " + Warriors.WIZARD.getMana()
                 +"\nA Grey Wizard                 " + Warriors.GREY_WIZARD.getMana()
                 +"\nW Air Wizard                  " + Warriors.AIR_WIZARD.getMana()
                 +"\nD Dragon                      " + Warriors.DRAGON.getMana()
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu"
                 +"\n");
                break;
        }
    }
    
    public static void createNewGame(Player player){
        System.out.println("*****createNewGame");
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
         //   Player p=controlGame.createThePlayer();
            Dialog.MainMenu(); 
          //  mainMenuChoice(p);
            break;
            case 2:
            instructions();   
            instructionsChoice();
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
    
    public static void instructions(){
        System.out.println("Instructions");  
        System.out.println("a. You will be asked to enter you name, to be able to start your profile.");  
        System.out.println("b. Then you choose from three different races.");  
        System.out.println("   Depending on which you choose will have different abilities.");  
        System.out.println("   Races to choose from are:");  
        System.out.println("                            1. Human");  
        System.out.println("                            2. Elf");  
        System.out.println("                            3. Wizard");  
        System.out.println("c. After you choose your race, you are going to be able to start the game.");  
        System.out.println("*** Remember all the options must be entered as a number***");  
        System.out.println("1)- Go back to the game");
        System.out.println("2)- Exit");
    }
    
    public static void instructionsChoice(){
        int choice=ChosenOne();
        choice=checkMenu(2, choice);
        while(choice==-1){
         System.out.println("Choose a correct answer:");   
         System.out.println("1)- Go back to the game");
         System.out.println("2)- Exit");
        }
        switch(choice){
            case 1:
                startGame();
            case 2:
                
        }
    }
    
    public static void mainMenuChoice(Player p){    
        int i=ChosenOne();
        i=checkMenu(3, i);
        while(i==-1){
            System.out.println("please choose a correct option:");
            Dialog.MainMenu();
            i=ChosenOne();
            i=checkMenu(3, i);
        }
        switch(i){
            case 1:
                System.out.println("this option will start the game");
                break;
            case 2:
                editName(p);
                editRace(p);
                 System.out.println("Your new Name is: " + p.getName());
                 System.out.println("Your new Race is: " + p.getMyCharacter().getName());
                 Dialog.MainMenu();
                 mainMenuChoice(p);
                 break;
            case 3:  
                break;
        }
    }
    
    public static void editName(Player p){
        System.out.println("Select a new name:");
                Scanner inFile;
                inFile= new Scanner(System.in);
                p.setName(inFile.nextLine());                
    }
    
    public static int editRace(Player p){
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
}
