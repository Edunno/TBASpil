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

    public String getInput(String a) {
        System.out.println(a);
        String b = sc.next().toLowerCase();
        return b;
    }
}
