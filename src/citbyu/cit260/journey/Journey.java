package citbyu.cit260.journey;

import citbyu.cit260.journey.model.Player;
import citbyu.cit260.journey.model.game.Game;
import citbyu.cit260.journey.view.StartProgramView;

public class Journey {     
    
    private static Game currentGame= null;
    private static Player player= null;
    private static String summonCreatures="";

    public static String getSummonCreatures() {
        return summonCreatures;
    }

    public static void setSummonCreatures(String summonCreatures) {
        Journey.summonCreatures = summonCreatures;
    }
    
    public static void setCurrentGame(Game currentGame){
        Journey.currentGame=currentGame;
    }
    
    public static Player getPlayer(){
        return player;
    }
    
    public static void setPlayer(Player player){
        Journey.player=player;
    }
    

    public static void main(String[] args) {
       
        StartProgramView spv= new StartProgramView();
        spv.display();    
               
    }
    
    
}
