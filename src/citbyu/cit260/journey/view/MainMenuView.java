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
