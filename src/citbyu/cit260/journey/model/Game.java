package citbyu.cit260.journey.model;

import citbyu.cit260.journey.control.ControlMap;
import citbyu.cit260.journey.control.controlGame;
import citbyu.cit260.journey.model.map.Item;
import citbyu.cit260.journey.model.map.Location;
import java.util.ArrayList;

public class Game {
    
     private Player player;
     private String summonCreatures;
     private Location[][] locationList;
     private ArrayList<Item> Items;

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

    public ArrayList<Item> getItems() {
        return Items;
    }

    public void setItems(ArrayList<Item> Items) {
        this.Items = Items;
    }

      
     
     public Game(){
         this.locationList=ControlMap.createLocationList();
     }
     
     public Game(Player player, String summonCreatures){
     
         this.player=player;
         this.summonCreatures=summonCreatures;
         this.locationList=ControlMap.createLocationList();
         this.Items=controlGame.CreateItemList();
     }
  
}

