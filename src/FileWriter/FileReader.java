/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileWriter;

import Player.Player;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author KimPPedersen
 */
public class FileReader {
    String filepath = "Score.csv";
    ArrayList<Player> l = new ArrayList();

    public ArrayList<Player> sortedByHighScore() {
        Comparator<Player> c = new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o2.getScore() - o1.getScore();
            }
        };
        Collections.sort(l, c);
        return l;
    }

    public ArrayList<Player> readData() {
        try {
            Scanner fileRead = new Scanner(new File(filepath));
            while (fileRead.hasNext()) {
                String data = fileRead.next();
                String[] tokens = data.split(",");
                String name = tokens[0];
                int score = Integer.parseInt(tokens[1]);
                Player player = new Player(name, score);
                l.add(player);
            }
            fileRead.close();

        } catch (FileNotFoundException E) {
            E.printStackTrace();
        }
        return l;
    }

}
    
    
