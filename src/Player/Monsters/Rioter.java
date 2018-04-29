/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player.Monsters;

import Player.Item;
import Rooms.ItemList;
import Player.Monster;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Esben
 */
public class Rioter extends Monster {

    private int burnTimer;
    private ItemList l = new ItemList();

    public Rioter() {
        super("Rioter", 10, 2, 40);
        setLoot(l.getPlasticShield());
        setMonsterGreetings("A rioter comes running towards you.");
        
    }

    @Override
    public int attack() {
        int dmg = 0;
        Random r = new Random();
        int n = r.nextInt(9);
        if (n > 2 || burnTimer != 0) {
            dmg += 2;
        } else {
            burnTimer = 0;
            molotov();
        }
        if (burnTimer != 0) {
            dmg += 2;
        }
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

    @Override
    public void attackOptions(String str) {
        //Lol, you can only attack this guy or run away from him. You suck if you flee btw.
    }

}
