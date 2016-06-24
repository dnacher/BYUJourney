package citbyu.cit260.journey.control;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.model.characters.Warrior;
import citbyu.cit260.journey.model.characters.enums.Warriors;
import citbyu.cit260.journey.model.map.Location;
import citbyu.cit260.journey.model.map.Map;
import citbyu.cit260.journey.view.AtackMenuView;
import java.util.ArrayList;
import java.util.List;

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
    
    public int attack(boolean lucky, int power, int armor, double life){
       double totalAttack = 0;
       int currentLife=(int) life;
       if(power<0 || armor<0 || life<0){
           return -999;
       }
       if (lucky){
           totalAttack=power*1.25;           
       }
       else{
           totalAttack=power;
       }
       currentLife=(int) (life-(totalAttack-armor));      
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

 
	public static void createMap() {
 
		List<String> NorthTownItemsList = new ArrayList<String>();
                
                String[][] list= new String[6][5];
                list[0][0]="Sword";
                list[0][1]="Great Axe";
                list[0][2]="Shield";
                list[0][3]="Helmet";
                list[0][4]="Peto";
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
                
                
		NorthTownItemsList.add("Sword");
		NorthTownItemsList.add("Shield");
		NorthTownItemsList.add("Peto");
		NorthTownItemsList.add("Helmet");
		NorthTownItemsList.add("Great Axe");
 
		/*System.out.println("==> For Loop Example.");
		for (int i = 0; i < NorthTownItemsList.size(); i++) {
			System.out.println(NorthTownItemsList.get(i));
		}*/
                
                for(int i=0;i<6;i++){
                    for(int j=0;j<5;j++){
                        System.out.println(list[i][j].toString());
                    }
                }
                //imprimir lista
               // System.out.println(list[0][1].toString());
        }
        public static void testMap(){
             String leftIndicator;
             String rightIndicator;
             Map map = new Map(); // retreive the map from game
             Location[][] placesList=createLocationList();
             map.setPlacesList(placesList);
             Location[][] locations = map.getPlacesList(); // retreive the locations from map
        try { 
            System.out.print("  |");
                for( int column = 0; column < locations[0].length; column++){
                    System.out.print("   " + column + "    |"); // print col numbers to side of map
                }
            System.out.println();
                for( int row = 0; row < locations.length; row++){
                    System.out.print(row + " "); // print row numbers to side of map
                    for( int column = 0; column < locations[row].length; column++){
                        leftIndicator = " ";
                        rightIndicator = " ";
                        if(locations[row][column] == map.getCurrentLocation()){
                            leftIndicator = "*"; // can be stars or whatever these are indicators showing visited
                            rightIndicator = "*"; // same as above
                        } 
                        else if(locations[row][column].isVisited()){
                            leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                            rightIndicator = "<"; // same as above
                        }
                        System.out.print("|"); // start map with a |
                        if(locations[row][column].getScene() == null)
                            System.out.print(leftIndicator + "??" + rightIndicator);
                        else
                            System.out.print(leftIndicator + locations[row][column].getScene() + rightIndicator);
                    }
                    System.out.println("|");
                }
        }
        catch (Exception e) {
            System.out.println("Error");
        }        
        }
        
        /*0-North Town 
    1-Dragon Land 
    2-Edelion
    3-Eten Ty
    4-Hidden Forest
    5-South Port*/  
        
        /*0-Inn
    1-Market
    2-Gates
    3-Dock                 
    4-Castle*/
        
        public static Location[][] createLocationList(){
        Location[][] placesList=new Location[6][5];
             Location l= new Location("test01");             
             placesList[0][0]=l;
             Location l1= new Location("test02");
             placesList[0][1]=l1;
             Location l2= new Location("test03");
             placesList[0][2]=l2;
             Location l3= new Location("test04");
             placesList[0][3]=l3;
             Location l4= new Location("test05");
             placesList[0][4]=l4;
             Location l5= new Location("test06");
             placesList[1][0]=l5;
             Location l6= new Location("test07");
             placesList[1][1]=l6;
             Location l7= new Location("test08");
             placesList[1][2]=l7;
             Location l8= new Location("test09");
             placesList[1][3]=l8;
             Location l9= new Location("test10");
             placesList[1][4]=l9;
             Location l10= new Location("test11");
             placesList[2][0]=l10;
             Location l11= new Location("test12");
             placesList[2][1]=l11;
             Location l12= new Location("test13");
             placesList[2][2]=l12;
             Location l13= new Location("test14");
             placesList[2][3]=l13;
             Location l14= new Location("test15");
             placesList[2][4]=l14;
             Location l15= new Location("test16");
             placesList[3][0]=l15;
             Location l16= new Location("test17");
             placesList[3][1]=l16;
             Location l17= new Location("test18");
             placesList[3][2]=l17;
             Location l18= new Location("test19");
             placesList[3][3]=l18;
             Location l19= new Location("test20");
             placesList[3][4]=l19;
             Location l20= new Location("test21");
             placesList[4][0]=l20;
             Location l21= new Location("test22");
             placesList[4][1]=l21;
             Location l22= new Location("test23");
             placesList[4][2]=l22;
             Location l23= new Location("test24");
             placesList[4][3]=l23;
             Location l24= new Location("test25");
             placesList[4][4]=l24;
             Location l25= new Location("test26");
             placesList[5][0]=l25;
             Location l26= new Location("test27");
             placesList[5][1]=l26;
             Location l27= new Location("test28");
             placesList[5][2]=l27;
             Location l28= new Location("test29");
             placesList[5][3]=l28;
             Location l29= new Location("DB");
             placesList[5][4]=l29;
             return placesList;
        }
        
}
