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
 * @author Dan
 */
public class Ragnaros extends Monster {
    
    private Random r = new Random();
    private ArrayList attackOptions;
    private int rand;
    String voiceAttack;
    
    
    
    public Ragnaros(){
        super("Ragnaros, the Fire Lord", 50, 5, 50);
        attackOptions.add("Spit");
        attackOptions.add("Pee");
        attackOptions.add("Fire extinguisher");
    }
    

    public void voiceAttack() {
        rand =  r.nextInt(2)+1;
        switch (rand) {
            case 1:
               voiceAttack = "By fire be purged!";
                break;
            case 2:
                voiceAttack = "Taste the flames of Sulfuron";
                break;
            case 3:
                voiceAttack = "DIE INSECT!";
                break;
        }
    }
        
        
    public void attackOptions(String a){
     switch (a) {
            case "Spit":
                takeDamage(1);
                break;
            case "Pee":
                takeDamage(2);
                break;
            case "Fire extinguisher":
                takeDamage(3);
                break;
    }
    
    }
}


