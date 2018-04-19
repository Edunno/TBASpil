/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import java.util.ArrayList;

/**
 *
 * @author caspe
 */
public class Player {

    private String name;
    private int health;
    private ArrayList<Item> Items;
    private Item mainHand;
    private Item offHand;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<Item> getItems() {
        return Items;
    }

    public void addItem(Item newItem) {
        //Lav check for om der er duplikater m.m.
        this.Items.add(newItem);
    }
    public void removeItem(Item oldItem){
        this.Items.remove(oldItem);
    }

    public int attack() {
        return 0;
    }

    public Item getMainHand() {
        return mainHand;
    }

    public void setMainHand(Item mainHand) {
        if (mainHand.isIsMainHand()) {
            this.mainHand = mainHand;
        }
    }

    public Item getOffHand() {
        return offHand;
    }

    public void setOffHand(Item offHand) {
        if (offHand.isIsOffHand()) {
            this.offHand = offHand;
        }
    }

}
