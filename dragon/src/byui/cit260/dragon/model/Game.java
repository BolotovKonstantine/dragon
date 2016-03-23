/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragon.model;

import java.io.Serializable;

/**
 *
 * @author Karina
 */
public class Game implements Serializable {

    private int time;
    private Player player;
    private DragonC dragon;
    private Shop shop;
    private Items[] inventory;

    public Items[] getInventory() {
        return inventory;
    }

    public void setInventory(Items[] inventory) {
        this.inventory = inventory;
    }

    public DragonC getDragon() {
        return dragon;
    }

    public void setDragon(DragonC dragon) {
        this.dragon = dragon;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Game() {
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.time;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.time != other.time) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "time=" + time + '}';
    }

}
