package citbyu.cit260.journey.control;

import citbyu.cit260.journey.model.characters.Warrior;
import citbyu.cit260.journey.model.characters.enums.Warriors;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class controlPlace {
    
    //this function will calculate if you have enough light or not to see
    public int enoughLight(int height, int width, int depth, int powerLight){
        
        if(height<0 || width<0 || depth<0 || powerLight<0){
        return -1;
        }
    int percentage=100;
    int area=height*width*depth;
    percentage-=area/powerLight;    
    return percentage;
    }
    
    public List<Warrior> moveEnemies(List<Warrior> originalList){
        List<Warrior> newList= new ArrayList();
        Warrior w= new Warrior(Warriors.EMPTY, 0);
        for(int i=0; i<originalList.size();i++){
            newList.add(i, w);
            newList.add(i+1, w);
            newList.add(i+2, w);
            newList.add(i+3, originalList.get(i));
        }
        return newList;
    }
    
    public controlPlace(){
    }
    
}
