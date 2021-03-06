/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

/**
 *
 * @author Esben
 */
public class Item {
    private String name;
    private String description;
    private int dmgBonus;
    private int defBonus;       //Reduces damage taken.
    private int dmgSave;        //0-99 Gives a chance to avoid all incoming damage.
    private int hpRestore;      //Restore hp to a player, if any hp is missing.
    private int hpBonus;        //permanent bonus to hp pool.
    private boolean reUsable;   //Decides wether the item is single use or not.
    private boolean unique;     //Decides wether the player can have multiple of the item or not.
    private boolean isMainHand; //Does the item take up the main hand slot?
    private boolean isOffHand;  //Does the item take up the off hand slot?

    public Item(String name, String description, boolean unique) {
        this.name = name;
        this.description = description;
        this.unique = unique;
    }
    /*
    #######################################
    ###############GETTERS#################
    #######################################
    */
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDmgBonus() {
        return dmgBonus;
    }

    public int getDefBonus() {
        return defBonus;
    }

    public int getDmgSave() {
        return dmgSave;
    }

    public int getHpRestore() {
        return hpRestore;
    }

    public int getHpBonus() {
        return hpBonus;
    }

    public boolean isReUsable() {
        return reUsable;
    }

    public boolean isUnique() {
        return unique;
    }

    public boolean isIsMainHand() {
        return isMainHand;
    }

    public boolean isIsOffHand() {
        return isOffHand;
    }
    /*
    ###################################
    ##############SETTERS##############
    ###################################
    */

    public void setName(String name) {
        this.name = name;
    }

    public void setDmgBonus(int dmgBonus) {
        this.dmgBonus = dmgBonus;
    }
    
    public void setDefBonus(int defBonus) {
        this.defBonus = defBonus;
    }

    public void setDmgSave(int dmgSave) {
        this.dmgSave = dmgSave;
    }

    public void setHpRestore(int hpRestore) {
        this.hpRestore = hpRestore;
    }

    public void setHpBonus(int hpBonus) {
        this.hpBonus = hpBonus;
    }

    public void setReUsable(boolean reUsable) {
        this.reUsable = reUsable;
    }
    
    public void setUnique (boolean unique) {
        this.unique = unique;
    }

    public void setIsMainHand(boolean isMainHand) {
        this.isMainHand = isMainHand;
    }

    public void setIsOffHand(boolean isOffHand) {
        this.isOffHand = isOffHand;
    }
    
    
    
}
