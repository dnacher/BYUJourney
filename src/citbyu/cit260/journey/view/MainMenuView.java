package citbyu.cit260.journey.view;

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
        System.out.println("**GetMenuOption**");
        return "N";
    }
    
    private boolean doAction(String menuOption){
        System.out.println("**doAction*");
        return true;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

/**
 *
 * @author gustavomartinez
 */
public class MainMenuView {
    
    private void startNewGame() {
	System.out.println("*** startNewGame function called ***");
}

private void startExistingGame() {
	System.out.println("*** startExistingGame function called ***");
}

private void saveGame() {
	System.out.println("*** saveGame function called ***");
}

private void displayHelpMenu() {
	System.out.println("*** displayHelpMenu function called ***");
}

private void startNewGame() {
			// create a new game
		GameControl.createNewGame(xxxxxxx());
		
		// display the game menu
		GameMenuView gameMenu = new GameMenuView();
		gameMenu.displayMenu();
}

}
    



{
public boolean doAction(String choice) {
	
	choice = choice.toUpperCase();
	
	switch (choice) {
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
	
	return false;
}
}
