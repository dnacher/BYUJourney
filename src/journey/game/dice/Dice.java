package journey.game.dice;

public class Dice {
   public static double perc=16.66;
    
    public static int rollDice(){
    double random= Math.random()*100;    
   
    if(random<(perc)){
        return 1;
    }
    else if(random>=perc && random<(perc*2)){
        return 2;
    }
    else if(random>=perc && random<(perc*3)){
        return 3;
    }
    else if(random>=perc && random<(perc*4)){
        return 4;
    }
    else if(random>=perc && random<(perc*5)){
        return 5;
    }
    else if(random>=perc && random<(perc*6)){
        return 6;
    }
        return -1;
    }
   
}
