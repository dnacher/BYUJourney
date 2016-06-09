/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import java.util.Scanner;

/**
 *
 * @author gus
 */
public class WizardDwarfDialogue {

    private final String menu;
    
    public WizardDwarfDialogue(){
    
        this.menu="\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Dwarf|"
                 +"\n Hello fellow stranger, what can I do for you?"
                 +"\n----------------------------------"
                 +"\n"
                 +"\n"
                 +"\n              Wizard:             "
                 +"\n"
                 +"\nA). I don't want to talk to you!"
                 +"\n"
                 +"\nB). Hello, Dwarf! Can you tell me How much wood would a woodchuck  chuck, if a woodchuck could chuck wood?"
                 +"\n"
                 +"\n"
                 +"\nQ Return "
                 +"\n----------------------------------";
    }
    
    public void displayWizardDwarfDialogue(){
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
        //System.out.println("**GetMenuOption**");
        //return "N";
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
	boolean answer=true;
	switch (menuOption) {
		case "A": //Option A
			System.out.println("\n Good luck with that");
			break;
		case "B": //Option B
			System.out.println("\nAs much wood As a woodchuck  would, if a woodchuck  could chuck wood.");
			break;
		default:
			System.out.println("\n*** Invalid selection *** Try again");
			break;
	}	
	return answer;
    }
}
