/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.Dice;
import citbyu.cit260.journey.control.controlPlayer;
import citbyu.cit260.journey.exceptions.NegativeValuesAtackException;
import citbyu.cit260.journey.model.characters.Warrior;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class AtackMenuView extends View{
        
    
    private boolean lucky;   
    private boolean enemyLucky;
    
    
    public static Warrior w;       
    public static Warrior enemyWarrior;     
    private final controlPlayer cp= new controlPlayer();
    
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
             System.out.println(w.getWar().getName());
         }
            }
    
     @Override
    public boolean doAction(String menuOption){
       menuOption = menuOption.toUpperCase();
	boolean answer=false;
        if(w!=null){
        if(w.getCurrentHp()<=0){
            System.out.println("you lose");
            w=null;
            return true;
            
        }
        else if(enemyWarrior.getCurrentHp()<0){
        System.out.println("you win");
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
                        System.out.println("you already have a creature");
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
			System.out.println("\n*** Invalid selection *** Try again");
			break;
	}	
	return answer;    
    }
   
private void atack() {
    if(w!=null){
        if(w.getCurrentHp()<=0 || enemyWarrior.getCurrentHp()<=0){
           /* if(w.getCurrentHp()<=0){
              System.out.println("You lose");  
            }*/
        }
        else{
    lucky=cp.getLucky();    
            try {
                enemyWarrior.setCurrentHp(cp.attack(lucky, w.getWar().getPower(), enemyWarrior.getWar().getArmor(), enemyWarrior.getCurrentHp()));
            } catch (NegativeValuesAtackException ex) {
                System.out.println(ex.getMessage());
            }
    enemyLucky=cp.getLucky();
            try {
                w.setCurrentHp(cp.attack(enemyLucky, enemyWarrior.getWar().getPower(), w.getWar().getArmor(), w.getCurrentHp()));
            } catch (NegativeValuesAtackException ex) {
                System.out.println(ex.getMessage());
            }
    if(w.getCurrentHp()>0){
        System.out.println("You´re still alive");
    }
    else{
        System.out.println("You´re already dead");
    }
    System.out.println("--------------------------------");
    System.out.println("your life is " + w.getCurrentHp());
    System.out.println("the enemy life is " + enemyWarrior.getCurrentHp());
    System.out.println("--------------------------------");
    }
    }
    else{
        System.out.println("You don´t have a creature to atack");
        System.out.println("Summon a crature with the option");
    }
}

private void withdraw() {
    if(w!=null){
   if(Dice.probability(50)){
       System.out.println("The Enemy got you before you could withdraw");
       enemyLucky=cp.getLucky();
       try {
           w.setCurrentHp(cp.attack(enemyLucky, enemyWarrior.getWar().getPower(), enemyWarrior.getWar().getArmor(), w.getCurrentHp()));
       } catch (NegativeValuesAtackException ex) {
          System.out.println(ex.getMessage());
       }
    if(w.getCurrentHp()>0){
        System.out.println("You´re still alive");
    }
    else{
        System.out.println("Luckily you don´t have a creature yet. you can run now");
    }
   }
   System.out.println("--------------------------------");
    System.out.println("your life is " + w.getCurrentHp());
    System.out.println("the enemy life is " + enemyWarrior.getCurrentHp());
    System.out.println("--------------------------------");
    }
    else{
        System.out.println("--------------------------------");
    }
}

private void spell() {   
   
}

private void Summon(){
    addMana();
    System.out.println(Journey.getPlayer().getMyCharacter().getMana());
    SummonCreatureView scv= new SummonCreatureView();
    scv.display();
}

public void addMana(){
    int dice=Dice.rollDices(Journey.getCurrentGame().getPlayer().getLevel());
    int mana=Journey.getPlayer().getMyCharacter().getMana();
    int total=dice+mana;
    Journey.getPlayer().getMyCharacter().setMana(total);
}

private void displayMainMenuView() {
	this.display();
}
}
