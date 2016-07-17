/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.enums;

import citbyu.cit260.journey.Journey;

/**
 *
 * @author Dani-Fla-Mathi
 */
public enum Dialogs {
    
    OldMan("That there’s some good in this world,and it’s worth fighting for."),
    OldMan2("A balanced diet is a cookie in each hand"),
    Wizard("All of the information is there, except for the information that isn't."),
    Wizard2("If you aren’t careful, you can lose the game"),
    dwarf("As much wood As a woodchuck  would, if a woodchuck  could chuck wood."),
    dwarf2("Even the smallest person can change the course of the future."),
    nordicMan("Great!, I love adventures. Let´s go. we can´t wait no more"),
    nordicMan2("That great sword suprised me, you´re free now. good luck!"),
    Carpenter("Every nail driven should be as another rivet in the machine of the universe"),
    Carpenter2("Patience is never more important than when you are on the verge of losing it"),
    BlackSmith("Chuck Norris tears can cure cancer, but he never cries."),
    BlackSmith2("Metal working territory, what are you think I can do for you?"),
    DragonHunter("So comes snow after fire, and even dragons have their endings."),
    DragonHunter2("Life’s hard; get a helmet"),
    Farmer("Luke I´m your father.....oh aren´t you luke? sorry, my bad..."),
    Farmer2("I've always said I want a farmer, not a hunter. Hunters go for the kill and they move on. A farmer nurtures; he watches things grow."),
    Soldier("Bravery is being the only one who knows you're afraid."),
    Soldier2("When I lost my rifle, the Army charged me 85 dollars. That is why in the Navy the Captain goes down with the ship"),
    RetiredSoldier("If the enemy is in range, so are you"),
    RetiredSoldier2("I used to be an adventurer like you, but then I took an arrow in the knee"),
    Hunter("Opportunities always look bigger going than coming"),
    Hunter2("I do not hunt for the joy of killing but for the joy of living"),
    DragonBorn("He has no enemies but is intensely disliked by his friends"),
    DragonBorn2("You´ll find the light stone in the dragon nest, but you´ll need to kill the dragon first"),
    Elf("I can’t understand a word you’re saying"),
    Elf2("Elves are cool, man."),
    SailorMan("Fish and visitors stink after three days."),
    SailorMan2("Land was created to provide a place for boats to visit."),
    ShipCaptain("Good luck means, work hard. Keep up the good work. "),
    ShipCaptain2("Inspiration is one thing and you can't control it, but hard work is what keeps the ship moving");
    
    private final String speach;
    
    
    private Dialogs(String speach){
    this.speach=speach;    
    }

    public String getSpeach(){
        return speach;
    }
    
}
