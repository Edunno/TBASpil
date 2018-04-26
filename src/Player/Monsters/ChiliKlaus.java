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
public class ChiliKlaus extends Monster {
    
    private Random r = new Random();
    private ArrayList attackOptions;
    private int rand;
    String voiceAttack;
    private String monsterGreetings;
    private String monsterDefeat;
    
    
    
    public ChiliKlaus(){
        super("Chili Klaus", 100, 1, 30);
        attackOptions.add("Eat chili");
        attackOptions.add("Drink milk");
        setMonsterGreetings("Hej med dig! Vil du smage min chili? \n");
        setMonsterDefeat("Chili Klaus can't take it anymore, too much chili  \n"
                         + "\"Jeg har alrig set en person spise så meget chili før! Du er sindssyg!\"\n"
                         + "Chili Klaus runs back into the forest of chillies he emerged from, you will never see him again..");
    }
    

    public void voiceAttack() {
        rand =  r.nextInt(2)+1;
        switch (rand) {
            case 1:
               voiceAttack = "CAROLINA REAPER TIME!";
                break;
            case 2:
                voiceAttack = "Smag på min Ghost pepper!";
                break;
            case 3:
                voiceAttack = "Kom bare du!!";
                break;
        }
    }
        
        
    public void attackOptions(String a){
     switch (a) {
            case "Eat chili":
                takeDamage(5);
                break;
            case "Drink Milk":
                takeDamage(10);
                break;
    }
    
    }
}


