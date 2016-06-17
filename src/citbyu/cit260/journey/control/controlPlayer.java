package citbyu.cit260.journey.control;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.model.characters.Warrior;
import citbyu.cit260.journey.model.characters.enums.Warriors;
import citbyu.cit260.journey.view.AtackMenuView;

public class controlPlayer {
    
    //this function will calculate the time spend to travel from one place to another
    //the speed of a horse and a man is based on a internet research
    public double calculateTime(int way, double distance, boolean wounded){
	int manSpeed=5;
	int horseSpeed=14;
	double Total=0;
    if(distance>=0){
        if(wounded){
            if(way==1){
		Total=distance/manSpeed;
                Total=Total*1.2;
	}
        else if(way==2){
		Total=distance/horseSpeed;
                Total=Total*1.2;
	}
	else{
		Total =-1;
	}        
        }
        else{
        if(way==1){
		Total=distance/manSpeed;
	}
        else if(way==2){
		Total=distance/horseSpeed;
	}
	else{
		Total =-1;
	}        
        }
	
    }
    else{
	Total =-1;
    }
    return Total;
    }
    
    public int substractPositive(int num1, int num2){
        int total=0;
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
    for level 0  from 3 to 10
    for level 1 from 11 to 18
    for level 2 from 19 to 26
    for level 3 from 27 to 34
    for level 4 from 35 to 42
    */
    public boolean lookForItem(int Level, int LevelPlayer, boolean lucky){
        Boolean found=false;
        int levelPoints=3;
        int points= Dice.rollDice(LevelPlayer);
        if(LevelPlayer>=0){
            if(Level>=0){               
                if (points>levelPoints+(8*Level)){                   
                    found=true;
                }
            }            
            else{
                return false;
            }
        }
        else{
             return false;
        }
        System.out.println(levelPoints+(8*Level));
    return found;
    }
    
    public boolean handleWeight(double totalWeight, double currentWeight, int LevelPlayer){
        boolean enable=false;
        int min=20;
        double total=0;
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
    
    public double attack(boolean lucky, int power, int armor, double life){
       double totalAttack = 0;
       double currentLife=life;
       if(power<0 || armor<0 || life<0){
           return -999;
       }
       if (lucky){
           totalAttack=power*1.25;           
       }
       else{
           totalAttack=power;
       }
       currentLife=life-(totalAttack-armor);      
       return currentLife;    
       }
    
    public boolean getLucky(){
        boolean lucky=Dice.probability(50);
        return lucky;
    }
    
    public double addTime(int num1, int num2){
        double distance=substractPositive(num1, num2);
        //****************************************************************now there is only one way to go "1" 
        double time=0;
        if(Journey.getPlayer().getMyCharacter().getcurrentHp()>50){
            time=calculateTime(1, distance, false);
        }
        else{
            System.out.println("You´re Wounded, find something to improve your health ");
            time=calculateTime(1, distance, true);
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
        System.out.println("Mana: " + Journey.getPlayer().getMyCharacter().getMana());
        System.out.println(AtackMenuView.enemyWarrior.getWar().getName());
    }
    
}
