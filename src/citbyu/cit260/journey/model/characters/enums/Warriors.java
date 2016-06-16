package citbyu.cit260.journey.model.characters.enums;

public enum Warriors {
    
      SWORD_MAN("Sword Man  ",100, 1,10,3),
      SPEAR_MAN("Spear Man  ",150, 1,10,3),
         KNIGHT("  Knight   ",200, 1,10,3),    
    
        ELF_BOW("  Elf bow  ",100, 1,10,3),
      SPEAR_ELF(" Spear Elf ",150, 1,10,3),
      HORSE_ELF(" Horse Elf ",200, 1,10,3),
    
            ORC("   Orc     ",100, 1,10,3),
        AXE_ORC(" Axe & Orc ",150, 1,10,3),
       WOLF_ORC(" Wolf & Orc",200, 1,10,3),
       
        WIZARD("   Wizard  ",100, 1,10,3),
        GREY_WIZARD("Grey Wizard",150, 1,10,3),
       AIR_WIZARD("Air Wizard ",200, 1,10,3),
       
       //Enemies
       DRAGON("Dragon",500,100,500,50),
       SAILOR("Dragon",50,0,50,5),
    
          FRIENDLY("***Friendly***",-1,-1,5,-1);
    
    private final String name;
    private final int power;
    private final int armor;
    private final int life;
    private final int mana;   
    
    private Warriors(String name, int power,int armor, int life, int mana){       
        this.name=name;
        this.power=power;
        this.armor=armor;
        this.life=life;
        this.mana=mana;             
    }
    
    public String getName(){
        return name;
    }
    
    public int getPower(){
        return power;
    }
    
     public int getArmor(){
        return armor;
    }
    
    public int getLife(){
        return life;
    }
    
    public int getMana(){
        return mana;
    }
    
    
}
