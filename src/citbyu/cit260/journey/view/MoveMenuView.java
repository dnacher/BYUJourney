/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.control.controlPlayer;
import java.util.Scanner;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class MoveMenuView extends View{
    
    private String menu;
    private String currentPlace="E";
    private int num1=0;
    private int num2=0;
    private final int N=1;
    private final int D=2;
    private final int E=3;
    private final int T=4;
    private final int H=5;
    private final int S=6;
   
    
    
    public MoveMenuView(){
    
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
                 +"\nQ Return Main Menu");
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
			System.out.println("\n*** Invalid selection *** Try again");
			break;
	}	
	return answer;
    }
    
   
private void northTown() {
    num1=this.returnPlaceId(currentPlace);
    currentPlace="N";
    num2=1;
    controlPlayer cp= new controlPlayer();
    double distance=cp.substractPositive(num1, num2);
    double Time=cp.calculateTime(1, distance, false);
    System.out.println("You Spend " + Time + " hours to travel to North Town");
        
}

private void dragonLand() {
    num1=this.returnPlaceId(currentPlace);
    currentPlace="D";
    num2=2;
    controlPlayer cp= new controlPlayer();
    double distance=cp.substractPositive(num1, num2);
    double Time=cp.calculateTime(1, distance, false);
    System.out.println("You Spend " + Time + " hours to travel to Dragon Land");
}

private void edelion() {
    num1=this.returnPlaceId(currentPlace);
    currentPlace="E";
    num2=3;
    controlPlayer cp= new controlPlayer();
    double distance=cp.substractPositive(num1, num2);
    double Time=cp.calculateTime(1, distance, false);
    System.out.println("You Spend " + Time + " hours to travel to Edelion");
}

private void hiddenForest() {
    num1=this.returnPlaceId(currentPlace);
    currentPlace="H";
    num2=4;
    controlPlayer cp= new controlPlayer();
    double distance=cp.substractPositive(num1, num2);
    double Time=cp.calculateTime(1, distance, false);
    System.out.println("You Spend " + Time + " hours to travel to Hidden Forest");
}

private void etenTy() {
    num1=this.returnPlaceId(currentPlace);
    currentPlace="T";
    num2=5;
    controlPlayer cp= new controlPlayer();
    double distance=cp.substractPositive(num1, num2);
    double Time=cp.calculateTime(1, distance, false);
    System.out.println("You Spend " + Time + " hours to travel to Eten Ty");
}

private void southPort() {
    num1=this.returnPlaceId(currentPlace);
    currentPlace="S";
    num2=6;	
    controlPlayer cp= new controlPlayer();
    double distance=cp.substractPositive(num1, num2);
    double Time=cp.calculateTime(1, distance, false);
    System.out.println("You Spend " + Time + " hours to travel to South Port");
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

private void displayMainMenuView() {
	this.display();
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