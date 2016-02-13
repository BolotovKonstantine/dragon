/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.dragon.control;

import byui.cit260.dragon.model.DragonC;
import byui.cit260.dragon.model.Player;

/**
 *
 * @author Karina
 */
public class GameControl {

    public void startNewGame(String playerName,String dragonName) {
      Player newPlayer = new Player() ;
      newPlayer.setName(playerName);
      DragonC newDragon = new DragonC();
      newDragon.setName(dragonName);
      initDragon(newDragon);
    }

    public boolean saveGame(boolean game) {
        return game;
    }

    public boolean retriveGame(boolean retrGame) {
        return retrGame;
    }

    public boolean createNewPlayer(boolean player) {
        return player;
    }

    public int getTime(int time) {
        return time;
    }

    public void setTime(int time) {

    }
}
