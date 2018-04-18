/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbaspil.presentation;

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
public class TUITest {
    
    public TUITest() {
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
     * Test of getName method, of class TUI.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        TUI instance = new TUI();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generalPrinter method, of class TUI.
     */
    @Test
    public void testGeneralPrinter() {
        System.out.println("generalPrinter");
        String a = "";
        TUI instance = new TUI();
        instance.generalPrinter(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInput method, of class TUI.
     */
    @Test
    public void testGetInput() {
        System.out.println("getInput");
        String a = "";
        Room room = null;
        TUI instance = new TUI();
        String expResult = "";
        String result = instance.getInput(a, room);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of falseInput method, of class TUI.
     */
    @Test
    public void testFalseInput() {
        System.out.println("falseInput");
        TUI instance = new TUI();
        String expResult = "";
        String result = instance.falseInput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
