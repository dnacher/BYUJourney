package citbyu.cit260.journey;

import citbyu.cit260.journey.model.Player;
import citbyu.cit260.journey.model.Game;
import citbyu.cit260.journey.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Journey {     
    
    private static Game currentGame= null;
    
    private static PrintWriter outFile=null;
    private static BufferedReader inFile=null;
    private static PrintWriter logFile=null;

    //getters and setters for the files of the game
    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Journey.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Journey.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Journey.inFile = inFile;
    }
   //*******end of getters and setters for the files of the game
    
   
    //getters and setters for the Game
    public static Game getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame){
        Journey.currentGame=currentGame;
    }
    
    
    //***********getters and setters inside the Game object. to be easier
    public static Player getPlayer(){
        return currentGame.getPlayer();
    }
    
    public static void setPlayer(Player player){
        //this if statement is to verify if the currentGame is null. 
        //if we don´t have this check the game will crash since cannot set a value in a null object
       if(currentGame==null){
           Game game= new Game();
           currentGame=game;       
       }
       currentGame.setPlayer(player);       
    }
    
     public static String getSummonCreatures() {
        return currentGame.getSummonCreatures();
    }

    public static void setSummonCreatures(String summonCreatures) {
        currentGame.setSummonCreatures(summonCreatures);
    }
    //********end of the getters and setters
    //********end of the getters and setters from the game

   
    
    public static void main(String[] args) {
        
        try{
            Journey.inFile=new BufferedReader(new InputStreamReader(System.in));
            Journey.outFile=new PrintWriter(System.out, true);
            // open log file
            String filePath="log.txt";
            Journey.logFile= new PrintWriter(filePath);
            StartProgramView spv= new StartProgramView();
            spv.display();
            return;
        }
        catch(Throwable e){
        
            System.out.println("Exception: " + e.toString() +
                             "\nCause: " + e.getCause() +
                             "\nMessage: " + e.getMessage());
            e.printStackTrace();
        }
        finally{
            try {
                if(Journey.inFile!=null)
                Journey.inFile.close();
                if(Journey.outFile!=null)
                Journey.outFile.close();
                if(Journey.logFile!=null)
                Journey.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            
        }
    }
    
    }
    
    

