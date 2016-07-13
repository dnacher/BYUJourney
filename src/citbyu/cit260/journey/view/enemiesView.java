/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.exceptions.controlPlayerException;
import citbyu.cit260.journey.control.controlPlayer;

/**
 *
 * @author gus
 */
public class enemiesView extends View{
    
    public enemiesView(){
        super("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Enemies Menu                       |"
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
			this.saveFile1();                        
			break;
		case "P": // get and start an existing game
			this.printReport1();                        
			break;
		case "B": // display the help menu
			this.printAndSave1();                        
			break;
		default:
			this.console.println("\n*** Invalid selection *** Try again");
			break;
	}	
	return answer;
    }
    
    
    public void saveFile1(){
        this.console.println("\nEnter the name and path file where you want"
                                + "\nto save the Report");
        String filePath = this.getInput();
        
        try {           
           controlPlayer.printEnemiesReport(filePath);
           //controlGame.saveItems(filePath);
           this.console.println("The file was succesfully saved");
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
    }
    
    public void printReport1(){
        String str="";        
        try {        
            str= controlPlayer.ReportEnemies();
        } catch (controlPlayerException ex) {
            ex.getMessage();
        }
        
        
    this.console.print(str);
    }
    
    public void printAndSave1(){
        saveFile1();
        printReport1();        
    }
}
