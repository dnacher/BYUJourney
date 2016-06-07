package citbyu.cit260.journey.view;

import citbyu.cit260.journey.view.dialogs.Dialog;
import java.util.Scanner;

public class StartProgramView {
    
    private String  promptMessage;
    
    public void displayStartProgramView(){
       
      boolean done= false;
      do{
          String playerName=this.getPlayersName();
          if(playerName.toUpperCase().equals("Q"))
              return;
          done= this.doAction(playerName);
      }while(!done);
       // Dialog.logo();
       // Dialog.description();
       // controlGame.startGame();        
    }
    
    public StartProgramView(){
    
        this.promptMessage="\n Please enter your Name: ";
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
           System.out.println("\n" + this.promptMessage);
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
    
    private boolean doAction(String playerName){
        System.out.println("\n*** doAction() called***");
        return true;
    }
    
    
    
}
