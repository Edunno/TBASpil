/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SaveData;

import Player.Player;
import java.util.ArrayList;

/**
 *
 * @author KimPPedersen
 */
public interface DataSaverInterface {

    ArrayList<Player> readData();

    void saveData(Player p);

    ArrayList<Player> sortedByHighScore();
    
}
