/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileWriter;

import Player.Player;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author KimPPedersen
 */
public class FileWriter {

    String filepath = "Score.csv";

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

}
