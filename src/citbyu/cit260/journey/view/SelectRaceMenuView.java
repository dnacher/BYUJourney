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
                 +"\nH Human" 
                 +"\nE Elf" 
                 +"\nW Wizard"                                   
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu");
    }    
       
    @Override
    public boolean doAction(String menuOption){
       menuOption = menuOption.toUpperCase();      
	boolean answer=false;
	switch (menuOption) {
		case "H": //create and start new game  
                        ch.setId(1);
                        ch.setName("Human");
			Journey.getPlayer().setMyCharacter(ch);                        
                        startGame();
                        break;
		case "E": // get and start an existing game
                        ch.setId(2);
                        ch.setName("Elf");
			Journey.getPlayer().setMyCharacter(ch);                           
                        startGame();
			break;
		case "W": // display the help menu
                        ch.setId(3);
                        ch.setName("Wizard");
			Journey.getPlayer().setMyCharacter(ch);                         
                        startGame();
			break;			
		default:
			System.out.println("\n*** Invalid selection *** Try again");
			break;
	}        
        return answer;        
    }    
    
    public void startGame(){
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
}
