package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.controlGame;
import java.util.Scanner;

public class HelpMenuView {
    
    private String menu;
    
    
    public HelpMenuView(){
    
        this.menu="\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Help Menu                       |"
                 +"\n----------------------------------"
                 +"\nG Goal of the Game"
                 +"\nP How to play the Game"
                 +"\nN How to Start a new Game"
                 +"\nS How to save a Game"
                 +"\nQ Quit Game"
                 +"\n----------------------------------";
    }
    
    void displayMainMenuView(){
        boolean done = false;
        do{
            String menuOption=this.getMenuOption();            
            if(menuOption.toUpperCase().equals("Q")){
               MainMenuView MV=new MainMenuView();
               MV.displayMainMenuView();
            }
            done= this.doAction(menuOption);
        }
        while(!done);
        
    }
    
    private String getMenuOption(){
        //System.out.println("**GetMenuOption**");
        //return "N";
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
