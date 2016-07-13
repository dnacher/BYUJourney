/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.Dice;
import citbyu.cit260.journey.control.controlPlayer;
import citbyu.cit260.journey.enums.Types;
import citbyu.cit260.journey.exceptions.NegativeValuesAtackException;
import citbyu.cit260.journey.model.characters.Warrior;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class AtackMenuView extends View{
 
    public static Warrior w;       
    public static Warrior enemyWarrior;     
    private final controlPlayer cp= new controlPlayer();
    Dice dice= new Dice();
    
    
     public AtackMenuView(){
    
        super("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Move Menu                       |"
                 +"\n----------------------------------"
                 +"\nS Summon Creature"
                 +"\nA Atack"
                 +"\nW Withdraw"
                 +"\nU Use/add Item"
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu"
                 +"\n");         
         if(w!=null){
             this.console.println(w.getWar().getName());
         }
            }
    
     @Override
    public boolean doAction(String menuOption){
       menuOption = menuOption.toUpperCase();
	boolean answer=false;
        if(w!=null){
        if(w.getCurrentHp()<=0){
            this.console.println("you lose");
            w=null;
            return true;
            
        }
        else if(enemyWarrior.getCurrentHp()<0){
        this.console.println("you win");
        w=null;
            return true;
        } 
        }
	switch (menuOption) {
                case "S": //create and start new game
                    if(w==null){
                        Summon();
                    }
                    else{
                        this.console.println("you already have a creature");
                    }
		
                        break;
		case "A": //create and start new game
			atack();
                        break;
		case "W": // get and start an existing game
			withdraw();                        
			break;
		case "U": // display the help menu
			spell();                        
			break;
		default:
			this.console.println("\n*** Invalid selection *** Try again");
			break;
	}	
	return answer;    
    }
   
private void atack() {
    if(w!=null){
        if(w.getCurrentHp()<=0 || enemyWarrior.getCurrentHp()<=0){
            if(w.getCurrentHp()<=0){
              this.console.println("You lose");  
            }
        }
        else{     
            try {
                enemyWarrior.setCurrentHp(cp.attack(w.getWar().getPower(), enemyWarrior.getWar().getArmor(), enemyWarrior.getCurrentHp()));
            } catch (NegativeValuesAtackException ex) {
                this.console.println(ex.getMessage());
            }   
            try {
                double armor=w.getWar().getArmor()*cp.calculateItems(Types.Armor);
                w.setCurrentHp(cp.attack(enemyWarrior.getWar().getPower(), (int)armor, w.getCurrentHp()));
            } catch (NegativeValuesAtackException ex) {
                this.console.println(ex.getMessage());
            }
    if(w.getCurrentHp()>0){
        this.console.println("You´re still alive");
    }
    else{
        this.console.println("You´re already dead");
    }
    this.console.println( "\n--------------------------------" +
                          "\nyour life is      " + w.getCurrentHp() + 
                          "\nthe enemy life is " + enemyWarrior.getCurrentHp() +
                          "\n--------------------------------");   
    }
    }
    else{
        this.console.println("\nYou don´t have a creature to atack" +
                             "\nSummon a crature with the option");       
    }
}

private void withdraw() {
    if(w!=null){
   if(Dice.probability(50)){
       this.console.println("The Enemy got you before you could withdraw");
       try {
           double armor=w.getWar().getArmor()*cp.calculateItems(Types.Armor);
           w.setCurrentHp(cp.attack(enemyWarrior.getWar().getPower(), (int)armor, w.getCurrentHp()));
       } catch (NegativeValuesAtackException ex) {
          this.console.println(ex.getMessage());
       }
    if(w.getCurrentHp()>0){
        this.console.println("You´re still alive");
    }
    else{
        this.console.println("Luckily you don´t have a creature yet. you can run now");
    }
   }
    this.console.println("\n--------------------------------" +
                       "\nyour life is      " + w.getCurrentHp() +
                       "\nthe enemy life is " + enemyWarrior.getCurrentHp() +
                       "\n--------------------------------");
    }
    else{
        this.console.println("--------------------------------");
    }
}

private void spell() {   
   
}

private void Summon(){
    addMana();
    this.console.println(Journey.getPlayer().getMyCharacter().getMana());
    SummonCreatureView scv= new SummonCreatureView();
    scv.display();
}

public void addMana(){
    int dicenum=dice.rollDices(Journey.getCurrentGame().getPlayer().getLevel());
    int mana=Journey.getPlayer().getMyCharacter().getMana();
    int total=dicenum+mana;
    Journey.getPlayer().getMyCharacter().setMana(total);
}

private void displayMainMenuView() {
	this.display();
}
}
