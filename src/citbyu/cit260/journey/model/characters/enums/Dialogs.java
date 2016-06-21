/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.model.characters.enums;

/**
 *
 * @author Dani-Fla-Mathi
 */
public enum Dialogs {
    
    OldMan("test"),
    Wizard(""),
    dwarf(""),
    nordicMan(""),
    Carpenter(""),
    BlackSmith(""),
    DragonHunter(""),
    Farmer(""),
    Soldier(""),
    RetiredSoldier("I used to be an adventurer like you, but then I took an arrow in the knee"),
    Hunter(""),
    DragonBorn("You´ll find the light stone in the dragon nest, but you´ll need to kill the dragon"),
    Elf(""),
    SailorMan(""),
    ShipCaptain("");
    
    private final String speach;
    
    private Dialogs(String speach){
    this.speach=speach;
}

public String getSpeach(){
    return speach;
}
}
