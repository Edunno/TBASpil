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
        printSeperator();
        System.out.println("\n" + a);
        System.out.println("\nAvailable commands:");
        for (int i = 0; i < (room.getDoors().size() + room.getActions().size()); i++) {
            if (i < room.getDoors().size()) {
                System.out.println(room.getDoors().get(i));
            } else if (i >= room.getDoors().size()) {
                System.out.println(room.getActions().get(i - room.getDoors().size()));
            }
        }
        printSeperator();
        String b = sc.nextLine();
        return b;
    }

    public String falseInput() {
        System.out.println("Input is not elligeble. Please try again. ");
        String a = sc.nextLine();
        return a;
    }

    public String fightInput(Monster x, int hp) {
        System.out.println(x.getVoiceAttack()+"     Player HP: "+hp);
        System.out.println("Available options:");
        for(int i = 0; i < x.getAttackOptions().size();i++){
            System.out.println(x.getAttackOptions().get(i)); //Hopefully prints the name of available options
        }
        printSeperator();
        String a = sc.nextLine();
        printSeperator();
        return a;
    }

    public String inputRequest(String a) {
        printSeperator();
        System.out.println(a);
        return sc.nextLine();
    }

    public void printItem(Item a) { //Der mangler måske nogle ting her.
        printSeperator();
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
    public void printMonsterGreet(Monster a){
        printSeperator();
        System.out.println(a.getMonsterGreetings());
    }
    public void printMonsterDefeat(Monster a){
        printSeperator();
        System.out.println(a.getMonsterDefeat());
    }
    
    public void printSeperator(){
        System.out.println("_________________________________________________");
    }
}
