/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragon;

import byui.cit260.dragon.model.Activity;
import byui.cit260.dragon.model.Actor;
import byui.cit260.dragon.model.DragonC;
import byui.cit260.dragon.model.Inventory;
import byui.cit260.dragon.model.Player;
import byui.cit260.dragon.model.Items;
import byui.cit260.dragon.model.Game;
import byui.cit260.dragon.model.Shop;
import byui.cit260.dragon.model.Department;
import citbyui.cit260.dragon.view.StartProgramView;

/**
 *
 * @author Finke
 */
public class Dragon {
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Dragon.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Dragon.player = player;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    StartProgramView startProgramView = new StartProgramView();
    startProgramView.displayStartProgramView();
    }

}
