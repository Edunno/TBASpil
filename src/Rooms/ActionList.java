/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rooms;

/**
 *
 * @author Esben
 */
public class ActionList {

    public void doAction(String actionTaken, Room currRoom) {
        if (actionTaken.equals("Loot Stores")) {
            lootStores(currRoom);
        }
        /*if(actionTaken.equals("")){
        
        }*/
    }

    public Room lootStores(Room currRoom) {
        System.out.println("You loot a couple of shops, and find a crowbar. Everything else is useless. There are some clothes and hoodies, but that's not really important, but if you want, you can imagine you get some new clothes.");
        currRoom.addAction("action"); //Placeholder!!!!!!!!!!
        return currRoom;
    }
}
