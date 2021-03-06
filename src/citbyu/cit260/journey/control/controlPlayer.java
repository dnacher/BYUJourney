package citbyu.cit260.journey.control;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.enums.Types;
import citbyu.cit260.journey.model.characters.Warrior;
import citbyu.cit260.journey.enums.Warriors;
import citbyu.cit260.journey.exceptions.CalculateTimeWayException;
import citbyu.cit260.journey.exceptions.NegativeValuesAtackException;
import citbyu.cit260.journey.exceptions.PlayerLevelControlException;
import citbyu.cit260.journey.exceptions.controlPlayerException;
import citbyu.cit260.journey.model.characters.Personages;
import citbyu.cit260.journey.model.map.Item;
import citbyu.cit260.journey.view.AtackMenuView;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class controlPlayer {
    
     protected final BufferedReader keyboard=Journey.getInFile();
     protected final PrintWriter console=Journey.getOutFile();    
    
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
    for level 0  from 3
    for level 1  from 8
    for level 2 from 13
    for level 3 from 19
    for level 4 from 27
    for level 5 from 35
    */
    public boolean lookForItem(int LevelPlayer){
        Boolean found=false;
        double levelPoints=25;
        int points= Dice.CalculateTotalDices(Dice.rollDice(LevelPlayer));
        double morePoints=calculateItems(Types.Search) * points;
        if(LevelPlayer==1){
            levelPoints+=20;
        }
        else if(LevelPlayer>1){
            levelPoints=45+((LevelPlayer-1)*10);
        }
        levelPoints=levelPoints/100;
        levelPoints=((LevelPlayer+2)*6)*levelPoints;        
        int lp=(int)levelPoints;
        if(points>=lp){
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
    }
        switch(num){
            case 1:
                num=15;                
                break;
            case 2:
                num=25;                
                break;
            case 3:
                num=40;               
                break;
            case 4:
                num=60;                
                break;
            case 5:
                num=75;                
                break;
            case 6:
                num=100;                
                break;                
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
            time=calculateTime(distance, true);
        }
        double currentTime=Journey.getPlayer().getTime();
        double totalTime=time+currentTime;
        Journey.getPlayer().setTime(totalTime);
        return time;
    }
    
    public void chooseWarrior(int choice){
        Warrior w=new Warrior(chooseCharacter(Journey.getPlayer().getMyCharacter().getId(), choice));
        AtackMenuView.playerWarrior=w;      
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
  /*0-North Town 
    1-Dragon Land 
    2-Edelion
    3-Eten Ty
    4-Hidden Forest
    5-South Port*/  
    public Warrior chooseEnemy(int city,int place){
        Warrior w;

        if(chooseEnemyPlace(place)){
            switch(city){
                case 0:
                    w= new Warrior(Warriors.SWORD_MAN);
                    break;
                case 1:
                    w= new Warrior(Warriors.DRAGON);
                    break;
                case 2:
                    w= new Warrior(Warriors.SAILOR);
                    break;
                case 3:
                    w= new Warrior(Warriors.ORC);
                    break;
                case 4:
                    w= new Warrior(Warriors.SWORD_MAN);
                    break;
                case 5:
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
        if(Journey.getPlayer().getCurrentCity()==Types.DragonLand.getValue()){
            enemy=true;
        }
        else{
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
        }
     return enemy;
    }
    
    public void enemy(){
        AtackMenuView.enemyWarrior=  chooseEnemy(Journey.getPlayer().getCurrentCity(), Journey.getPlayer().getCurrentPlace()); 
        
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
           }
           else{              
               Journey.getCurrentGame().setMaximumLevel(true);    
               throw new PlayerLevelControlException("\n*****************************************************"
                                                    +"\n*****You reach the maximum level. Congratulation*****" +
                                                     "\n*****************************************************");
                                  
               }
           }
       
       public String PrintInventory(){
           int number=1;
           String str="";
           if(Journey.getPlayer().getInventory().size()>0){
               for(Item item: Journey.getPlayer().getInventory()){               
               str+="\n----------------------------";
               str+="\n" + number + ") " + item.getName();
               if(item.isInUse()){
                str+="\n   in use";
               }
               else{
                str+="\n   you´re not using it";
               }              
               //str+="----------------------------";
               number+=1;
               }
           }
           else{
               str+="\nYou don´t have items in your inventory yet." +
                                  "\nTo have items you´ll need to search items or fight" +
                                  "\nagainst enemies...";
           } 
           return str;
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
        try(PrintWriter out = new PrintWriter(ouputLocation)) {
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
    
    public static Personages getPersonages()throws controlPlayerException{
        Personages p= new Personages();
        if(!stillHavePersonages()){
        Random r = new Random();        
        int Result = (int) (Math.random()*28);            
        p= Journey.getCurrentGame().getPersonagesList().get(Result);         
        if(p.isDone()){
            throw new controlPlayerException("Nobody wants to talk to you here");
        }
        else{
            p.setDone(true);
            Journey.getCurrentGame().getPersonagesList().set(Result, p);            
            return p;                
        }
            
        }
        else{
            throw new controlPlayerException("No more speeches");
        }
        
        
    }
    
    public static boolean stillHavePersonages(){
        boolean done=true;  
        for(Personages p: Journey.getCurrentGame().getPersonagesList()){
            if(!p.isDone()){
                done=false;
            }
        }
        return done;
    }
    
    public static void resetListPersonages(){ 
        ArrayList<Personages> PersonagesList= ControlMap.createPersonagesDialogs();
        Journey.getCurrentGame().setPersonagesList(PersonagesList);    
    }
    
    public Warrior atack(Warrior atacker, Warrior defender, boolean enemy) throws NegativeValuesAtackException{
        if(atacker!=null && defender!=null){
        int power;                   
        int defenderArmor;
        int defenderLife;
        if(enemy){
            defenderArmor=(int) (defender.getWar().getArmor()*calculateItems(Types.Armor));
            defenderLife=(int)(defender.getCurrentHp()*calculateItems(Types.Magic));
            int newPower=atacker.getWar().getPower()-defenderArmor;
            if(newPower>0){
                defender.setCurrentHp(defender.getCurrentHp()-newPower);
            }
        }
        else{
            power=(int)(atacker.getWar().getPower()*calculateItems(Types.Power));
            int newPower=power-defender.getWar().getArmor();
            if(newPower>0){
            defender.setCurrentHp(defender.getCurrentHp()-newPower);
            }
        }
        return defender;   
        }
        else {
            throw new NegativeValuesAtackException("one or both warriors are null");
        }
        }
}

  
