/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbaspil;
import Rooms.Room;
/**
 *
 * @author caspe
 */
public class Actions {
    
    private Room currentRoom;
    private String action;

    public void setAction(String action) {
        this.action = action;
    }
    
    
    
    public Actions(String actionTaken, Room currentRoom){
        this.currentRoom = currentRoom;
        this.action = actionTaken;
    }
    public String checkAction(){
       if(currentRoom.getDoors().contains(action)){
           return action; 
       }
    
       if(currentRoom.getActions().contains(action)){
           return "isAction";
       }
       if( action.equals("help") || action.equals("inventory")){
           return "isOther"
       }
       return "falseAction";
    
}
    
}