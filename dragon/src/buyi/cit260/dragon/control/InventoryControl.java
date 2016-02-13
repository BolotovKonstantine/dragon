/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.dragon.control;

import byui.cit260.dragon.model.DragonC;

/**
 *
 * @author Karina
 */
public class InventoryControl {

    public double getMoney(double money) {
        return money;
    }

    public double buyItem(double itemProp) {
        return itemProp;
    }

    public double abilityToBuy(double inventoryItem, double amount, double money) {
        return inventoryItem;
    }

    public double addToInventory(double inventoryItem, double ammount) {
        return inventoryItem;
    }
    
    
    
    public double sendPhoto(DragonC dragon, DragonC oldDragon ) {
        double money = dragon.getBrain() - oldDragon.getBrain();
        money = money + dragon.getLegs() - oldDragon.getLegs();
        money = money + dragon.getHygene() - oldDragon.getHygene();
        money = money + dragon.getShape() - oldDragon.getShape();
        money = money + dragon.getTail() - oldDragon.getTail();
        money = money + dragon.getWings() - oldDragon.getWings();
        return money;
    }

    public double removeFromInventory(double inventoryItem, double amount) {
        return amount;
    }

}
