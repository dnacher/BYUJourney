package citbyu.cit260.journey.control;

import citbyu.cit260.journey.model.Player.Player;
import org.junit.Test;
import static org.junit.Assert.*;


public class controlPlayerTest {
    
    public controlPlayerTest() {
    }
   
   
    @Test
    public void testHandleWeight1() {
        System.out.println("handleWeight");
        double totalWeight = 20.0;
        double currentWeight = 0.0;
        int LevelPlayer = 0;
        controlPlayer instance = new controlPlayer();
        boolean expResult = true;
        boolean result = instance.handleWeight(totalWeight, currentWeight, LevelPlayer);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testHandleWeight2() {
        System.out.println("handleWeight");
        double totalWeight = 20.0;
        double currentWeight = 0.0;
        int LevelPlayer = 1;
        controlPlayer instance = new controlPlayer();
        boolean expResult = true;
        boolean result = instance.handleWeight(totalWeight, currentWeight, LevelPlayer);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testHandleWeight3() {
        System.out.println("handleWeight");
        double totalWeight = 20.0;
        double currentWeight = 7.0;
        int LevelPlayer = 2;
        controlPlayer instance = new controlPlayer();
        boolean expResult = false;
        boolean result = instance.handleWeight(totalWeight, currentWeight, LevelPlayer);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testHandleWeight4() {
        System.out.println("handleWeight");
        double totalWeight = 20.0;
        double currentWeight = 0.0;
        int LevelPlayer = 3;
        controlPlayer instance = new controlPlayer();
        boolean expResult = true;
        boolean result = instance.handleWeight(totalWeight, currentWeight, LevelPlayer);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testHandleWeight5() {
        System.out.println("handleWeight");
        double totalWeight = -2;
        double currentWeight = 0.0;
        int LevelPlayer = 0;
        controlPlayer instance = new controlPlayer();
        boolean expResult = false;
        boolean result = instance.handleWeight(totalWeight, currentWeight, LevelPlayer);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testHandleWeight6() {
        System.out.println("handleWeight");
        double totalWeight = 20.0;
        double currentWeight = -4.0;
        int LevelPlayer = 0;
        controlPlayer instance = new controlPlayer();
        boolean expResult = false;
        boolean result = instance.handleWeight(totalWeight, currentWeight, LevelPlayer);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testHandleWeight7() {
        System.out.println("handleWeight");
        double totalWeight = 20.0;
        double currentWeight = 0.0;
        int LevelPlayer = -5;
        controlPlayer instance = new controlPlayer();
        boolean expResult = false;
        boolean result = instance.handleWeight(totalWeight, currentWeight, LevelPlayer);
        assertEquals(expResult, result);       
    }

   
    @Test
    public void testCalculateTime1() {
        System.out.println("calculateTime");
        int way = 1;
        int distance = 50;
        boolean wounded = false;
        controlPlayer instance = new controlPlayer();
        double expResult = 10.0;
        double result = instance.calculateTime(way, distance, wounded);
        assertEquals(expResult, result, 0.0);       
    }
    
    @Test
    public void testCalculateTime2() {
        System.out.println("calculateTime");
        int way = 2;
        int distance = 70;
        boolean wounded = false;
        controlPlayer instance = new controlPlayer();
        double expResult = 5.0;
        double result = instance.calculateTime(way, distance, wounded);
        assertEquals(expResult, result, 0.0);       
    }
    @Test
    public void testCalculateTime3() {
        System.out.println("calculateTime");
        int way = 1;
        int distance = 150;
        boolean wounded = false;
        controlPlayer instance = new controlPlayer();
        double expResult = 30.0;
        double result = instance.calculateTime(way, distance, wounded);
        assertEquals(expResult, result, 0.0);       
    }
    @Test
    public void testCalculateTime4() {
        System.out.println("calculateTime");
        int way = 2;
        int distance = 140;
        boolean wounded = true;
        controlPlayer instance = new controlPlayer();
        double expResult = 12;
        double result = instance.calculateTime(way, distance, wounded);
        assertEquals(expResult, result, 0.0);       
    }
    @Test
    public void testCalculateTime5() {
        System.out.println("calculateTime");
        int way = 3;
        int distance = 140;
        boolean wounded = false;
        controlPlayer instance = new controlPlayer();
        double expResult = -1.0;
        double result = instance.calculateTime(way, distance, wounded);
        assertEquals(expResult, result, 0.0);       
    }
    @Test
    public void testCalculateTime6() {
        System.out.println("calculateTime");
        int way = 2;
        int distance = -140;
        boolean wounded = false;
        controlPlayer instance = new controlPlayer();
        double expResult = -1.0;
        double result = instance.calculateTime(way, distance, wounded);
        assertEquals(expResult, result, 0.0);       
    }
    @Test
    public void testCalculateTime7() {
        System.out.println("calculateTime");
        int way = 0;
        int distance = 0;
        boolean wounded = false;
        controlPlayer instance = new controlPlayer();
        double expResult = -1.0;
        double result = instance.calculateTime(way, distance, wounded);
        assertEquals(expResult, result, 0.0);       
    }

    
    @Test
    public void testLookForItem1() {
        System.out.println("lookForItem");
        int Level = 1;
        int LevelPlayer = 10;
        boolean lucky = false;
        controlPlayer instance = new controlPlayer();
        boolean expResult = true;
        boolean result = instance.lookForItem(Level, LevelPlayer, lucky);
        assertEquals(expResult, result);        
    }
    @Test
    public void testLookForItem2() {
        System.out.println("lookForItem");
        int Level = 2;
        int LevelPlayer = 25;
        boolean lucky = true;
        controlPlayer instance = new controlPlayer();
        boolean expResult = true;
        boolean result = instance.lookForItem(Level, LevelPlayer, lucky);
        assertEquals(expResult, result);        
    }
    @Test
    public void testLookForItem3() {
        System.out.println("lookForItem");
        int Level = 3;
        int LevelPlayer = 0;
        boolean lucky = false;
        controlPlayer instance = new controlPlayer();
        boolean expResult = false;
        boolean result = instance.lookForItem(Level, LevelPlayer, lucky);
        assertEquals(expResult, result);        
    }
    @Test
    public void testLookForItem4() {
        System.out.println("lookForItem");
        int Level = 1;
        int LevelPlayer = 50;
        boolean lucky = false;
        controlPlayer instance = new controlPlayer();
        boolean expResult = true;
        boolean result = instance.lookForItem(Level, LevelPlayer, lucky);
        assertEquals(expResult, result);        
    }
    @Test
    public void testLookForItem5() {
        System.out.println("lookForItem");
        int Level = 7;
        int LevelPlayer = 1;
        boolean lucky = true;
        controlPlayer instance = new controlPlayer();
        boolean expResult = false;
        boolean result = instance.lookForItem(Level, LevelPlayer, lucky);
        assertEquals(expResult, result);        
    }
    @Test
    public void testLookForItem6() {
        System.out.println("lookForItem");
        int Level = 15;
        int LevelPlayer = 10;
        boolean lucky = false;
        controlPlayer instance = new controlPlayer();
        boolean expResult = false;
        boolean result = instance.lookForItem(Level, LevelPlayer, lucky);
        assertEquals(expResult, result);        
    }
    @Test
    public void testLookForItem7() {
        System.out.println("lookForItem");
        int Level = -2;
        int LevelPlayer = 5;
        boolean lucky = false;
        controlPlayer instance = new controlPlayer();
        boolean expResult = false;
        boolean result = instance.lookForItem(Level, LevelPlayer, lucky);
        assertEquals(expResult, result);        
    }
    

    
    @Test
    public void testAttack() {
        System.out.println("attack");
        boolean lucky = false;
        int power = 0;
        int armor = 0;
        int life = 0;
        controlPlayer instance = new controlPlayer();
        double expResult = 0.0;
        double result = instance.attack(lucky, power, armor, life);
        assertEquals(expResult, result, 0.0);       
    }
    
    @Test
    public void testAttack1() {
        System.out.println("attack");
        boolean lucky = false;
        int power = 1;
        int armor = 1;
        int life = 1;
        controlPlayer instance = new controlPlayer();
        double expResult = 1.0;
        double result = instance.attack(lucky, power, armor, life);
        assertEquals(expResult, result, 0.0);       
    }
    
    @Test
    public void testAttack2() {
        System.out.println("attack");
        boolean lucky = false;
        int power = -1;
        int armor = 1;
        int life = 1;
        controlPlayer instance = new controlPlayer();
        double expResult = -1;
        double result = instance.attack(lucky, power, armor, life);
        assertEquals(expResult, result, 0.0);       
    }
   
    @Test
    public void testAttack3() {
        System.out.println("attack");
        boolean lucky = false;
        int power = 1;
        int armor = -1;
        int life = 1;
        controlPlayer instance = new controlPlayer();
        double expResult = -1;
        double result = instance.attack(lucky, power, armor, life);
        assertEquals(expResult, result, 0.0);       
    }
    
    @Test
    public void testAttack4() {
        System.out.println("attack");
        boolean lucky = false;
        int power = 1;
        int armor = 1;
        int life = -1;
        controlPlayer instance = new controlPlayer();
        double expResult = -1;
        double result = instance.attack(lucky, power, armor, life);
        assertEquals(expResult, result, 0.0);       
    }
    
    @Test
    public void testAttack5() {
        System.out.println("attack");
        boolean lucky = false;
        int power = 3;
        int armor = 1;
        int life = 1;
        controlPlayer instance = new controlPlayer();
        double expResult = -1;
        double result = instance.attack(lucky, power, armor, life);
        assertEquals(expResult, result, 0.0);       
    }
    
    @Test
    public void testAttack6() {
        System.out.println("attack");
        boolean lucky = false;
        int power = 1;
        int armor = 1;
        int life = 5;
        controlPlayer instance = new controlPlayer();
        double expResult = 5;
        double result = instance.attack(lucky, power, armor, life);
        assertEquals(expResult, result, 0.0);       
    }
}
