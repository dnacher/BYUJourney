
package journey.characters;

import journey.enums.Warriors;

public class Warrior {
    
    
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
   
}
