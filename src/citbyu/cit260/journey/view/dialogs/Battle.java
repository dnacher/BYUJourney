
package citbyu.cit260.journey.view.dialogs;
import java.util.Scanner;
import citbyu.cit260.journey.model.characters.Character;
import citbyu.cit260.journey.model.characters.Warrior;
import citbyu.cit260.journey.model.characters.enums.Warriors;
import citbyu.cit260.journey.control.Dice;

public class Battle {
    
    public static void printBoardFirst(Warrior w[],Character c){
             
     System.out.println("            Note: Creature_Name(current HP of the creature)");
     System.out.println("");
     System.out.println("                     A                B                 C");
     System.out.println("");
     System.out.println("           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
     System.out.println("           @                 @                 @                 @");
        WarriorLinefull(w[0],w[1],w[3]);
     System.out.println("           @                 @                 @                 @");
     System.out.println("           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
     System.out.println("           @                 @                 @                 @");
        WarriorLinefull(w[4],w[5],w[5]);
     System.out.println("           @                 @                 @                 @");
     System.out.println("           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
     System.out.println("           @                 @                 @                 @");
        WarriorLinefull(w[6],w[7],w[8]);
     System.out.println("           @                 @                 @                 @");
     System.out.println("           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
     System.out.println("");
     BattleDialogFirst();
     int choice=0;
     Scanner inFile= new Scanner(System.in);
     choice= inFile.nextInt();
     choice=optionFirstBoard(choice, inFile);
     afterBattleOption(choice,c);
    }
    
    public static void BattleDialogFirst(){
        System.out.println("        To summon creatures to the board you will neeed to roll the dice.");
        System.out.println("         The dice will give you Mana; the attribute to summon creatures");
        System.out.println("   Once you have Mana you will have the options of which creatures you can Summon");
        System.out.println("The creatures will appear in A3. then you will be able to move/atack with the creature");
        System.out.println("");        
        System.out.println("                      choose an option:");
        System.out.println("");
        System.out.println("1: Roll a Dice");
        System.out.println("2: Retreat");
    
    }
    
    public static void printBoardFirst(Warrior w[] ){
    //Warrior a1, Warrior a2, Warrior a3,Warrior b1, Warrior b2, Warrior b3,Warrior c1, Warrior c2, Warrior c3
        System.out.println("                   A                B                 C");
     System.out.println("");
     System.out.println("           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
     System.out.println("           @                 @                 @                 @");
        WarriorLinefull(w[0],w[1],w[3]);
     System.out.println("           @                 @                 @                 @");
     System.out.println("           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
     System.out.println("           @                 @                 @                 @");
        WarriorLinefull(w[4],w[5],w[5]);
     System.out.println("           @                 @                 @                 @");
     System.out.println("           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
     System.out.println("           @                 @                 @                 @");
        WarriorLinefull(w[6],w[7],w[8]);
     System.out.println("           @                 @                 @                 @");
     System.out.println("           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
     
     BattleDialogWhile();
    }
    
    public static void BattleDialogWhile(){
        System.out.println("choose an option:");
        System.out.println("");
        System.out.println("1: Roll a Dice to Summon your creatures");
        System.out.println("2: type the origin coordinates of your creature to move/fight");
        System.out.println("3: summon a creature");       
        System.out.println("4: Retreat. (you will lose life: total number of your creatures in the board or 50 if you haven´t)");
    }
    
        
    public static void WarriorLinefull(Warrior w1, Warrior w2, Warrior w3){
        System.out.println("         1 @ " + w1 + " @ "+ w2.getWar().getName() +  "("+w2.getCurrentHp()+") @ "+ w3.getWar().getName() +"("+ w3.getCurrentHp()+") @");
    }
    
    public static void afterBattleOption(int choice,Character c){
        if(choice==1){
            beginBattle(c);
        }
        else{
            System.out.println("retreat");
        }
    }
    
    public static int optionFirstBoard(int choice,Scanner inFile){
    while(choice!=1 && choice!=2){
       System.out.println("please choose option 1 or 2");
       System.out.println("1: Roll a Dice");
       System.out.println("2: Retreat");
       choice= inFile.nextInt();
     }
    return choice;
    }
    
    public static void beginBattle(Character c){
        int i=1;
        //loooook for the variables on this roll function********************************************this is just for test
        c.setMana(Dice.roll(i,i));
        int ret=creaturesCanAfford(c);
        Scanner inFile= new Scanner(System.in);
        int choice= inFile.nextInt();
        summonCreature(ret,choice,c);
    }
    
    public static int creaturesCanAfford(Character c){
        int i=1;
        if(c.getMana()>=3){
           firstLevelMenu(c.getId());
           i +=1;           
        }
        else if(c.getMana()>=5){
            secondLevelMenu(c.getId());
            i +=1;            
        }
        else if(c.getMana()>=11){
            thirdLevelMenu(c.getId());
            i +=1;
        }
        System.out.println(i +": Keep Mana");
        return i;
    }
    
    public static void summonCreature(int ret, int choice, Character c){
        if(ret==2){
            while(choice!=1 && choice!=2){
                System.out.println("you need to choose the 2 options");
                creaturesCanAfford(c);
                Scanner inFile= new Scanner(System.in);
                choice= inFile.nextInt();
            }
        }
        else if(ret==3){
            while(choice!=1 && choice!=2 || choice!=3){
                System.out.println("you need to choose the 3 options");
                creaturesCanAfford(c);
                Scanner inFile= new Scanner(System.in);
                choice= inFile.nextInt();
            }
        }
        else if(ret==4){
            while(choice!=1 && choice!=2 || choice!=3){
                System.out.println("you need to choose the 4 options");
                creaturesCanAfford(c);
                Scanner inFile= new Scanner(System.in);
                choice= inFile.nextInt();
            }
        }
        switch(choice){
            case 1:
                
            case 2:
                
            case 3:
                
            case 4:
                
        }
    }
    
    public static void firstLevelMenu(int id){
        switch(id){
            case 1:
                System.out.println("1: " + Warriors.SWORD_MAN.getName());
                break;
            case 2:
                System.out.println("1: " + Warriors.ELF_BOW.getName());
                break;
            case 3:
                System.out.println("1: " + Warriors.WIZARD.getName());
                break;
        }
    }
    
      public static void secondLevelMenu(int id){
        switch(id){
            case 1:
                System.out.println("2: " + Warriors.SPEAR_MAN.getName());
                break;
            case 2:
                System.out.println("2: " + Warriors.SPEAR_ELF.getName());
                break;
            case 3:
                System.out.println("2: " + Warriors.GREY_WIZARD.getName());
                break;
        }
    }
      
        public static void thirdLevelMenu(int id){
        switch(id){
            case 1:
                System.out.println("3: " + Warriors.KNIGHT.getName());
                break;
            case 2:
                System.out.println("3: " + Warriors.HORSE_ELF.getName());
                break;
            case 3:
                System.out.println("3: " + Warriors.AIR_WIZARD.getName());
                break;
        }
    }
        
        public static void moveAtack(int origin, int destiny){
        
        }
        
        public static Warrior[] createList(Warriors w, int quantity){
        Warrior [ ] list = new Warrior [9];
        Warrior enemy= new Warrior(w, 10);
        Warrior empty= new Warrior(Warriors.EMPTY, -1);
        for(int i=0; i<9;i++){
            if(i<=quantity){
                list[i]=enemy;
            }
            else{
                list[i]=empty;
            }
            
        }
        return list;        
        }
}
