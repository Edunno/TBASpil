/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbaspil;

import Player.*;

/**
 *
 * @author Dan
 */
public class Fight {

    Player p; // We need a Player object for the fight
    Monster m; // We also need a monster object
    boolean fightInProgress; // this boolean is used to signal whether theres a fight in progress or not
    boolean isPlayerDead = false;

     
    public Fight(Player p, Monster m, boolean fightInProgress) {
        this.p = p;
        this.m = m;
        this.fightInProgress = fightInProgress;
    }

    // Attack method calls the Monster objects takeDamage() method and calculates all the item bonuses to decied how much damage the attack does
    // the player then loses health according to the monsters damage, if the monsters health is below 0 the fight is stopped.
    public void attack() {
        if (fightInProgress) {
            m.takeDamage((p.getMainHand().getDmgBonus() + p.getOffHand().getDmgBonus()) - (p.getMainHand().getDefBonus() + p.getOffHand().getDefBonus()));
            p.setHealth(p.getHealth()-m.getDmg());
            if(m.getHp() <= 0 ){
                fightInProgress = false;
            }
            if(p.getHealth() <= 0){
                isPlayerDead = true;
        }
        }
    }

    

}
