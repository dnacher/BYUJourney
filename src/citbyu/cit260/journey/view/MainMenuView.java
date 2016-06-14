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
                 +"\n----------------------------------");
    }    
    
    @Override
    public boolean doAction(String menuOption){
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
        //****************************************************wrong. must call help display function
	this.display();
}

}

    
    
