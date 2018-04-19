/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbaspil;

import Player.Item;
import Player.Monster;
import Rooms.Room;
import tbaspil.presentation.TUI;
import Player.Player;
import Rooms.ActionList;
import Rooms.MonsterList;

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
    private String intro;
    private MonsterList mons = new MonsterList();
    private Monster currMonster;
    private String tuiText;

    public void startGame() {
        makeIntro();
        ask.generalPrinter(intro);
        String a = ask.getName();
        createPlayer(a);
        createRoom("startRoom");
        while (true) {
            setCurrRoom();
            if (flag) {
                tuiText = getInputFromTUI(currRoom.getFlavorText());
            } else if (!currRoom.isFight()) {
                tuiText = getInputFromTUI("");
            }
            if (currRoom.isFight()) {
                currMonster = mons.makeMonster(currRoom.getMonster());
                tuiText = fightInTUI(currMonster);
            }
            checkAction(tuiText);

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
        this.gamer = new Player(a, 100);
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
        if (b.equals("isOther")) {
            if (a.equals("help")) {
                flag = false;
                ask.generalPrinter("type inventory");
            } else if (a.equals("inventory")) {
                if (!gamer.getItems().isEmpty()) {
                    for (int i = 0; i < gamer.getItems().size(); i++) {
                        ask.generalPrinter(gamer.getItems().get(i).getName());
                        ask.generalPrinter("- type \"exit\" to return.");
                    }
                }
                while (true) {
                    String itemReq = ask.inputRequest("Select Item to interact with: ");
                    if (itemReq.equals("exit")) {
                        break;
                    }
                    for (int i = 0; i < gamer.getItems().size(); i++) {
                        if (itemReq.equals(gamer.getItems().get(i))) {
                            ask.printItem(gamer.getItems().get(i));
                            handleItem(gamer.getItems().get(i));
                        }
                        else {
                            ask.inputRequest("No such item. Try again:");
                        }
                    }
                }
            }
        }
    }

    private void makeIntro() {
        this.intro
                = "                                                WELCOME TO:\n"
                + "  ▄▄▄▄      ▄▄▄        ██████  ▓█████  ███▄ ▄███▓▓█████  ███▄    █   ▄▄▄█████▓\n"
                + "▓█████▄ ▒████▄    ▒██    ▒   ▓█    ▀ ▓██▒▀█▀ ██▒▓█    ▀  ██ ▀█   █ ▓      ██▒ ▓▒\n"
                + "▒██▒ ▄██▒██  ▀█▄  ░ ▓██▄    ▒███    ▓██     ▓██░▒███    ▓██  ▀█ ██▒▒   ▓██░ ▒░\n"
                + "▒██░█▀  ░██▄▄▄▄██   ▒   ██▒▓█    ▄  ▒██     ▒██ ▒▓█   ▄  ▓██▒  ▐▌██▒░  ▓██▓ ░ \n"
                + "░▓█  ▀█▓ ▓█     ▓██▒▒██████░█████▒▒██▒  ░██▒░▒████▒▒██░   ▓██░   ▒██▒ ░ \n"
                + "░▒▓███▀▒ ▒▒    ▓▒█░▒    ▒▓▒ ▒ ░░░ ▒░ ░░ ▒░   ░  ░░░ ▒░ ░░ ▒░      ▒ ▒     ▒ ░░   \n"
                + "▒░▒   ░ ▒▒ ▒ ░░ ░▒  ░ ░ ░ ░  ░░  ░      ░ ░ ░  ░░ ░░   ░ ▒░    ░    \n"
                + "  ░     ░   ░   ▒   ░  ░  ░     ░   ░      ░      ░      ░   ░ ░   ░      \n"
                + "  ░            ░  ░      ░     ░  ░       ░      ░  ░         ░          \n"
                + "        ░                                                                 "
                + "Intro:\n"
                + "";
    }

    private String fightInTUI(Monster a) {
        return ask.fightInput(a);
    }

    private void handleItem(Item a) {
        if (a.isIsMainHand() || a.isIsOffHand()) {
            String itemUse = ask.inputRequest("Equip?(yes/no)");
            if (itemUse.equals("yes")) {
                if (a.isIsMainHand()) {
                    gamer.setMainHand(a);
                } else {
                    gamer.setOffHand(a);
                }
            }
        } else {
            String itemUse = ask.inputRequest("Use?(yes/no)");
            if (itemUse.equals("yes")) {

                useItem(a);
            }
        }
    }

    private void useItem(Item a) {
        gamer.addMaxHealth(a.getHpBonus());
        gamer.restoreHp(a.getHpRestore());
        if (!a.isReUsable()) {
            gamer.removeItem(a);
        }
    }

}
