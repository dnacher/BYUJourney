package citbyu.cit260.journey.model;

import java.io.Serializable;

/**
 *
 * @author gus
 */
public class theDice implements Serializable {
  
    private int intDice;
    private String stringDice;

    
    public int getIntDice() {
        return intDice;
    }

    
    public void setIntDice(int intDice) {
        this.intDice = intDice;
    }

   
    public String getStringDice() {
        return stringDice;
    }

    
    public void setStringDice(String stringDice) {
        this.stringDice = stringDice;
    }
    
    
    public theDice(){
        
    }
    
    public theDice(int intDice, String stringDice){
        this.intDice = intDice;
        this.stringDice = stringDice;
    }
    
    
}

