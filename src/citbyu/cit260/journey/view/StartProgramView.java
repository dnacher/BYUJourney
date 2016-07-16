package citbyu.cit260.journey.view;

import citbyu.cit260.journey.control.ControlDialog;
import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.controlGame;
import java.io.IOException;

public class StartProgramView extends View{
    
    private ControlDialog dialog;
    private controlGame cg;
                   
    public StartProgramView(){
        super("Please enter your Name: ");
        this.dialog= new ControlDialog();
        this.cg= new controlGame();
        this.displayBanner();
    }
    
    private void displayBanner(){    
        this.console.println(dialog.logo());
        this.console.println(dialog.description());        
    }
    
    private String getPlayersName(){
       
       String value="";
       boolean valid= false;
       
       while(!valid){
           this.console.println("\n" + this.displayMessage);
           try {
               value=keyboard.readLine();
           } catch (IOException ex) {
               ErrorView.display(this.getClass().getName() + " " ,ex.getMessage());
           }
           value=value.trim();
           
           if(value.length()<1){
               this.console.println("\nInvalid value: value can not be blank");
               continue;
           }
           break;
       }
       return value;
    }
    
    @Override
    public boolean doAction(String playersName){
       if(playersName.length()<2){
           this.console.println("\nInvalid Players name:" + "The name mus be greater than one Character in lenght");
           return false;
       }   
       //create the Player with the name that the player type
       cg.createNewGame(playersName);
       if(Journey.getPlayer()==null){
           this.console.println("\nError creating the player.");
           return false;
       }       
       this.displayNextView();
       return true;       
    }
    
    private void displayNextView(){
        this.console.println("\n ==================================" + 
                             "\n Welcome to the game " + Journey.getPlayer().getName() +
                             "\n We hope have a lot of fun!" +
                             "\n ==================================" +
                             "\n ==================================");   
        MainMenuView mainMenuView= new MainMenuView();        
        mainMenuView.display();
        
    }    
    
}
