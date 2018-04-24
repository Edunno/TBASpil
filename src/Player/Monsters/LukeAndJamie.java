/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player.Monsters;

import Player.Monster;
import java.util.ArrayList;
import java.util.Random;

public class LukeAndJamie extends Monster {
    
    private String voiceAttack;
    private int dmg1 = 0;
    private Random r = new Random();
    private int rand;
    
    public LukeAndJamie(int hp, int dmg) {
        super(20, dmg);
    }

    @Override
    public void voiceAttack() {
        this.rand = r.nextInt(5) + 1;
        dmg1 = 0;
        switch (rand) {
            case 1:
                voiceAttack = "Luke swings his lightsaber at you";
                dmg1 = 2;
                break;
            case 2:
                voiceAttack = "Jamie swings his sword at you";
                dmg1 = 2;
                break;
            case 3:
                voiceAttack = "Luke and Jamie gets in the same shirt, and now they have two functional hands and one body.\n"
                        + "A lightsaber and a sword is now comming your way.";
                dmg1 = 4;
                break;
        }
    }
        
        
        
        
    }
    
    
    

