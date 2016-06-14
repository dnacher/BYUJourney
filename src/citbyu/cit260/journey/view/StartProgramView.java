package citbyu.cit260.journey.view;

import citbyu.cit260.journey.control.controlGame;
import citbyu.cit260.journey.model.Player.Player;
import citbyu.cit260.journey.view.dialogs.Dialog;
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
       
       Player player= controlGame.createThePlayer(playersName);
       if(player==null){
           System.out.println("\nError creating the player.");
           return false;
       }
       
       this.displayNextView(player);
       return true;
       
    }
    
    private void displayNextView(Player player){
        System.out.println("\n ==================================");
        System.out.println("\n Welcome to the game " + player.getName());
        System.out.println("\n We hope have a lot of fun!");
        System.out.println("\n ==================================");
        System.out.println("\n ==================================");
        
        MainMenuView mainMenuView= new MainMenuView();        
        mainMenuView.display();
        
    }
    
    
    
}
