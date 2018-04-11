package Rooms;

import Player.Player;
import java.util.ArrayList;

/**
 *
 * @author Esben
 */
public class Room implements RoomRules {

//        doors.add("go north");
//        doors.add("go south");
//        doors.add("go east");
//        doors.add("go west");
    private String flavorText;
    private ArrayList doors;
    private ArrayList actions;
    private String north, south, west, east;
    private Player gamer;

    //Constructor
    public Room(String name, Player gamer) {
        this.gamer = gamer;
        if (name.equals("woodRoom")) {
            woodRoom();
        }
        if (name.equals("darkChestRoom")) {
            darkChestRoom();
        }
        if (name.equals("handsRoom")) {
            handsRoom();
        }
        if (name.equals("lavaFloorRoom")) {
            lavaFloorRoom();
        }
        if (name.equals("checkersRoom")) {
            checkersRoom();
        }
        if (name.equals("studio54")) {
            studio54();
        }
        if (name.equals("saunaRoom")) {
            saunaRoom();
        }
        if (name.equals("chiliRoom")) {
            chiliRoom();
        }

        //Indsæt flere muligheder for method calls.
    }

    public ArrayList getDoors() {
        return doors;
    }

    public ArrayList getActions() {
        return actions;
    }

    @Override
    public String getFlavorText() {
        return flavorText;
    }

    @Override
    public String getInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEncounters() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAvailableExits() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void woodRoom() {
        this.flavorText = "You have entered the room.\n"
                + "The room is made completely out of wood.\n"
                + "You can smell its been newly restored and the only thing you can see, is a desk and a large wooden chair from its behind.\n"
                + "You can hear something, heavily breathing from the chair and your first thought is that time your mom sneaked up on you while beating the meat.";

//        doors.add("go north");
//        doors.add("go south");
//        doors.add("go east");
//        doors.add("go west");
        actions.add("beat the meat");
        actions.add("give a hand");

        this.north = "darkChestRoom";

    }

    public void darkChestRoom() {
        this.flavorText = "You have entered the room.\n"
                + "The room is completely dark, except of a little stream of light, shining on a small shining chest.\n"
                + "There is tones from a little chime playing in the background. The room smells like moist.\n"
                + "You are thinking about all those scenarios from Indiana Jones, where he removes the artifact.";

//        doors.add("go north");
//        doors.add("go south");
//        doors.add("go east");
//        doors.add("go west");
    }

    public void handsRoom() {
        this.flavorText = "You have entered the room.\n"
                + "The room is filled with pictures on the walls of hands making different signs and Indian rugs filling the floor. \n"
                + "There is two dark figures with cloaks on, mumbling facing the pictures.\n"
                + "*Sniff* *Sniff* - The rugs are giving the smell of curry and cardamom.\n"
                + "The dark figures reminds you of something, but you don’t know what.";

//        doors.add("go north");
//        doors.add("go south");
//        doors.add("go east");
//        doors.add("go west");
    }

    public void lavaFloorRoom() {
        this.flavorText = "You have entered the room.\n"
                + "The room is filled with furniture that is placed randomly, like if it was made out a Feng Shui book.\n"
                + "But the room is glowing, and it is a red steaming substance. It’s lava!\n"
                + "There is a wooden box in the middle, but you have to make a very long jump, to reach it.\n"
                + "Its already pretty hot, from the small tile you are standing on.";

//        doors.add("go north");
//        doors.add("go south");
//        doors.add("go east");
//        doors.add("go west");       
    }

    public void checkersRoom() {
        this.flavorText = "You have entered the room.\n"
                + "The floor is black and white tiles, like a game of checkers, with white walls.\n"
                + "Besides the big red button in front of you on a stander, with the title “Start” on it, it is completely empty.\n"
                + "The room smells like the soap they use for cleaning at public restrooms.\n"
                + "You are thinking about the first Harry Potter movie, where they are using themselves as chess pieces.";
//        doors.add("go north");
//        doors.add("go south");
//        doors.add("go east");
//        doors.add("go west");
    }

    public void studio54() {
        this.flavorText = "Ohhhh my what is this, GROOOVY BABE, you feel the urge to dance!\n"
                + "There is disco lights, music playing and the smell of sweat. Yes, you are back, this is studio54!\n"
                + "While you gaze around you see:\n"
                + "A bar with drinks, disco ball hanging from the celing and turning, Austin FUCKING Powers whinking at you and a ton of cocain and other recreational drugs";
    }

    public void saunaRoom() {
        this.flavorText = "as you enter the hot steaming room, you meet a smell of eaculyptus and old-man-ball-sweat.\n"
                + "You fell the sweat starting to emerge.\n"
                + "The room is made with staircase seats up towards each corner, providing a nice place to sit down and break a sweat.\n"
                + "In the middle of the room there is a sauna oven with filled with stones on the top.\n"
                + "From the ceeling is dripping water down on the stones making the sound: tssssshhhh. On the floor is there also a bucket with water, two birch branches and a spoon.\n"
                + "in the top corner three fat Russians are sitting and looking at you...";
//        doors.add("go north");
//        doors.add("go south");
//        doors.add("go east");
//        doors.add("go west");
    }

    public void chiliRoom() {
        this.flavorText = "as you walk in the room, get the smell of newly cut grass and spicy lemon.\n"
                + "A voice ermerges: HI I am ChiliKlaus. Do you want surstrømning or just regular caroline aka carolina ripper?\n"
                + "This funny litle leprechaun looking man with black beard is the only thing you can focus on in this room";
//        doors.add("go north");
//        doors.add("go south");
//        doors.add("go east");
//        doors.add("go west");
    }

    public void startRoom() {
        String a = gamer.getName();
        this.flavorText = "As you enter your parents’ bedroom, you notice something you haven't before…\n"
                + "The bookshelf where all your baby pictures is standing is secret door with a staircase down.\n"
                + "You call out: Moooooaaaam what is this?! From the deep you hear somebody call " + a + ".\n"
                + "As you lean forward to listen, you fall in and the door slams behind you and keep falling.
                + "\n"
                + "Ahhhhhhhhhhhhhhhhh!!!\n"
                + "\n"
                + "BAM – you land on the floor. Confused you look around, where are you? What is this?\n"
                + "The room is all red, there to couches, and a bell on the wall starts ringing.\n"
                + "In comes a little gimp asking you to take shoes of, because he is horny and he loves to fuck shoes and he likes your shoes."
    }
    
    public void kitchenRoom() {
        this.flavorText = "As you enter the room, there is the sweet smell of Cinnamon and sweet apples.\n"
                + "This reminds you of your grandmother’s place. You know, the place your parents keep teasing you with, the place you that you were made.\n"
                + "Some might say that you are not fully baked, but you know better.
}    
    public String getNorth() {
        return north;
    }

    public String getSouth() {
        return south;
    }

    public String getWest() {
        return west;
    }

    public String getEast() {
        return east;
    }

}
