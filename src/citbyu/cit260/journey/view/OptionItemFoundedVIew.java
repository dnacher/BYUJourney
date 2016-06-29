/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class OptionItemFoundedVIew extends View{
    
    public OptionItemFoundedVIew(){
        super("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Item Founded                    |"
                 +"\n----------------------------------"
                 +"\nK Keep the Item"
                 +"\nU Start using the item"
                 +"\nD Discard Item" 
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu"
                 +"\n");
    }
    
    @Override
    public boolean doAction(String menuOption){
    menuOption = menuOption.toUpperCase();
	boolean answer=false;
	switch (menuOption) {
		case "K": //create and start new game
			
                        break;
		case "U": // get and start an existing game
                  
                  
			break;
		case "D": // display the help menu
			                       
			break;	                  
		default:
			System.out.println("\n*** Invalid selection *** Try again");
			break;
	}	
	return answer;
    }
    
    
}
