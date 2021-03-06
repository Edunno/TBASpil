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
import Rooms.ItemList;
import Rooms.MonsterList;
import SaveData.FileManager;
import java.util.ArrayList;

/**
 *
 * @author Esben
 */
public class Controller {
    
    private Room currRoom;
    private Room nextRoom;
    private Room prevRoom;
    private TUI ask;
    private Player gamer;
    private boolean flag = true;
    private String intro;
    private MonsterList mons;
    private Monster currMonster;
    private String tuiText;
    private ItemList itemCreate;
    private Fight fight;
    private boolean startFight = true;
    private boolean gameRunning = true;
    FileManager fm = new FileManager();

    /*
    startGame initialises the classes needed for reference and data holding in Controller
     */
    public void startGame() {
        ask = new TUI();
        mons = new MonsterList();
        itemCreate = new ItemList();
        makeIntro(); //Generates te intro to be used in next line.
        ask.generalPrinter(intro);
        String a = ask.getName(); //Gets the name that the player types from the TUI.
        createPlayer(a);
        createRoom("startRoom"); //Creates the startRoom, and sets it up so it can be transferred to currentRoom.
        gamer.addItem(itemCreate.getWoodSword());
        while (gameRunning) {
            setCurrRoom();
            if (flag && !currRoom.isFight()) { //Flag decides whether or not the flavor text from the currentRoom should be shown. It gets disabled if the player satys in a room.
                tuiText = getInputFromTUI(currRoom.getFlavorText());
            } else if (!currRoom.isFight()) { //Runs the room normally(but without flavor text), if there is no fight.
                tuiText = getInputFromTUI("");
            }
            if (currRoom.isFight() && !checkIfDefeated(gamer.getMonstersDefeated())) { //Switches over to combat mode, if the room contains a fight and the monster is not defeated.
                currMonster = mons.makeMonster(currRoom.getMonster(), gamer);
                fight = new Fight(gamer, currMonster);
                ask.printMonsterGreet(currMonster);
                while (true) {
                    tuiText = fightInTUI(currMonster, fight.getPlayerHP());
                    String b = fight.checkFight(tuiText);
                    while (b.equals("falseAction")) { //Note that if the returned String "b" is "falseAction", the original String "a" is disregarded.
                        tuiText = fightInTUI(currMonster, fight.getPlayerHP());
                        b = fight.checkFight(tuiText);
                    }
                    if (b.equals("isOther")) {
                        actOnCheck(tuiText, b);
                    }
                    if (b.equals("Flee")) {
                        this.nextRoom = this.prevRoom;
                    }
                    currMonster = fight.getMonster();
                    if (!fight.isFightInProgress()) {
                        break;
                    }
                    if (fight.isIsPlayerDead()) {
                        fm.saveData(gamer);
                        fm.readData();
                        printHighscore(fm.sortedByHighScore());
                    }
                }
                if (currMonster.getHp() <= 0) {
                    ask.printMonsterDefeat(currMonster);
                    if (fight.checkIfLootable()) {
                        gamer.addItem(fight.giveLoot());
                    }
                    gamer.addDefeatedMonster(currMonster);
                    gamer.setScore(currMonster.getMonsterScore());
                }
                gamer.setHealth(fight.getPlayerHP());
                currRoom.setFight(false);
            } else if (currRoom.isFight() && checkIfDefeated(gamer.getMonstersDefeated())) {
                currRoom.setFight(false);
            } else {
                checkAction(tuiText);
            }
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
        this.prevRoom = this.currRoom;
        this.currRoom = this.nextRoom;
    }
    
    public void createPlayer(String a) {
        this.gamer = new Player(a, 100);
    }
    
    public void checkAction(String a) {
        Actions ch = new Actions(a, currRoom);
        String b = ch.checkAction();
        while (b.equals("falseAction")) { //Note that if the returned String "b" is "falseAction", the original String "a" is disregarded.
            a = ask.falseInput();
            ch = new Actions(a, currRoom);
            b = ch.checkAction();
        }
        actOnCheck(a, b);
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
                + "        ░                                                                 \n"
                + "Intro:\n"
                + "If available, type: \"north\", \"south\", \"east\" or \"west\" to move to the room in tha direction.\n"
                + "You can type \"help\" and \"inventory\" at any time to get extra info.\n"
                + "In combat you will usually be able to attack and flee, but other options may be available under certain circumstances.\n"
                + "Some options may not be displayed, but the most obvious actions are always available.\n";
    }
    
    private String fightInTUI(Monster a, int hp) {
        return ask.fightInput(a, hp);
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
    
    private void otherInputs(String a) {
        if (a.equals("help")) {
            flag = false;
            ask.generalPrinter("Type inventory to access items."
                    + "");
        }
        if (a.equals("inventory")) {
            if (!gamer.getItems().isEmpty()) {
                for (int i = 0; i < gamer.getItems().size(); i++) {     //Prints available items in invetory
                    ask.generalPrinter(gamer.getItems().get(i).getName());
                    ask.generalPrinter("- type \"exit\" to return.");
                }
                while (true) {
                    String itemReq = ask.inputRequest("Select Item to interact with: ");
                    if (itemReq.equals("exit")) {
                        break;
                    }
                    for (int i = 0; i < gamer.getItems().size(); i++) {
                        if (itemReq.equals(gamer.getItems().get(i).getName())) {
                            ask.printItem(gamer.getItems().get(i));
                            handleItem(gamer.getItems().get(i));
                            return;
                        }
                    }
                    ask.generalPrinter("No such item. Try again.");
                }
            }
        }
    }
    
    private void actOnCheck(String a, String b) {
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
            ask.generalPrinter(al.getActionFlav());
            nextRoom = al.doAction(a, currRoom);
            flag = false;
            if (al.isGivesLoot()) {
                gamer.addItem(al.getActionLoot());
            }
            
        }
        if (b.equals("isOther")) { //Treats the a input if it is help or inventory.
            otherInputs(a);
        }
    }
    
    private boolean checkIfDefeated(ArrayList<Monster> l) {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getName().equals(currMonster.getName())) {
                return true;
            }
        }
        return false;
    }
    
    private void printHighscore(ArrayList<Player> l){
        ask.generalPrinter("HIGHSCORE:\n");
        for (Player p : l){
            ask.generalPrinter("Name: " + p.getName()+ " Score: " + p.getScore() +"\n");
        }
    }
    
}
