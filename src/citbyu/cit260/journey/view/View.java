/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author gustavomartinez
 */
    public abstract class View implements ViewInterface {
        protected String displayMessage;
        
        protected final BufferedReader keyboard= Journey.getInFile();
        protected final PrintWriter console= Journey.getOutFile();
         
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        boolean done = false;
        do {
            //prompt for and get player name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                    return;            
            // do the requested action and display next view
            done = this.doAction(value);
        } while (!done); // exit the view when done == true
    }
    
    @Override
    public String getInput() {    
        
        boolean valid = false;
        String value = null;
        
        //while a valid name has not been retrived
        while (!valid) {        
            //prompt for the playes's name
            System.out.print("\n" + this.displayMessage);         
            try {
                //get the value entered from the keyboard
                value = this.keyboard.readLine();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            value = value.trim();            
            if(value.length() < 1){
                System.out.println("\n*** You must enter a value ***");
                continue;
            }            
            break;             
        }        
        return value; // return name
    } 
    
}
    

