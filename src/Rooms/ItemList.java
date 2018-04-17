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
public class ItemList {
    
    
    
    public Item getWoodSword(){
        Item woodSword = new Item("Wooden Sword","A wooden sword. It's pretty scrappy, and pretty crappy, but I guess it beats having to use your fists.",true);
        //Set item values
        return woodSword;
    }
    
    public Item momsDildo(){
        Item momsDildo = new Item("Moms Dildo","It's moist, dripping and you can feel the warmth of your mothers loom",true);
        //Set item values
        return momsDildo;
    }
}
