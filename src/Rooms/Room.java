package Rooms;

import Player.Player;
import java.util.ArrayList;

/**
 *
 * @author Esben
 */

//Lav rum så de kan connecte til ALLE rum der skal kunne låses op, så kan man låse døre op løbende!!!

public class Room {

//        doors.add("go north");
//        doors.add("go south");
//        doors.add("go east");
//        doors.add("go west");
    private String flavorText;
    private ArrayList doors;
    private ArrayList actions;
    private String north, south, west, east;
    private Player gamer;
    private boolean fight = false;
    private String monster;

    //Constructor
    public Room(String name, Player gamer) {
        this.gamer = gamer;
        doors = new ArrayList();
        actions = new ArrayList();
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
        if (name.equals("startRoom")) {
            startRoom();
        }
        if (name.equals("kitchenRoom")) {
            kitchenRoom();
        }
        if (name.equals("placeholderRoom")) {
            placeholderRoom();
        }
        if (name.equals("londonRiotsRoom")) {
            londonRiotsRoom();
        }
        if (name.equals("sarajevo1910")) {
            sarajevo1910();
        }

        //Indsæt flere muligheder for method calls.
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

    public ArrayList getDoors() {
        return doors;
    }

    public ArrayList getActions() {
        return actions;
    }
    public void addAction(String action){
        actions.add(action);
    }
    public void removeAction(String action){
        actions.remove(action);
    }
    public void addDoor(String door){
        doors.add(door);
    }
    public void removeDoor(String door){
        doors.add(door);
    }

    public String getFlavorText() {
        return flavorText;
    }
    
    public boolean isFight() {
        return fight;
    }

    public void setFight(boolean fight) {
        this.fight = fight;
    }

    public String getMonster() {
        return monster;
    }

    public void woodRoom() {
        this.flavorText = "\"You have entered the room.\\n\"\n" 
                + "The room is made completely out of wood.\\n\"\n" 
                + "You can smell its been newly restored and the only thing you can see, is a desk and a large wooden chair from its behind.\\n\"\n" 
                + "You can hear something, heavily breathing from the chair and your first thought is that time your mom sneaked up on you while beating the meat.\";";


        doors.add("south");
        this.south = "kitchenRoom";
        actions.add("Check chair");
    }

    public void darkChestRoom() {
        this.flavorText = "You have entered the room.\n"
                + "The room is completely dark, except of a little stream of light, that enlightens a small shining chest.\n"
                + "There is tones from a little chime playing in the background. The room smells like moist.\n"
                + "You are thinking about all those scenarios from Indiana Jones, where he removes the artifact.";
      
        doors.add("north");
        doors.add("south");
        doors.add("east");
        this.north = "saunaRoom";
        this.south = "londonRiotsRoom";
        this.east = "studio54";
        this.fight = true;
        monster = "Rioter";
        actions.add("Loot chest");
        
    }

    public void handsRoom() {
        this.flavorText = "You have entered the room.\n"
                + "The room is filled with pictures on the walls of hands making different signs and Indian rugs filling the floor. \n"
                + "There is two dark figures with cloaks on, mumbling facing the pictures.\n"
                + "*Sniff* *Sniff* - The rugs are giving the smell of curry and cardamom.\n"
                + "The dark figures reminds you of something, but you don’t know what.\n"
                + "It's Luke Skywalker and Jamie Lannister! They look at your hands, like Winnie the Pooh looks at honey.\n"
                + "Luke lights up his lightsaber and Jamie pulls out his sword. Get ready to fight!";


        doors.add("south");
        doors.add("west");
        this.south = "lavaFloorRoom";
        this.west = "sarajevo1910";
        this.fight = true;
        monster = "LukeAndJamie";
    }

    public void lavaFloorRoom() {
        this.flavorText = "You have entered the room.\n"
                + "The room is filled with furniture that is placed randomly, like if it was made out a Feng Shui book.\n"
                + "But the room is glowing, and it is a red steaming substance. It’s lava!\n"
                + "There is a wooden box in the middle, but you have to make a very long jump, to reach it.\n"
                + "Its already pretty hot, from the small tile you are standing on.";


        doors.add("west"); 
        doors.add("north");
        this.north = "handsRoom";
        this.west = "placeholderRoom";
        this.fight = true;
        monster = "Ragnaros";
    }

    public void checkersRoom() {
        this.flavorText = "You have entered the room.\n"
                + "The floor is black and white tiles, like a game of checkers, with white walls.\n"
                + "Besides the big red button in front of you on a stander, with the title “Start” on it, it is completely empty.\n"
                + "The room smells like the soap they use for cleaning at public restrooms.\n"
                + "You are thinking about the first Harry Potter movie, where they are using themselves as chess pieces.";

        doors.add("east");
        doors.add("west");
        this.east = "placeholderRoom";
        this.west = "chiliRoom";
        actions.add("Press start");
    }

    public void studio54() {
        this.flavorText = "You have entered the room.\n"
                + "Ohhhh my what is this, GROOOVY BABY, you feel the urge to dance!\n"
                + "There is disco lights, music playing and the smell of sweat. Yes, you are back, this is studio54!\n"
                + "While you gaze around you see:\n"
                + "A bar with drinks, disco ball hanging from the ceiling, Austin FUCKING Powers waving to you. He is standing next to a mountain of cocain and other recreational drugs.";
        
        doors.add("east");
        doors.add("west");
        this.east = "kitchenRoom";
        this.west = "darkChestRoom";
        this.fight = true;
        monster = "AustinPowers";
        
    }

    public void saunaRoom() {
        this.flavorText = "You have entered the room.\n"
                + "as you enter, you are met by a hot steam, the smell of eaculyptus and old-men-balls-sweat.\n"
                + "You fell the sweat starting to emerge.\n"
                + "The room is made with staircase seats up towards each corner, providing a nice place to sit down and break a sweat.\n"
                + "In the middle of the room there is a sauna oven, with stones on top.\n"
                + "Water from the ceiling are dripping on the stones, making the sound: tssssshhhh. \n"
                + "There is a bucket with water, two birch branches and a spoon.\n"
                + "In the top corner, three fat Russians staring at you...";

        doors.add("south");
        this.south = "darkChestRoom";
        this.fight = true;
        monster = "IgorAndIvan";

    }

    public void chiliRoom() {
        this.flavorText = "You have entered the room.\n"
                + "You are met with the smell of newly cut grass and spicy lemon.\n"
                + "The room is filled with chili plants, some are red, some are yellow, som are even white\n"
                + "You see some eyes within the leaves, red glowing eyes... a small man it seems...\n"
                + "This funny little leprechaun looking man with black beard is the only thing you can focus on in this room";
        
        doors.add("north");
        doors.add("east");
        this.north = "londonRiotsRoom";
        this.east = "checkersRoom";
        this.fight = true;
        monster = "ChiliKlaus";

    }

    public void startRoom() {
        String a = gamer.getName();
        this.flavorText = "You have entered the room.\n"
                + "As you enter your parents’ bedroom, you notice something you haven't before…\n"
                + "At the bookshelf where all your baby pictures are placed, there is a beam of light and reveals a hidden door.\n"
                + "You call out: Muuuuuuum what is this?! \n"
                + "From the deep you hear somebody whisper " + a + ".\n"
                + "As you lean forward, trying to hear better, you slip and fall down the stairs. You also hear the door slams behind you.\n"
                + "\n"
                + "Ahhhhhhhhhhhhhhhhh!!!\n"
                + "\n"
                + "BAM – you are at the end. Confused, but surprisingly not hurt, you look around, where are you? What is this?\n"
                + "The room is all red, there is two couches.n\""
                + "A bell on the wall starts ringing.\n"
                + "In comes a little gimp asking you to take shoes of, because he is horny and he loves to fuck shoes and he likes your shoes.";
         
         doors.add("east");
         this.east = "darkChestRoom";
         actions.add("Grab");
    }
    
    public void kitchenRoom() {
        this.flavorText = "You have entered the room.\n"
                + "As you enter the room, there is a sweet smell of cinnamon and sweet apples.\n"
                + "This reminds you of your grandmother’s place. You know, the place your parents keep teasing you with, the place you that you were concieved.\n"
                + "Some might say that you are not fully baked, but you know best.";
        
        doors.add("north");
        doors.add("west");
        doors.add("south");
        this.north = "woodRoom";
        this.west = "studio54";
        this.south = "sarajevo1910";
        this.fight = true;
        monster = "Babysitter";
}    


        public void placeholderRoom() {
        this.flavorText = "You have entered the room.\n"
                + "The room is a big blank square of white walls, save for a text in the middle of all surfaces, that reads:\"no image\".\n"
                + "This place has clearly been left blank, possibly intentionally to begin with, but you'd wager it's been forgotten.\n"
                + "There seems to be blank doors in the walls though, so it's not totally wasted.";

        doors.add("north");
        doors.add("east");
        doors.add("west");
        this.north = "sarajevo1910";
        this.east = "lavaFloorRoom";
        this.west = "checkersRoom";
//        actions.add("");
//        actions.add("");

    }

        public void londonRiotsRoom() {
        this.flavorText = "You have entered the room.\n"
                + "TYou suddenly find yourself in the middle of a street. You can see what looks like Big Ben in the distance.\n"
                + "Buildings around you are randomly on fire, most windows have been smashed and a thick and hot smoke burns in your eyes and nose.\n"
                + "There are two doors, on each side of the street. The one you came form and one on the other side.";

                //Mulighed for at loote butikkerne

        doors.add("north");
        doors.add("south");
        this.north = "darkChestRoom";
        this.south = "chiliRoom";
        this.fight = true;
        monster = "Rioter";

//        actions.add("");
//        actions.add("");

    }
        public void sarajevo1910() {
        this.flavorText = "You have entered the room.\n"
                + "You sit outside a café. It looks like the early 1900's.\n"
                + "The café you sit in front of is placed in what looks like an old european city, just next to a bridge crossing a river close to you.\n"
                + "On your plate is a sandwhich, a couple of bites taken from it. You suppose it's yours, as no one else is at the café.\n"
                + "You are wearing a cap and a thick wool coat, and as you feel it, you notice a gun in your right pocket. It's a small clip pistol.\n"
                + "You have no idea where you got it from, but searching your jacket further, you find a pamflet written in some sort of slavick language.\n"
                + "There is a tense feeling in the air from people passing by, yet the birds sing and it's a beautiful sommerday.\n"
                + "From the the road up ahead an open car comes driving, it's passengers obviously fancy, as they are well dressed and escorted\n"
                + "by otherr cars, both in front and behind. You wonder what to do next.";
        
        doors.add("north");
        doors.add("east");
        doors.add("south");
        this.north = "kitchenRoom";
        this.east = "handsRoom";
        this.south = "placeholderRoom";

//        doors.add("go north");
//        doors.add("go south");
//        doors.add("go east");
//        doors.add("go west");
//        actions.add("");
//        actions.add("");

    }
        //hawtafix

    Player getPlayer() {
        return gamer;
    }
}
