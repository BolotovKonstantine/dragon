/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.dragon.control;

import byui.cit260.dragon.model.DragonC;
import byui.cit260.dragon.model.Game;
import dragon.Dragon;

/**
 *
 * @author Karina
 */
public class DragonControl {

    public double older(DragonC dragon) {
        double newAge = dragon.getAge() + 0.3;
        dragon.setAge(newAge);
        if (newAge > 15) {
            return 100;
        }
        return newAge;
    }
    public boolean ifdead(DragonC dragon){
    if (dragon.getAge()>15)
    return true; else 
    return false;
    }
    public void getTired(DragonC dragon){
    double newTired = dragon.getTired() - 0.1;
    if (newTired<0) newTired = 0;
    dragon.setTired(newTired);
    }
    
    
    public boolean heal(boolean sick, boolean modifier) {
        boolean newHealth = sick ^ modifier;
        return newHealth;
    }

    public double actionResult(double currentStatus, double modifier) {
        Game game = Dragon.getCurrentGame();
        DragonC dragon = game.getDragon();
        double newModifier = dragon.getTired() * modifier ;
        double newStatus = currentStatus + newModifier ;
        if (newStatus > 10) {
            return 10;
        }
        if (newStatus < 0) {
            return 0;
        }
        return newStatus;
    }

    public double calcModifier(double itemProp, double actionProp) {
        double newModifier = itemProp + actionProp;
        if (newModifier > 5) {
            return 5;
        }
        return newModifier;
    }

    public boolean calcHealthModifier(boolean itemProp, boolean actionProp) {
        boolean newHealthModifier = itemProp & actionProp;
        return newHealthModifier;
    }

    public void initDragon(DragonC dragon) {
        dragon.setAge(0);
        dragon.setBrain(1);
        dragon.setHygene(5);
        dragon.setLegs(1);
        dragon.setMood(7);
        dragon.setSick(false);
        dragon.setBrain(1);
        dragon.setLegs(1);
        dragon.setTail(1);
        dragon.setWings(1);
        dragon.setTired(1);
        dragon.setShape(5);
//        return dragon;
    }
}
