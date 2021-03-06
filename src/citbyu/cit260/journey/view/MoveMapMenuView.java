/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.control.controlGame;
import citbyu.cit260.journey.control.controlPlayer;
import citbyu.cit260.journey.exceptions.CalculateTimeWayException;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class MoveMapMenuView extends View{    
    
    private String currentPlace="E";
    private int num1=0;
    private int num2=0;
    private final int N=0;
    private final int D=1;
    private final int E=2;
    private final int T=3;
    private final int H=4;
    private final int S=5;   
    
    public MoveMapMenuView(){          
        super("\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Move Menu                       |"
                 +"\n----------------------------------"
                 +"\nN North Town" 
                 +"\nD Dragon Land" 
                 +"\nE Edelion"
                 +"\nT Eten Ty"
                 +"\nH Hidden Forest"
                 +"\nS South Port"                        
                 +"\n----------------------------------"
                 +"\nQ Return Main Menu"
                 +"\n");            
            }    
    
    @Override
    public boolean doAction(String menuOption){
       menuOption = menuOption.toUpperCase();
	boolean answer=false;
	switch (menuOption) {
		case "N": //create and start new game                       
			this.northTown();
                        break;
		case "D": // get and start an existing game
			this.dragonLand();                        
			break;
		case "E": // display the help menu
			this.edelion();                        
			break;
		case "H": // save the current game
			this.hiddenForest();                        
			break;
                case "T": // save the current game
			this.etenTy();                        
			break;
		case "S": // save the current game
			this.southPort();                        
			break;		
		default:
			this.console.println("\n*** Invalid selection *** Try again");
			break;
	}	
        
	return answer;
    }
    
   
private void northTown() {
    num1=this.returnPlaceId(currentPlace);
    currentPlace="N";
    num2=N;
    controlPlayer cp= new controlPlayer();
    double timespend=0;
        try {
            if(Journey.getPlayer().getMyCharacter().getcurrentHp()<=50){
                 this.console.println("You´re Wounded, find something to improve your health ");
            }
            timespend = cp.addTime(num1, num2);
        } catch (CalculateTimeWayException ex) {
            ErrorView.display(this.getClass().getName() + " ", ex.getMessage());
        }
    this.console.println("You Spend " + timespend + " hours to travel to North Town");
    Journey.getPlayer().setCurrentCity(N);
    controlGame.resetCount();
    MovePlaceMenuView2 mpv= new MovePlaceMenuView2();
    mpv.display();        
}

private void dragonLand() {
    num1=this.returnPlaceId(currentPlace);
    currentPlace="D";
    num2=D;
    controlPlayer cp= new controlPlayer();
    double timespend=0;
        try {
            timespend = cp.addTime(num1, num2);
        } catch (CalculateTimeWayException ex) {
            this.console.println(ex.getMessage());
        }
    this.console.println("You Spend " + timespend + " hours to travel to Dragon Land");
    Journey.getPlayer().setCurrentCity(D);
    controlGame.resetCount();
    MovePlaceMenuView2 mpv= new MovePlaceMenuView2();
    mpv.display();
}

private void edelion() {
    num1=this.returnPlaceId(currentPlace);
    currentPlace="E";
    num2=E;
    controlPlayer cp= new controlPlayer();
    double timespend=0;
        try {
            timespend = cp.addTime(num1, num2);
        } catch (CalculateTimeWayException ex) {
           ErrorView.display(this.getClass().getName()+ " " ,ex.getMessage());
        }
    this.console.println("You Spend " + timespend + " hours to travel to Edelion");
    Journey.getPlayer().setCurrentCity(E);
    controlGame.resetCount();
    MovePlaceMenuView2 mpv= new MovePlaceMenuView2();
    mpv.display();
}

private void hiddenForest() {
    num1=this.returnPlaceId(currentPlace);
    currentPlace="H";
    num2=H;
    controlPlayer cp= new controlPlayer();
    double timespend=0;
        try {
            timespend = cp.addTime(num1, num2);
        } catch (CalculateTimeWayException ex) {
            ErrorView.display(this.getClass().getName()+ " ",ex.getMessage());
        }
    this.console.println("You Spend " + timespend + " hours to travel to Hidden Forest");
    Journey.getPlayer().setCurrentCity(H);
    controlGame.resetCount();
    MovePlaceMenuView2 mpv= new MovePlaceMenuView2();
    mpv.display();
}

private void etenTy() {
    num1=this.returnPlaceId(currentPlace);
    currentPlace="T";
    num2=T;
    controlPlayer cp= new controlPlayer();
    double timespend=0;
        try {
            timespend = cp.addTime(num1, num2);
        } catch (CalculateTimeWayException ex) {
            ErrorView.display(this.getClass().getName() + " " ,ex.getMessage());
        }
    this.console.println("You Spend " + timespend + " hours to travel to Eten Ty");
    Journey.getPlayer().setCurrentCity(T);
    controlGame.resetCount();
    MovePlaceMenuView2 mpv= new MovePlaceMenuView2();
    mpv.display();
}

private void southPort() {
    num1=this.returnPlaceId(currentPlace);
    currentPlace="S";
    num2=S;	
    controlPlayer cp= new controlPlayer();
    double timespend=0;
        try {
            timespend = cp.addTime(num1, num2);
        } catch (CalculateTimeWayException ex) {
            ErrorView.display(this.getClass().getName() + " " ,ex.getMessage());
        }
    this.console.println("You Spend " + timespend + " hours to travel to South Port");
    Journey.getPlayer().setCurrentCity(S);
    controlGame.resetCount();
    MovePlaceMenuView mpv= new MovePlaceMenuView();
    mpv.display();
}

private int returnPlaceId(String current){
    switch (current){
        case "N":
            return N;            
        case "D":
            return D;            
        case "E":
            return E;
        case "H":
            return H;
        case "T":
            return T;
        case "S":
            return S;
        default:
            return -1;
    }    
}

}

