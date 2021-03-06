/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.control.ControlDialog;
import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.model.characters.Character;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class SelectRaceMenuView extends View{
    
    ControlDialog dialog= new ControlDialog();
    
    private Character ch= new Character(100,0,"no name",-1);
    
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
        int number=getIntNumber(menuOption);        
	boolean answer=false;
        if(number>3 || number<1 && number!=-999){
              this.console.println("\nEnter a valid number" 
                        + "\nTry again or enter Q to quit");
        }
        else{
	switch (number) {
		case 1: //create and start new game  
                        ch.setId(1);
                        ch.setName("Human");
                        console.println(dialog.PrintRace(number));
			Journey.getPlayer().setMyCharacter(ch); 
                        introductionView iv= new introductionView(dialog.HumanStart());
                        iv.display();
                        startGame();
                        break;
		case 2: // get and start an existing game
                        ch.setId(2);
                        ch.setName("Elf");
                        console.println(dialog.PrintRace(number));
                        this.console.println("");
			Journey.getPlayer().setMyCharacter(ch);   
                        introductionView iv2= new introductionView(dialog.ElfStart());
                        iv2.display();
                        startGame();
			break;
		case 3: // display the help menu
                        ch.setId(3);
                        ch.setName("Wizard");
                        console.println(dialog.PrintRace(number));
                        this.console.println("");
			Journey.getPlayer().setMyCharacter(ch);  
                        introductionView iv3= new introductionView(dialog.WizardStart());
                        iv3.display();
                        startGame();
			break;                
        }
        }
        return answer;        
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
    
    public void startGame(){
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
}
