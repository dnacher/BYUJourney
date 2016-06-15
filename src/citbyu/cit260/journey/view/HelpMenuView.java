package citbyu.cit260.journey.view;

public class HelpMenuView extends View{
    
    public HelpMenuView(){
    
        super("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Help Menu                       |"
                 +"\n----------------------------------"
                 +"\nG Goal of the Game"
                 +"\nP How to play the Game"
                 +"\nN How to Start a new Game"
                 +"\nS How to save a Game"
                 +"\nQ Quit Menu"
                 +"\n----------------------------------");
    }   
    
    @Override
    public boolean doAction(String menuOption){
       menuOption = menuOption.toUpperCase();
	boolean answer=false;
	switch (menuOption) {
		case "G": //create and start new game
			this.GoalGame();
                        //answer=false;
			break;		
		case "P": // display the help menu
			this.howToPlay();
                        //answer=true;
			break;
                case "N": // display the help menu
			this.howStartNewGame();
                        //answer=true;
			break;
		
		case "S": // save the current game
			this.howStartNewGame();
                        //answer=true;
			break;
		default:
			System.out.println("\n*** Invalid selection *** Try again");
			break;
	}	
	return answer;
    }
    
     private void GoalGame() {
        System.out.println("*** You will need to recover the stolen light stones. to do that you will need to travel around the world and talk to creatures in this amazing world ***");
    }

    private void howToPlay() {
	System.out.println("*** read all the option in every menu and select an option typing a correct letter ***");
    }

    private void howStartNewGame() {
	System.out.println("*** in the Main Menu type 'N' and then Enter ***");
    }

    private void howSaveGame() {
	System.out.println("*** in the Main Menu type 'S' and then Enter ***");
    }

}
