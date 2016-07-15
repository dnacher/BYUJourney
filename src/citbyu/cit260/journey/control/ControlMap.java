/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.control;

import citbyu.cit260.journey.Journey;
import citbyu.cit260.journey.model.map.Location;
import citbyu.cit260.journey.model.map.Map;
import java.io.BufferedReader;
import java.io.PrintWriter;

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
      
}
