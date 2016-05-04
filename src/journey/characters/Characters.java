package journey.characters;

public class Characters {
    
    private int id;
    private int hp;
    private int karma;
    private String name;
    
    
    public Characters(int hp, int karma,String name, int id){
        
    this.hp=hp;
    this.karma=karma;
    this.name=name;
    this.id=id;            
    }

   
    public int getHp() {
        return hp;
    }
  
    public void setHp(int hp) {
        this.hp = hp;
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
