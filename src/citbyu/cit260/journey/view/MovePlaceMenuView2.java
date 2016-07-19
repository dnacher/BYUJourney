/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.ControlMap;
import citbyu.cit260.journey.control.controlGame;
import citbyu.cit260.journey.control.controlPlayer;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class MovePlaceMenuView2 extends View{
    
    private final int I=0;
    private final int M=1;
    private final int W=2;
    private final int F=3;
    private final int C=4;
    private final controlPlayer cp= new controlPlayer();
    
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
			this.console.println("\n*** Invalid selection *** Try again");
			break;
	}        
	return answer;
    }
    
    public void Inn(){
        setCurrentPlace(I);
        cp.enemy();
        print();
        controlGame.resetCount();
        OptionPlaceMenuView opmv= new OptionPlaceMenuView();
        opmv.display();
    }
    
    public void Market(){
        setCurrentPlace(M);
        cp.enemy();
        print();
        controlGame.resetCount();
        OptionPlaceMenuView opmv= new OptionPlaceMenuView();
        opmv.display();
    }
    
    public void Wall(){
        setCurrentPlace(W);
        cp.enemy();
        print();
        controlGame.resetCount();
        OptionPlaceMenuView opmv= new OptionPlaceMenuView();
        opmv.display();
    }

    public void Farm(){
        setCurrentPlace(F);
        cp.enemy();
        print();
        controlGame.resetCount();
        OptionPlaceMenuView opmv= new OptionPlaceMenuView();
        opmv.display();
    }
    
    public void Castle(){
        setCurrentPlace(C);
        cp.enemy();
        print();
        controlGame.resetCount();
        OptionPlaceMenuView opmv= new OptionPlaceMenuView();
        opmv.display();
    }
    
    public void setCurrentPlace(int i){
         Journey.getPlayer().setCurrentPlace(i);
         ControlMap.updateMap(Journey.getPlayer().getCurrentCity(), Journey.getPlayer().getCurrentPlace());
    }
    
     public void print(){
        this.console.println("\nyou have Mana: " + Journey.getPlayer().getMyCharacter().getMana() +
                             "\nif you want to fight there are a " + AtackMenuView.enemyWarrior.getWar().getName() + " warrior in this place");
    }
}
