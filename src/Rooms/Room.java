package Rooms;

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

    //Constructor
    public Room(String name) {
        if (name.equals("woodRoom")) {
            woodRoom();
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
        public void placeholderRoom() {
        this.flavorText = "You have entered the room.\n"
                + "The room is a big blank square of white walls, save for a text in the middle of all surfaces, that reads:\"no image\".\n"
                + "This place has clearly been left blank, possibly intentionally to begin with, but you'd wager it's been forgotten.\n"
                + "There seems to be blank doors in the walls though, so it's not totally wasted.";

//        doors.add("go north");
//        doors.add("go south");
//        doors.add("go east");
//        doors.add("go west");
//        actions.add("");
//        actions.add("");

    }

        public void londonRiotsRoom() {
        this.flavorText = "You have entered the room.\n"
                + "TYou suddenly find yourself in the middle of a street. You can see what looks like Big Ben in the distance.\n"
                + "Buildings around you are randomly on fire, most windows have been smashed and a thick and hot smoke burns in your eyes and nose.\n"
                + "There are two doors, on each side of the street. The one you came form and one on the other side.";

                //Mulighed for at loote butikkerne

//        doors.add("go north");
//        doors.add("go south");
//        doors.add("go east");
//        doors.add("go west");
//        actions.add("");
//        actions.add("");

    }
        public void sarajevo1910() {
        this.flavorText = "You sit outside a café. It looks like the early 1900's.\n"
                + "The café you sit in front of is placed in what looks like an old european city, just next to a bridge crossing a river close to you.\n"
                + "On your plate is a sandwhich, a couple of bites taken from it. You suppose it's yours, as no one else is at the café.\n"
                + "You are wearing a cap and a thick wool coat, and as you feel it, you notice a gun in your right pocket. It's a small clip pistol.\n"
                + "You have no idea where you got it from, but searching your jacket further, you find a pamflet written in some sort of slavick language.\n"
                + "There is a tense feeling in the air from people passing by, yet the birds sing and it's a beautiful sommerday.\n"
                + "From the the road up ahead an open car comes driving, it's passengers obviously fancy, as they are well dressed and escorted\n"
                + "by otherr cars, both in front and behind. You wonder what to do next.";

//        doors.add("go north");
//        doors.add("go south");
//        doors.add("go east");
//        doors.add("go west");
//        actions.add("");
//        actions.add("");

    }
}
