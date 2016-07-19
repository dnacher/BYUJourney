package citbyu.cit260.journey.control;

import citbyu.cit260.journey.Journey;

public class ControlDialog {
     
    //this is the dialog of the beginning
    //this text was created with the help of this page http://patorjk.com/software/taag/
    public String logo(){
      String str="\n                   _______ _                 _                                              " +
                 "\n                  |__   __| |               | |                                             " +
                 "\n                     | |  | |__   ___       | | ___  _   _ _ __ _ __   ___ _   _            " +
                 "\n                     | |  | '_ \\ / _ \\  _   | |/ _ \\| | | | '__| '_ \\ / _ \\ | | |           " +
                 "\n                     | |  | | | |  __/ | |__| | (_) | |_| | |  | | | |  __/ |_| |           " +
                 "\n                     |_|  |_| |_|\\___|  \\____/ \\___/ \\__,_|_|  |_| |_|\\___|\\__, |           " +
                 "\n         __             _   _            _      _       _     _         _   __/ |           " +
                 "\n        / _|           | | | |          | |    (_)     | |   | |       | | |___/            " +
                 "\n       | |_ ___  _ __  | |_| |__   ___  | |     _  __ _| |__ | |_   ___| |_ ___  _ __   ___ " +
                 "\n       |  _/ _ \\| '__| | __| '_ \\ / _ \\ | |    | |/ _` | '_ \\| __| / __| __/ _ \\| '_ \\ / _ \\" +
                 "\n       | || (_) | |    | |_| | | |  __/ | |____| | (_| | | | | |_  \\__ \\ || (_) | | | |  __/" +
                 "\n       |_| \\___/|_|     \\__|_| |_|\\___| |______|_|\\__, |_| |_|\\__| |___/\\__\\___/|_| |_|\\___|" +
                 "\n                                                   __/ |                                    " +
                 "\n                                                  |___/                                    " +
                 "\n" +
                 "\n";   
        
       return str;         
    }
    
    public String description(){
        String str="\n                           All the races in Edelion are in a big danger" +
                           "\n                    since the light stone were stolen from the great wizards." +
                           "\n" +
                           "\n               The light stone can open a portal to a new world. depending on who is" +
                           "\n                owning the stone if the light stone can save all the races or not." +
                           "\n" +
                           "\n               Your task is to join the allied and enemy races to fight against the " +
                           "\n                                creatures that stole the light stone." +
                           "\n" +
                           "\n               Discover where the light stones are and bringing back to the wizards." +
                           "\n";    
      
        return str;
    }  
    
    public String HumanStart(){
     String str="\n**************************************************************" +
                        "\n**************************************************************" +
                        "\n**************************************************************" +
                        "\nYou wake up outside of the big wall that protect a great city" + 
                        "\nYou don´t remember what Happend" +
                        "\nThe only things you have is a cape, a sword and an old map" +
                        "\n" +
                        "\n" +
                        "\"Captain\"" +
                        "\n" +
                        "\nYou hear a voice" +
                        "\nyou turn your head and see a tall and big guy with a great sword in his hands." +
                        "\nAre you going to help us on the bridge or are you going to go with the army to the north?" +
                        "\n" +
                        "\n1- Yes, I will help you, I don´t like the cold weather in the north" +                        
                        "\n2- Wait, I don´t know what happend. please explain to me" +
                        "\n3- No, I want to travel to the north. I ´ve never been there";   
     return str;
    }
    
    public String ElfStart(){
            String str= "\n**************************************************************" +
                        "\n**************************************************************" +
                        "\n**************************************************************" +
                        "\nall your race is going to the Valinor -Land of the Valar- " + 
                        "\nyou are struggling in your mind since the time you hear about" +
                        "\nan object that could bring the war to all the races" +
                        "\nnow you need to choose an option" +  
                        "\n you hear a voice...." +
                        "\n" +
                        "\nour kindom is moving now " + Journey.getPlayer().getName() +
                        "\nWhat are you going to do?" +
                        "\n" +
                        "\n1- Go to the land of humans and help them find the Light stones" +                        
                        "\n2- Wait, I need to think first. it´s a very importan choice..." +
                        "\n3- No, I want to travel with my king";   
     return str;
    }
    
    public String WizardStart(){
             String str="\n**************************************************************" +
                        "\n**************************************************************" +
                        "\n**************************************************************" +
                        "\nthe master must be soon in the castle but you recieved bad news" + 
                        "\nthe light stones were stolen. the Elf and human are already doing" +
                        "\ntheir best to recover the light stones" +
                        "\n" +
                        "\n" +
                        Journey.getPlayer().getName() +
                        " What are we going to do?" +
                        "\n" +                        
                        "\n1- Let´s help them recover the light stones now" +                        
                        "\n2- Wait, we need to wait for the master" +
                        "\n3- We are going to look for the great book of magic in the mountains";   
     return str;
    }
    
    public String PrintRace(int optionMenu){
        
         String str="\n***************************************";
         switch(optionMenu){
            case 1:              
               str+="\n*** Hello " + Journey.getPlayer().getName() + " You´re a Human now ***";
                break;
            case 2:
                str+="\n*** Hello " + Journey.getPlayer().getName() + " You´re a Elf now ***";
                break;
            case 3:
                str+="\n*** Hello " + Journey.getPlayer().getName() + " You´re a Wizard now ***";
                break;
         }         
         str+="\n***************************************"+
              "\n***************************************";
         
         return str;
    }
    
}

