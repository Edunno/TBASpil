    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import java.util.ArrayList;

/**
 *
 * @author Esben
 */
public abstract class Monster {
    private String name;
    private int hp;
    private int dmg;
    private String voiceAttack;
    private ArrayList attackOptions;

    public Monster(String name, int hp, int dmg) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
        this.attackOptions.add("attack");
        this.attackOptions.add("Flee");
    }
    
    public int attack(){
        return dmg;
    }

    public int getDmg() {
        return dmg;
    }
    
    public String getName(){
        return name;
    }
    
    public void takeDamage(int i){
        this.hp = this.hp-i;
    }

    public int getHp() {
        return hp;
    }
    public void voiceAttack(){
        this.voiceAttack = "The monster attacks you!";
    }

    public String getVoiceAttack() {
        return voiceAttack;
    }

    public ArrayList getAttackOptions() {
        return attackOptions;
    }
    
    public abstract void attackOptions(String str);
    
}
