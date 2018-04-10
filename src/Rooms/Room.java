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
    Room r1 = new Room();
    private String flavorText;
    private ArrayList doors;
    private ArrayList actions;
    
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
        
        doors.add("go north");
        doors.add("go south");
        actions.add("beat the meat");
        actions.add("give a hand");
        
    }
    
    public void darkChestRoom() {
        this.flavorText = "You have entered the room.\n"
                + "The room is completely dark, except of a little stream of light, shining on a small shining chest.\n"
                + "There is tones from a little chime playing in the background. The room smells like moist.\n"
                + "You are thinking about all those scenarios from Indiana Jones, where he removes the artifact.";
    }
    
    public void handsRoom() {
        this.flavorText = "You have entered the room.\n"
                + "The room is filled with pictures on the walls of hands making different signs and Indian rugs filling the floor. \n"
                + "There is two dark figures with cloaks on, mumbling facing the pictures.\n"
                + "*Sniff* *Sniff* - The rugs are giving the smell of curry and cardamom.\n"
                + "The dark figures reminds you of something, but you don’t know what.";
    }
    
    public void lavaFloorRoom() {
        this.flavorText = "You have entered the room.\n"
                + "The room is filled with furniture that is placed randomly, like if it was made out a Feng Shui book.\n"
                + "But the room is glowing, and it is a red steaming substance. It’s lava!\n"
                + "There is a wooden box in the middle, but you have to make a very long jump, to reach it.\n"
                + "Its already pretty hot, from the small tile you are standing on.";
    }
    
    public void checkersRoom() {
        this.flavorText = "You have entered the room.\n"
                + "The floor is black and white tiles, like a game of checkers, with white walls.\n"
                + "Besides the big red button in front of you on a stander, with the title “Start” on it, it is completely empty.\n"
                + "The room smells like the soap they use for cleaning at public restrooms.\n"
                + "You are thinking about the first Harry Potter movie, where they are using themselves as chess pieces.";
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
                + "From the ceeling is dripping water down on the stones making the sound: tssssshhhh. On the floor is there also a bucket with water and a spoon.\n"
                + "in the top corner three fat Russians are sitting and looking at you...";
    }
}
