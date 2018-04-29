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
    private int maxHealth;
    private int hp;
    private int score;
    private ArrayList<Monster> monstersDefeated = new ArrayList();
    private ArrayList<Item> Items = new ArrayList();
    private Item mainHand;
    private Item offHand;

    public Player(String name, int health) {
        this.name = name;
        this.maxHealth = health;
        this.hp = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return hp;
    }

    public void setHealth(int health) {
        this.maxHealth = health;
    }

    public ArrayList<Item> getItems() {
        return Items;
    }

    public void addItem(Item newItem) {
        if (Items.contains(newItem) && newItem.isUnique()) {
            return;
        }
        this.Items.add(newItem);
    }

    public void removeItem(Item oldItem) {
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

    public void takeDmg(int i) {
        hp = hp - i;
        if (hp > maxHealth) {
            hp = maxHealth;
        }
    }

    public void restoreHp(int i) {
        hp += i;
        if (hp > maxHealth) {
            hp = maxHealth;
        }
    }

    public void addMaxHealth(int i) {
        maxHealth += i;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int i) {
        score += i;
    }

    public void addDefeatedMonster(Monster m) {
        monstersDefeated.add(m);
    }

    public ArrayList<Monster> getMonstersDefeated() {
        return monstersDefeated;
    }
}
