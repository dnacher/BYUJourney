package citbyu.cit260.journey.view.dialogs;

import citbyu.cit260.journey.model.Player;
import citbyu.cit260.journey.model.characters.Character;

public class Dialog {
    
    //this is the dialog of the beginning
    //this text was created with the help of this page http://patorjk.com/software/taag/
    public static void logo(){
        System.out.println("                   _______ _                 _                                              ");
        System.out.println("                  |__   __| |               | |                                             ");
        System.out.println("                     | |  | |__   ___       | | ___  _   _ _ __ _ __   ___ _   _            ");
        System.out.println("                     | |  | '_ \\ / _ \\  _   | |/ _ \\| | | | '__| '_ \\ / _ \\ | | |           ");
        System.out.println("                     | |  | | | |  __/ | |__| | (_) | |_| | |  | | | |  __/ |_| |           ");
        System.out.println("                     |_|  |_| |_|\\___|  \\____/ \\___/ \\__,_|_|  |_| |_|\\___|\\__, |           ");
        System.out.println("         __             _   _            _      _       _     _         _   __/ |           ");
        System.out.println("        / _|           | | | |          | |    (_)     | |   | |       | | |___/            ");
        System.out.println("       | |_ ___  _ __  | |_| |__   ___  | |     _  __ _| |__ | |_   ___| |_ ___  _ __   ___ ");
        System.out.println("       |  _/ _ \\| '__| | __| '_ \\ / _ \\ | |    | |/ _` | '_ \\| __| / __| __/ _ \\| '_ \\ / _ \\");
        System.out.println("       | || (_) | |    | |_| | | |  __/ | |____| | (_| | | | | |_  \\__ \\ || (_) | | | |  __/");
        System.out.println("       |_| \\___/|_|     \\__|_| |_|\\___| |______|_|\\__, |_| |_|\\__| |___/\\__\\___/|_| |_|\\___|");
        System.out.println("                                                   __/ |                                    ");
        System.out.println("                                                  |___/                                    ");
        System.out.println("");
        System.out.println("");            
    }
    
    public static void description(){
        System.out.println("                           All the races in Edelion are in a big danger");
        System.out.println("                    since the light stone were stolen from the great wizards.");
        System.out.println("");
        System.out.println("               The light stone can open a portal to a new world. depending on who is");
        System.out.println("                owning the stone if the light stone can save all the races or not.");
        System.out.println("");
        System.out.println("               Your task is to join the allied and enemy races to fight against the ");
        System.out.println("                                creatures that stole the light stone.");
        System.out.println("");
        System.out.println("               Discover where the light stones are and bringing back to the wizards.");
        System.out.println("");
    }
    
     public static void choosePlayerName(){
        System.out.println("Please type your name: ");         
    }
     
     public static void choosePlayerName2(){
      System.out.println("Don´t you have a name? come on, type something..: ");      
     }
     
      public static void choosePlayerName3(){
      System.out.println("What kind of name is just a space..come on be more creative: ");      
     }
     
    //this is the dialog of the beginning to choose a Race
    public static void chooseRace(){
        System.out.println("Please choose your race: ");
        System.out.println("1-Human");
        System.out.println("2-Elf");
        System.out.println("3-Wizard");        
    }
    
    //this is the dialog of the beginning if you put an incorrect choice
    public static void chooseRace2(){
        System.out.println("please choose a correct answer(number). it could be:");
        System.out.println("1-Human");
        System.out.println("2-Elf");
        System.out.println("3-Wizard");
    }
    
    public static void HelloWorld(Player p){
        System.out.println("Welcome to the Journey " + p.getName());       
    }
    
    public static void MainMenu(){
     System.out.println("*****************************");
     System.out.println("Please select an option:");
     System.out.println("1)- Go to the world of the light stone");
     System.out.println("2)- Edit your profile");     
     System.out.println("3)- Exit game");    
     System.out.println("*****************************");
    }
    
    public static void theChoice(Character c){
        System.out.println("you choose a " + c.getName() + " is that correct?");
        System.out.println("1-Yes");
        System.out.println("2-No. I want to change"); 
    }
    
    public static void asterisk(){
        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("*****************************");
    }
    
    public static void printInformation(Character c){
         System.out.println("Race: " + c.getName());
         System.out.println("hp: " + c.getcurrentHp());
         System.out.println("Karma: " + c.getKarma());
    }
    
    public static void HumanStart(){
     System.out.println("**************************************************************");
     System.out.println("**************************************************************");
     System.out.println("**************************************************************");
     System.out.println("You wake up outside of the big wall that protect a great city");     
     System.out.println("You don´t remember what Happend");    
     System.out.println("The only things you have is a cape, a sword and an old map");   
     System.out.println();
     System.out.println();
     System.out.println("\"Captain\"");
     System.out.println("You hear a voice");
     System.out.println("you turn your head and see a tall and big guy with a great sword in his hands.");
     System.out.println("Are you going to help us on the bridge or are you going to go with the army to the north?");
     System.out.println();
     System.out.println();
     System.out.println("1- Yes, I will help you, I don´t like the cold weather in the north");
     System.out.println("2- Wait, I don´t know what happend. please explain to me");
     System.out.println("3- No, I want to travel to the north. I ´ve never been there");
    }
    
