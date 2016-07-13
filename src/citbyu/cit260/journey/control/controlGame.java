package citbyu.cit260.journey.control;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.model.Game;
import citbyu.cit260.journey.model.Player;
import citbyu.cit260.journey.model.characters.Character;
import citbyu.cit260.journey.enums.ItemDescription;
import citbyu.cit260.journey.enums.Warriors;
import citbyu.cit260.journey.exceptions.ControlGameException;
import citbyu.cit260.journey.exceptions.PlayerLevelControlException;
import citbyu.cit260.journey.model.map.Item;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class controlGame {
    
    protected final BufferedReader keyboard=Journey.getInFile();
    protected final PrintWriter console=Journey.getOutFile();
    controlPlayer cp= new controlPlayer();
    
   /* public static int bringIdPlayer(){
    
        int ret= Game.getInstance().getIdPlayer();
        updateIdPlayer();
    
        return ret;
    }
    
    public static void updateIdPlayer(){
        Game.getInstance().setIdPlayer(Game.getInstance().getIdPlayer() + 1);
    }*/
    
    
    public void createNewGame(String name){      
        if(name==null){
            this.console.println("The Name cannot be null");
        }
        
        Player player= new Player();
        Character ch= new Character(100, 0, 0,"Human", 1);
        player.setMyCharacter(ch);
        player.setName(name);  
        player.setCurrentPlace(3);
        player.setCurrentPlace(3);
        Journey.setPlayer(player);
        Game game= new Game(player, name);
        //create a test for the player
        ArrayList<Item> list= new ArrayList<>();
        Journey.getCurrentGame().getPlayer().setInventory(list);
        Journey.getCurrentGame().setItems(CreateItemList());
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
      //               id     desc   inuse lev descrp                  type
      Item i1=new Item(0, "Diamond", false, 0, ItemDescription.Diamond, 0);
      list.add(i1);
      Item i2=new Item(1, "Stone Dust", false, 1, ItemDescription.StoneDust, 0);
      list.add(i2);
      Item i3=new Item(2, "Star Dust", false, 2, ItemDescription.StarDust, 0);
      list.add(i3);
      Item i4=new Item(3, "Crown", false, 3, ItemDescription.Crown, 0);
      list.add(i4);
      Item i5=new Item(4, "Fus Roh Dah", false, 4, ItemDescription.FusRohDah, 0);
      list.add(i5);
      Item i6=new Item(5, "Heart", false, 0, ItemDescription.Heart, 1);
      list.add(i6);
      Item i7=new Item(6, "Collar", false, 1, ItemDescription.Collar, 1);
      list.add(i7);
      Item i8=new Item(7, "Gold Stone Collar", false, 2, ItemDescription.GoldStoneCollar, 1);
      list.add(i8);
      Item i9=new Item(8, "Black Gold Collar", false, 3, ItemDescription.BlackGoldCollar, 1);
      list.add(i9);
      Item i10=new Item(9, "Walking Stick", false, 4, ItemDescription.WalkingStick, 1);
      list.add(i10);
      Item i11=new Item(10, "knife", false, 0, ItemDescription.knife, 2);
      list.add(i11);
      Item i12=new Item(11, "Sword", false, 1, ItemDescription.Sword, 2);
      list.add(i12);      
      Item i13=new Item(12, "Great Axe", false, 2, ItemDescription.GreatAxe, 2);
      list.add(i13);
      Item i14=new Item(13, "Long Bow", false, 3, ItemDescription.LongBow, 2);
      list.add(i14);
      Item i15=new Item(14, "WarHammer", false, 4, ItemDescription.WarHammer, 2);
      list.add(i15);
      Item i16=new Item(15, "Helmet", false, 0, ItemDescription.Helmet, 3);
      list.add(i16);
      Item i17=new Item(16, "Breast Plate", false, 1, ItemDescription.BreastPlate, 3);
      list.add(i17);
      Item i18=new Item(17, "Shield", false, 2, ItemDescription.Shield, 3);
      list.add(i18);
      Item i19=new Item(18, "Bracelet", false, 3, ItemDescription.Bracelet, 3);
      list.add(i19);
      Item i20=new Item(19, "Diamond Chest", false, 4, ItemDescription.DiamondChest, 3);
      list.add(i20);
      Item i21=new Item(20, "Map", false, 0, ItemDescription.Map, 4);
      list.add(i21);
      Item i22=new Item(21, "Magic Stone", false, 1, ItemDescription.MagicStone, 4);
      list.add(i22);
      Item i23=new Item(22, "Strength", false, 2, ItemDescription.Strength, 4);
      list.add(i23);
      Item i24=new Item(23, "Horse", false, 3, ItemDescription.Horse, 4);
      list.add(i24);
      Item i25=new Item(24, "Great Horse", false, 4, ItemDescription.GreatHorse, 4);
      list.add(i25);
      Item i26=new Item(25, "Obsidian", false, 0, ItemDescription.Obsidian, 5);
      list.add(i26);
      Item i27=new Item(26, "Black Stone", false, 1, ItemDescription.BlackStone, 5);
      list.add(i27);
      Item i28=new Item(27, "Bright Stone", false, 2, ItemDescription.BrightStone, 5);
      list.add(i28);
      Item i29=new Item(28, "Ring", false, 3, ItemDescription.Ring, 5);
      list.add(i29);
      Item i30=new Item(29, "Silver Stone Collar", false, 4, ItemDescription.SilverStoneCollar, 5);
      list.add(i30);      
      return list;
    }
    
    public void ReturnItemsbyLevel(int Level){
        for(Item item: Journey.getCurrentGame().getItems()){
            if(item.getLevel()==Level){
                this.console.println(item.getName());
            }
        }
    }
    
    public void ReturnTotalItemsByLevel(int Level){
        int total=0;
        for(Item item: Journey.getCurrentGame().getItems()){
            if(item.getLevel()==Level){
                total+=1;
            }
        }
        this.console.println("The total of items with level " + Level +" is " + total);    
    }
    
    public void returnTotalPercentage(){
      ArrayList<Item> list= new ArrayList<>();
      Item i19=new Item(18, "Bracelet", false, 3, ItemDescription.Bracelet, 3);
      list.add(i19);
      Item i20=new Item(19, "Diamond Chest", false, 4, ItemDescription.DiamondChest, 3);
      list.add(i20);
      Item i5=new Item(4, "Fus Roh Dah", false, 4, ItemDescription.FusRohDah, 0);
      list.add(i5);
      Item i6=new Item(5, "Heart", false, 0, ItemDescription.Heart, 1);
      list.add(i6);
      Item i7=new Item(6, "Collar", false, 1, ItemDescription.Collar, 1);
      list.add(i7);
      Item i23=new Item(22, "Strength", false, 2, ItemDescription.Strength, 4);
      list.add(i23);
      Item i24=new Item(23, "Horse", false, 3, ItemDescription.Horse, 4);
      list.add(i24);
      Item i25=new Item(24, "Great Horse", false, 4, ItemDescription.GreatHorse, 4);
      list.add(i25);
      Item i26=new Item(25, "Obsidian", false, 0, ItemDescription.Obsidian, 5);
      list.add(i26);
        int total=0;
        for(int i=0; i<list.size();i++){
            total=list.get(i).getDescription().getPercentage() + total;
        }
        this.console.println("the total percentage is " + total);
    }
    
    public boolean StillHaveItemsToFind() throws PlayerLevelControlException{
        boolean stillHave=false;
        for(Item item: Journey.getCurrentGame().getItems()){
            if(item.getLevel()==Journey.getPlayer().getLevel()){
                if(!item.isFound()){
                    stillHave=true;
                    return stillHave;
                }
            }
        }
        if(!stillHave){
            try{
                cp.updateLevel();
            }
            catch(PlayerLevelControlException pl){
                this.console.println(pl.getMessage());
            }
           
        }
        return stillHave;
    }  

    public Item ChooseItem() {
        boolean found=true;
        int number=0;
        while(found){
            number=Dice.rollDice() -1;
            number= ((number) * 5) + Journey.getPlayer().getLevel();
            try{
            found=Journey.getCurrentGame().getItems().get(number).isFound();             
            Journey.getCurrentGame().getItems().get(number).setFound(true); 
            }
            catch(Exception e){
                this.console.println("You didn´t find anything here..."); 
                Item i= new Item();
                i.setName(" ");
                return i;
            }
           
        }   
             return Journey.getCurrentGame().getItems().get(number);  
    }
    
    public Item looking() throws PlayerLevelControlException {
        StillHaveItemsToFind();
        Item item=ChooseItem();
        if(cp.lookForItem(Journey.getPlayer().getLevel())){            
            if(item.getId()!=-1){
                this.console.println("you find " + item.getName());
            }           
        }
        else{
            this.console.println("You didn´t find anything here...");
        }
        return item;
    }
    
    public static void updateCount(){
    
        int num=Journey.getCurrentGame().getCount();
        num+=1;
        Journey.getCurrentGame().setCount(num);
    }
    
    public static void resetCount(){        
        Journey.getCurrentGame().setCount(1);
    }

    public static void saveGame(Game game, String filePath) throws ControlGameException {
                 
        try(FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);            
            output.writeObject(game);
        }
        catch(Exception e) {
            throw new ControlGameException(e.getMessage());
        }        
    }
    
    
    public static void getExistingGame(String filepath)
                    throws ControlGameException {
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filepath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game =(Game) input.readObject();   
        }
        catch(Exception e) {
            throw new ControlGameException(e.getMessage());
        }
        Journey.setCurrentGame(game);
    }
    
    public static void saveItems(String filePath) throws ControlGameException {
                 
            FileWriter outfile= null;
            ObjectOutputStream output =null;
        try{
            outfile=new FileWriter(filePath);
            outfile.write(ReportItems());         
            outfile.flush();            
        }
        catch(Exception e) {
            throw new ControlGameException(e.getMessage());
        }        
        finally{
            if(outfile!=null){
                try {
                    outfile.close();
                    
                } catch (IOException e) {
                    throw new ControlGameException(e.getMessage());
                }
            }
        }
    }
    
    public static void printItemsReport(String ouputLocation)throws ControlGameException{
        PrintWriter out=null;
        try{
            out= new PrintWriter(ouputLocation);
            out.println("\n\n        Item Inventory         ");
            out.printf("%n%-20s%5s%8s","Name","Level"," Type ");
            out.printf("%n%-20s%5s%8s","-------------------","-----","------");
            for(Item i: Journey.getCurrentGame().getItems()){
                out.printf("%n%-20s%5s%8s",i.getName(),i.getLevel(), GetTypeName(i.getType()));                
            }            
        }
        catch(IOException e){
            throw new ControlGameException(e.getMessage());
        }
        finally{
            if(out!=null){
                out.close();
            }
        }
    }
    
    public static String ReportItems() throws ControlGameException{
        String str="\n\n        Item Inventory         ";
        str+= String.format("%n%-20s%5s%8s","Name","Level"," Type ");
        str+=String.format("%n%-20s%5s%8s","-------------------","-----","------");        
        try{
        for(Item i: Journey.getCurrentGame().getItems()){
                str+=String.format("%n%-20s%5s%8s",i.getName(),i.getLevel(), controlGame.GetTypeName(i.getType()));                
            }
        }
        catch(Exception e){
            throw new ControlGameException(e.getMessage());
        }
        return str;
    }
    
     /*
    Types:
    0 magic
    1 spell
    2 power
    3 armor
    4 map
    5 search*/
    public static String GetTypeName(int type){
        String Type="";
        switch(type){
            case 0:
                Type="Magic";
                break;
            case 1:
                Type="Spell";
                break;
            case 2:
                Type="Power";
                break;
            case 3:
                Type="Armor";
                break;
            case 4:
                Type="Map";
                break;
            case 5:
                Type="Search";
                break;
        }
        return Type;
        }
    }
    
