package citbyu.cit260.journey.control;

import citbyu.cit260.journey.model.Player.Player;
import org.junit.Test;
import static org.junit.Assert.*;


public class controlPlayerTest {
    
    public controlPlayerTest() {
    }
   
    /**
     * Test of move method, of class controlPlayer.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int newPlace = 0;
        Player player = new Player();
        controlPlayer instance = new controlPlayer();
        int expResult = 0;
        int result = instance.move(newPlace, player);
        assertEquals(expResult, result);       
    }

    /**
     * Test of handleWeight method, of class controlPlayer.
     */
    @Test
    public void testHandleWeight() {
        System.out.println("handleWeight");
        double totalWeight = 20.0;
        double currentWeight = 1.0;
        int LevelPlayer = 2;
        controlPlayer instance = new controlPlayer();
        boolean expResult = true;
        boolean result = instance.handleWeight(totalWeight, currentWeight, LevelPlayer);
        assertEquals(expResult, result);       
    }

    /**
     * Test of sumNumbers method, of class controlPlayer.
     */
    @Test
    public void testSumNumbers() {
        System.out.println("sumNumbers");
        int number = 1;
        controlPlayer instance = new controlPlayer();
        int expResult = 1;
        int result = instance.sumNumbers(number);
        assertEquals(expResult, result);       
    }
    
}
