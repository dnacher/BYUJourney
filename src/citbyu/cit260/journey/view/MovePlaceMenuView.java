/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class MovePlaceMenuView extends View{
    
    private final int I=1;
    private final int M=2;
    private final int G=3;
    private final int D=4;
    private final int C=5;
    
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
        setCurrentPlace(I);
    }
    
    public void Market(){
        setCurrentPlace(M);
    }
    
    public void Gates(){
        setCurrentPlace(G);
    }

    public void Dock(){
        setCurrentPlace(D);
    }
    
    public void Castle(){
        setCurrentPlace(C);
    }
    
    public void setCurrentPlace(int i){
         Journey.getPlayer().setCurrentPlace(i);
    }
}
