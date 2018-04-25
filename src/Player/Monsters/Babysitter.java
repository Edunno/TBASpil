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
    private int dmg2 = 0;
    private Random r = new Random();
    private ArrayList attackOptions;
    private int rand;

    public Babysitter() {
        super("Babysitter", 10, 0, 30);
        attackOptions.add("attack");
        attackOptions.add("Yell at babysitter");
        attackOptions.add("Snarky comeback");
        attackOptions.add("Start crying");
    }

    @Override
    public int attack() {
        voiceAttack();
        return dmg1;
    }

    public void voiceAttack() {
        this.rand = r.nextInt(5) + 1;
        dmg1 = 0;
        switch (rand) {
            case 1:
                voiceAttack = "You go to bed, young man";
                dmg1 = dmg2 + 1;
                break;
            case 2:
                voiceAttack = "You're not old enough to look at those, young man";
                dmg1 = dmg2 + 0;
                break;
            case 3:
                voiceAttack = "I'm telling your parents, young man! You're going to be so much in trouble!";
                dmg1 = dmg2 + 2;
                break;
            case 4:
                voiceAttack = "Don't you roll your eyes at me, young man";
                dmg1 = dmg2 + 1;
                attackOptions.remove("Snarky comeback");
                attackOptions.add("Repeat what babysitter said");
                break;
            case 5:
                voiceAttack = "I'm going to count to three and then you're in trouble, young man";
                dmg1 = dmg2 + 0;
                break;
            case 6:
                voiceAttack = "Aren't you cuttest one, young man";
                dmg1 = dmg2 + 0;
                attackOptions.remove("attack");
                attackOptions.add("Make out with babysitter");
                break;
            default:
                break;
        }
    }

    @Override
    public void attackOptions(String a) {
        switch (rand) {
            case 1:
                switch (a) {
                    case "attack":
                        takeDamage(0);
                        dmg2 = 3;
                        break;
                    case "yell at babysitter":
                        takeDamage(1);
                        break;
                    case "Snarky comeback":
                        takeDamage(2);
                        break;
                    case "start crying":
                        takeDamage(0);
                        dmg2 = -2;
                        break;
                    default:
                        break;
                }
                break;

            case 2:
                switch (a) {
                    case "attack":
                        takeDamage(0);
                        dmg2 = 3;
                        break;
                    case "yell at babysitter":
                        takeDamage(1);
                        dmg2 = 0;
                        break;
                    case "Snarky comeback":
                        takeDamage(3);
                        break;
                    case "start crying":
                        takeDamage(0);
                        dmg2 = 2;
                        break;
                    default:
                        break;
                }
                break;

            case 3:
                switch (a) {
                    case "attack":
                        takeDamage(1);
                        dmg2 = 0;
                        break;
                    case "yell at babysitter":
                        takeDamage(1);
                        dmg2 = 1;
                        break;
                    case "Snarky comeback":
                        takeDamage(3);
                        dmg2 = 0;
                        break;
                    case "start crying":
                        takeDamage(2);
                        dmg2 = 2;
                        break;
                    default:
                        break;
                }
                break;

            case 4:
                switch (a) {
                    case "attack":
                        takeDamage(2);
                        dmg2 = 0;
                        break;
                    case "yell at babysitter":
                        takeDamage(2);
                        dmg2 = 0;
                        break;
                    case "Repeat what babysitter said":
                        takeDamage(3);
                        dmg2 = 0;
                        break;
                    case "start crying":
                        takeDamage(0);
                        dmg2 = 0;
                        break;
                    default:
                        break;
                }
                break;

            case 5:
                switch (a) {
                    case "attack":
                        takeDamage(2);
                        dmg2 = 0;
                        break;
                    case "yell at babysitter":
                        takeDamage(3);
                        dmg2 = 0;
                        break;
                    case "Snarky comeback":
                        takeDamage(5);
                        dmg2 = 0;
                        break;
                    case "start crying":
                        takeDamage(0);
                        dmg2 = 2;
                        break;
                    default:
                        break;
                }
                break;

            case 6:
                switch (a) {
                    case "Make out with babysitter":
                        takeDamage(10);
                        dmg2 = 0;
                        break;
                    case "yell at babysitter":
                        takeDamage(2);
                        dmg2 = 0;
                        break;
                    case "Snarky comeback":
                        takeDamage(3);
                        dmg2 = 0;
                        break;
                    case "start crying":
                        takeDamage(2);
                        dmg2 = 5;
                        break;
                    default:
                        break;
                }
                break;
        }
    }

}
