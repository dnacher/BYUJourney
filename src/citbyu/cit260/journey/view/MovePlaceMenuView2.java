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
public class MovePlaceMenuView2 extends View{
    
    public MovePlaceMenuView2(){        
                super("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Move Menu                       |"
                 +"\n----------------------------------"
                 +"\nI Inn"
                 +"\nM Market"
                 +"\nW Wall"
                 +"\nF Farm"                 
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
		case "W": // display the help menu
			Wall();
			break;
		case "F": // save the current game
			Farm();
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
    
    public void Wall(){
    
    }

    public void Farm(){
    
    }
    
    public void Castle(){
    
    }
}
