/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.Dice;
import citbyu.cit260.journey.control.controlPlayer;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class AtackMenuView extends View{
    
    private String menu;
    private int power=30;
    private boolean lucky;
    private int armor=10;
    private double life=100;
    private int enemyPower=15;
    private boolean enemyLucky;
    private int enemyArmor=8;
    private double enemyLife=80;   
    
    
     public AtackMenuView(){
    
        super("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Move Menu                       |"
                 +"\n----------------------------------"
                 +"\nA Atack"
                 +"\nW Withdraw"
                 +"\nU Use Spell"
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu");
        
         System.out.println("Mana: " + Journey.getPlayer().getMyCharacter().getMana());
            }
    
     @Override
    public boolean doAction(String menuOption){
       menuOption = menuOption.toUpperCase();
	boolean answer=false;
        if(life<=0){
            System.out.println("you lose");
            return true;
            
        }
        else if(enemyLife<0){
        System.out.println("you win");
            return true;
        }
        else{
	switch (menuOption) {
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
    }
   
private void atack() {
    controlPlayer cp= new controlPlayer();    
    lucky=cp.getLucky();
    enemyLife=cp.attack(lucky, power, armor, enemyLife);
    enemyLucky=cp.getLucky();
    life=cp.attack(enemyLucky, enemyPower, enemyArmor, life);
    if(life>0){
        System.out.println("You´re still alive");
    }
    else{
        System.out.println("You´re already dead");
    }
    System.out.println("--------------------------------");
    System.out.println("your life is " + life);
    System.out.println("the enemy life is " + enemyLife);
    System.out.println("--------------------------------");
        
}

private void withdraw() {
   controlPlayer cp= new controlPlayer();  
   if(Dice.probability(50)){
       System.out.println("The Enemy got you before you could withdraw");
       enemyLucky=cp.getLucky();
    life=cp.attack(enemyLucky, enemyPower, enemyArmor, life);
    if(life>0){
        System.out.println("You´re still alive");
    }
    else{
        System.out.println("You´re already dead");
    }
   }
   System.out.println("--------------------------------");
    System.out.println("your life is " + life);
    System.out.println("the enemy life is " + enemyLife);
    System.out.println("--------------------------------");
}

private void spell() {
    controlPlayer cp= new controlPlayer();    
    lucky=Dice.probability(80);
    enemyLife=cp.attack(lucky, power, armor, enemyLife);
    enemyLucky=cp.getLucky();
    life=cp.attack(enemyLucky, enemyPower, enemyArmor, life);
    if(life>0){
        System.out.println("You´re still alive");
    }
    else{
        System.out.println("You´re already dead");
    }
    System.out.println("--------------------------------");
    System.out.println("your life is " + life);
    System.out.println("the enemy life is " + enemyLife);
    System.out.println("--------------------------------");
}

private void displayMainMenuView() {
	this.display();
}
}
