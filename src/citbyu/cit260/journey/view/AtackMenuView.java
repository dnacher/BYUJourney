package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.Dice;
import citbyu.cit260.journey.control.controlPlayer;
import citbyu.cit260.journey.enums.Types;
import citbyu.cit260.journey.exceptions.NegativeValuesAtackException;
import citbyu.cit260.journey.model.characters.Warrior;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class AtackMenuView extends View{
 
    public static Warrior w;       
    public static Warrior enemyWarrior;     
    private final controlPlayer cp= new controlPlayer();
    Dice dice= new Dice();
    
    
     public AtackMenuView(){
    
        super("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Move Menu                       |"
                 +"\n----------------------------------"
                 +"\nS Summon Creature"
                 +"\nA Atack"
                 +"\nW Withdraw"
                 +"\nU Use Item"
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu"
                 +"\n");         
         if(w!=null){
             this.console.println(w.getWar().getName());
         }
            }
    
     @Override
    public boolean doAction(String menuOption){
       menuOption = menuOption.toUpperCase();
	boolean answer=false;
        if(w!=null){
        if(w.getCurrentHp()<=0){
            this.console.println("you lose");
            w=null;
            return true;
            
        }
        else if(enemyWarrior.getCurrentHp()<0){
            if(Journey.getPlayer().getCurrentCity()==Types.DragonLand.getValue()){
                this.console.println("\n You finally defeat the dragon. and you see a light inside the cave..." + 
                                     "\n once you walk into you realize that the Light stone is there." +
                                     "\n you can have the powerful light stone to go to others worlds..." +
                                     "\n CONGRATULATION" +
                                     "\n Game Made by Gustavo Martinez and Daniel Nacher");
                Journey.setCurrentGame(null);
                Journey.startGame();
            }
        this.console.println("you win");
        w=null;
            return true;
        } 
        }
	switch (menuOption) {
                case "S": //create and start new game
                    if(w==null){
                        Summon();
                    }
                    else{
                        this.console.println("you already have a creature");
                    }		
                        break;
		case "A": //create and start new game
			atack();
                        break;
		case "W": // get and start an existing game
			withdraw();                        
			break;
		case "U": // display the help menu
			ShowMyInventory();                       
			break;
		default:
			this.console.println("\n*** Invalid selection *** Try again");
			break;
	}	
	return answer;    
    }
   
private void atack() {
    if(w!=null){
        if(w.getCurrentHp()<=0 || enemyWarrior.getCurrentHp()<=0){
            if(w.getCurrentHp()<=0){
              this.console.println("You´re too weak for this Enemy. Try next time with items to help you");  
            }
        }
        else{     
            try {
                enemyWarrior.setCurrentHp(cp.attack(w.getWar().getPower(), enemyWarrior.getWar().getArmor(), enemyWarrior.getCurrentHp()));
            } catch (NegativeValuesAtackException ex) {
                this.console.println(ex.getMessage());
            }   
            try {
                double armor=w.getWar().getArmor()*cp.calculateItems(Types.Armor);
                int percentage=(int) (cp.calculateItems(Types.Armor)-1)/100;
                this.console.println("You have " + percentage + " more for your items in use");
                w.setCurrentHp(cp.attack(enemyWarrior.getWar().getPower(), (int)armor, w.getCurrentHp()));
            } catch (NegativeValuesAtackException ex) {
                this.console.println(ex.getMessage());
            }
    if(w.getCurrentHp()>0){
        this.console.println("You´re still alive");
    }
    else{
        this.console.println("You´re already dead");
    }
    this.console.println( "\n--------------------------------" +
                          "\nyour life is      " + w.getCurrentHp() + 
                          "\nthe enemy life is " + enemyWarrior.getCurrentHp() +
                          "\n--------------------------------");   
    }
    }
    else{
        this.console.println("\nYou don´t have a creature to atack" +
                             "\nSummon a crature with the option");       
    }
}

private void withdraw() {
    if(w!=null){
   if(Dice.probability(50)){
       this.console.println("The Enemy got you before you could withdraw");
       try {
           double armor=w.getWar().getArmor()*cp.calculateItems(Types.Armor);
           int percentage=(int) (cp.calculateItems(Types.Armor)-1)/100;
           this.console.println("You have " + percentage + " more for your items in use");
           w.setCurrentHp(cp.attack(enemyWarrior.getWar().getPower(), (int)armor, w.getCurrentHp()));
       } catch (NegativeValuesAtackException ex) {
          this.console.println(ex.getMessage());
       }
    if(w.getCurrentHp()>0){
        this.console.println("You´re still alive");
    }
    else{
        this.console.println("Luckily you don´t have a creature yet. you can run now");
    }
   }
    this.console.println("\n--------------------------------" +
                       "\nyour life is      " + w.getCurrentHp() +
                       "\nthe enemy life is " + enemyWarrior.getCurrentHp() +
                       "\n--------------------------------");
    }
    else{
        this.console.println("--------------------------------");
    }
}


private void Summon(){
    addMana();
    this.console.println(Journey.getPlayer().getMyCharacter().getMana());
    SummonCreatureView scv= new SummonCreatureView();
    scv.display();
}

public void addMana(){
    this.console.println(dice.createStringDice(dice.rollDice(Journey.getCurrentGame().getPlayer().getLevel())));
    int dicenum=dice.CalculateTotalDices(dice.rollDice(Journey.getCurrentGame().getPlayer().getLevel()));
    this.console.println(dicenum);
    int mana=Journey.getPlayer().getMyCharacter().getMana();
    int total=dicenum+mana;
    Journey.getPlayer().getMyCharacter().setMana(total);
}

public void ShowMyInventory(){
        if(Journey.getPlayer().getInventory().size()>0){
            ShowMyInventoryView SMIV= new ShowMyInventoryView();
            SMIV.display();                        
        }
        else{
            this.console.println("\nYou don´t have items in your inventory yet." +
                                  "\nTo have items you´ll need to search items " +
                                  "\nor fight against enemies...");
            
        }       
    }
}
