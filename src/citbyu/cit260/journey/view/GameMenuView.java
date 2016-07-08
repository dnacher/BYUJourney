package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.controlGame;
import citbyu.cit260.journey.exceptions.PlayerLevelControlException;
import citbyu.cit260.journey.model.map.Item;
import java.io.IOException;

public class GameMenuView extends View{
    
    controlGame cg= new controlGame();
    
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
                + "\nI Show my Inventory and use an item"
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
			MoveMapMenuView mmmv= new MoveMapMenuView();
                        mmmv.display();
                        //ControlMap cm= new ControlMap();
                       // cm.createMap(Journey.getCurrentGame().getLocationList());
                        //ControlMap.createMap(Journey.getCurrentGame().getLocationList());
                        break;
		case "L": // get and start an existing game
                    if(Journey.getCurrentGame().getCount()<3){
           try {
               LookForItem();
           } catch (PlayerLevelControlException ex) {
               ErrorView.display(this.getClass().getName()+ " " ,ex.getMessage());
           }
                       controlGame.updateCount();
                    }
                    else{
                        this.console.println("You already search here. Please search somewhere else");
                    }
			break;
		case "A": // display the help menu
			                       
			break;	
                case "S": // display the help menu
			                       
			break;	
                case "H": // display the help menu
			ShowItems();
			break;   
                case "I": // display the help menu
			ShowMyInventory();
			break;       
		default:
			this.console.println("\n*** Invalid selection *** Try again");
			break;
	}	
	return answer;
    }
    
    public void ShowItems(){    
        this.console.println("\nThis option will show you the total of items in a particular level" +
                              "\nType a number from 0 to 4");                
        String value;
        try {
            value = keyboard.readLine();
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName() + " ",ex.getMessage());
        }
        //controlGame.ReturnItemsbyLevel(value);   
        //controlGame.ReturnTotalItemsByLevel(value);        
        cg.returnTotalPercentage();
    }
    
    
    public void ShowMyInventory(){
        if(Journey.getPlayer().getInventory().size()>0){
            ShowMyInventoryView SMIV= new ShowMyInventoryView();
            SMIV.display();                        
        }
        else{
            this.console.println("\nYou don´t have items in your inventory yet." +
                                  "\nTo have items you´ll need to search items " +
                                  "\nor fight against enemies...");
            this.display();
        }       
    }
    
    public void LookForItem() throws PlayerLevelControlException{                 
            Item i= new Item();
            i.setName("noName");
            i=cg.looking();
            if (i.getName()!="noName"){
                OptionItemFoundedVIew OIFV= new OptionItemFoundedVIew(i);
                OIFV.display();
            }
            else{
                this.display();
            }            
    }
    
}
