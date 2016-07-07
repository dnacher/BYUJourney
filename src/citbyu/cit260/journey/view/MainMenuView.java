package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.controlGame;

public class MainMenuView extends View{ 
    
    public MainMenuView(){
        
        //changed from menu variable to super to call the view constructor
        super("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Main Menu                       |"
                 +"\n----------------------------------"
                 +"\nN Start New Game"
                 +"\nG Get and Start saved Game"
                 +"\nH Get help on how to play the Game"
                 +"\nS Save Game"
                 +"\nQ Quit Game"
                 +"\n----------------------------------"
                 +"\n");
    }    
    
    @Override
    public boolean doAction(String menuOption){
       menuOption = menuOption.toUpperCase();
	boolean answer=false;
	switch (menuOption) {
		case "N": //create and start new game
			this.startNewGame();                        
			break;
		case "G": // get and start an existing game
			this.startExistingGame();                        
			break;
		case "H": // display the help menu
			this.displayHelpMenu();                        
			break;
		case "S": // save the current game
			this.saveGame();                        
			break;
		default:
			System.out.println("\n*** Invalid selection *** Try again");
			break;
	}	
	return answer;
    }
    
private void startNewGame() {   
   SelectRaceMenuView smv=new SelectRaceMenuView();
   smv.display();
}

private void startExistingGame() {
	this.console.println("\n\nEnter the file path for file where the game"
                                + "is to be saved");
        String filePath = this.getInput();
        
        try {
            controlGame.getExistingGame(filePath);
           
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
}

private void saveGame() {
        
        this.console.println("\n\nEnter the file path for file where the game"
                                + "is to be saved");
        String filePath = this.getInput();
        
        try {
            controlGame.saveGame(Journey.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
}

private void displayHelpMenu() {        
        HelpMenuView hmv= new HelpMenuView();
	hmv.display();
}

}

    
    