/*
"\n"
                 +"\n|                                          Move Menu                                        |"
                 +"\n---------------------------------------------------------------------------------------------"
                 +"\n---------------------------------------------------------------------------------------------"
                 +"\n                         @@,                                                                 "
                 +"\n                       @@` +@@:                                                              "
                 +"\n                     #@.      '@@#@@@@@@@@;.                                                 "
                 +"\n                     @                    ,+@@@@@`                                           "
                 +"\n                     @@,                        `@@'                                         "
                 +"\n                       +@@;  @                     ;@@`    :++;;,.   ,+@@@@@`                "  
                 +"\n                     .@,                        ##                               `@          "
                 +"\n                     @                             N-North Town                    @@@@@#    "
                 +"\n                @@@@@                                                                     0@@"
                 +"\n               ',          ;##                                                              @"
                 +"\n               ,'           #    D-Dragon Land                                             @ "
                 +"\n           '@                                                                         ;@@@/  "
                 +"\n           @                                   ##  E-Edelion                         ;@      "
                 +"\n           @                                    #                                    @       "       
                 +"\n            @@                                                                  `@@@@        "
                 +"\n             @                ##  T-Eten ty                                     @            "
                 +"\n             @                #                                               @`             "
                 +"\n            +,                                  @@@@,@                        `#             "
                 +"\n            +,                                  @@@@,@                        `#             "
                 +"\n            @                                 @@@@@@@@@      H-hidden forest  @              "
                 +"\n           @`                         @@@@@@@@@@@@@@@@@@@                @   `               "
                 +"\n            ';                         @@@@@@@@@@@@@@@@@@        `@@@@@                      "
                 +"\n             @                              @@@@@@@@@@@@       `@@                           "
                 +"\n             @    `@@@`                        @@@@@@@@      `@@                             "
                 +"\n             @  '@@   @@                                      @@                             "
                 +"\n             ,@@;      :@,                                    @                              "
                 +"\n                         @@     ##@ S- South port              @                             "
                 +"\n                          `@'   #                             @                              "
                 +"\n                            @@@@@@;@@                         :;                             "
                 +"\n                                   `@@,                       :#                             "
                 +"\n                                      #@@;               .#@@@'                              "
                 +"\n                                         ;@@@+` .;+@@@@@@+`                                  "
                 +"\n                                             .@@+;.                                          "
                 +"\n---------------------------------------------------------------------------------------------"
                 +"\n---------------------------------------------------------------------------------------------"
                 +"\n*/