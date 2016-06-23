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
    
    OldMan("test",""),
    Wizard("",""),
    dwarf("As much wood As a woodchuck  would, if a woodchuck  could chuck wood.","Good luck with that"),
    nordicMan("",""),
    Carpenter("",""),
    BlackSmith("",""),
    DragonHunter("",""),
    Farmer("",""),
    Soldier("",""),
    RetiredSoldier("I used to be an adventurer like you, but then I took an arrow in the knee",""),
    Hunter("",""),
    DragonBorn("You´ll find the light stone in the dragon nest, but you´ll need to kill the dragon",""),
    Elf("",""),
    SailorMan("",""),
    ShipCaptain("","");
    
    private final String speach;
    private final String speach2;
    
    private Dialogs(String speach, String speach2){
    this.speach=speach;
    this.speach2=speach2;
}

public String getSpeach(){
    return speach;
}

public String getSpeach2(){
    return speach2;
}
}
