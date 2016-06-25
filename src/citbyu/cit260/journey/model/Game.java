package citbyu.cit260.journey.model;

import citbyu.cit260.journey.control.ControlMap;
import citbyu.cit260.journey.model.map.Location;

public class Game {
    
     private Player player;
     private String summonCreatures;
     private Location[][] locationList;

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

    public Location[][] getLocationList() {
        return locationList;
    }

    public void setLocationList(Location[][] locationList) {
        this.locationList = locationList;
    }

      
     
     public Game(){
         this.locationList=ControlMap.createLocationList();
     }
     
     public Game(Player player, String summonCreatures){
     
         this.player=player;
         this.summonCreatures=summonCreatures;
         this.locationList=ControlMap.createLocationList();
           
     }
  
}

