/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.model.characters.Character;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class SelectRaceMenuView extends View{
    
    private Character ch= new Character(100,0,0,"no name",-1);
    
    public SelectRaceMenuView(){
        super("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Select Race                     |"
                 +"\n----------------------------------"
                 +"\n1 Human" 
                 +"\n2 Elf" 
                 +"\n3 Wizard"                                   
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu");
    }    
       
    @Override
    public boolean doAction(String menuOption){
        menuOption = menuOption.toUpperCase(); 
        int number=getDoubleNumber(menuOption);        
	boolean answer=false;
        if(number>3 || number<1 && number!=-999){
              System.out.println("\nEnter a valid number" 
                        + "\nTry again or enter Q to quit");
        }
        else{
	switch (number) {
		case 1: //create and start new game  
                        ch.setId(1);
                        ch.setName("Human");
			Journey.getPlayer().setMyCharacter(ch);                        
                        startGame();
                        break;
		case 2: // get and start an existing game
                        ch.setId(2);
                        ch.setName("Elf");
			Journey.getPlayer().setMyCharacter(ch);                           
                        startGame();
			break;
		case 3: // display the help menu
                        ch.setId(3);
                        ch.setName("Wizard");
			Journey.getPlayer().setMyCharacter(ch);                         
                        startGame();
			break;                
        }
        }
        return answer;        
    } 
    
      public int getDoubleNumber(String menuOption) {
        int number = -999;
            while (number == -999) {                              
                if (menuOption.equals("Q"))
                    break;
            try {
                number = Integer.parseInt(menuOption);
                
            } catch (NumberFormatException nf) {
                
                System.out.println("\nYou must enter a valid number" 
                        + "\nTry again or enter Q to quit");
                break;
            }
            }            
            return number;           
    }
    
    public void startGame(){
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
}
