package citbyu.cit260.journey;

import java.util.List;
import citbyu.cit260.journey.model.characters.Character;
import citbyu.cit260.journey.view.StartProgramView;


public class Journey {     
    
    private List<Character>PlayerList;

    public static void main(String[] args) {
       
        //StartProgramView.displayStartProgramView();     
        StartProgramView startProgView= new StartProgramView();
        startProgView.displayStartProgramView();
        
    }
    
    
}
