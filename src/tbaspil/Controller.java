/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbaspil;

import Rooms.Room;
import tbaspil.presentation.TUI;
import Player.Player;

/**
 *
 * @author Esben
 */
public class Controller {
    private Room currRoom;
    private Room nextRoom;
    private TUI ask;
    private Player gamer;
    
    
    public void startGame(){
        String a = ask.getName();
        gamer.setName(a);
        gamer.setHealth(100);
    }
    
    public String getInputFromTUI(String a){
        String b = ask.getInput(a);
        return b;
    }
    
    public void  createRoom(){
        
    }
    
    public void createPlayer(){
        
    }
    
}
