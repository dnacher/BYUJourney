/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.control.controlGame;
import citbyu.cit260.journey.exceptions.PlayerLevelControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class OptionPlaceMenuView extends View{
    
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
                case "L": {
             try {
                 // get and start an existing game
                 lookForItem();
             } catch (PlayerLevelControlException ex) {
                 Logger.getLogger(OptionPlaceMenuView.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
			break;	    	    
		default:
			System.out.println("\n*** Invalid selection *** Try again");
			break;
	}        
	return answer;
    }
    
    public void atack(){
        AtackMenuView amv= new AtackMenuView();
        amv.display();
    }
    
    public void talk(){
    
    }
    
     public void lookForItem() throws PlayerLevelControlException{
       controlGame.looking();
    }
    
}
