/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.dragon.control;

import byui.cit260.dragon.model.DragonC;
import byui.cit260.dragon.model.Player;
import buyi.cit260.dragon.control.DragonControl;
import dragon.Dragon;

/**
 *
 * @author Karina
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
    Dragon.setPlayer(player);
    return player;
    }

    public static void createNewGame(Player player) {
    System.out.println("\n*** createNewGame stub function called ***");
    }
    
    

    public void startNewGame(String playerName, String dragonName) {
        DragonC newDragon = new DragonC();
        newDragon.setName(dragonName);
        DragonControl drC = new DragonControl();
        drC.initDragon(newDragon);
        DragonC oldDragon = new DragonC();
        oldDragon.setName("Old Dragon");
        drC.initDragon(oldDragon);
        
        
    }

    public boolean saveGame(boolean game) {
        return game;
    }

    public boolean retriveGame(boolean retrGame) {
        return retrGame;
    }

    public Player createNewPlayer(String playerName) {
        Player newPlayer = new Player();
        newPlayer.setName(playerName);
        return newPlayer;
    }
}
