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
public class MovePlaceMenuView extends View{
    
    public MovePlaceMenuView(){        
                super("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Move Menu                       |"
                 +"\n----------------------------------"
                 +"\nI Inn"
                 +"\nM Market"
                 +"\nG Gates"
                 +"\nD Dock"                 
                 +"\nC Castle"                        
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu");              
        }

    @Override
    public boolean doAction(String menuOption) {
         menuOption = menuOption.toUpperCase();
	boolean answer=false;
	switch (menuOption) {
		case "I": //create and start new game                       
			Inn();
                        break;
		case "M": // get and start an existing game
			Market();
			break;
		case "G": // display the help menu
			Gates();
			break;
		case "D": // save the current game
			Dock();
			break;
                case "C": // save the current game
			Castle();
			break;		
		default:
			System.out.println("\n*** Invalid selection *** Try again");
			break;
	}        
	return answer;
    }
    
    public void Inn(){
    
    }
    
    public void Market(){
    
    }
    
    public void Gates(){
    
    }

    public void Dock(){
    
    }
    
    public void Castle(){
    
    }
}
