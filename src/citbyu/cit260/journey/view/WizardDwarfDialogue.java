/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.enums.Dialogs;

/**
 *
 * @author gus
 */

public class WizardDwarfDialogue extends View{
    
    public WizardDwarfDialogue(){
    
        super("\n"
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
                 +"\n----------------------------------"
                 +"\n");
    }
    
    @Override
    public boolean doAction(String menuOption){
       menuOption = menuOption.toUpperCase();
	boolean answer=true;
	switch (menuOption) {
		case "A": //Option A
			this.console.println(Dialogs.dwarf2.getSpeach());
			break;
		case "B": //Option B
			this.console.println(Dialogs.dwarf.getSpeach());
			break;
		default:
			this.console.println("\n*** Invalid selection *** Try again");
			break;
	}	
	return answer;
    }
}
