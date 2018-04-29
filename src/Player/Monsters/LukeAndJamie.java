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
    
    private Random r = new Random();
    private ArrayList attackOptions;
    private int rand;
    String voiceAttack;
    int dmg1 = 0;
    private String monsterGreetings;
    private String monsterDefeat;
    
    public LukeAndJamie() {
        super("Luke and Jamie", 20, 2, 25);
        attackOptions.add("attack");
        attackOptions.add("Knock their heads together");
        attackOptions.add("Ask if they could use a hand");
        setMonsterGreetings("*In sync voices* - Greetings traveler, that is some nice hands you have there.");
        setMonsterDefeat("Luke: Now you will never become a jedi, FOOL.\n"
                + "Jamie: FUCKING PIECE OF SHIT GOLD HAND. MAKES ME WEAK AS FK!");
    }

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
        @Override
    public void attackOptions(String str) {
        switch (str) {
            case "attack":
                break;
            case "Knock their heads together":
                takeDamage(3);
                dmg1 = 4;
                break;
            case "Ask if they could use a hand":
                takeDamage(1);
                dmg1 = 2;
                break;
        }
        
        
    }
        
    }
    
    
    

