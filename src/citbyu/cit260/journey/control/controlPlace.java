package citbyu.cit260.journey.control;

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
    
}
