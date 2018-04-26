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
    private String monsterGreetings;
    private String monsterDefeat;
    private ArrayList attackOptions;
    private int monsterScore;
    
    
    public Monster(String name, int hp, int dmg, int monsterScore, String option) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
        this.monsterScore = monsterScore;
        attackOptions = new ArrayList();
        this.attackOptions.add("attack");
        this.attackOptions.add("Flee");
        this.voiceAttack = name + " attacks you!";
        this.monsterGreetings = "The monster greets you..";
        this.monsterDefeat = "The monster is defeated!";
        
    }

    public int attack() {
        return dmg;
    }

    public int getDmg() {
        return dmg;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int i) {
        this.hp = this.hp - i;
    }

    public int getHp() {
        return hp;
    }

    public String getMonsterGreetings(){
        return monsterGreetings;
    }
    
    public String getVoiceAttack() {
        return voiceAttack;
    }
    
    public String getMonsterDefeat(){
        return monsterDefeat;
    }
    
    public int getMonsterScore(){
        return monsterScore;
    }

    public ArrayList getAttackOptions() {
        return attackOptions;
    }

    public abstract void attackOptions(String str);

}
