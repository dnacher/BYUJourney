/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author gus
 */
public class theDiceView implements Serializable {
  
    private int intDice;
    private String stringDice;

    /**
     * @return the intDice
     */
    public int getIntDice() {
        return intDice;
    }

    /**
     * @param intDice the intDice to set
     */
    public void setIntDice(int intDice) {
        this.intDice = intDice;
    }

    /**
     * @return the stringDice
     */
    public String getStringDice() {
        return stringDice;
    }

    /**
     * @param stringDice the stringDice to set
     */
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

