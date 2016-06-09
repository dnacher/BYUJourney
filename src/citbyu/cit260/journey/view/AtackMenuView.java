/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.control.Dice;
import citbyu.cit260.journey.control.controlPlayer;
import java.util.Scanner;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class AtackMenuView {
    
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
    
        this.menu="\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Move Menu                       |"
                 +"\n----------------------------------"
                 +"\nA Atack"
                 +"\nW Withdraw"
                 +"\nU Use Spell"
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu";
            }
    
    public void displayMoveMenuView(){
        boolean done = false;
        do{
            String menuOption=this.getMenuOption();            
            if(menuOption.toUpperCase().equals("Q"))
                return;
            
            done= this.doAction(menuOption);
        }
        while(!done);
        
    }
    
    private String getMenuOption(){
       Scanner keyboard= new Scanner(System.in);
       String value="";
       boolean valid= false;
       
       while(!valid){
           System.out.println(menu);
           value=keyboard.nextLine();
           value=value.trim().toUpperCase();
           
           if(value.length()<1){
               System.out.println("\nInvalid value: value can not be blank");
               continue;
           }
           break;
       }
       return value;
        
    }
    
    private boolean doAction(String menuOption){
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
			this.atack();
                        break;
		case "W": // get and start an existing game
			this.withdraw();                        
			break;
		case "U": // display the help menu
			this.spell();                        
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
	MainMenuView MV= new MainMenuView();
        MV.displayMainMenuView();
}
}
