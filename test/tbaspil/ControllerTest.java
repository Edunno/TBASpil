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
        Controller instance = new Controller();
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
        Controller instance = new Controller();
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
        Controller instance = new Controller();
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
        Controller instance = new Controller();
        instance.setCurrRoom();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createPlayer method, of class Controller.
     */
    @Test
    public void testCreatePlayer() {
        System.out.println("createPlayer");
        String a = "";
        Controller instance = new Controller();
        instance.createPlayer(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkAction method, of class Controller.
     */
    @Test
    public void testCheckAction() {
        System.out.println("checkAction");
        String a = "";
        Controller instance = new Controller();
        instance.checkAction(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
