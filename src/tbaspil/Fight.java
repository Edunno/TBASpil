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

    private Player p; // We need a Player object for the fight
    private Monster m; // We also need a monster object
    private boolean fightInProgress = true; // this boolean is used to signal whether theres a fight in progress or not
    private boolean isPlayerDead = false;

    public Fight(Player p, Monster m) {
        this.p = p;
        this.m = m;
    }

    // Attack method calls the Monster objects takeDamage() method and calculates all the item bonuses to decied how much damage the attack does
    // the player then loses health according to the monsters damage, if the monsters health is below 0 the fight is stopped.
    public void attack() {
        if (fightInProgress) {
            m.takeDamage(checkPlayerHands()+1);
            p.setHealth(p.getHealth() - m.getDmg() - checkForDefense());
            if (m.getHp() <= 0) {
                fightInProgress = false;
            }
            if (p.getHealth() <= 0) {
                isPlayerDead = true;
            }
        }
    }

    public String checkFight(String a) {
        while (true) {
            for (int i = 0; i < m.getAttackOptions().size(); i++) {
                if (a.equals(m.getAttackOptions().get(i))) {
                    if (a.equals("attack")) {
                        attack();
                        return "other";
                    } else {
                        m.attackOptions(a);
                    }
                } else if (a.equals("help") || a.equals("inventory")) {
                    return "isOther";
                }
            }
            return "falseAction";
        }
    }

    public Monster getMonster() {
        return m;
    }

    public boolean isFightInProgress() {
        return fightInProgress;
    }

    public boolean isIsPlayerDead() {
        return isPlayerDead;
    }
    
    private int checkPlayerHands(){
        if(p.getMainHand() == null){
            if(p.getOffHand() == null){
                return 0;
            }
            return p.getOffHand().getDmgBonus();
        }
        if(p.getOffHand() == null){
            return p.getMainHand().getDmgBonus();
        }
        return p.getMainHand().getDmgBonus()+p.getOffHand().getDmgBonus();
    }

    private int checkForDefense() {
        if(p.getMainHand() == null){
            if(p.getOffHand() == null){
                return 0;
            }
            return p.getOffHand().getDefBonus();
        }
        if(p.getOffHand() == null){
            return p.getMainHand().getDefBonus();
        }
        return p.getMainHand().getDefBonus()+p.getOffHand().getDefBonus();
    }
}
