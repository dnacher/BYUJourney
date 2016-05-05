package journey.characters;

public class Characters {
    
    private int id;
    private int currentHp;
    private int karma;
    private String name;
    
    
    public Characters(int currentHp, int karma,String name, int id){
        
    this.currentHp=currentHp;
    this.karma=karma;
    this.name=name;
    this.id=id;            
    }

   
    public int getcurrentHp() {
        return currentHp;
    }
  
    public void setHp(int hp) {
        this.currentHp = hp;
    }
  
    public int getKarma() {
        return karma;
    }

    public void setKarma(int karma) {
        this.karma = karma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
