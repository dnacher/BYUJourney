package citbyu.cit260.journey.control;

public class Dice {

    /*public static int rollDice(int level) {
        double random = Math.random() * 100;
       level=level+6;
        int per=100/level;
        for (int i = 1; i <= level; i++) {
            if (random >= per && random < (per * i)) {
                return i;
            }
        }
        return 1;
    }*/
        
    //this function roll one dice
     public static int rollDice(int level) {
         if(level<0){
             return -1;
         }
       double random = Math.random()*((level + 1)*6) ;
       return (int)random + 1; 
    }
     
      //this function will roll 2 dices 
    public static int roll2Dice(int level) {
        int dice1 = rollDice(level);
        System.out.println("Dice 1: " + dice1);
        int dice2 = rollDice(level);
        System.out.println("Dice 2: " + dice2);
        int total = dice1 + dice2;        
        return total;
    }
     
     //this function will control the total mana for each roll of dices
     public static int roll(int time, int level) {
        int ret = 0;
        if (time > 0 && time % 2 == 0) {
            if (probability(60)) {
                ret = roll2Dice(level) - 5;
                System.out.println("you lose 5 points of your mana");
            }
        } else {
            ret = roll2Dice(level);
        }
        return ret;
    }   

    //this function will return true or false depending on the probability
    public static boolean probability(int percentage) {
        if(percentage>0 && percentage<101){
        int i = (int) (Math.random() * 100);
        if (i > 0 && i <= percentage) {
            return true;
        } else {
            return false;
        }
        }
        else{
            return false;
        }
    }
}
