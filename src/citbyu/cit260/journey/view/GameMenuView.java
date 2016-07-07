package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.controlGame;
import citbyu.cit260.journey.exceptions.PlayerLevelControlException;
import citbyu.cit260.journey.model.map.Item;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                        //ControlMap.createMap(Journey.getCurrentGame().getLocationList());
                        break;
		case "L": // get and start an existing game
                    if(Journey.getCurrentGame().getCount()<3){
           try {
               LookForItem();
           } catch (PlayerLevelControlException ex) {
               System.out.println(ex.getMessage());
           }
                       controlGame.updateCount();
                    }
                    else{
                        System.out.println("You already search here. Please search somewhere else");
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
			System.out.println("\n*** Invalid selection *** Try again");
			break;
	}	
	return answer;
    }
    
    public void ShowItems(){    
        System.out.println("This option will show you the total of items in a particular level");
        System.out.println("Type a number from 0 to 4");        
        String value;
        try {
            value = keyboard.readLine();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        //controlGame.ReturnItemsbyLevel(value);   
        //controlGame.ReturnTotalItemsByLevel(value);        
        controlGame.returnTotalPercentage();
    }
    
    
    public void ShowMyInventory(){
        if(Journey.getPlayer().getInventory().size()>0){
            ShowMyInventoryView SMIV= new ShowMyInventoryView();
            SMIV.display();                        
        }
        else{
            System.out.println("\nYou don´t have items in your inventory yet." +
                                  "\nTo have items you´ll need to search items " +
                                  "\nor fight against enemies...");
            this.display();
        }       
    }
    
    public void LookForItem() throws PlayerLevelControlException{                 
            Item i= new Item();
            i.setName("noName");
            i=controlGame.looking();
            if (i.getName()!="noName"){
                OptionItemFoundedVIew OIFV= new OptionItemFoundedVIew(i);
                OIFV.display();
            }
            else{
                this.display();
            }            
    }
    
}
