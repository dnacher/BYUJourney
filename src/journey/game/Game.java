package journey.game;

import java.util.Scanner;
import journey.characters.Characters;

public abstract class Game {
    
    
    public static void begin(Characters user){
    
        switch(user.getId()){
            case 1:
               GameHuman.start();
               Scanner inFile;
                inFile= new Scanner(System.in);
                int choice= inFile.nextInt();
                GameHuman.answerStartQuestions(choice);
                break;
            case 2:
                GameElf.start();
                break;
            case 3:
                 GameWizard.start();
                break;
        
        }
        
    }
    
    
    
  
}

