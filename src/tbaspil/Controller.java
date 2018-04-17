/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbaspil;

import Rooms.Room;
import tbaspil.presentation.TUI;
import Player.Player;
import Rooms.ActionList;

/**
 *
 * @author Esben
 */
public class Controller {

    private Room currRoom;
    private Room nextRoom;
    private TUI ask = new TUI();
    private Player gamer;
    private boolean flag = true;

    public void startGame() {
        String a = ask.getName();
        createPlayer(a);
        createRoom("startRoom");
        String b;
        while (true) {
            setCurrRoom();
            if (flag) {
                b = getInputFromTUI(currRoom.getFlavorText());
            }
            else{
                b = getInputFromTUI("");
            }
            checkAction(b);
        }
    }

    public String getInputFromTUI(String a) {
        String b = ask.getInput(a, currRoom);
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
        gamer = new Player(a, 100);
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
            flag = true;
        }
        if (b.equals("south")) {
            createRoom(currRoom.getSouth());
            flag = true;
        }
        if (b.equals("east")) {
            createRoom(currRoom.getEast());
            flag = true;
        }
        if (b.equals("west")) {
            createRoom(currRoom.getWest());
            flag = true;
        }
        if (b.equals("isAction")) {
            ActionList al = new ActionList();
            nextRoom = al.doAction(a, currRoom);
            flag = false;
        }
    }

}
