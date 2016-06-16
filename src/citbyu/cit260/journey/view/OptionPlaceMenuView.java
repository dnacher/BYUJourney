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
                 +"\nQ Return Main Menu");
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
                case "L": // get and start an existing game
			lookItem();
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
    
    public void lookItem(){}
    
}
