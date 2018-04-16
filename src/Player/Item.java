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
    private int hpRestore; 
    private int hpBonus;        //permanent bonus to hp pool.
    private boolean reUsable;   //Decides wether the item is single use or not.
    private boolean unique;     //Decides wether the player can have multiple of the item or not.

    public Item(String name, String description, int dmgBonus, int defBonus, int dmgSave, int hpRestore, int hpBonus, boolean reUsable, boolean unique) {
        this.name = name;
        this.description = description;
        this.dmgBonus = dmgBonus;
        this.defBonus = defBonus;
        this.dmgSave = dmgSave;
        this.hpRestore = hpRestore;
        this.hpBonus = hpBonus;
        this.reUsable = reUsable;
        this.unique = unique;
    }

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
    
    
}
