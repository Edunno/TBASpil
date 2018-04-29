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

    public Item getWoodSword() {
        Item woodSword = new Item("Wooden Sword", "A wooden sword. It's pretty scrappy, and pretty crappy, but I guess it beats having to use your fists.", true);
        woodSword.setReUsable(true);
        woodSword.setIsMainHand(true);
        woodSword.setDmgBonus(1);
        woodSword.setUnique(true);
        return woodSword;
    }

    public Item getMomsDildo() {
        Item momsDildo = new Item("Moms Dildo", "It's moist, dripping and you can feel the warmth of your mothers loom", true);
        momsDildo.setReUsable(true);
        momsDildo.setIsMainHand(true);
        momsDildo.setDmgBonus(2);
        momsDildo.setUnique(true);
        return momsDildo;
    }

    public Item getMorningStar() {
        Item morningStar = new Item("Morning Star", "A morning star. Dont swing it headless around. You could end headless.", true);
        morningStar.setReUsable(true);
        morningStar.setIsMainHand(true);
        morningStar.setDmgBonus(2);
        return morningStar;
    }

    public Item getDaddysBelt() {
        Item daddysBelt = new Item("Daddys Belt", "Oh boi, you know this one hurts like fuck.", true);
        daddysBelt.setReUsable(true);
        daddysBelt.setIsMainHand(true);
        daddysBelt.setDmgBonus(3);
        return daddysBelt;
    }

    public Item getGoose() {
        Item goose = new Item("Goose", "Legendary weapon. It literally can break your arm. Use is wisely, it will flee after an attack", true);
        goose.setIsMainHand(true);
        goose.setReUsable(false);
        goose.setDmgBonus(30);
        goose.setUnique(true);
        return goose;
    }

    public Item getMonsterEnergy() {
        Item monsterEnergy = new Item("Monster Energy", "Programming will be easier now, but you don't have a pc", true);
        monsterEnergy.setReUsable(false);
        monsterEnergy.setHpRestore(20);
        return monsterEnergy;
    }

    public Item getPlasticShield() {
        Item plasticShield = new Item("Plastic Shield", "Not very effective and harms the inviroment. *SCREECH* YOU MURDER", true);
        plasticShield.setReUsable(true);
        plasticShield.setIsOffHand(true);
        plasticShield.setDefBonus(2);
        plasticShield.setUnique(true);
        return plasticShield;
    }

    public Item getBirchBranch() {
        Item birchBranch = new Item("Birch Branch", "bathed in cold icewater the Birch branch is used to slap your body in the sauna.\n"
                + "The sound of the braches hitting the body makes the distinguish sound: Swwwwwoooofff !!!", true);
        birchBranch.setReUsable(true);
        birchBranch.setIsMainHand(true);
        birchBranch.setIsOffHand(true);
        birchBranch.setHpRestore(3);
        birchBranch.setDmgBonus(1);
        return birchBranch;
    }

    public Item getBBGun() {
        Item BBGun = new Item("BB Gun", "A little toy pistol which can shoot small plastic bullets - HURTS like hell!", true);
        BBGun.setReUsable(true);
        BBGun.setIsMainHand(true);
        BBGun.setDmgBonus(2);
        return BBGun;
    }

    public Item getSulfuras() {
        Item Sulfuras = new Item("Sulfuras, Hand of Ragnaros", "A giant glowing hammer, lava is flowing through the handle and it seems to be nearly indestructible", true);
        Sulfuras.setReUsable(true);
        Sulfuras.setIsMainHand(true);
        Sulfuras.setDmgBonus(30);
        Sulfuras.setUnique(true);
        return Sulfuras;
    }

    public Item getCrowbar() {
        Item crowbar = new Item("A red Crowbar", "A usefull tool. Equally good at opening boxes and smashing skulls", true);
        crowbar.setReUsable(true);
        crowbar.setIsMainHand(true);
        crowbar.setDmgBonus(2);
        return crowbar;
    }
}
