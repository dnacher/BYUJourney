package citbyu.cit260.journey;

import citbyu.cit260.journey.model.Player;
import citbyu.cit260.journey.model.Game;
import citbyu.cit260.journey.view.StartProgramView;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


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
