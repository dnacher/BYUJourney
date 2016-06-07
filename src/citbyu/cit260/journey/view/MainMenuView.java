package citbyu.cit260.journey.view;

public class MainMenuView {
    
    private String menu;
    
    public MainMenuView(){
    
        this.menu="\n"
                 +"\n----------------------------------"
                 +"\n----------------------------------"
                 +"\n|Main Menu                       |"
                 +"\n----------------------------------"
                 +"\nN Start New Game"
                 +"\nG Get and Start saved Game"
                 +"\nH Get help on how to play the Game"
                 +"\nS Save Game"
                 +"\nQ Quit Game"
                 +"\n----------------------------------";
    }
    
    void displayMainMenuView(){
        boolean done = false;
        do{
            String menuOption=this.getMenuOption();            
            if(menuOption.toUpperCase().equals("Q"))
                return;
            done= this.doAction(menuOption);
        }
        while(!done);
        
    }
    
    private String getMenuOption(){
        System.out.println("**GetMenuOption**");
        return "N";
    }
    
    private boolean doAction(String menuOption){
        System.out.println("**doAction*");
        return true;
    }
}
