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
public enum ItemDescription {
    
    Diamond("",5),
    StoneDust("",10),
    StarDust("",20),
    Crown("",25),
    FusRohDah("",30),
    Heart("",5),
    Collar("",10),
    GoldStoneCollar("",20),
    BlackGoldCollar("",25),
    WalkingStick("",30),
    knife("",5),
    Sword("",10),
    GreatAxe("",20),
    LongBow("",25),
    WarHammer("",30),
    Helmet("",5),
    BreastPlate("",10),
    Shield("",20),
    Bracelet("",25),
    DiamondChest("",30),
    Map("",5),
    MagicStone("",10),
    Strength("",20),
    Horse("",25),
    GreatHorse("",30),
    Obsidian("",5),
    BlackStone("",10),
    BrightStone("",20),
    Ring("",25),    
    SilverStoneCollar("",30);
    
    private final String description;
    private final int percentage;
    
    private ItemDescription(String description, int percentage){
        this.description=description;
        this.percentage=percentage;
    }

    public String getDescription(){
        return description;
    }
    
    public int getPercentage(){
        return percentage;
    }

}
