package citbyu.cit260.journey;

import citbyu.cit260.journey.model.Player.Player;
import citbyu.cit260.journey.model.game.Game;
import citbyu.cit260.journey.view.StartProgramView;


public class Journey {     
    
    private static Game currentGame= null;
    private static Player player= null;
    
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
       
        //StartProgramView.displayStartProgramView();     
        StartProgramView startProgView= new StartProgramView();
        startProgView.displayStartProgramView();
        
    }
    
    
}
