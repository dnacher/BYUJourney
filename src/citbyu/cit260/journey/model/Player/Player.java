package citbyu.cit260.journey.model.Player;

public class Player {
    
    private int id;
    private String name;
    private int time;
    private int currentPlace;

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

    public int getPlace() {
        return currentPlace;
    }

    public void setPlace(int place) {
        this.currentPlace = place;
    }    
    
    public Player(){
        
    }
    
    public Player(int id, String name){
    this.id=id;
    this.name=name;
    }
    
    
}
