/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rooms;

import Player.Player;
import java.util.ArrayList;
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
public class RoomTest {
    
    String a = "";
    
    public RoomTest() {
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
     * Test of getNorth method, of class Room.
     */
    @Test
    public void testGetNorth() {
        Player gamer = new Player("John", 100);
        Room rum1 = new Room("darkChestRoom", gamer);
        assertEquals("saunaRoom", rum1.getNorth());
        assertNotEquals("woodRoom", rum1.getNorth());
    }

    /**
     * Test of getSouth method, of class Room.
     */
    @Test
    public void testGetSouth() {
        Player gamer = new Player("John", 100);
        Room rum1 = new Room("woodRoom", gamer);
        assertEquals("kitchenRoom", rum1.getSouth());
        assertNotEquals("studio54", rum1.getSouth());
        
    }

    /**
     * Test of getWest method, of class Room.
     */
    @Test
    public void testGetWest() {
        Player gamer = new Player("John", 100);
        Room rum1 = new Room("handsRoom", gamer);
        assertEquals("sarajevo1910", rum1.getWest());
        assertNotEquals("woodRoom", rum1.getWest());
    }

    /**
     * Test of getEast method, of class Room.
     */
    @Test
    public void testGetEast() {
        Player gamer = new Player("John", 100);
        Room rum1 = new Room("checkersRoom", gamer);
        assertEquals("placeholderRoom", rum1.getEast());
        assertNotEquals("woodRoom", rum1.getEast());
    }

    /**
     * Test of getDoors method, of class Room.
     */
    @Test
    public void testGetDoors() {
        Player gamer = new Player("John", 100);
        Room rum1 = new Room("studio54", gamer);
        ArrayList<String> list = new ArrayList<String>();
        list.add("east");
        list.add("west");
        assertEquals(list, rum1.getDoors());
        list.add("south");
        list.add("north");
        assertNotEquals(list, rum1.getDoors());
    }


    /**
     * Test of getFlavorText method, of class Room.
     */
    @Test
    public void testGetFlavorText() {
    Player gamer = new Player("John", 100);
    Room rum1 = new Room("checkersRoom", gamer);
    assertEquals("You have entered the room.\n"
                + "The floor is black and white tiles, like a game of checkers, with white walls.\n"
                + "Besides the big red button in front of you on a stander, with the title “Start” on it, it is completely empty.\n"
                + "The room smells like the soap they use for cleaning at public restrooms.\n"
                + "You are thinking about the first Harry Potter movie, where they are using themselves as chess pieces.", rum1.getFlavorText());
    }

    /**
     * Test of woodRoom method, of class Room.
     */
    @Test
    public void testWoodRoom() {
        Player gamer = new Player("Claus", 100);
        Room rum1 = new Room("woodRoom", gamer);
        assertEquals("Claus", rum1.getPlayer().getName());
        assertEquals("\"You have entered the room.\\n\"\n" 
                + "The room is made completely out of wood.\\n\"\n" 
                + "You can smell its been newly restored and the only thing you can see, is a desk and a large wooden chair from its behind.\\n\"\n" 
                + "You can hear something, heavily breathing from the chair and your first thought is that time your mom sneaked up on you while beating the meat.\";", rum1.getFlavorText());
    }

    /**
     * Test of darkChestRoom method, of class Room.
     */
    @Test
    public void testDarkChestRoom() {
       Player gamer = new Player("Ole", 100);
       Room rum1 = new Room("darkChestRoom", gamer);
       assertEquals("Ole", rum1.getPlayer().getName());
       assertEquals("You have entered the room.\n"
                + "The room is completely dark, except of a little stream of light, shining on a small shining chest.\n"
                + "There is tones from a little chime playing in the background. The room smells like moist.\n"
                + "You are thinking about all those scenarios from Indiana Jones, where he removes the artifact.", rum1.getFlavorText());
    }

    /**
     * Test of handsRoom method, of class Room.
     */
    @Test
    public void testHandsRoom() {
       Player gamer = new Player("Bent", 100);
       Room rum1 = new Room("handsRoom", gamer);
       assertEquals("Bent", rum1.getPlayer().getName());
       assertEquals("You have entered the room.\n"
                + "The room is filled with pictures on the walls of hands making different signs and Indian rugs filling the floor. \n"
                + "There is two dark figures with cloaks on, mumbling facing the pictures.\n"
                + "*Sniff* *Sniff* - The rugs are giving the smell of curry and cardamom.\n"
                + "The dark figures reminds you of something, but you don’t know what.\n"
                + "It's Luke Skywalker and Jamie Lannister! They look at your hands, like Winnie the Pooh looks at honey.\n"
                + "Luke lights up his lightsaber and Jamie pulls out his sword. Get ready to fight!", rum1.getFlavorText());
    }

    /**
     * Test of lavaFloorRoom method, of class Room.
     */
    @Test
    public void testLavaFloorRoom() {
        Player gamer = new Player("Benny", 100);
       Room rum1 = new Room("lavaFloorRoom", gamer);
       assertEquals("Benny", rum1.getPlayer().getName());
       assertEquals("You have entered the room.\n"
                + "The room is filled with furniture that is placed randomly, like if it was made out a Feng Shui book.\n"
                + "But the room is glowing, and it is a red steaming substance. It’s lava!\n"
                + "There is a wooden box in the middle, but you have to make a very long jump, to reach it.\n"
                + "Its already pretty hot, from the small tile you are standing on.", rum1.getFlavorText());
    }

    /**
     * Test of checkersRoom method, of class Room.
     */
    @Test
    public void testCheckersRoom() {
        Player gamer = new Player("Lars", 100);
       Room rum1 = new Room("checkersRoom", gamer);
       assertEquals("Lars", rum1.getPlayer().getName());
       assertEquals("You have entered the room.\n"
                + "The floor is black and white tiles, like a game of checkers, with white walls.\n"
                + "Besides the big red button in front of you on a stander, with the title “Start” on it, it is completely empty.\n"
                + "The room smells like the soap they use for cleaning at public restrooms.\n"
                + "You are thinking about the first Harry Potter movie, where they are using themselves as chess pieces.", rum1.getFlavorText());
    }

    /**
     * Test of studio54 method, of class Room.
     */
    @Test
    public void testStudio54() {
         Player gamer = new Player("Yrsa", 100);
       Room rum1 = new Room("studio54", gamer);
       assertEquals("Yrsa", rum1.getPlayer().getName());
       assertEquals("Ohhhh my what is this, GROOOVY BABY, you feel the urge to dance!\n"
                + "There is disco lights, music playing and the smell of sweat. Yes, you are back, this is studio54!\n"
                + "While you gaze around you see:\n"
                + "A bar with drinks, disco ball hanging from the ceiling, Austin FUCKING Powers waving to you. He is standing next to a mountain of cocain and other recreational drugs.", rum1.getFlavorText());
    }

    /**
     * Test of saunaRoom method, of class Room.
     */
    @Test
    public void testSaunaRoom() {
       Player gamer = new Player("Connie", 100);
       Room rum1 = new Room("saunaRoom", gamer);
       assertEquals("Connie", rum1.getPlayer().getName());
       assertEquals("as you enter the hot steaming room, you meet a smell of eaculyptus and old-man-ball-sweat.\n"
                + "You fell the sweat starting to emerge.\n"
                + "The room is made with staircase seats up towards each corner, providing a nice place to sit down and break a sweat.\n"
                + "In the middle of the room there is a sauna oven with filled with stones on the top.\n"
                + "From the ceeling is dripping water down on the stones making the sound: tssssshhhh. On the floor is there also a bucket with water, two birch branches and a spoon.\n"
                + "in the top corner three fat Russians are sitting and looking at you...", rum1.getFlavorText());
    }

    /**
     * Test of chiliRoom method, of class Room.
     */
    @Test
    public void testChiliRoom() {
       Player gamer = new Player("Rudi", 100);
       Room rum1 = new Room("chiliRoom", gamer);
       assertEquals("Rudi", rum1.getPlayer().getName());
       assertEquals("as you walk in the room, get the smell of newly cut grass and spicy lemon.\n"
                + "A voice ermerges: HI I am ChiliKlaus. Do you want surstrømning or just regular caroline aka carolina ripper?\n"
                + "This funny litle leprechaun looking man with black beard is the only thing you can focus on in this room", rum1.getFlavorText());
    }

    /**
     * Test of startRoom method, of class Room.
     */
    @Test
    public void testStartRoom() {
         Player gamer = new Player("", 100);
       Room rum1 = new Room("startRoom", gamer);
       assertEquals("", rum1.getPlayer().getName());
       assertEquals("As you enter your parents’ bedroom, you notice something you haven't before…\n"
                + "The bookshelf where all your baby pictures is standing is secret door with a staircase down.\n"
                + "You call out: Moooooaaaam what is this?! From the deep you hear somebody call " + a + ".\n"
                + "As you lean forward to listen, you fall in and the door slams behind you and keep falling.\n"
                + "\n"
                + "Ahhhhhhhhhhhhhhhhh!!!\n"
                + "\n"
                + "BAM – you land on the floor. Confused you look around, where are you? What is this?\n"
                + "The room is all red, there to couches, and a bell on the wall starts ringing.\n"
                + "In comes a little gimp asking you to take shoes of, because he is horny and he loves to fuck shoes and he likes your shoes.", rum1.getFlavorText());
    }

    /**
     * Test of kitchenRoom method, of class Room.
     */
    @Test
    public void testKitchenRoom() {
       Player gamer = new Player("Tony", 100);
       Room rum1 = new Room("kitchenRoom", gamer);
       assertEquals("Tony", rum1.getPlayer().getName());
       assertEquals("As you enter the room, there is the sweet smell of Cinnamon and sweet apples.\n"
                + "This reminds you of your grandmother’s place. You know, the place your parents keep teasing you with, the place you that you were made.\n"
                + "Some might say that you are not fully baked, but you know better.", rum1.getFlavorText());
    }

    /**
     * Test of placeholderRoom method, of class Room.
     */
    @Test
    public void testPlaceholderRoom() {
       Player gamer = new Player("Iben", 100);
       Room rum1 = new Room("placeholderRoom", gamer);
       assertEquals("Iben", rum1.getPlayer().getName());
       assertEquals("You have entered the room.\n"
                + "The room is a big blank square of white walls, save for a text in the middle of all surfaces, that reads:\"no image\".\n"
                + "This place has clearly been left blank, possibly intentionally to begin with, but you'd wager it's been forgotten.\n"
                + "There seems to be blank doors in the walls though, so it's not totally wasted.", rum1.getFlavorText());
    }

    /**
     * Test of londonRiotsRoom method, of class Room.
     */
    @Test
    public void testLondonRiotsRoom() {
        Player gamer = new Player("Sara", 100);
       Room rum1 = new Room("londonRiotsRoom", gamer);
       assertEquals("Sara", rum1.getPlayer().getName());
       assertEquals("You have entered the room.\n"
                + "TYou suddenly find yourself in the middle of a street. You can see what looks like Big Ben in the distance.\n"
                + "Buildings around you are randomly on fire, most windows have been smashed and a thick and hot smoke burns in your eyes and nose.\n"
                + "There are two doors, on each side of the street. The one you came form and one on the other side.", rum1.getFlavorText());
    }

    /**
     * Test of sarajevo1910 method, of class Room.
     */
    @Test
    public void testSarajevo1910() {
         Player gamer = new Player("Ida", 100);
       Room rum1 = new Room("sarajevo1910", gamer);
       assertEquals("Ida", rum1.getPlayer().getName());
       assertEquals("You sit outside a café. It looks like the early 1900's.\n"
                + "The café you sit in front of is placed in what looks like an old european city, just next to a bridge crossing a river close to you.\n"
                + "On your plate is a sandwhich, a couple of bites taken from it. You suppose it's yours, as no one else is at the café.\n"
                + "You are wearing a cap and a thick wool coat, and as you feel it, you notice a gun in your right pocket. It's a small clip pistol.\n"
                + "You have no idea where you got it from, but searching your jacket further, you find a pamflet written in some sort of slavick language.\n"
                + "There is a tense feeling in the air from people passing by, yet the birds sing and it's a beautiful sommerday.\n"
                + "From the the road up ahead an open car comes driving, it's passengers obviously fancy, as they are well dressed and escorted\n"
                + "by otherr cars, both in front and behind. You wonder what to do next.", rum1.getFlavorText());
    }
    
}
