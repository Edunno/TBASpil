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
public class Rioter extends Monster {

    private int burnTimer;

    public Rioter() {
        super(10, 2);
    }

    @Override
    public int attack() {
        System.out.print("The Rioter attacks you ");
        int dmg = 0;
        Random r = new Random();
        int n = r.nextInt(9);
        if (n > 2 || burnTimer != 0) {
            System.out.print(" with a crowbar");
            dmg += 2;
        } else {
            System.out.print("with a molotov cocktail");
            burnTimer = 0;
            molotov();
        }
        if (burnTimer != 0) {
            System.out.print(", while you are on fire");
            dmg += 2;
        }
        System.out.print(".");
        return dmg;

    }

    public void molotov() {
        if (burnTimer < 3) {
            burnTimer++;
        }
        else {
            burnTimer = 0;
        }
    }

}
