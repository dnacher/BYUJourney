
package citbyu.cit260.journey.model.characters;

import java.io.Serializable;
import java.util.Objects;
import citbyu.cit260.journey.model.characters.enums.Warriors;

public class Warrior implements Serializable{
    
    
    private Warriors warrrior;
    private int currentHp;
    
    public Warrior(Warriors war, int currentHp){
    this.warrrior=war;
    this.currentHp=currentHp;    
    }

   
    public Warriors getWar() {
        return warrrior;
    }

   
    public void setWar(Warriors war) {
        this.warrrior = war;
    }

   
    public int getCurrentHp() {
        return currentHp;
    }

   
    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }
    
    @Override
    public String toString(){
        return this.getWar().getName() + "(" + this.getCurrentHp() + ")";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.warrrior);
        hash = 89 * hash + this.currentHp;
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
        final Warrior other = (Warrior) obj;
        if (this.warrrior != other.warrrior) {
            return false;
        }
        if (this.currentHp != other.currentHp) {
            return false;
        }
        return true;
    }
    
    
   
}
