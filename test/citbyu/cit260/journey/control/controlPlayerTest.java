package citbyu.cit260.journey.control;

import citbyu.cit260.journey.model.Player.Player;
import org.junit.Test;
import static org.junit.Assert.*;


public class controlPlayerTest {
    
    public controlPlayerTest() {
    }
   
    @Test
    public void testCalculateTime() {
        System.out.println("calculateTime");
        int way = 1;
        int distance = 50;
        controlPlayer instance = new controlPlayer();
        int expResult = 10;
        int result = instance.calculateTime(way, distance);
        assertEquals(expResult, result);            
    }
    
    public void testCalculateTime2() {
        System.out.println("calculateTime");
        int way = 2;
        int distance = 70;
        controlPlayer instance = new controlPlayer();
        int expResult = 5;
        int result = instance.calculateTime(way, distance);
        assertEquals(expResult, result);            
    }
    
    public void testCalculateTime3() {
        System.out.println("calculateTime");
        int way = 1;
        int distance = 150;
        controlPlayer instance = new controlPlayer();
        int expResult = 30;
        int result = instance.calculateTime(way, distance);
        assertEquals(expResult, result);            
    }
    
    public void testCalculateTime4() {
        System.out.println("calculateTime");
        int way = 2;
        int distance = 180;
        controlPlayer instance = new controlPlayer();
        int expResult = 12;
        int result = instance.calculateTime(way, distance);
        assertEquals(expResult, result);            
    }
    
    public void testCalculateTime5() {
        System.out.println("calculateTime");
        int way = 3;
        int distance = 140;
        controlPlayer instance = new controlPlayer();
        int expResult = -1;
        int result = instance.calculateTime(way, distance);
        assertEquals(expResult, result);            
    }
    
    public void testCalculateTime6() {
        System.out.println("calculateTime");
        int way = 2;
        int distance = -140;
        controlPlayer instance = new controlPlayer();
        int expResult = -1;
        int result = instance.calculateTime(way, distance);
        assertEquals(expResult, result);            
    }
    
    public void testCalculateTime7() {
        System.out.println("calculateTime");
        int way = 0;
        int distance = 0;
        controlPlayer instance = new controlPlayer();
        int expResult = -1;
        int result = instance.calculateTime(way, distance);
        assertEquals(expResult, result);            
    }
       

    /**
     * Test of lookForItem method, of class controlPlayer.
     */
    @Test
    public void testLookForItem() {
        System.out.println("lookForItem");
        int Level = 0;
        int LevelPlayer = 10;
        controlPlayer instance = new controlPlayer();
        boolean expResult = true;
        boolean result = instance.lookForItem(Level, LevelPlayer);
        assertEquals(expResult, result);        
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
