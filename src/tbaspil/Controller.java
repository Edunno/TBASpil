/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbaspil;

import Rooms.Room;
import tbaspil.presentation.TUI;
import Player.Player;

/**
 *
 * @author Esben
 */
public class Controller {

    private Room currRoom;
    private Room nextRoom;
    private TUI ask;
    private Player gamer;

    public void startGame() {
        String a = ask.getName();
        createPlayer(a);
        while (true) {
            createRoom("startRoom");
            setCurrRoom();
            String b = getInputFromTUI(currRoom.getFlavorText());
            checkAction(b);
        }
    }

    public String getInputFromTUI(String a) {
        String b = ask.getInput(a);
        return b;
    }

    //Forbereder det kommende rum.
    public void createRoom(String a) {
        this.nextRoom = new Room(a, gamer);
    }

    //Indsætter det nye rum.
    public void setCurrRoom() {
        this.currRoom = this.nextRoom;
    }

    public void createPlayer(String a) {
        gamer.setName(a);
        gamer.setHealth(100);
    }

    public void checkAction(String a) {
        Actions ch = new Actions(a, currRoom);
        String b = ch.checkAction();
        while (b.equals("falseAction")) {
            b = ask.falseInput();
            ch.setAction(b);
            b = ch.checkAction();
        }
        if (b.equals("north")) {
            createRoom(currRoom.getNorth());
        }
        if (b.equals("south")) {
            createRoom(currRoom.getSouth());
        }
        if (b.equals("east")) {
            createRoom(currRoom.getEast());
        }
        if (b.equals("west")) {
            createRoom(currRoom.getWest());
        }
    }

}
