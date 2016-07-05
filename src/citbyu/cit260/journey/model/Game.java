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
     private boolean maximumLevel;
     private int count;

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

    public boolean isMaximumLevel() {
        return maximumLevel;
    }

    public void setMaximumLevel(boolean maximumLevel) {
        this.maximumLevel = maximumLevel;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }     
     
     public Game(){
         this.locationList=ControlMap.createLocationList();
     }
     
     public Game(Player player, String summonCreatures){
     
         this.player=player;
         this.summonCreatures=summonCreatures;
         this.locationList=ControlMap.createLocationList();
         this.Items=controlGame.CreateItemList();
         this.maximumLevel=false;
         this.count=1;
     }
  
}

