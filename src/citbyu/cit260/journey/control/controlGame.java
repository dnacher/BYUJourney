package citbyu.cit260.journey.control;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.model.Game;
import citbyu.cit260.journey.model.Player;
import citbyu.cit260.journey.model.characters.Character;
import citbyu.cit260.journey.model.characters.enums.ItemDescription;
import citbyu.cit260.journey.model.characters.enums.Warriors;
import citbyu.cit260.journey.model.map.Item;
import java.util.ArrayList;

public class controlGame {
    
   /* public static int bringIdPlayer(){
    
        int ret= Game.getInstance().getIdPlayer();
        updateIdPlayer();
    
        return ret;
    }
    
    public static void updateIdPlayer(){
        Game.getInstance().setIdPlayer(Game.getInstance().getIdPlayer() + 1);
    }*/
    
    
    public static void createNewGame(String name){      
        if(name==null){
            System.out.println("The Name cannot be null");
        }
        
        Player player= new Player();
        Character ch= new Character(100, 0, 0,"Human", 1);
        player.setMyCharacter(ch);
        player.setName(name);  
        player.setCurrentPlace(3);
        player.setCurrentPlace(3);
        Journey.setPlayer(player);
        Game game= new Game(player, name);
        Journey.setCurrentGame(game);
    }   
    
    public static void createString(int Character){
        switch(Character){
            case 1:
                Journey.setSummonCreatures("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Summon Creature Menu            |"
                 +"\n----------------------------------"
                 +"\n--Creature            Mana Needed-"
                 +"\nS Sword Man                   " + Warriors.SWORD_MAN.getMana()
                 +"\nA Spear Man                   " + Warriors.SPEAR_MAN.getMana()
                 +"\nW Knight                      " + Warriors.KNIGHT.getMana()
                 +"\nD Dragon                      " + Warriors.DRAGON.getMana()
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu"
                 +"\n");
                break;
            case 2:
                Journey.setSummonCreatures("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Summon Creature Menu            |"
                 +"\n----------------------------------"
                 +"\n--Creature            Mana Needed-"
                 +"\nS Elf bow                     " + Warriors.ELF_BOW.getMana()
                 +"\nA Spear Elf                   " + Warriors.SPEAR_ELF.getMana()
                 +"\nW Horse Elf                   " + Warriors.HORSE_ELF.getMana()
                 +"\nD Dragon                      " + Warriors.DRAGON.getMana()
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu"
                 +"\n");
                break;
            case 3:
                Journey.setSummonCreatures("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Summon Creature Menu            |"
                 +"\n----------------------------------"
                 +"\n--Creature            Mana Needed-"
                 +"\nS Wizard                      " + Warriors.WIZARD.getMana()
                 +"\nA Grey Wizard                 " + Warriors.GREY_WIZARD.getMana()
                 +"\nW Air Wizard                  " + Warriors.AIR_WIZARD.getMana()
                 +"\nD Dragon                      " + Warriors.DRAGON.getMana()
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu"
                 +"\n");
                break;
        }
    }      
    
    public static int checkMenu(int size, int menuChoice){
        if(menuChoice<=size && menuChoice>0){
            return menuChoice;
        }
        else{
            return -1;
        }
    }
    
    public static int checkint(String userInput){
        int i;        
        try{
            i= Integer.parseInt(userInput);           
        }
        catch(Exception e){
            i=-1;
        }
        return i;
    }
    
