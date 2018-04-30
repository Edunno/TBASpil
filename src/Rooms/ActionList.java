/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rooms;

import Player.Item;

/**
 *
 * @author Esben
 */
public class ActionList {

    private boolean givesLoot = false;
    private Item actionLoot;
    private String actionFlav;

    public Room doAction(String actionTaken, Room currRoom) {
        if (actionTaken.equals("Loot Stores")) {
            return lootStores(currRoom);
        }
        if (actionTaken.equals("Loot chest")) {
            return lootChest(currRoom);
        }
        if (actionTaken.equals("Check chair")) {
            return checkChair(currRoom);
        }
        if (actionTaken.equals("Press start")) {
            return pressStart(currRoom);
        }
        /*if(actionTaken.equals("")){
        
        }*/
        return null;
    }

    public boolean isGivesLoot() {
        return givesLoot;
    }

    public Item getActionLoot() {
        return actionLoot;
    }

    public Room lootStores(Room currRoom) {
        System.out.println("You loot a couple of shops, and find a crowbar. Everything else is useless. There are some clothes and hoodies, but that's not really important, but if you want, you can imagine you get some new clothes.");
        currRoom.removeAction("Loot Stores");
        ItemList il = new ItemList();
        actionLoot = il.getCrowbar();
        return currRoom;
    }

    public Room lootChest(Room currRoom) {
        currRoom.removeAction("Loot chest");
        ItemList il = new ItemList();
        actionLoot = il.getDaddysBelt();
        actionFlav = "You have found Daddys Belt - Oh boi, you know this one hurts like fuck.";
        return currRoom;
    }
    
    public Room checkChair(Room currRoom){
        currRoom.removeAction("Check chair");
        actionFlav = "Just an old radio, scratting weird sounds.";
        return currRoom;
    }
    
    public Room pressStart(Room currRoom) {
        currRoom.removeAction("Press start");
        ItemList il = new ItemList();
        actionLoot = il.getMonsterEnergy();
        actionFlav = "A pinata drops down from a missing square in the ceiling."
                + "It contains a Monster!!"
                + "Programming will be easier now, but you don't have a pc";
        return currRoom;
    }

    public String getActionFlav() {
        return actionFlav;
    }
    
    
}
