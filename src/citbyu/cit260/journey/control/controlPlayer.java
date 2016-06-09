package citbyu.cit260.journey.control;

import static citbyu.cit260.journey.control.Dice.rollDice;
import citbyu.cit260.journey.model.Player.Player;
import citbyu.cit260.journey.model.game.Game;
import citbyu.cit260.journey.model.characters.Character;

public class controlPlayer {
    
    public Player createPlayer(String name, Character myCharacter){
        Player p= new Player(controlGame.bringIdPlayer() , name, myCharacter);
        Game.getInstance().getList().add(p);        
        return p;
    }
    
    //this function will calculate the time spend to travel from one place to another
    //the speed of a horse and a man is based on a internet research
    public double calculateTime(int way, double distance, boolean wounded){
	int manSpeed=5;
	int horseSpeed=14;
	double Total=0;
    if(distance>0){
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
        int points= rollDice(LevelPlayer);
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

    public int move(int newPlace, Player player){
        if(player!= null){
            if(newPlace>=0){
                player.setCurrentPlace(newPlace);
                return player.getCurrentPlace();
            }
            else{
                return -1;
            }
            
        }
        else{
            return -1;
        }
        
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
    
    
}
