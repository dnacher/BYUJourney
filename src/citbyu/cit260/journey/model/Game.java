package citbyu.cit260.journey.model;

public class Game {
    
     private Player player;
     private String summonCreatures;

    public Player getPlayer() {
        return player;
    }
    
     public String getSummonCreatures() {
        return summonCreatures;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setSummonCreatures(String summonCreatures) {
        this.summonCreatures = summonCreatures;
    }
     
     public Game(){
     }
     
     public Game(Player player, String summonCreatures){
     
         this.player=player;
         this.summonCreatures=summonCreatures;
           
     }
  
}

