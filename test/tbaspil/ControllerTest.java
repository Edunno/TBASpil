/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbaspil;

import Player.Player;
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
public class ControllerTest {
    
     private Player gamer;
     private Controller instance = new Controller();
     private Actions ch;
    
    public ControllerTest() {
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
     * Test of startGame method, of class Controller.
     */
    @Test
    public void testStartGame() {
        System.out.println("startGame");
        instance.startGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInputFromTUI method, of class Controller.
     */
    @Test
    public void testGetInputFromTUI() {
        System.out.println("getInputFromTUI");
        String a = "";
        String expResult = "";
        String result = instance.getInputFromTUI(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createRoom method, of class Controller.
     */
    @Test
    public void testCreateRoom() {
        System.out.println("createRoom");
        String a = "";
        instance.createRoom(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrRoom method, of class Controller.
     */
    @Test
    public void testSetCurrRoom() {
        System.out.println("setCurrRoom");
        instance.setCurrRoom();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createPlayer method, of class Controller.
     */
    @Test
    public void testCreatePlayer() {
        String a = "casper";
       // Player gamer = new Player(null, 100);
        instance.createPlayer(a);
        assertEquals(gamer.getName(), a);
    }

    /**
     * Test of checkAction method, of class Controller.
     */
    @Test
    public void testCheckAction() {
        String a = "";
        instance.checkAction(a);
        assertEquals(a, instance.equals(a));
    }
    
}
