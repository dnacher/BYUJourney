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
public enum ItemDescription {
    
    Diamond(""),
    StoneDust(""),
    StarDust(""),
    Crown(""),
    FusRohDah(""),
    Heart(""),
    Collar(""),
    GoldStoneCollar(""),
    BlackGoldCollar(""),
    WalkingStick(""),
    knife(""),
    Sword(""),
    GreatAxe(""),
    LongBow(""),
    WarHammer(""),
    Helmet(""),
    BreastPlate(""),
    Shield(""),
    Bracelet(""),
    DiamondChest(""),
    Map(""),
    MagicStone(""),
    Strength(""),
    Horse(""),
    GreatHorse(""),
    Obsidian(""),
    BlackStone(""),
    BrightStone(""),
    Ring(""),    
    SilverStoneCollar("");
    
    private final String description;
    
    private ItemDescription(String description){
        this.description=description;
    }

    public String getDescription(){
        return description;
    }

}
