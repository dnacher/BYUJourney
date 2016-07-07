/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.model.map.Item;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class OptionItemFoundedVIew extends View{
    
    private Item it= new Item();
    
    public OptionItemFoundedVIew(Item i){
        super("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Item Founded                    |"
                 +"\n----------------------------------"
                 +"\n1 Keep the Item"
                 +"\n2 Start using the item"
                 +"\n3 Discard Item" 
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu"
                 +"\n");
        it=i;
    }
    
    
    @Override
    public boolean doAction(String menuOption){
   menuOption = menuOption.toUpperCase(); 
        int number=getDoubleNumber(menuOption);        
	boolean answer=false;
        if(number>3 || number<1 && number!=-999){
              this.console.println("\nEnter a valid number" 
                        + "\nTry again or enter Q to quit");
        }
        else{
	switch (number) {
		case 1:  
                        Journey.getPlayer().getInventory().add(it);
                        return true;  
		case 2: 
                        it.setInUse(true);
                        Journey.getPlayer().getInventory().add(it);
			return true;  
		case 3: 
                        this.console.println("you discard the item");
			return true;                                      
        }
        }
        return answer;        
    } 
    
      public int getDoubleNumber(String menuOption) {
        int number = -999;
            while (number == -999) {                              
                if (menuOption.equals("Q"))
                    break;
            try {
                number = Integer.parseInt(menuOption);
                
            } catch (NumberFormatException nf) {
                
                this.console.println("\nYou must enter a valid option" 
                                 + "\nType one of the numbers in the menu"
                                 + "\nor enter Q to quit");
                break;
            }
            }            
            return number;           
    }
    
    
}
