/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.controlGame;
import citbyu.cit260.journey.control.controlPlayer;
import citbyu.cit260.journey.exceptions.PlayerLevelControlException;
import citbyu.cit260.journey.model.characters.Personages;
import citbyu.cit260.journey.enums.Types;
import citbyu.cit260.journey.model.map.Item;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class OptionPlaceMenuView extends View{
    
    controlGame cg= new controlGame();
    controlPlayer cp= new controlPlayer();
    
    public OptionPlaceMenuView(){
        super("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Move Menu                       |"
                 +"\n----------------------------------"
                 +"\nA Atack"
                 +"\nT Talk"                    
                 +"\nL Look Item"
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu"
                 +"\n");
    }
    
    @Override
    public boolean doAction(String menuOption) {
         menuOption = menuOption.toUpperCase();
	boolean answer=false;
	switch (menuOption) {
		case "A": //create and start new game                       
			atack();                        
                        break;
		case "T": // get and start an existing game
			talk();
			break;	
                case "L":           
                        lookForItem();         
			break;	    	    
		default:
			this.console.println("\n*** Invalid selection *** Try again");
			break;
	}        
	return answer;
    }
    
    public void atack(){
        AtackMenuView amv= new AtackMenuView();
        amv.display();
    }
    
    public void talk() {    
        if(Journey.getPlayer().getCurrentCity()== Types.DragonLand.getValue()){
            this.console.println("You´re not welcome here....run away. this place is dangerous");
        }
        else{
        try{
        Personages p=controlPlayer.getPersonages();
        this.console.println("\n" + p.getName());
        this.console.println("\n" + p.getDialog().getSpeach());
        }
        catch(Exception ex){
            this.console.println(ex.getMessage());
            if(!controlPlayer.stillHavePersonages()){
                controlPlayer.resetListPersonages();
            }
            
        }
        }
    }
    
     public void lookForItem(){
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
                this.console.println(ex.getMessage());
            }
            if (!"noName".equals(i.getName())){
                OptionItemFoundedVIew OIFV= new OptionItemFoundedVIew(i);
                OIFV.display();
            }    
     }
    
}
