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
 * @author KimPPedersen
 */
public class IgorAndIvan extends Monster {

    private String voiceAttack;
    private int dmg1 = 0;
    private int dmg2 = 0;
    private ArrayList attackOptions;
    private int hp = 200;
    private boolean isIvanAlive = true;
    private Random r = new Random();
    private int rand;

    public IgorAndIvan(String name, int hp, int dmg) {
        super("Igor & Ivan", 200, 10);
        attackOptions.add("attack");
        attackOptions.add("Hit with birch branches");
        attackOptions.add("Wet towel slap");

    }

    private boolean isIvanAlive() {
        if (hp >= 100) {
            isIvanAlive = true;
        }
        return false;
    }

    @Override
    public int attack() {
        isIvanAlive();
        voiceAttack();
        return dmg1;
    }

    public void voiceAttack() {
        if (isIvanAlive) {
            dmg1 = dmg1 * 2;
            this.rand = r.nextInt(5) + 1;
            dmg1 = 0;
            switch (rand) {
                case 1:
                    voiceAttack = "Igor and Ivan attacks you";
                    dmg1 = dmg2 + 1;
                    break;
                case 2:
                    voiceAttack = "Come here you western capitalistic dickhead and let my ball sweat drip on you";
                    dmg1 = dmg2 + 5;
                    break;
                case 3:
                    voiceAttack = "Igor and Ivan makes a human sandwick out of you between their sweaty bodies";
                    dmg1 = dmg2 + 7;
                    break;
                default:
                    break;
            }
        }
        switch (rand) {
            case 1:
                voiceAttack = "Igor attacks you";
                dmg1 = dmg2 + 1;
                break;
            case 2:
                voiceAttack = "Yoy killed my brother, you capitalistic dick! Come here, I'll kill you";
                dmg1 = dmg2 + 5;
                break;
            case 3:
                voiceAttack = "Igor spits vodka fire at you";
                dmg1 = dmg2 + 10;
                break;
            default:
                break;
        }
    }

    @Override
    public void attackOptions(String str) {
        switch (str) {
            case "attack":
                break;
            case "Hit with birch branches":
                takeDamage(0);
                dmg1 = 5;
                break;
            case "Wet towel slap":
                takeDamage(0);
                dmg1 = 10;
                break;
        }

    }

}
