package citbyu.cit260.journey.model.characters.enums;

public enum Warriors {
    
      SWORD_MAN(1,"Sword Man  ", 1,10,3),
      SPEAR_MAN(2,"Spear Man  ", 1,10,3),
         KNIGHT(3,"  Knight   ", 1,10,3),    
    
        ELF_BOW(1,"  Elf bow  ", 1,10,3),
      SPEAR_ELF(2," Spear Elf ", 1,10,3),
      HORSE_ELF(3," Horse Elf ", 1,10,3),
    
            ORC(1,"   Orc     ", 1,10,3),
        AXE_ORC(2," Axe & Orc ", 1,10,3),
       WOLF_ORC(3," Wolf & Orc", 1,10,3),
       
        WIZARD(1,"   Wizard  ", 1,10,3),
        GREY_WIZARD(2,"Grey Wizard", 1,10,3),
       AIR_WIZARD(3,"Air Wizard ", 1,10,3),
    
          EMPTY(8,"***EMPTY***",-1,-1,-1);
    
    private final int id;
    private final String name;
    private final int speed;
    private final int life;
    private final int mana;   
    
    private Warriors(int id, String name, int speed, int life, int mana){
        this.id=id;
        this.name=name;
        this.speed=speed;
        this.life=life;
        this.mana=mana;             
    }
    
    public int getId(){
    return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public int getLife(){
        return life;
    }
    
    public int getMana(){
        return mana;
    }
    
    
}
