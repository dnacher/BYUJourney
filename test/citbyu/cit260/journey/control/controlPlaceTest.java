package citbyu.cit260.journey.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class controlPlaceTest {
    
    public controlPlaceTest() {
    }

    @Test
    public void testEnoughLight1() {
        System.out.println("enoughLight");
        int height = 3;
        int width = 2;
        int depth = 4;
        int powerLight = 10;
        controlPlace instance = new controlPlace();
        int expResult = 98;
        int result = instance.enoughLight(height, width, depth, powerLight);
        assertEquals(expResult, result);       
    }
    
     @Test
    public void testEnoughLight2() {
        System.out.println("enoughLight");
        int height = 5;
        int width = 4;
        int depth = 10;
        int powerLight = 20;
        controlPlace instance = new controlPlace();
        int expResult = 90;
        int result = instance.enoughLight(height, width, depth, powerLight);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testEnoughLight3() {
        System.out.println("enoughLight");
        int height = 8;
        int width = 1;
        int depth = 1;
        int powerLight = 8;
        controlPlace instance = new controlPlace();
        int expResult = 99;
        int result = instance.enoughLight(height, width, depth, powerLight);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testEnoughLight4() {
        System.out.println("enoughLight");
        int height = 0;
        int width = 40;
        int depth = 2;
        int powerLight = 10;
        controlPlace instance = new controlPlace();
        int expResult = 100;
        int result = instance.enoughLight(height, width, depth, powerLight);
        assertEquals(expResult, result);
      
    }
    
     @Test
    public void testEnoughLight5() {
        System.out.println("enoughLight");
        int height = -1;
        int width = 10;
        int depth = 150;
        int powerLight = 120;
        controlPlace instance = new controlPlace();
        int expResult = -1;
        int result = instance.enoughLight(height, width, depth, powerLight);
        assertEquals(expResult, result);
      
    }
    
     @Test
    public void testEnoughLight6() {
        System.out.println("enoughLight");
        int height = 2;
        int width = -5;
        int depth = 8;
        int powerLight = 7;
        controlPlace instance = new controlPlace();
        int expResult = -1;
        int result = instance.enoughLight(height, width, depth, powerLight);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testEnoughLight7() {
        System.out.println("enoughLight");
        int height = 3;
        int width = 5;
        int depth = 5;
        int powerLight = -10;
        controlPlace instance = new controlPlace();
        int expResult = -1;
        int result = instance.enoughLight(height, width, depth, powerLight);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testEnoughLight8() {
        System.out.println("enoughLight");
        int height = 2;
        int width = 40;
        int depth = -8;
        int powerLight = 7;
        controlPlace instance = new controlPlace();
        int expResult = -1;
        int result = instance.enoughLight(height, width, depth, powerLight);
        assertEquals(expResult, result);
       
    }
    
}
