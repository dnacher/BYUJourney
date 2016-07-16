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
                    this.console.println("\nyou start fighting bravely in the wall and your army win the battle..."+
                                         "\nThe captain told you about a powerful stones that were stolen."+
                                         "\nSince you win the battle, you´re call to recover those stones"+
                                         "\nYou can start searching where you are now. (Edelion) or look somewhere else"+
                                         "\n"+
                                         "\nThere will be two ways to find items in the game"+
                                         "\n       1)using the look for item in the game"+
                                         "\n       2) fighting against enemies to recover what they stole");  
                    answer=true;
                    startGame();
                    break;
		case 2: 
                    this.console.println("\nYes, but we don´t have much time...you will need to answer quickly."+
                                         "\nWe are being attacked in the wall and in the north"+
                                         "\nThere are a big army marching to the north"+
                                         "\nand we are fighting here in the wall"+
                                         "\nWhere do you want to fight?");   
                    break;
                case 3:
                    this.console.println("\nIn the north the fight was very hard. sadly you caouldn´t live..."+
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
