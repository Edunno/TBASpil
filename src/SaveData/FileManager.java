/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SaveData;

import Player.Player;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author KimPPedersen
 */
public class FileManager implements DataSaverInterface {

    String filepath = "Score.csv";

    //Her gemmes data
    @Override
    public void saveData(Player p) {
        try {
            boolean append = true;
            java.io.FileWriter fw = new java.io.FileWriter(filepath, append);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(p.getName() + "," + p.getScore());
            pw.flush();
            pw.close();
            JOptionPane.showMessageDialog(null, "Data saved");
        } catch (IOException E) {
            JOptionPane.showMessageDialog(null, "Data not saved");
        }
    }
    ArrayList<Player> l = new ArrayList();

    //Her Indlæses data fra fil
    @Override
    public ArrayList<Player> readData() {
        try {
            Scanner fileRead = new Scanner(new File(filepath));
            while (fileRead.hasNext()) {
                String data = fileRead.next();
                String[] tokens = data.split(",");
                String name = tokens[0];
                int score = Integer.parseInt(tokens[1]);
                Player player = new Player(name, 0);
                player.setScore(score);
                l.add(player);
            }
            fileRead.close();

        } catch (FileNotFoundException E) {
            E.printStackTrace();
        }
        return l;
    }
    //Her sorteres data til efter high score
    @Override
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
}
