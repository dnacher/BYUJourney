package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.controlGame;
import java.util.Scanner;

public class MainMenuView {
    
    private String menu;
    
    
    public MainMenuView(){
    
        this.menu="\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Main Menu                       |"
                 +"\n----------------------------------"
                 +"\nN Start New Game"
                 +"\nG Get and Start saved Game"
                 +"\nH Get help on how to play the Game"
                 +"\nS Save Game"
                 +"\nQ Quit Game"
                 +"\n----------------------------------";
    }
    
    void displayMainMenuView(){
        boolean done = false;
        do{
            String menuOption=this.getMenuOption();            
            if(menuOption.toUpperCase().equals("Q"))
                return;
            
            done= this.doAction(menuOption);
        }
        while(!done);
        
    }
    
    private String getMenuOption(){
       Scanner keyboard= new Scanner(System.in);
       String value="";
       boolean valid= false;
       
       while(!valid){
           System.out.println(menu);
           value=keyboard.nextLine();
           value=value.trim().toUpperCase();
           
           if(value.length()<1){
               System.out.println("\nInvalid value: value can not be blank");
               continue;
           }
           break;
       }
       return value;
        
    }
    
    private boolean doAction(String menuOption){
       menuOption = menuOption.toUpperCase();
	boolean answer=false;
	switch (menuOption) {
		case "N": //create and start new game
			this.startNewGame();
                        //answer=false;
			break;
		case "G": // get and start an existing game
			this.startExistingGame();
                        answer=true;
			break;
		case "H": // display the help menu
			this.displayHelpMenu();
                        answer=true;
			break;
		case "S": // save the current game
			this.saveGame();
                        answer=true;
			break;
		default:
			System.out.println("\n*** Invalid selection *** Try again");
			break;
	}	
	return answer;
    }
    
    private void startNewGame() {
		// create a new game
		      controlGame.createNewGame(Journey.getPlayer());
		
		// display the game menu
		//GameMenuView gameMenu = new GameMenuView();
		//gameMenu.displayMenu();
}

private void startExistingGame() {
	System.out.println("*** startExistingGame function called ***");
}

private void saveGame() {
	System.out.println("*** saveGame function called ***");
}

private void displayHelpMenu() {
	HelpMenuView HV= new HelpMenuView();
        HV.displayMainMenuView();
}

}

    
    
