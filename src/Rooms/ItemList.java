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
    
    public Item getMomsDildo(){
        Item momsDildo = new Item("Moms Dildo","It's moist, dripping and you can feel the warmth of your mothers loom",true);
        //Set item values
        return momsDildo;
    }
    
    public Item getMorningStar(){
        Item morningStar = new Item("Morning Star","A morning star. Dont swing it headless around. You could end headless.",true);
        //Set item values
        return morningStar;
    }
    
    public Item getDaddysBelt(){
        Item daddysBelt = new Item("Daddys Belt","Oh boi, you know this one hurts like fuck.",true);
        //Set item values
        return daddysBelt;
    }
    
    public Item getGoose(){
        Item goose = new Item("Goose","Legendary weapon. It literally can break your arm.",true);
        //Set item values
        return goose;
    }
    
    public Item getMonsterEnergy(){
        Item monsterEnergy = new Item("Monster Energy","Programming will be easier now, but you don't have a pc",true);
        //Set item values
        return monsterEnergy;
    }
    
    public Item getPlasticShield(){
        Item plasticShield = new Item("Plastic Shield","Not very effective and harms the inviroment. *SCREECH* YOU MURDER", true);
        //Set item values
        return plasticShield;
    }
    //test
}
