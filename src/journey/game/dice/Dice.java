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
    
    public static int roll(int time){
    int ret=0;
    if(time>0 && time%2==0){
        if(probability(60)){
        ret=roll2Dice()-5;
         System.out.println("you lose 5 points of your mana");
        }        
    }
    else{
        ret=roll2Dice();
    }
    return ret;
    }
    
    public static int roll2Dice(){
    int dice1=rollDice();
    System.out.println("Dice 1: " + dice1);
    int dice2=rollDice();
    System.out.println("Dice 2: " + dice2);
    int total=dice1+dice2;   
    return total;    
    }
   
    public static boolean probability(int percentage){
    
    int i=(int)(Math.random()*100);
    if(i>0 && i<=percentage){       
        return true;
    }
    else{
        return false;
    }
    }
}
