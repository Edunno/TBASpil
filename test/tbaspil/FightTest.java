/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbaspil;

import Player.Monster;
import Player.Monsters.Rioter;
import Player.Player;
import Rooms.Room;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author caspe
 */
public class FightTest {

    public FightTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of attack method, of class Fight.
     */
    @Test
    public void testAttack() {
        Rioter r = new Rioter();
        assertFalse(r.getHp() <= 0);
        Player p = new Player("navn", 10);
        assertTrue(p.getHealth() <= 0);
    }

    /**
     * Test of checkFight method, of class Fight.
     */
    @Test
    public void testCheckFight() {
        
    }

}
