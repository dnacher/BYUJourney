package journey.game;

import java.util.Scanner;
import journey.dialogs.Dialog;

public class GameHuman {
      public static void start(){
        Dialog.HumanStart();    
    }
    
    public static void answerStartQuestions(int choice){
    switch(choice){
        case 1:
            System.out.println("Great!, let´s go. we can´t wait no more");
            break;
        case 2:
            Dialog.noTime();
            Scanner inFile= new Scanner(System.in);
            int answer= inFile.nextInt();
            Answer2(answer);
            break;
        case 3:
            System.out.println("That answer suprised me, but you´re free. good luck!");
            break;         
    }    
    }
    
    public static void Answer2(int answer){
        if(answer==1){
            System.out.println("Great!, let´s go. we can´t wait no more");
        }
        else{
            System.out.println("That answer suprised me, but you´re free. good luck!");
        }
    }
}
