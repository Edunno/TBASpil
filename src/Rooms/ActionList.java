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

    public Room doAction(String actionTaken, Room currRoom) {
        if (actionTaken.equals("Loot Stores")) {
            return lootStores(currRoom);
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
}
