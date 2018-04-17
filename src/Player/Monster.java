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
public class Monster {
    private int hp;
    private int dmg;

    public Monster(int hp, int dmg) {
        this.hp = hp;
        this.dmg = dmg;
    }
    
    public int attack(){
        return dmg;
    }

    public int getDmg() {
        return dmg;
    }
    
    public void takeDamage(int i){
        this.hp = this.hp-i;
    }

    public int getHp() {
        return hp;
    }
    
}
