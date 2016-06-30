/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

/**
 *
 * @author gustavomartinez
 */
public class chooseRace2 {
    
    
    
    public Double getDoubleNumber() {
        Double nubmer = null;
            while (number == null) {
                String value = this.getInput();
                value = value.trim()toUpperCase();
                
                if (value.equals("Q"))
                    break;
                number = Double.parseDouble(value);
            }
            
            return number;
            
            try {
                number = Double.parseDouble(value);
                
            } catch (NumberFormatException nf) {
                
                System.out.println("\nYou must enter a valid number" 
                        + "Try again or enter Q to quit");
            }
    }
    
}
