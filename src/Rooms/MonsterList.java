/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rooms;

import Player.Monster;
import Player.Monsters.AustinPowers;
import Player.Monsters.Babysitter;
import Player.Monsters.IgorAndIvan;
import Player.Monsters.LukeAndJamie;
import Player.Monsters.Ragnaros;
import Player.Monsters.Rioter;
import Player.Player;

/**
 *
 * @author Esben
 */
public class MonsterList {

    public Monster makeMonster(String name, Player player) {
        if (name.equals("Babysitter")) {
            Babysitter bs = new Babysitter();
            return bs;
        }
        if (name.equals("Rioter")) {
            Rioter bs = new Rioter();
            return bs;
        }
        if (name.equals("AustinPowers")) {
            AustinPowers ap = new AustinPowers();
            return ap;
        }
        if (name.equals("IgorAndIvan")) {
            IgorAndIvan ii = new IgorAndIvan();
        }
        if (name.equals("LukeAndJamie")) {
            LukeAndJamie lj = new LukeAndJamie();
        }
        if (name.equals("Ragnaros")) {
            Ragnaros r = new Ragnaros();
        }
        return null;
    }
}