    /*
    Types:
    0 magic
    1 spell
    2 power
    3 armor
    4 map
    5 search*/
    public static ArrayList<Item> CreateItemList(){
      ArrayList<Item> list= new ArrayList<>();
      //             id     desc     inuse lev descrp                                  type
      Item i1=new Item(0, "Diamond", false, 0, ItemDescription.Diamond.getDescription(), 0);
      list.add(i1);
      Item i2=new Item(1, "Stone Dust", false, 1, ItemDescription.StoneDust.getDescription(), 0);
      list.add(i2);
      Item i3=new Item(2, "Star Dust", false, 2, ItemDescription.StarDust.getDescription(), 0);
      list.add(i3);
      Item i4=new Item(3, "Crown", false, 3, ItemDescription.Crown.getDescription(), 0);
      list.add(i4);
      Item i5=new Item(4, "Fus Roh Dah", false, 4, ItemDescription.FusRohDah.getDescription(), 0);
      list.add(i5);
      Item i6=new Item(5, "Heart", false, 0, ItemDescription.Heart.getDescription(), 1);
      list.add(i6);
      Item i7=new Item(6, "Collar", false, 1, ItemDescription.Collar.getDescription(), 1);
      list.add(i7);
      Item i8=new Item(7, "Gold Stone Collar", false, 2, ItemDescription.GoldStoneCollar.getDescription(), 1);
      list.add(i8);
      Item i9=new Item(8, "Black Gold Collar", false, 3, ItemDescription.BlackGoldCollar.getDescription(), 1);
      list.add(i9);
      Item i10=new Item(9, "Walking Stick", false, 4, ItemDescription.WalkingStick.getDescription(), 1);
      list.add(i10);
      Item i11=new Item(10, "knife", false, 0, ItemDescription.knife.getDescription(), 2);
      list.add(i11);
      Item i12=new Item(11, "Sword", false, 1, ItemDescription.Sword.getDescription(), 2);
      list.add(i12);      
      Item i13=new Item(12, "Great Axe", false, 2, ItemDescription.GreatAxe.getDescription(), 2);
      list.add(i13);
      Item i14=new Item(13, "Long Bow", false, 3, ItemDescription.LongBow.getDescription(), 2);
      list.add(i14);
      Item i15=new Item(14, "WarHammer", false, 4, ItemDescription.WarHammer.getDescription(), 2);
      list.add(i15);
      Item i16=new Item(15, "Helmet", false, 0, ItemDescription.Helmet.getDescription(), 3);
      list.add(i16);
      Item i17=new Item(16, "Breast Plate", false, 1, ItemDescription.BreastPlate.getDescription(), 3);
      list.add(i17);
      Item i18=new Item(17, "Shield", false, 2, ItemDescription.Shield.getDescription(), 3);
      list.add(i18);
      Item i19=new Item(18, "Bracelet", false, 3, ItemDescription.Bracelet.getDescription(), 3);
      list.add(i19);
      Item i20=new Item(19, "Diamond Chest", false, 4, ItemDescription.DiamondChest.getDescription(), 3);
      list.add(i20);
      Item i21=new Item(20, "Map", false, 0, ItemDescription.Map.getDescription(), 4);
      list.add(i21);
      Item i22=new Item(21, "Magic Stone", false, 1, ItemDescription.MagicStone.getDescription(), 4);
      list.add(i22);
      Item i23=new Item(22, "Strength", false, 2, ItemDescription.Strength.getDescription(), 4);
      list.add(i23);
      Item i24=new Item(23, "Horse", false, 3, ItemDescription.Horse.getDescription(), 4);
      list.add(i24);
      Item i25=new Item(24, "Great Horse", false, 4, ItemDescription.GreatHorse.getDescription(), 4);
      list.add(i25);
      Item i26=new Item(25, "Obsidian", false, 0, ItemDescription.Obsidian.getDescription(), 5);
      list.add(i26);
      Item i27=new Item(26, "Black Stone", false, 1, ItemDescription.BlackStone.getDescription(), 5);
      list.add(i27);
      Item i28=new Item(27, "Bright Stone", false, 2, ItemDescription.BrightStone.getDescription(), 5);
      list.add(i28);
      Item i29=new Item(28, "Ring", false, 3, ItemDescription.Ring.getDescription(), 5);
      list.add(i29);
      Item i30=new Item(29, "Silver Stone Collar", false, 4, ItemDescription.SilverStoneCollar.getDescription(), 5);
      list.add(i30);      
      return list;
    }
    
    public static void ReturnItemsbyLevel(int Level){
        for(Item item: Journey.getCurrentGame().getItems()){
            if(item.getLevel()==Level){
                System.out.println(item.getName());
            }
        }
    }
    
    
}