    public static void noTime(){
     System.out.println("we don´t have time to explain. the orcs are atacking our city, help here or in the bridge in the north");
     System.out.println("1-Ok, I´ll help you");
     System.out.println("2-Well, I will Help People in the north");
    }
    
    public static void PrintMap(){
         System.out.println("                         @@,                                                                               ");
         System.out.println("                       @@` +@@:                                                                            ");
         System.out.println("                     #@.      '@@#@@@@@@@@;.                                                               ");
         System.out.println("                     @                    ,+@@@@@`                                                         ");
         System.out.println("                     @@,                        `@@'                                                       ");
         System.out.println("                       +@@;  @                     ;@@`    :++;;,.   ,+@@@@@`                              ");  
         System.out.println("                     .@,                        ##                               `@                        ");
         System.out.println("                     @                           # N-North Town                    @@@@@#                  ");
         System.out.println("                @@@@@                                                                     0@@              ");
         System.out.println("               ',          ;##                                                              @              ");
         System.out.println("               ,'           #    D-Dragon Land                                             @              ");
         System.out.println("           '@                                                                         ;@@@/                   ");
         System.out.println("           @                                   ##  E-Edelion                         ;@                    ");
         System.out.println("           @                                    #                                    @                     ");       
         System.out.println("            @@                                                                  `@@@@                      ");
         System.out.println("             @                ##  T-Eten ty                                     @                          ");
         System.out.println("             @                #                                               @`                          ");
         System.out.println("            +,                                  @@@@,@                        `#                           ");
         System.out.println("            +,                                  @@@@,@                        `#                           ");
         System.out.println("            @                                 @@@@@@@@@      H-hidden forest  @                            ");
         System.out.println("           @`                         @@@@@@@@@@@@@@@@@@@                   @`                             ");
         System.out.println("           .#                       @@@@@@@@@@@@@@@@@@@@                 #@                              ");
         System.out.println("            @                       @@@@@@@@@@@@@@@@@@@@@              ,@`                                ");
         System.out.println("            ';                         @@@@@@@@@@@@@@@@@@        `@@@@@                                  ");
         System.out.println("             @                              @@@@@@@@@@@@       `@@                                       ");
         System.out.println("             @    `@@@`                        @@@@@@@@      `@@                                         ");
         System.out.println("             @  '@@   @@                                      @@                                           ");
         System.out.println("             ,@@;      :@,                                    @                                            ");
         System.out.println("                         @@     ##@ S- South port              @                                            ");
         System.out.println("                          `@'   #                             @                                            ");
         System.out.println("                            @@@@@@;@@                         :;                                           ");
         System.out.println("                                   `@@,                       :#                                           ");
         System.out.println("                                      #@@;               .#@@@'                                            ");
         System.out.println("                                         ;@@@+` .;+@@@@@@+`                                                ");
         System.out.println("                                             .@@+;.                                                        ");
                   
    }
    
     //Characters a1= new Characters(100, 0, "Sword Man  ", 1);
        //Dialog.printBoardVoid();
        //Menus.MainMenu(); 
       // int dice1=Dice.rollDice();
        //int dice2=Dice.rollDice();
       // int total= dice1+ dice2;
       // System.out.println("Dice 1: " + dice1);
      //  System.out.println("Dice 2: " + dice2);
       // System.out.println("Total: " + total);
       // if(total>=8){
      //  System.out.println("you can summon a knight");
      //  }
      //  else{
      //  System.out.println("you cannot summon a knight");
      //  }
      //  int total= 0;
      //  for(int i=0; i<5;i++){            siempre
      //      total +=Dice.roll(i);
      //      System.out.println("Total: " + total);
      //       System.out.println("***************");
     //   }
        
       
      //  Warrior w1= new Warrior(Warriors.ORC,10);
       // Warrior w2= new Warrior(Warriors.EMPTY,-1);
      //  Characters c= new Characters(100, 0, 0, "name", -1);
      //  Warrior w[]=Battle.createList(Warriors.AXE_ORC, 0);
      //  Battle.printBoardFirst(w, c);
        
               //  System.out.println(Dice.rollDice());
               //  System.out.println(Dice.rollDice());

    public static void StartHelp() {
     System.out.println("*****************************");
     System.out.println("Please select an option:");
     System.out.println("1)- Start the game");     
     System.out.println("2)- Help/Instructions");       
     System.out.println("*****************************");
        
    }
    
    
}

