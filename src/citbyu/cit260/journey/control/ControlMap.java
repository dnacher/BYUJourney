/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.control;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.enums.Dialogs;
import citbyu.cit260.journey.model.characters.Personages;
import citbyu.cit260.journey.model.map.Location;
import citbyu.cit260.journey.model.map.Map;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class ControlMap {
    
    protected final BufferedReader keyboard=Journey.getInFile();
    protected final PrintWriter console=Journey.getOutFile();
    
    public String createMap(Location[][] list){
             String leftIndicator;
             String rightIndicator;
             Map map = new Map(); // retreive the map from game
             Location[][] placesList=list;
             map.setPlacesList(placesList);
             Location[][] locations = map.getPlacesList(); // retreive the locations from map
             String finalString="";
         
            finalString+="\n  |";
                for( int column = 0; column < locations[0].length; column++){
                   String str= getCity(column);
                    finalString+=str+ "|"; // print col numbers to side of map
                }
            finalString+="\n";
                for( int row = 0; row < locations.length; row++){
                    finalString+= row + " "; // print row numbers to side of map
                    for( int column = 0; column < locations[row].length; column++){
                        leftIndicator = " ";
                        rightIndicator = " ";
                        if(row==Journey.getPlayer().getCurrentCity() && column==Journey.getPlayer().getCurrentPlace()){
                            //  if(locations[row][column] == map.getCurrentLocation()){
                            leftIndicator = "*"; // can be stars or whatever these are indicators showing visited
                            rightIndicator = "*"; // same as above
                        } 
                        else if(locations[row][column].isVisited()){
                            leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                            rightIndicator = "<"; // same as above
                        }
                        finalString+="|"; // start map with a |
                        if(locations[row][column].getScene() == null)
                            finalString+=leftIndicator + "??" + rightIndicator;
                        else
                            finalString+=leftIndicator + locations[row][column].getScene() + rightIndicator;
                    }
                    finalString+="|";
                    finalString+="\n";
                }                
        return finalString;
        }
    
    
    /*0-North Town 
    1-Dragon Land 
    2-Edelion
    3-Eten Ty
    4-Hidden Forest
    5-South Port 
        
    0-Inn
    1-Market
    2-Gates
    3-Dock                 
    4-Castle*/
        //Location [Place][City]
      public static Location[][] createLocationList(){
        Location[][] placesList=new Location[5][6];           
             placesList=addLocations(placesList, "         Inn            ",0);
             placesList=addLocations(placesList, "        Market          ",1);             
             placesList=addLocations(placesList, "        Gates           ",2);
             placesList=addLocations(placesList, "         Farm           ",3);
             placesList=addLocations(placesList, "        Castle          ",4);            
             Location l= new Location("         Dock           ");
             
             placesList[2][5]=l;           
             return placesList;
        }
      
      public static Location[][] addLocations(Location[][] placesList, String scene, int place){
          for(int x=0;x<6;x++){
              Location l= new Location(scene);
              if(place==2 && x==2){
                  l.setisVisited(true);
              }              
              placesList[place][x]=l;
          }
          return placesList;
      }      
     
      public String getCity(int num){
          String str;
          switch(num){
              case 0:
                  str="       North Town         ";                      
                  break;                  
              case 1:
                  str="      Dragon Land         ";
                  break;
              case 2:
                  str="        Edelion           ";
                  break;
              case 3:
                  str="        Eten Ty           ";
                  break;
              case 4:
                  str="     Hidden Forest        ";
                  break;
              case 5:
                  str="       South Port         ";
                  break;
              default:
                  str="";
          }
          return str;
      }
      
      public static void updateMap(int place, int city){      
          Location[][] loc=Journey.getCurrentGame().getLocationList();
          loc[city][place].setisVisited(true);
          Journey.getCurrentGame().setLocationList(loc);
      }
      
      public static ArrayList<Personages> createPersonagesDialogs(){
        ArrayList<Personages> list= new ArrayList<>();
        Personages p= new Personages(Dialogs.OldMan, "an Old Man", false);
        list.add(p);        
        Personages p1= new Personages(Dialogs.Wizard, "a Wizard", false);
        list.add(p1);
        Personages p2= new Personages(Dialogs.Wizard2, "a Wizard", false);
        list.add(p2);
        Personages p3= new Personages(Dialogs.dwarf, "a Dwarf", false);
        list.add(p3);
        Personages p4= new Personages(Dialogs.dwarf2, "a Dwarf", false);
        list.add(p4);
        Personages p5= new Personages(Dialogs.nordicMan, "Nordic Man", false);
        list.add(p5);
        Personages p6= new Personages(Dialogs.nordicMan2, "Nordic Man", false);
        list.add(p6);
        Personages p7= new Personages(Dialogs.Carpenter, "Carenter", false);
        list.add(p7);
        Personages p8= new Personages(Dialogs.Carpenter2, "Carenter", false);
        list.add(p8);
        Personages p9= new Personages(Dialogs.BlackSmith, "BlackSmith", false);
        list.add(p9);
        Personages p10= new Personages(Dialogs.BlackSmith2, "BlackSmith", false);
        list.add(p10);
        Personages p11= new Personages(Dialogs.DragonHunter, "Dragon Hunter", false);
        list.add(p11);
        Personages p12= new Personages(Dialogs.DragonHunter2, "Dragon Hunter", false);
        list.add(p12);
        Personages p13= new Personages(Dialogs.Farmer, "Farmer", false);
        list.add(p13);
        Personages p14= new Personages(Dialogs.Farmer2, "Farmer", false);
        list.add(p14);
        Personages p15= new Personages(Dialogs.Soldier, "Soldier", false);
        list.add(p15);
        Personages p16= new Personages(Dialogs.Soldier2, "Soldier", false);
        list.add(p16);
        Personages p17= new Personages(Dialogs.RetiredSoldier, "Retired Soldier", false);
        list.add(p17);
        Personages p18= new Personages(Dialogs.RetiredSoldier2, "Retired Soldier", false);
        list.add(p18);
        Personages p19= new Personages(Dialogs.Hunter, "Hunter", false);
        list.add(p19);
        Personages p20= new Personages(Dialogs.Hunter2, "Hunter", false);
        list.add(p20);
        Personages p21= new Personages(Dialogs.DragonBorn, "DragonBorn", false);
        list.add(p21);
        Personages p22= new Personages(Dialogs.DragonBorn2, "DragonBorn", false);
        list.add(p22);
        Personages p23= new Personages(Dialogs.Elf, "Elf", false);
        list.add(p23);
        Personages p24= new Personages(Dialogs.Elf2, "Elf", false);
        list.add(p24);
        Personages p25= new Personages(Dialogs.SailorMan, "Sailor Man", false);
        list.add(p25);
        Personages p26= new Personages(Dialogs.SailorMan2, "Sailor Man", false);
        list.add(p26);
        Personages p27= new Personages(Dialogs.ShipCaptain, "Ship Captain", false);
        list.add(p27);
        Personages p28= new Personages(Dialogs.ShipCaptain2, "Ship Captain", false);
        list.add(p28); 
        Personages p29= new Personages(Dialogs.OldMan2, "an Old Man", false);
        list.add(p29);
        return list;
    }
      
}
