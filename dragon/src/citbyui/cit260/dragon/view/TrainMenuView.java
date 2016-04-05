/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.dragon.view;

import buyi.cit260.dragon.control.DragonControl;
import byui.cit260.dragon.model.DragonC;
import byui.cit260.dragon.model.Game;
import byui.cit260.dragon.model.Items;
import dragon.Dragon;
import java.util.Scanner;

/**
 *
 * @author Karina
 */
/**
 * Train dragon(what to train) 10 points: This screen allows user to train
 * different parameters of dragon effectiveness also depends on inventory
 */
public class TrainMenuView extends View {

    public TrainMenuView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n| Train Menu                            |"
                + "\n----------------------------------------"
                + "\nB - Brain"
                + "\nT - Tail"
                + "\nL - Legs"
                + "\nW - Wings"
                + "\nQ - Quit"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "B":
                this.dragonBrain();
                break;
            case "T":
                this.dragonTail();
                break;
            case "L":
                this.dragonLegs();
                break;
            case "W":
                this.dragonWings();
                break;

            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void dragonBrain() {
        this.console.println("*** You trained dragon's brain ***");
        Game game = Dragon.getCurrentGame();
        DragonC dragon = game.getDragon();
        Items[] inv = game.getInventory();
        DragonControl control = new DragonControl();
        double newStat = control.actionResult(dragon.getBrain(), 1);
        dragon.setBrain(newStat);
        double newStat1 = control.actionResult(dragon.getMood(), -1);
        dragon.setMood(newStat1);
        control.older(dragon);
        control.getTired(dragon);
        if(control.ifdead(dragon)){
        this.console.println("You just Killed your dragon");
    }
    }
    
    private void dragonTail() {
        this.console.println("*** You just trained dragon's tail ***");
        
        Game game = Dragon.getCurrentGame();
        DragonC dragon = game.getDragon();
        Items[] inv = game.getInventory();
        DragonControl control = new DragonControl();
        double newStat = control.actionResult(dragon.getTail(), 1);
        dragon.setTail(newStat);
        double newStat1 = control.actionResult(dragon.getMood(), -1);
        dragon.setMood(newStat1);
        control.older(dragon);
        control.getTired(dragon);
        if(control.ifdead(dragon)){
        this.console.println("You just Killed your dragon");
    }
    }
    private void dragonLegs() {
        this.console.println("*** You just trained dragon's legs ***");
        Game game = Dragon.getCurrentGame();
        DragonC dragon = game.getDragon();
        Items[] inv = game.getInventory();
        DragonControl control = new DragonControl();
        double newStat = control.actionResult(dragon.getLegs(), 1);
        dragon.setLegs(newStat);
        double newStat1 = control.actionResult(dragon.getMood(), -1);
        dragon.setMood(newStat1);
        control.older(dragon);
        control.getTired(dragon);
        if(control.ifdead(dragon)){
        this.console.println("You just Killed your dragon");
    }
    }
    private void dragonWings() {
        this.console.println("*** You just trained dragon's wings ***");
        Game game = Dragon.getCurrentGame();
        DragonC dragon = game.getDragon();
        Items[] inv = game.getInventory();
        DragonControl control = new DragonControl();
        double newStat = control.actionResult(dragon.getWings(), 1);
        dragon.setWings(newStat);
        double newStat1 = control.actionResult(dragon.getMood(), -1);
        dragon.setMood(newStat1);
        control.older(dragon);
        control.getTired(dragon);
        if(control.ifdead(dragon)){
        this.console.println("You just Killed your dragon");
    }
}
}