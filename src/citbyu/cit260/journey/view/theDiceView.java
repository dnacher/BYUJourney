package citbyu.cit260.journey.view;

import java.io.Serializable;

/**
 *
 * @author gus
 */
public class theDiceView implements Serializable {
  
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
    
    
    public theDiceView(){
        
    }
    
    public theDiceView(int intDice, String stringDice){
        this.intDice = intDice;
        this.stringDice = stringDice;
    }
    
    
}

