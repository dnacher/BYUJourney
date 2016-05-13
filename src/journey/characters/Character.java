package journey.characters;

import java.io.Serializable;
import java.util.Objects;

public class Character implements Serializable{
    
    //id=1 Human
    //id=2 Elf
    //id=3 Wizard
       
    private int id;
    private int currentHp;
    private int mana;
    private int karma;
    private String name;
    
    public Character(){
    }
    
    public Character(int currentHp,int mana, int karma,String name, int id){
        
    this.currentHp=currentHp;
    this.mana=mana;
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

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + this.currentHp;
        hash = 29 * hash + this.mana;
        hash = 29 * hash + this.karma;
        hash = 29 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Character other = (Character) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.currentHp != other.currentHp) {
            return false;
        }
        if (this.mana != other.mana) {
            return false;
        }
        if (this.karma != other.karma) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "id=" + id + ", currentHp=" + currentHp + ", mana=" + mana + ", karma=" + karma + ", name=" + name + '}';
    }
    
   
    
    
    
}
