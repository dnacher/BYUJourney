package journey.game.dialogs;

import journey.characters.Characters;

public class Dialog {
    
    //this is the dialog of the beginning
    //this text was created with the help of this page http://patorjk.com/software/taag/
    public static void dialog1(){
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
        System.out.println("Please choose your race: ");
        System.out.println("1-Human");
        System.out.println("2-Elf");
        System.out.println("3-Wizard");    
    }
    
    //this is the dialog of the beginning 
    public static void dialog2(){
        System.out.println("please choose a correct answer(number). it could be:");
        System.out.println("1-Human");
        System.out.println("2-Elf");
        System.out.println("3-Wizard");
    }
    
    public static void humanChoice(){
        System.out.println("you choose a Human. is that correct?");
        System.out.println("1-Yes");
        System.out.println("2-No. I want to change"); 
    }
    
    public static void elfChoice(){
        System.out.println("You choose an Elf. is that correct?");
        System.out.println("1-Yes");
        System.out.println("2-No. I want to change"); 
    }
    
    public static void wizardChoice(){
        System.out.println("You choose a Wizard. is that correct?");
        System.out.println("1-Yes");
        System.out.println("2-No. I want to change");
    }
    
    public static void youSure(){
        System.out.println("Do you like your choice?:");
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
    
    public static void printInformation(Characters c){
         System.out.println("Race: " + c.getName());
         System.out.println("hp: " + c.getHp());
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
         System.out.println("                     @                           # 1-North Town                    @@@@@#                  ");
         System.out.println("                @@@@@                                                                     0@@              ");
         System.out.println("               ',          ;##                                                              @              ");
         System.out.println("               ,'           #    2-Dragon Land                                             @              ");
         System.out.println("           '@                                                                         ;@@@/                   ");
         System.out.println("           @                                   ##  3-Edelion                         ;@                    ");
         System.out.println("           @                                    #                                    @                     ");       
         System.out.println("            @@                                                                  `@@@@                      ");
         System.out.println("             @                ##  4-Eten ty                                     @                          ");
         System.out.println("             @                #                                               @`                          ");
         System.out.println("            +,                                  @@@@,@                        `#                           ");
         System.out.println("            +,                                  @@@@,@                        `#                           ");
         System.out.println("            @                                 @@@@@@@@@      6-hidden forest  @                            ");
         System.out.println("           @`                         @@@@@@@@@@@@@@@@@@@                   @`                             ");
         System.out.println("           .#                       @@@@@@@@@@@@@@@@@@@@                 #@                              ");
         System.out.println("            @                       @@@@@@@@@@@@@@@@@@@@@              ,@`                                ");
         System.out.println("            ';                         @@@@@@@@@@@@@@@@@@        `@@@@@                                  ");
         System.out.println("             @                              @@@@@@@@@@@@       `@@                                       ");
         System.out.println("             @    `@@@`                        @@@@@@@@      `@@                                         ");
         System.out.println("             @  '@@   @@                                      @@                                           ");
         System.out.println("             ,@@;      :@,                                    @                                            ");
         System.out.println("                         @@     ##@ 5- South port              @                                            ");
         System.out.println("                          `@'   #                             @                                            ");
         System.out.println("                            @@@@@@;@@                         :;                                           ");
         System.out.println("                                   `@@,                       :#                                           ");
         System.out.println("                                      #@@;               .#@@@'                                            ");
         System.out.println("                                         ;@@@+` .;+@@@@@@+`                                                ");
         System.out.println("                                             .@@+;.                                                        ");
                   
    }
}

