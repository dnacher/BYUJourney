package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.ControlMap;
import citbyu.cit260.journey.control.controlGame;
import citbyu.cit260.journey.control.controlPlayer;
import citbyu.cit260.journey.exceptions.PlayerLevelControlException;
import citbyu.cit260.journey.model.map.Item;

public class GameMenuView extends View{
    
    controlGame cg= new controlGame();
    controlPlayer cp= new controlPlayer();
    
    public GameMenuView(){
        super(    "\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Game Menu                       |"
                 +"\n----------------------------------"
                 +"\nD Display Map"
                 +"\nM Move"
                 +"\nL Look for Items"
                 +"\nA Atack" 
                 +"\nS Save Game"  
                 +"\nR Items Reports"
                + "\nI Show my Inventory and start using an item"
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu"
                 +"\n");
    }    
    
    @Override
    public boolean doAction(String menuOption){
       menuOption = menuOption.toUpperCase();
	boolean answer=false;
	switch (menuOption) {
                case "M": 
			MoveMapMenuView mmmv= new MoveMapMenuView();
                        mmmv.display();                       
                        break;
		case "D": 
                        ControlMap cm= new ControlMap();
                        String str=cm.createMap(Journey.getCurrentGame().getLocationList());                        
                        this.console.print(str);
                        break;
		case "L": 
                    if(Journey.getCurrentGame().getCount()<3){
                        try {
                            LookForItem();
                        } 
                        catch (PlayerLevelControlException ex) {
                            ErrorView.display(this.getClass().getName()+ " " ,ex.getMessage());
                        }
                    controlGame.updateCount();
                    }
                    else{
                        this.console.println("You already search here. Please search somewhere else");
                    }
			break;
		case "A": 
			atack();                       
			break;	
                case "S": 
			this.saveGame();                       
			break;
                case "I": 
			ShowMyInventory();
			break; 
                case "R": // save the current game
			saveItems();
			break;
		default:
			this.console.println("\n*** Invalid selection *** Try again");
			break;
	}	
	return answer;
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
          
        }       
    }
    
    public void LookForItem() throws PlayerLevelControlException{                 
            Item i= new Item();
            i.setName("noName");
            try{
                if(!cg.StillHaveItemsToFind()){
                    try{
                        cp.updateLevel();   
                        this.console.println("*****You reach one more level. Congratulation********");
                        this.console.println("***************Now you´re Level: " + Journey.getPlayer().getLevel() + " ******************");
                        this.console.println("*****************************************************");
                    }
                    catch(PlayerLevelControlException pl){
                        throw new PlayerLevelControlException(pl.getMessage());
                    }           
                }                 
            i=cg.looking();
            this.console.println("you find " + i.getName());               
            this.console.println(i.getDescription().getDescription());
            }
            catch(Exception ex){
                ex.getMessage();
            }
            if (!"noName".equals(i.getName())){
                OptionItemFoundedVIew OIFV= new OptionItemFoundedVIew(i);
                OIFV.display();
            }                 
    }
    
    private void saveGame() {
        
        this.console.println("\n\nEnter the file path for file where the game"
                                + "is to be saved");
        String filePath = this.getInput();
        
        try {
            controlGame.saveGame(Journey.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
     public void atack(){
        AtackMenuView amv= new AtackMenuView();
        amv.display();
    }
     
     private void saveItems() {
    ItemsView iv= new ItemsView();
    iv.display();
    }
    
}
