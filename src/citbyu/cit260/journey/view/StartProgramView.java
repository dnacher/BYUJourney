package citbyu.cit260.journey.view;

import citbyu.cit260.journey.control.controlGame;
import citbyu.cit260.journey.view.dialogs.Dialog;

public class StartProgramView {
    
    
    public static void displayStartProgramView(){
        Dialog.logo();
        Dialog.description();
        Dialog.choosePlayerName();
        controlGame.createThePlayer();
    }
}
