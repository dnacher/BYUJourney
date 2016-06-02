package citbyu.cit260.journey.model.Player;
import citbyu.cit260.journey.model.characters.Character;

public class Player {
    
    private int id;
    private String name;
    private int time;
    private int currentPlace;
    private Character myCharacter;

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
    
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }  
    
    public int getCurrentPlace() {
        return currentPlace;
    }

    public void setCurrentPlace(int currentPlace) {
        this.currentPlace = currentPlace;
    }

    public Character getMyCharacter() {
        return myCharacter;
    }

    public void setMyCharacter(Character myCharacter) {
        this.myCharacter = myCharacter;
    }
    
    public Player(){
        
    }
    
    public Player(int id, String name, Character myCharacter){
    this.id=id;
    this.name=name;
    this.time=0;
    this.currentPlace=0;
    this.myCharacter=myCharacter;
        
    }
    
    
}
