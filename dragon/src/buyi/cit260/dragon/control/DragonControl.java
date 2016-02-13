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
public class DragonControl {

    public int older(int age) {
        int newAge = age + 1;
        if (newAge > 15) {
            return 100;
        }
        return newAge;
    }

    public boolean heal(boolean sick, boolean modifier) {
        boolean newHealth = sick ^ modifier;
        return newHealth;
    }

    public double actionResult(double currentStatus, double modifier) {
        double newStatus = currentStatus + modifier;
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

    public DragonC initDragon(DragonC dragon) {
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
        dragon.setTired(0);
        dragon.setShape(5);
        return dragon;
    }
}
