package citbyu.cit260.journey;

import citbyu.cit260.journey.model.Player;
import citbyu.cit260.journey.model.Game;
import citbyu.cit260.journey.view.StartProgramView;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class Journey {     
    
    private static Game currentGame= null;
   
   
    
    public static Game getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame){
        Journey.currentGame=currentGame;
    }
    
    
    //***********getters and setters inside the Game object. to be easier
    public static Player getPlayer(){
        return currentGame.getPlayer();
    }
    
    public static void setPlayer(Player player){
        currentGame.setPlayer(player);
    }
    
     public static String getSummonCreatures() {
        return currentGame.getSummonCreatures();
    }

    public static void setSummonCreatures(String summonCreatures) {
        currentGame.setSummonCreatures(summonCreatures);
    }
    //********end of the getters and setters
    

    public static void main(String[] args) {
       
        StartProgramView spv= new StartProgramView();
        spv.display();  
        //Array dos dimensiones
    /*   String[][] list= new String[10][10];
       list[2][4]="listblabla";
       String j=list[2][4];
       System.out.println(j);
       //List ArrayList
       List<String> myList= new ArrayList<String>();
       myList.add("hh");
       for(String string:myList){
           System.out.println(string);
       }*/
    }
    
    
}
