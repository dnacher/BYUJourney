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
public class SummonCreatureView extends View{
    
    public SummonCreatureView(){    
        super(Journey.getSummonCreatures());
    }
    
    @Override
    public boolean doAction(String menuOption){
        menuOption = menuOption.toUpperCase();
        boolean answer=false;
	switch (menuOption) {
                case "S": //create and start new game
			
                        break;
		case "A": //create and start new game
			
                        break;
		case "W": // get and start an existing game
			                       
			break;
		case "D": // display the help menu
			                     
			break;
		default:
			System.out.println("\n*** Invalid selection *** Try again");
			break;
	}
        return answer;
    }
    
    public void sOption(){
        
    }
    
    public void aOption(){
    
    }
    
    public void wOption(){
    
    }
    
    public void dOption(){
    
    }
    
    public boolean canAfford(int manaNeeded){
    boolean answer= false;
    if(Journey.getPlayer().getMyCharacter().getMana()>=manaNeeded){
        subtractMana(manaNeeded);
    }
    else{
        System.out.println("you don´t have enough Mana to summon this creature");
        System.out.println("choose another one or roll dices to add Mana");
    }
    return answer;
    }

    private void subtractMana(int manaNeeded) {
        int totalMana=Journey.getPlayer().getMyCharacter().getMana();
        int total=totalMana-manaNeeded;
        Journey.getPlayer().getMyCharacter().setMana(manaNeeded);        
    }
}
