
package journey.characters;

import java.io.Serializable;
import java.util.Objects;
import journey.enums.Warriors;

public class Warrior implements Serializable{
    
    
    private Warriors war;
    private int currentHp;
    
    public Warrior(Warriors war, int currentHp){
    this.war=war;
    this.currentHp=currentHp;    
    }

   
    public Warriors getWar() {
        return war;
    }

   
    public void setWar(Warriors war) {
        this.war = war;
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
        hash = 89 * hash + Objects.hashCode(this.war);
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
        if (this.war != other.war) {
            return false;
        }
        if (this.currentHp != other.currentHp) {
            return false;
        }
        return true;
    }
    
    
   
}
