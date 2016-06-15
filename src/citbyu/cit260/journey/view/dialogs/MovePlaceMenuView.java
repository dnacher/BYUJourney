/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view.dialogs;

import citbyu.cit260.journey.view.View;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class MovePlaceMenuView extends View{
    
    public MovePlaceMenuView(){
    
            super("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Move Menu                       |"
                 +"\n----------------------------------"
                 +"\nN North Town"
                 +"\nD Dragon Land"
                 +"\nE Edelion"
                 +"\nT Eten Ty"
                 +"\nH Hidden Forest"
                 +"\nS South Port"                        
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu");
    
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
