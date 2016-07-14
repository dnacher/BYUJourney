package citbyu.cit260.journey.control;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.enums.Types;
import citbyu.cit260.journey.model.characters.Warrior;
import citbyu.cit260.journey.enums.Warriors;
import citbyu.cit260.journey.exceptions.CalculateTimeWayException;
import citbyu.cit260.journey.exceptions.NegativeValuesAtackException;
import citbyu.cit260.journey.exceptions.PlayerLevelControlException;
import citbyu.cit260.journey.exceptions.controlPlayerException;
import citbyu.cit260.journey.model.map.Item;
import citbyu.cit260.journey.view.AtackMenuView;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class controlPlayer {
    
     protected final BufferedReader keyboard=Journey.getInFile();
     protected final PrintWriter console=Journey.getOutFile();
     Dice dice= new Dice();
    
    //this function will calculate the time spend to travel from one place to another
    //the speed of a horse and a man is based on a internet research
    public double calculateTime(double distance, boolean wounded) throws CalculateTimeWayException{
	int Speed=5;	
	double Total=0;
    if(distance>=0){
        if(wounded){           
		Total=distance/Speed*calculateItems(Types.Map);
                Total=Total*1.2;
        }
        else{
            Total=distance/Speed;
        }     
    }
    else{
	throw new CalculateTimeWayException("There was a problem with the id of your way to move through the map");
    }	
    return Total;
    }
    
    public int substractPositive(int num1, int num2){
        int total;
        if(num1>=num2){
            total=num1-num2;
        }
        else{
            total= num2-num1;
        }
        return total;
    
    }
    
    //the points are based on a table that we wrote before
    /*
    to return a true the player must have:
    for level 0  from 3 to 12
    for level 1  from 8 to 18
    for level 2 from 13 to 24
    for level 3 from 19 to 30
    for level 4 from 27 to 36
    for level 5 from 35 to 42
    */
    public boolean lookForItem(int LevelPlayer){
        Boolean found=false;
        double levelPoints=25;
        int points= dice.rollDices(LevelPlayer);                
        if(LevelPlayer==1){
            levelPoints+=20;
        }
        else if(LevelPlayer>1){
            levelPoints=45+((LevelPlayer-1)*10);
        }
        levelPoints=levelPoints/100;
        levelPoints=((LevelPlayer+2)*6)*levelPoints;
        if(points>=levelPoints){
            found=true;
        }
    return found;
    }
    
    public boolean handleWeight(double totalWeight, double currentWeight, int LevelPlayer){
        boolean enable=false;
        int min=20;
        double total;
        if(currentWeight<0){
            return false;
        }
        if(totalWeight<0){
            return false;
        }
        if(LevelPlayer==0){
            total= min-(totalWeight+currentWeight);            
        }
        else if(LevelPlayer>0){
            total=(min+(sumNumbers(LevelPlayer)))-(totalWeight+currentWeight);            
                   
        }
        else{
            return false;
        }
        if(total>=0){
                enable=true;
            }       
        return enable;       
    }
    
    public int sumNumbers(int number){
        int total=0;
        for(int i=0; i<number+1;i++){
        total +=i;        
        }        
        return total;
    
    }
    
    public int attack(int power, int armor, double life) throws NegativeValuesAtackException{
       double totalAttack;
       int currentLife;
       if(power<0 || armor<0 || life<0){
           throw new NegativeValuesAtackException("\n the power, life or the armor have a negative value.");
       }       
           totalAttack=power*calculateItems(Types.Power);       
       currentLife=(int) (life-(totalAttack-armor));      
       return currentLife;    
       }
    
    public double calculateItems(Types type){
    int num=0;
    for(Item i: Journey.getPlayer().getInventory()){        
        if(i.getType()==type.getValue()){
            if(i.isInUse()){
                num+=1;
            }            
        }
        switch(num){
            case 1:
                num=15;
                console.println("You have 15% more for your items in use");
                break;
            case 2:
                num=25;
                console.println("You have 25% more for your items in use");
                break;
            case 3:
                num=40;
                console.println("You have 40% more for your items in use");
                break;
            case 4:
                num=60;
                console.println("You have 60% more for your items in use");
                break;
            case 5:
                num=75;
                console.println("You have 75% more for your items in use");
                break;
            case 6:
                num=100;
                console.println("You have 100% more for your items in use");
                break;                
        }
    }
    double ret=(num/100)+1;
    return ret;
    }
    
    public double addTime(int num1, int num2) throws CalculateTimeWayException{
        double distance=substractPositive(num1, num2);         
        double time;
        if(Journey.getPlayer().getMyCharacter().getcurrentHp()>50){
            time=calculateTime(distance, false);
        }
        else{
            this.console.println("You´re Wounded, find something to improve your health ");
            time=calculateTime(distance, true);
        }
        double currentTime=Journey.getPlayer().getTime();
        double totalTime=time+currentTime;
        Journey.getPlayer().setTime(totalTime);
        return time;
    }
    
    public void chooseWarrior(int choice){
        Warrior w=new Warrior(chooseCharacter(Journey.getPlayer().getMyCharacter().getId(), choice));
        AtackMenuView.w=w;      
    }
    
    public Warriors chooseCharacter(int id, int choice){
        switch(id){
            case 1:
                return humanChoice(choice);                
            case 2:
                return elfChoice(choice);                
            case 3:
                return wizardChoice(choice);
            default:
                return Warriors.FRIENDLY;
        }
    }
    
    public Warriors humanChoice(int choice){
        switch(choice){
            case 1:
                return Warriors.SWORD_MAN;                
            case 2:
                return Warriors.SPEAR_MAN;
            case 3:
                return Warriors.KNIGHT;
            default:
                return Warriors.DRAGON;
        }
    }
    
    public Warriors elfChoice(int choice){
        switch(choice){
            case 1:
                return Warriors.ELF_BOW;                
            case 2:
                return Warriors.SPEAR_ELF;
            case 3:
                return Warriors.HORSE_ELF;
            default:
                return Warriors.DRAGON;
        }
    }
    
    public Warriors wizardChoice(int choice){
        switch(choice){
            case 1:
                return Warriors.WIZARD;                
            case 2:
                return Warriors.GREY_WIZARD;
            case 3:
                return Warriors.AIR_WIZARD;
            default:
                return Warriors.DRAGON;
        }
    }
  /*1-North Town 
    2-Dragon Land 
    3-Edelion
    4-Eten Ty
    5-Hidden Forest
    6-South Port*/  
    public Warrior chooseEnemy(int city,int place){
        Warrior w;

        if(chooseEnemyPlace(place)){
            switch(city){
                case 1:
                    w= new Warrior(Warriors.SWORD_MAN);
                    break;
                case 2:
                    w= new Warrior(Warriors.DRAGON);
                    break;
                case 3:
                    w= new Warrior(Warriors.SAILOR);
                    break;
                case 4:
                    w= new Warrior(Warriors.ORC);
                    break;
                case 5:
                    w= new Warrior(Warriors.SWORD_MAN);
                    break;
                case 6:
                    w= new Warrior(Warriors.ELF_BOW);
                    break;
                default:
                    w= new Warrior(Warriors.SAILOR);
                    break;
            }            
        }
        else{
                    w= new Warrior(Warriors.FRIENDLY);
        }        
        return w;
    }
    
  /*1-Inn
    2-Market
    3-Gates
    4-Dock                 
    5-Castle*/
    public boolean chooseEnemyPlace(int place){
        boolean enemy=false;        
        switch(place){
            case 1:                
                    enemy=Dice.probability(5);                              
                break;
            case 2:               
                    enemy=Dice.probability(7);                 
                break;
            case 3:                
                    enemy=Dice.probability(10);                 
                break;
            case 4:                
                    enemy=Dice.probability(40);                  
                break;
            case 5:                
                    enemy=Dice.probability(100);                   
                break;           
        }
        return enemy;
    
    }
    
    public void enemy(){
        AtackMenuView.enemyWarrior=  chooseEnemy(Journey.getPlayer().getCurrentCity(), Journey.getPlayer().getCurrentPlace()); 
        this.console.println("Mana: " + Journey.getPlayer().getMyCharacter().getMana());
        this.console.println(AtackMenuView.enemyWarrior.getWar().getName());
    }

 
	public void createMap() {
                
                String[][] list= new String[6][5];
                list[0][0]="Sword";
                list[0][1]="Great Axe";
                list[0][2]="Shield";
                list[0][3]="Helmet";
                list[0][4]="breastplate";
                list[1][0]="Dimond";
                list[1][1]="Magic Skull";
                list[1][2]="Power Tooth";
                list[1][3]="Hearth";
                list[1][4]="Light Stone";
                list[2][0]="Magic Stone";
                list[2][1]="Oblivian";
                list[2][2]="Black Stone";
                list[2][3]="Bright Stone";
                list[2][4]="Star Stone";
                list[3][0]="Ring";
                list[3][1]="Treasure Chest";
                list[3][2]="Crown";
                list[3][3]="Bracelet";
                list[3][4]="Mirror";
                list[4][0]="Collar";
                list[4][1]="Green Collar";
                list[4][2]="Silver Stones Collar";
                list[4][3]="Gold Stones Collar";
                list[4][4]="Black Gold Stones Collar";
                list[5][0]="Baston";
                list[5][1]="Knowledge of Cartography";
                list[5][2]="Strength";
                list[5][3]="Horse";
                list[5][4]="Great Horse";
               
        }
        
       public void updateLevel() throws PlayerLevelControlException{
       
           int currentLevel=Journey.getPlayer().getLevel();
           if(currentLevel<5){
            currentLevel+=1;
            Journey.getPlayer().setLevel(currentLevel);                   
                   this.console.println("*****You reach one more level. Congratulation********");
                   this.console.println("***************Now you´re Level: " + Journey.getPlayer().getLevel() + " ******************");
                   this.console.println("*****************************************************");
           }
           else{              
               Journey.getCurrentGame().setMaximumLevel(true);    
               throw new PlayerLevelControlException("\n*****************************************************"
                                                    +"\n*****You reach the maximum level. Congratulation*****" +
                                                     "\n*****************************************************");
                                  
               }
           }
       
       public void PrintInventory(){
           int number=1;
           if(Journey.getPlayer().getInventory().size()>0){
               for(Item item: Journey.getPlayer().getInventory()){               
               this.console.println("----------------------------");
               this.console.println(number + ") " + item.getName());
               if(item.isInUse()){
                this.console.println("   in use");
               }
               else{
                this.console.println("   you´re not using it");
               }              
               this.console.println("----------------------------");
               number+=1;
               }
           }
           else{
               this.console.println("\nYou don´t have items in your inventory yet." +
                                  "\nTo have items you´ll need to search items or fight" +
                                  "\nagainst enemies...");
           } 
    }
       
       public static void saveEnemies(String filePath) throws controlPlayerException{
           FileWriter outfile=null;
           ObjectOutputStream ouput=null;
           try{
               outfile= new FileWriter(filePath);
               outfile.write(ReportEnemies());
               outfile.flush();
           }
           catch(Exception e){
               throw new controlPlayerException(e.getMessage());
           }
           finally{
               if(outfile!=null){
                   try{
                    outfile.close();
                   }
                   catch(IOException e){
                       throw new controlPlayerException(e.getMessage());
                   } 
               }
           }
       }
    
    public static void printEnemiesReport(String ouputLocation)throws controlPlayerException{
        PrintWriter out=null;
        try{
            out= new PrintWriter(ouputLocation);
            out.println("\n\n        Enemies List         ");
            out.printf("%n%-20s%4s%4s%4s%4s","Name","Power"," Armor ","Life","Mana");
            out.printf("%n%-20s%4s%4s%4s%4s","-------------------","-----","------","-----","------");
            Warriors[]list = Warriors.values();
            for(Warriors i: list){
                out.printf("%n%-20s%4s%4s%4s%4s",i.getName(),i.getPower(), i.getArmor(), i.getLife(), i.getMana());                
            }            
        }
        catch(IOException e){
            throw new controlPlayerException(e.getMessage());
        }
        finally{
            if(out!=null){
                out.close();
            }
        }
    }
    
    public static String ReportEnemies() throws controlPlayerException{
        String str="\n\n        Enemies List         ";
        str+= String.format("%n%-20s%4s%4s%4s%4s","Name","Power"," Armor ","Life","Mana");
        str+=String.format("%n%-20s%4s%4s%4s%4s","-------------------","-----","------","-----","------");        
        Warriors[]list = Warriors.values();
        try{
            for(Warriors i: list){
                str+=String.format("%n%-20s%4s%4s%4s%4s",i.getName(),i.getPower(), i.getArmor(), i.getLife(), i.getMana());                
            }
        }
        catch(Exception e){
            throw new controlPlayerException(e.getMessage());
        }
        return str;
    }
    
       
} 
  
