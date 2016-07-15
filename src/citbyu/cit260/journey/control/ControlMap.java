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
             Location l= new   Location("         Inn            ");             
             placesList[0][0]=l;
             Location l1= new  Location("         Inn            ");
             placesList[0][1]=l1;
             Location l2= new Location("         Inn            ");
             placesList[0][2]=l2;
             Location l3= new Location("         Inn            ");
             placesList[0][3]=l3;
             Location l4= new Location("         Inn            ");
             placesList[0][4]=l4;
             Location l5= new Location("         Inn            ");
             placesList[0][5]=l5;
             Location l6= new  Location("        Market          ");
             placesList[1][0]=l6;
             Location l7= new Location("        Market          ");
             placesList[1][1]=l7;
             Location l8= new Location("        Market          ");
             placesList[1][2]=l8;
             Location l9= new  Location("        Market          ");
             placesList[1][3]=l9;
             Location l10= new Location("        Market          ");
             placesList[1][4]=l10;
             Location l11= new Location("        Market          ");
             placesList[1][5]=l11;
             Location l12= new Location("        Gates           ");
             placesList[2][0]=l12;
             Location l13=  new Location("        Gates           ");
             placesList[2][1]=l13;
             Location l14= new Location("        Gates           "); 
             l14.setisVisited(true);
             placesList[2][2]=l14;
             Location l15= new  Location("        Gates           ");             
             placesList[2][3]=l15;
             Location l16= new  Location("        Gates           ");
             placesList[2][4]=l16;
             Location l17= new Location("         Dock           ");
             placesList[2][5]=l17;
             Location l18= new Location("         Farm           ");
             placesList[3][0]=l18;
             Location l19= new  Location("         Farm           ");             
             placesList[3][1]=l19;
             Location l20= new  Location("         Farm           ");             
             placesList[3][2]=l20;
             Location l21= new Location("         Farm           ");
             placesList[3][3]=l21;
             Location l22=new Location("         Farm           ");
             placesList[3][4]=l22;
             Location l23= new Location("         Farm           ");
             placesList[3][5]=l23;
             Location l24= new Location("        Castle          ");
             placesList[4][0]=l24;
             Location l25= new  Location("        Castle          ");
             placesList[4][1]=l25;
             Location l26= new  Location("        Castle          ");
             placesList[4][2]=l26;
             Location l27= new Location("        Castle          ");
             placesList[4][3]=l27;
             Location l28= new Location("        Castle          ");
             placesList[4][4]=l28;
             Location l29= new Location("        Castle          ");
             placesList[4][5]=l29;  
             return placesList;
        }
      
      /*
       North Town" 
       Dragon Land 
       Edelion
       Eten Ty
       Hidden Forest
       South Port */
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
      
    /*
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
                        if(locations[row][column] == map.getCurrentLocation()){
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
        }*/  
      
}
