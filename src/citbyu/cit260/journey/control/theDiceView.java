/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.control;

import java.io.Serializable;

/**
 *
 * @author gus
 */
public class theDiceView implements Serializable {

    public static void setDice(int dice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    private int aDice;
    private String id;

   
    public int getaDice() {
        return aDice;
    }

    
    public void setaDice(int aDice) {
        this.aDice = aDice;
    }

   
    public String getId() {
        return id;
    }

   
    public void setId(String id) {
        this.id = id;
    }

    
    
    

    
}
