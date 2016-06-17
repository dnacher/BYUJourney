package citbyu.cit260.journey.model.characters.enums;

public enum Warriors {
    
      SWORD_MAN("Sword Man  ",15, 14,50,3),
      SPEAR_MAN("Spear Man  ",20, 18,70,3),
         KNIGHT("  Knight   ",25, 20,90,3),    
    
        ELF_BOW("  Elf bow  ",15, 14,50,3),
      SPEAR_ELF(" Spear Elf ",20, 18,70,3),
      HORSE_ELF(" Horse Elf ",25, 20,90,3),
    
            ORC("   Orc     ",15, 14,50,3),
        AXE_ORC(" Axe & Orc ",20, 18,70,3),
       WOLF_ORC(" Wolf & Orc",25, 20,90,3),
       
         WIZARD("   Wizard  ",15, 14,50,3),
    GREY_WIZARD("Grey Wizard",20, 18,70,3),
     AIR_WIZARD("Air Wizard ",25, 20,90,3),
       
       //Enemies
         DRAGON("  Dragon   ",50,30,130,50),
         SAILOR("  Sailor   ",5,0,20,5),
    
       FRIENDLY("***Friendly***",0,0,3,0);
    
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
