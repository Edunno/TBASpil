/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player.Monsters;

import Player.Monster;
import java.util.Random;

/**
 *
 * @author Esben
 */
public class Babysitter extends Monster {

    private String voiceAttack;

    private Random r = new Random();

    public Babysitter() {
        super(10, 1);
    }

    @Override
    public int attack() {
        voiceAttack();
        int dmg = voiceAttack();
        return dmg;
    }

    public int voiceAttack() {
        int rand = r.nextInt(5) + 1;
        int dmg1 = 0;
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
                dmg1 =1;
                break;
            case 5:
                voiceAttack = "I'm going to count to three and then you're in trouble, young man";
                dmg1 =0;
                break;
            case 6:
                voiceAttack = "Aren't you cuttest one, young man";
                dmg1 =0;
                break;
            default:
                break;
        }
            return dmg1;
    }

}
