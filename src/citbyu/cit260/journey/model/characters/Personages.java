/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.model.characters;

import citbyu.cit260.journey.enums.Dialogs;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class Personages {
    
    private Dialogs dialog;
    private String name;
    private boolean done;

    public Dialogs getDialog() {
        return dialog;
    }

    public void setDialog(Dialogs dialog) {
        this.dialog = dialog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
    
    public Personages(){
    }
    
    public Personages(Dialogs dialog, String name, boolean done){
        this.dialog=dialog;
        this.name=name;
        done=false;
    }
}
