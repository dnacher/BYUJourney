package citbyu.cit260.journey.model.game;

import java.util.Scanner;
import citbyu.cit260.journey.model.characters.Character;

public abstract class Game {
    
    
    public static void begin(Character user){
    
        switch(user.getId()){
            case 1:
               GameHuman.start();
               Scanner inFile;
                inFile= new Scanner(System.in);
                int choice= inFile.nextInt();
                GameHuman.answerStartQuestions(choice);
                break;
            case 2:
               // GameElf.start();
                break;
            case 3:
              //   GameWizard.start();
                break;
        
        }
        
    }
    
    
    
  
}

