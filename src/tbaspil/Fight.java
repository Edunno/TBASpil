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

    Player p;
    Monster m;
    boolean fightInProgress;

    public Fight(Player p, Monster m, boolean fightInProgress) {
        this.p = p;
        this.m = m;
        this.fightInProgress = fightInProgress;
    }

    public void attack() {
        if (fightInProgress) {
            m.takeDamage(p.getMainHand().getDmgBonus() + p.getOffHand().getDmgBonus());
            p.setHealth(p.getHealth()-m.getDmg());
            if(m.getHp() <= 0 || p.getHealth() <= 0){
                fightInProgress = false;
            }
        }
    }

}
