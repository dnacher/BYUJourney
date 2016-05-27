package citbyu.cit260.journey.control;

import static citbyu.cit260.journey.control.Dice.rollDice;
import citbyu.cit260.journey.model.Player.Player;

public class controlPlayer {
    
    //this function will calculate the time spend to travel from one place to another
    //the speed of a horse and a man is based on a internet research
    public int calculateTime(int way, int distance){
	int manSpeed=5;
	int horseSpeed=14;
	int Total=0;
    if(distance>0){
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
    else{
	Total =-1;
    }
    return Total;
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
    public boolean lookForItem(int Level, int LevelPlayer){
        Boolean found=false;
        int points= rollDice(LevelPlayer);
        if(LevelPlayer>0){
        if(Level==0){
            if (points>3){
                found=true;
            }
        }
        else if(Level==1){
            if (points>3){
                found=true;
	}
        }
        else if(Level==2){
            if (points>11){
                found=true;
            }
        }
        else if(Level==3){
            if (points>19){
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
    return found;
    }

    public int move(int newPlace, Player player){
        if(player!= null){
            if(newPlace>0){
                player.setPlace(newPlace);
                return player.getPlace();
            }
            else{
                return -1;
            }
            
        }
        else{
            return -1;
        }
        
    }
    
    

}
