package citbyu.cit260.journey.control;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.model.Game;
import citbyu.cit260.journey.model.Player;
import citbyu.cit260.journey.model.characters.Character;
import citbyu.cit260.journey.model.characters.enums.Warriors;

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
        int i=0;        
        try{
            i= Integer.parseInt(userInput);           
        }
        catch(Exception e){
            i=-1;
        }
        return i;
    }
    
    
}
