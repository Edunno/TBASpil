/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player.Monsters;

import Player.Monster;
import Rooms.ItemList;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author KimPPedersen
 */
public class AustinPowers extends Monster {

    private String voiceAttack;
    private int dmg1 = 0;
    private int dmg2 = 0;
    private Random r = new Random();
    private ArrayList attackOptions;
    private int rand;
    private ItemList l = new ItemList();

    public AustinPowers() {
        super("Austin Powers", 20, 2, 50);
        attackOptions.add("attack");
        attackOptions.add("Do drugs");
        attackOptions.add("Dance off");
        setMonsterGreetings("Yeah, Baby! Ohhhhh behave... HAHHAHA - wanna fight now or fight later baby?!");
        setMonsterDefeat("my mojo... You got me... Shagadelic, Baby, see you later aligator!");
        setLoot(l.getBBGun());
        
    }
    
    public void voiceAttack() {
        int rand = r.nextInt(5) + 1;
        dmg1 = 0;
        switch (rand) {
            case 1:
                voiceAttack = "Austin Power attacks you";
                dmg1 = 2 + dmg2;
                break;
            case 2:
                voiceAttack = "Austin Power wants to do drugs with you";
                dmg1 = 0 + dmg2;
                break;
            case 3:
                voiceAttack = "Austin Power wants to dance!";
                dmg1 = 2 + dmg2;
                break;
        }
    }

    public void attackOptions(String a){
     switch (a) {
            case "attack":
                break;
            case "Do drugs":
                takeDamage(1);
                dmg1 = 1;
                break;
            case "Dance off":
                takeDamage(2);
                dmg1 = 0;
                break;
    }
    
    }
}
