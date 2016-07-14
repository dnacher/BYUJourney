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
    
    Diamond("This will help you with magic"),
    StoneDust("This will help you with magic"),
    StarDust("This will help you with magic"),
    Crown("This will help you with magic"),
    FusRohDah("This will help you with magic"),
    Heart("This will help you with spells"),
    Collar("This will help you with spells"),
    GoldStoneCollar("This will help you with spells"),
    BlackGoldCollar("This will help you with spells"),
    WalkingStick("This will help you with spells"),
    knife("This will help you with the power of your atack"),
    Sword("This will help you with the power of your atack"),
    GreatAxe("This will help you with the power of your atack"),
    LongBow("This will help you with the power of your atack"),
    WarHammer("This will help you with the power of your atack"),
    Helmet("This will help you with your armor"),
    BreastPlate("This will help you with your armor"),
    Shield("This will help you with your armor"),
    Bracelet("This will help you with your armor"),
    DiamondChest("This will help you with your armor"),
    Map("This will help you with your travels"),
    MagicStone("This will help you with your travels"),
    Strength("This will help you with your travels"),
    Horse("This will help you with your travels"),
    GreatHorse("This will help you with your travels"),
    Obsidian("This will help you with your searchings"),
    BlackStone("This will help you with your searchings"),
    BrightStone("This will help you with your searchings"),
    Ring("This will help you with your searchings"),    
    SilverStoneCollar("This will help you with your searchings");
    
    private final String description;
   
    
    private ItemDescription(String description){
        this.description=description;
       
    }

    public String getDescription(){
        return description;
    }   
    

}
