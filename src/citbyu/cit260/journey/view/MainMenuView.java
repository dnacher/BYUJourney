package citbyu.cit260.journey.view;

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
   SelectMenuView smv=new SelectMenuView();
   smv.display();
}

private void startExistingGame() {
	System.out.println("*** startExistingGame function called ***");
}

private void saveGame() {
	System.out.println("*** saveGame function called ***");
}

private void displayHelpMenu() {        
        HelpMenuView hmv= new HelpMenuView();
	hmv.display();
}

}

    
    
