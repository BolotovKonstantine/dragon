/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragon;

import byui.cit260.dragon.model.Player;

/**
 *
 * @author Finke
 */
public class Dragon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Player playerOne = new Player();    
    
    playerOne.setName("Karina");
    playerOne.setBestTime(7.00);
    
    String playerInfo = playerOne.toString();
    System.out.println(playerInfo);
    }
    
}
