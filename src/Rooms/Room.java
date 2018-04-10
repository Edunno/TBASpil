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

    public void darkChest() {
        this.flavorText = "You have entered the room.\n"
                + "The room is completely dark, except of a little stream of light, shining on a small shining chest.\n"
                + "There is tones from a little chime playing in the background. The room smells like moist.\n"
                + "You are thinking about all those scenarios from Indiana Jones, where he removes the artifact.";
    }
}
