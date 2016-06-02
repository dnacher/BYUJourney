package citbyu.cit260.journey.model.game;

import citbyu.cit260.journey.model.Player.Player;
import java.util.ArrayList;

public class Game {
    
     private ArrayList<Player> list= new ArrayList<Player>();
        private int idPlayer=0;

    public ArrayList<Player> getList() {
        return list;
    }

    public void setList(ArrayList<Player> list) {
        this.list = list;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }
    
    private static Game instance;
    
    private Game(){ 
       
    }
    
    public static Game getInstance(){
        if(instance==null){
            instance= new Game();
        }
        return instance;
    }  
  
}

