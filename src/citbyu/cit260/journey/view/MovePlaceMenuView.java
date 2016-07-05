/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.controlGame;
import citbyu.cit260.journey.control.controlPlayer;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class MovePlaceMenuView extends View{
    
    private final int I=0;
    private final int M=1;
    private final int G=2;
    private final int D=3;
    private final int C=4;
    private controlPlayer cp= new controlPlayer(); 
    
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
                 +"\nQ Return Main Menu"
                 +"\n");            
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
        cp.enemy();
        controlGame.resetCount();
        OptionPlaceMenuView opmv= new OptionPlaceMenuView();
        opmv.display();
    }
    
    public void Market(){
        setCurrentPlace(M);
        cp.enemy();
        controlGame.resetCount();
        OptionPlaceMenuView opmv= new OptionPlaceMenuView();
        opmv.display();
    }
    
    public void Gates(){
        setCurrentPlace(G);
        cp.enemy();
        controlGame.resetCount();
        OptionPlaceMenuView opmv= new OptionPlaceMenuView();
        opmv.display();
    }

    public void Dock(){
        setCurrentPlace(D);
        cp.enemy();
        controlGame.resetCount();
        OptionPlaceMenuView opmv= new OptionPlaceMenuView();
        opmv.display();
    }
    
    public void Castle(){
        setCurrentPlace(C);
        cp.enemy();
        controlGame.resetCount();
        OptionPlaceMenuView opmv= new OptionPlaceMenuView();
        opmv.display();
    }
    
    public void setCurrentPlace(int i){
         Journey.getPlayer().setCurrentPlace(i);
    }
    
    
}
