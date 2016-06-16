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
public class MovePlaceMenuView2 extends View{
    
    private final int I=1;
    private final int M=2;
    private final int W=3;
    private final int F=4;
    private final int C=5;
    
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
			System.out.println("\n*** Invalid selection *** Try again");
			break;
	}        
	return answer;
    }
    
    public void Inn(){
        setCurrentPlace(I);
        OptionPlaceMenuView opmv= new OptionPlaceMenuView();
        opmv.display();
    }
    
    public void Market(){
        setCurrentPlace(M);
        OptionPlaceMenuView opmv= new OptionPlaceMenuView();
        opmv.display();
    }
    
    public void Wall(){
        setCurrentPlace(W);
        OptionPlaceMenuView opmv= new OptionPlaceMenuView();
        opmv.display();
    }

    public void Farm(){
        setCurrentPlace(F);
        OptionPlaceMenuView opmv= new OptionPlaceMenuView();
        opmv.display();
    }
    
    public void Castle(){
        setCurrentPlace(C);
        OptionPlaceMenuView opmv= new OptionPlaceMenuView();
        opmv.display();
    }
    
    public void setCurrentPlace(int i){
         Journey.getPlayer().setCurrentPlace(i);
    }
}
