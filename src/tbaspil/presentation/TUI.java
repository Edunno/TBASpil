/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbaspil.presentation;

import java.util.Scanner;

/**
 *
 * @author caspe
 */
public class TUI {

    private Scanner sc = new Scanner(System.in);

    public String getName() {
        System.out.println("Name?");
        String userName = sc.next();
        while (userName.toLowerCase().equals("south") || userName.toLowerCase().equals("west") || userName.toLowerCase().equals("north") || userName.toLowerCase().equals("east")) {
            System.out.println("Can't be North, South, East or West");
            System.out.println("Name?");
            userName = sc.next();

        }
        return userName;
    }

    public String getInput(String a) {
        System.out.println(a);
        String b = sc.next().toLowerCase();
        return b;
    }
}
