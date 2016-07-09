/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.controlGame;
import citbyu.cit260.journey.exceptions.ControlGameException;
import citbyu.cit260.journey.model.map.Item;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class ItemsView extends View{
    
    public ItemsView(){
        super("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Items Menu                       |"
                 +"\n----------------------------------"
                 +"\nS Save File in the Hard Disk"
                 +"\nP Only print the information"
                 +"\nB Print and save the Report"
                 +"\n----------------------------------"
                 +"\n");
    }
    
    @Override
    public boolean doAction(String menuOption){
       menuOption = menuOption.toUpperCase();
	boolean answer=false;
	switch (menuOption) {
		case "S": //create and start new game
			this.saveFile();                        
			break;
		case "P": // get and start an existing game
			this.printReport();                        
			break;
		case "B": // display the help menu
			this.printAndSave();                        
			break;
		default:
			this.console.println("\n*** Invalid selection *** Try again");
			break;
	}	
	return answer;
    }
    
    
    public void saveFile(){
        this.console.println("\nEnter the name and path file where you want"
                                + "\nto save the Report");
        String filePath = this.getInput();
        
        try {           
           controlGame.printItemsReport(filePath);
           //controlGame.saveItems(filePath);
           this.console.println("The file was succesfully saved");
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
    }
    
    public void printReport(){
        String str="";        
        try {        
            str= controlGame.ReportItems();
        } catch (ControlGameException ex) {
            ex.getMessage();
        }
        
        
    this.console.print(str);
    }
    
    public void printAndSave(){
        saveFile();
        printReport();        
    }
}
