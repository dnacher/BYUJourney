/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.controlPlayer;
import citbyu.cit260.journey.model.characters.Warrior;
import citbyu.cit260.journey.enums.Warriors;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class SummonCreatureView extends View{
    
    Warrior w;
    
    public SummonCreatureView(){    
        super(Journey.getSummonCreatures());
    }
    
    @Override
    public boolean doAction(String menuOption){
        menuOption = menuOption.toUpperCase();
        boolean answer=false;
	switch (menuOption) {
                case "S": //create and start new game
			sOption();
                        break;
		case "A": //create and start new game
			aOption();
                        break;
		case "W": // get and start an existing game
			wOption();
			break;
		case "D": // display the help menu
			dOption();
			break;
		default:
			System.out.println("\n*** Invalid selection *** Try again");
			break;
	}
        return answer;
    }
    
    public void sOption(){
       if(canAfford(Warriors.SWORD_MAN.getMana())){
           controlPlayer cp= new controlPlayer();
           cp.chooseWarrior(1);           
           subtractMana(Warriors.SWORD_MAN.getMana());
           AtackMenuView amv=new AtackMenuView();
           amv.display();
       }       
    }
    
    public void aOption(){
        if(canAfford(Warriors.SPEAR_MAN.getMana())){
           controlPlayer cp= new controlPlayer();
           cp.chooseWarrior(2);
           subtractMana(Warriors.SWORD_MAN.getMana());
           AtackMenuView amv=new AtackMenuView();
           amv.display();
       }
    }
    
    public void wOption(){
        if(canAfford(Warriors.KNIGHT.getMana())){
           controlPlayer cp= new controlPlayer();
           cp.chooseWarrior(3); 
           subtractMana(Warriors.SWORD_MAN.getMana());
           AtackMenuView amv=new AtackMenuView();
           amv.display();
       }
    }
    
    public void dOption(){
        if(canAfford(Warriors.DRAGON.getMana())){
           subtractMana(Warriors.SWORD_MAN.getMana());
           AtackMenuView amv=new AtackMenuView();
           amv.display();
       }
    }
    
    public boolean canAfford(int manaNeeded){
    boolean answer= false;
    if(Journey.getPlayer().getMyCharacter().getMana()>=manaNeeded){
        subtractMana(manaNeeded);
        answer=true;
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
