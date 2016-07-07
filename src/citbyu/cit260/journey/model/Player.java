package citbyu.cit260.journey.model;
import citbyu.cit260.journey.Journey;
import static citbyu.cit260.journey.control.controlGame.createString;
import citbyu.cit260.journey.model.characters.Character;
import citbyu.cit260.journey.model.map.Item;
import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable{
    
    private int id;
    private String name;
    private double time;
    private int currentPlace;
    private int currentCity;    
    private Character myCharacter;
    private ArrayList<Item> Inventory;
    private int level;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }  
    
    public int getCurrentPlace() {
        return currentPlace;
    }

    public void setCurrentPlace(int currentPlace) {
        this.currentPlace = currentPlace;
    }

    public int getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(int currentCity) {
        this.currentCity = currentCity;
    }
    
    public Character getMyCharacter() {
        return myCharacter;
    }

    public void setMyCharacter(Character myCharacter) {
        this.myCharacter = myCharacter;
        //this if statement check if the object is not null
        //if is not null then set the String setSummonCreatures in the 
        //Game object
        if(Journey.getCurrentGame()!=null){
            createString(Journey.getPlayer().getMyCharacter().getId());
        }        
    }

    public ArrayList<Item> getInventory() {
        return Inventory;
    }

    public void setInventory(ArrayList<Item> Inventory) {
        this.Inventory = Inventory;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
    
    public Player(){
        
    }
    
    public Player(int id, String name, Character myCharacter){
    this.id=id;
    this.name=name;
    this.time=0;
    this.currentPlace=1;
    this.currentCity=1;
    this.myCharacter=myCharacter;
    this.Inventory=new ArrayList<>();
    this.level=0;    
    }
    
    
}
