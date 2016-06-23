package citbyu.cit260.journey.model;

import citbyu.cit260.journey.model.Player;

public class Game {
    
     private static Player player;
     private static String summonCreatures;

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Game.player = player;
    }

    public static String getSummonCreatures() {
        return summonCreatures;
    }

    public static void setSummonCreatures(String summonCreatures) {
        Game.summonCreatures = summonCreatures;
    }
     
     public Game(){
     }
     
     public Game(Player player, String summonCreatures){
     
         this.player=player;
         this.summonCreatures=summonCreatures;
           
     }
  
}

