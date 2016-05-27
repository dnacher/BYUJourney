/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.control;

import citbyu.cit260.journey.model.Player.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class controlPlayerTest {
    
    public controlPlayerTest() {
    }

    /**
     * Test of calculateTime method, of class controlPlayer.
     */
    @Test
    public void testCalculateTime() {
        System.out.println("calculateTime");
        int way = 1;
        int distance = 50;
        controlPlayer instance = new controlPlayer();
        int expResult = 10;
        int result = instance.calculateTime(way, distance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
