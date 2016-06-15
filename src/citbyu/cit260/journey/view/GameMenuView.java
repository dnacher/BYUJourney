package citbyu.cit260.journey.view;

public class GameMenuView extends View{
    
    public GameMenuView(){
        super(    "\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Game Menu                       |"
                 +"\n----------------------------------"
                 +"\nM Map"
                 +"\nL Look for Items"
                 +"\nA Atack" 
                 +"\nS Save Game"
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu");
    }
    
    
    @Override
    public boolean doAction(String menuOption){
       menuOption = menuOption.toUpperCase();
	boolean answer=false;
	switch (menuOption) {
		case "M": //create and start new game
			MoveMapMenuView mmmv= new MoveMapMenuView();
                        mmmv.display();
                        break;
		case "L": // get and start an existing game
			                       
			break;
		case "A": // display the help menu
			                       
			break;	
                case "S": // display the help menu
			                       
			break;	
		default:
			System.out.println("\n*** Invalid selection *** Try again");
			break;
	}	
	return answer;
    }
    
}
