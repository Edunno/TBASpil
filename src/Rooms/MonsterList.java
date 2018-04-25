/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rooms;

import Player.Monster;
import Player.Monsters.Babysitter;
import Player.Player;

/**
 *
 * @author Esben
 */
public class MonsterList {
    
    public Monster makeMonster(String name, Player player){
        if(name.equals("Babysitter")){
            Babysitter bs = new Babysitter();
            return bs;
        }
        /*
        if(name.equals("MonsterNavn")){
            MonsterNavn bs = new MonsterNavn();
            return bs;
        }
        */
        return null;
    }
}
