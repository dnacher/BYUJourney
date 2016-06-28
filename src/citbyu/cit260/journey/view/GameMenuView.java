package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.ControlMap;
import citbyu.cit260.journey.control.controlGame;
import java.util.Scanner;

public class GameMenuView extends View{
    
    public GameMenuView(){
        super(    "\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Game Menu                       |"
                 +"\n----------------------------------"
                 +"\nM Display Map"
                 +"\nL Look for Items"
                 +"\nA Atack" 
                 +"\nS Save Game"
                 +"\nH Show items "
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu"
                 +"\n");
    }
    
    
    @Override
    public boolean doAction(String menuOption){
       menuOption = menuOption.toUpperCase();
	boolean answer=false;
	switch (menuOption) {
		case "M": //create and start new game
			/*MoveMapMenuView mmmv= new MoveMapMenuView();
                        mmmv.display();*/
                        ControlMap.createMap(Journey.getCurrentGame().getLocationList());
                        break;
		case "L": // get and start an existing game
			                       
			break;
		case "A": // display the help menu
			                       
			break;	
                case "S": // display the help menu
			                       
			break;	
                case "H": // display the help menu
			ShowItems();
			break;    
		default:
			System.out.println("\n*** Invalid selection *** Try again");
			break;
	}	
	return answer;
    }
    
    public void ShowItems(){    
        System.out.println("This option will show you the total of items in a particular level");
        System.out.println("Type a number from 0 to 4");
        Scanner keyboard = new Scanner(System.in);
        int value = keyboard.nextInt();
        controlGame.ReturnItemsbyLevel(value);   
        controlGame.ReturnTotalItemsByLevel(value);
    }
    
}
