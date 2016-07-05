/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.controlPlayer;
import citbyu.cit260.journey.model.map.Item;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class ShowMyInventoryView extends View{
    
    boolean answer=false; 
    
    public ShowMyInventoryView(){
        super("Select the number of the item you want to start using it");
        controlPlayer.PrintInventory();
        
    }
    
    @Override
    public boolean doAction(String menuOption){
        menuOption = menuOption.toUpperCase(); 
        int number=getDoubleNumber(menuOption);        
	       
        if(number>Journey.getPlayer().getInventory().size() || number<0 && number!=-999){
              System.out.println("\nEnter a valid number" 
                        + "\nTry again or enter Q to quit");
        }
        else{
              number-=1;
              Item i=Journey.getPlayer().getInventory().get(number);
              i.setInUse(true);
              Journey.getPlayer().getInventory().set(number, i);
        }
        return answer;        
    } 
    
   @Override
    public void display() {
        boolean done = false;
        if(Journey.getPlayer().getInventory().size()<1){
            done=true;
        }
        
        do {
            //prompt for and get player name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                    return;
            // do the requested action and display next view
            done = this.doAction(value);
        } while (!done); // exit the view when done == true
    } 
    
      public int getDoubleNumber(String menuOption) {
        int number = -999;        
            while (number == -999) {                              
                if (menuOption.equals("Q"))
                    break;
            try {
                number = Integer.parseInt(menuOption);
                
            } catch (NumberFormatException nf) {
                
                System.out.println("\nYou must enter a valid number" 
                        + "\nTry again or enter Q to quit");
                break;
            }
            }            
            return number;           
    }
}
