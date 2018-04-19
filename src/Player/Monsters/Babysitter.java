/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player.Monsters;

import Player.Monster;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Esben
 */
public class Babysitter extends Monster {

    private String voiceAttack;
    private int dmg1 = 0;
    private Random r = new Random();
    private ArrayList attackOptions;
    int rand;

    public Babysitter() {
        super(10, 1);
        attackOptions.add("Attack");
        attackOptions.add("Yell at babysitter");
        attackOptions.add("Snarky comeback");
        attackOptions.add("Start crying");
    }

    @Override
    public int attack() {
        voiceAttack();
        return dmg1;
    }

    @Override
    public void voiceAttack() {
        int rand = r.nextInt(5) + 1;
        dmg1 = 0;
        switch (rand) {
            case 1:
                voiceAttack = "You go to bed, young man";
                dmg1 = 1;
                break;
            case 2:
                voiceAttack = "You're not old enough to look at those, young man";
                dmg1 = 0;
                break;
            case 3:
                voiceAttack = "I'm telling your parents, young man! You're going to be so much in trouble!";
                dmg1 = 2;
                break;
            case 4:
                voiceAttack = "Don't you roll your eyes at me, young man";
                dmg1 = 1;
                attackOptions.remove("Snarky comeback");
                attackOptions.add("Repeat in in a high pitch voice what babysitter said");
                break;
            case 5:
                voiceAttack = "I'm going to count to three and then you're in trouble, young man";
                dmg1 = 0;
                break;
            case 6:
                voiceAttack = "Aren't you cuttest one, young man";
                dmg1 = 0;
                attackOptions.remove("attack");
                attackOptions.add("Make out with babysitter");
                break;
            default:
                break;
        }
    }

    public void attackOptions(String a) {
        if (rand == 1 && (a.equals("attack"))) {
            takeDamage(0);
            dmg1 = 3;
        } else if (rand == 1 && (a.equals("yell at babysitter"))) {
            takeDamage(1);
        } else if (rand == 1 && (a.equals("Snarky comeback"))) {
            takeDamage(2);
        } else if (rand == 1 && (a.equals("start crying"))) {
            takeDamage(0);
            dmg1 = -2;
        } else if (rand == 2 && (a.equals("attack"))) {
            takeDamage(0);
            dmg1 = 3;
        } else if (rand == 2 && (a.equals("yell at babysitter"))) {
            takeDamage(1);
            dmg1 = 0;
        } else if (rand == 2 && (a.equals("Snarky comeback"))) {
            takeDamage(3);
        } else if (rand == 2 && (a.equals("start crying"))) {
            takeDamage(0);
            dmg1 = 2;
        } else if (rand == 3 && (a.equals("attack"))) {
            takeDamage(1);
            dmg1 = 0;
        } else if (rand == 3 && (a.equals("yell at babysitter"))) {
            takeDamage(1);
            dmg1 = 1;
        } else if (rand == 3 && (a.equals("Snarky comeback"))) {
            takeDamage(3);
            dmg1 = 0;
        } else if (rand == 3 && (a.equals("start crying"))) {
            takeDamage(2);
            dmg1 = 2;
        } else if (rand == 4 && (a.equals("attack"))) {
            takeDamage(2);
            dmg1 = 0;
        } else if (rand == 4 && (a.equals("yell at babysitter"))) {
            takeDamage(2);
            dmg1 = 0;
        } else if (rand == 4 && (a.equals("Repeat in in a high pitch voice what babysitter said"))) {
            takeDamage(3);
            dmg1 = 0;
        } else if (rand == 4 && (a.equals("start crying"))) {
            takeDamage(0);
            dmg1 = 0;
        } else if (rand == 5 && (a.equals("attack"))) {
            takeDamage(2);
            dmg1 = 0;
        } else if (rand == 5 && (a.equals("yell at babysitter"))) {
            takeDamage(3);
            dmg1 = 0;
        } else if (rand == 5 && (a.equals("Snarky comeback"))) {
            takeDamage(5);
            dmg1 = 0;
        } else if (rand == 5 && (a.equals("start crying"))) {
            takeDamage(0);
            dmg1 = 2;
        } else if (rand == 6 && (a.equals("Make out with babysitter"))) {
            takeDamage(10);
            dmg1 = 0;
        } else if (rand == 6 && (a.equals("yell at babysitter"))) {
            takeDamage(2);
            dmg1 = 0;
        } else if (rand == 6 && (a.equals("Snarky comeback"))) {
            takeDamage(3);
            dmg1 = 0;
        } else if (rand == 6 && (a.equals("start crying"))) {
            takeDamage(2);
            dmg1 = 5;
        }

    }
}
