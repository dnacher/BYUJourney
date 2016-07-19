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
public class introductionView extends View{
    
    public introductionView(String str){
        super(str);
    }
    
    @Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase(); 
        int number=getIntNumber(menuOption);        
	boolean answer=false;	
	switch (number) {
		case 1:                      
                    this.console.println("\nyou choose the right option. now you will be able to help all races to" +
                                         "\nkeep the peace if you succeed in this journey finding the light stones" +
                                         "\nYou can start searching where you are now. (Edelion) or look somewhere else"+
                                         "\n"+
                                         "\nThere will be two ways to find items in the game"+
                                         "\n       1)using the look for item in the game"+
                                         "\n       2) fighting against enemies to recover what they stole");  
                    answer=true;
                    startGame();
                    break;
		case 2: 
                    this.console.println("\nWe don´t have much time...you will need to answer now.");   
                    break;
                case 3:
                    this.console.println("\nYou and your company was ambushed.  Unfortunately no one survived"+
                                         "\n*****************************************************************"+
                                         "\n**************************THE END********************************"+
                                         "\n*****************************************************************");
                    answer=true;
                    Journey.setCurrentGame(null);    
                    Journey.startGame();
		default:
                    this.console.println("\n*** Invalid selection *** Try again");
                    break;
	}        
	return answer;
    }
    
     public void startGame(){
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
     
      public int getIntNumber(String menuOption) {
        int number = -999;
            while (number == -999) {                              
                if (menuOption.equals("Q"))
                    break;
            try {
                number = Integer.parseInt(menuOption);
                
            } catch (NumberFormatException nf) {
                
                this.console.println("\nYou must enter a valid number" 
                        + "\nTry again or enter Q to quit");
                break;
            }
            }            
            return number;           
    }
    
}
