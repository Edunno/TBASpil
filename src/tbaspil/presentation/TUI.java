/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbaspil.presentation;

import Player.Item;
import Player.Monster;
import Rooms.Room;
import java.util.Scanner;

/**
 *
 * @author caspe
 */
public class TUI {

    private Scanner sc = new Scanner(System.in);

    public String getName() {
        System.out.println("Name?");
        String userName = sc.nextLine();
        while (userName.toLowerCase().equals("south") || userName.toLowerCase().equals("west") || userName.toLowerCase().equals("north") || userName.toLowerCase().equals("east")) {
            System.out.println("Can't be North, South, East or West");
            System.out.println("Name?");
            userName = sc.next();

        }
        return userName;
    }

    public void generalPrinter(String a) {
        System.out.println(a);
    }

    public String getInput(String a, Room room) {
        System.out.println("\n" + a);
        System.out.println("\nAvailable commands:");
        for (int i = 0; i < (room.getDoors().size() + room.getActions().size()); i++) {
            if (i < room.getDoors().size()) {
                System.out.println(room.getDoors().get(i));
            } else if (i >= room.getDoors().size()) {
                System.out.println(room.getActions().get(i - room.getDoors().size()));
            }
        }
        String b = sc.next().toLowerCase();
        return b;
    }

    public String falseInput() {
        System.out.println("Input is not elligeble. Please try again. ");
        String a = sc.next().toLowerCase();
        return a;
    }

    public String fightInput(Monster x) {
        System.out.println(x.getVoiceAttack());

        String a = sc.next();
        return a;
    }

    public String inputRequest(String a) {
        System.out.println(a);
        return sc.next();
    }

    public void printItem(Item a) { //Der mangler måske nogle ting her.
        System.out.println("Name: " + a.getName());
        System.out.println(a.getDescription());
        if (a.getDmgBonus() != 0) {
            System.out.println("Damage: " + a.getDmgBonus());
        }
        if (a.getDefBonus() != 0) {
            System.out.println(a.getDefBonus());
        }
        if (a.getDmgSave() != 0) {
            System.out.println(a.getDmgSave());
        }
        if (a.getHpBonus() != 0) {
            System.out.println(a.getHpBonus());
        }
        if (a.getHpRestore() != 0) {
            System.out.println(a.getHpRestore());
        }
        System.out.println("Reusable: " + a.isReUsable());
    }
}
