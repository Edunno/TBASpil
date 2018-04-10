package Rooms;

/**
 *
 * @author Esben
 */
public class Room implements RoomRules {

    Room r1 = new Room();
    private String flavorText;

    @Override
    public String getFlavorText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
}
