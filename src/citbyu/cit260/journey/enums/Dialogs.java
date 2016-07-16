/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.enums;

/**
 *
 * @author Dani-Fla-Mathi
 */
public enum Dialogs {
    
    OldMan("That there’s some good in this world,and it’s worth fighting for.","A balanced diet is a cookie in each hand"),
    Wizard("All of the information is there, except for the information that isn't.","If you aren’t careful, you can loos the game"),
    dwarf("As much wood As a woodchuck  would, if a woodchuck  could chuck wood.","Even the smallest person can change the course of the future."),
    nordicMan("Great!, let´s go. we can´t wait no more","That answer suprised me, but you´re free. good luck!"),
    Carpenter("Every nail driven should be as another rivet in the machine of the universe", "Patience is never more important than when you are on the verge of losing it"),
    BlackSmith("Chuck Norris tears can cure cancer, but he never cries.","Metal working territory, what are you think I can do for you?"),
    DragonHunter("So comes snow after fire, and even dragons have their endings.","Life’s hard; get a helmet"),
    Farmer("I've always said I want a farmer, not a hunter. Hunters go for the kill and they move on. A farmer nurtures; he watches things grow.",""),
    Soldier("When I lost my rifle, the Army charged me 85 dollars. That is why in the Navy the Captain goes down with the ship","Bravery is being the only one who knows you're afraid."),
    RetiredSoldier("I used to be an adventurer like you, but then I took an arrow in the knee","If the enemy is in range, so are you"),
    Hunter("I do not hunt for the joy of killing but for the joy of living","Opportunities always look bigger going than coming"),
    DragonBorn("You´ll find the light stone in the dragon nest, but you´ll need to kill the dragon","He has no enemies but is intensely disliked by his friends"),
    Elf("Elves are cool, man.","I can’t understand a word you’re saying"),
    SailorMan("Land was created to provide a place for boats to visit.","Fish and visitors stink after three days."),
    ShipCaptain("Inspiration is one thing and you can't control it, but hard work is what keeps the ship moving","Good luck means, work hard. Keep up the good work. ");
    
    
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
