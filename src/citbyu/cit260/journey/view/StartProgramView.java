package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.controlGame;
import java.util.Scanner;

public class StartProgramView extends View{
                   
    public StartProgramView(){
    
        super("\n Please enter your Name: ");
        this.displayBanner();
    }
    
    private void displayBanner(){    
        Dialog.logo();
        Dialog.description();        
    }
    
    private String getPlayersName(){
       Scanner keyboard= new Scanner(System.in);
       String value="";
       boolean valid= false;
       
       while(!valid){
           System.out.println("\n" + this.displayMessage);
           value=keyboard.nextLine();
           value=value.trim();
           
           if(value.length()<1){
               System.out.println("\nInvalid value: value can not be blank");
               continue;
           }
           break;
       }
       return value;
    }
    
    @Override
    public boolean doAction(String playersName){
       if(playersName.length()<2){
           System.out.println("\nInvalid Players name:" + "The name mus be greater than one Character in lenght");
           return false;
       }   
       //create the Player with the name that the player type
       controlGame.createNewGame(playersName);
       if(Journey.getPlayer()==null){
           System.out.println("\nError creating the player.");
           return false;
       }       
       this.displayNextView();
       return true;       
    }
    
    private void displayNextView(){
        System.out.println("\n ==================================");
        System.out.println("\n Welcome to the game " + Journey.getPlayer().getName());
        System.out.println("\n We hope have a lot of fun!");
        System.out.println("\n ==================================");
        System.out.println("\n ==================================");        
        MainMenuView mainMenuView= new MainMenuView();        
        mainMenuView.display();
        
    }    
    
}
