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
 * Play with dragon(games): This screen allows user to play with dragon games
 * avialibility depends on players inventory.
 */
public class PlayMenuView extends View {

    public PlayMenuView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n| Play Menu                            |"
                + "\n----------------------------------------"
                + "\nB -Ball"
                + "\nT -Tickle"
                + "\nH -Hug"
                + "\nN - Numbers"
                + "\nQ - Quit"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "B":
                this.ball();
                break;
            case "T":
                this.tickleDragon();
                break;
            case "H":
                this.hugDragon();
                break;
            case "N":
                this.numbers();
                break;

            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void ball() {
        this.console.println("*** You just played with your Dragon with ball***");
        Game game = Dragon.getCurrentGame();
        DragonC dragon = game.getDragon();
        Items[] inv = game.getInventory();
        DragonControl control = new DragonControl();
        double newStat = control.actionResult(dragon.getLegs(), 1);
        dragon.setLegs(newStat);
        control.getTired(dragon);
        control.older(dragon);
        if(control.ifdead(dragon)){
        this.console.println("You just Killed your dragon");
        }
    }

    private void tickleDragon() {
        this.console.println("*** You just tickled your Dragon***");
        Game game = Dragon.getCurrentGame();
        DragonC dragon = game.getDragon();
        Items[] inv = game.getInventory();
        DragonControl control = new DragonControl();
        double newStat = control.actionResult(dragon.getMood(), 1);
        dragon.setMood(newStat);
        control.older(dragon);
        control.getTired(dragon);
        if(control.ifdead(dragon)){
        this.console.println("You just Killed your dragon");
        }
    }

    private void hugDragon() {
        this.console.println("*** hugDragon function called ***");
        Game game = Dragon.getCurrentGame();
        DragonC dragon = game.getDragon();
        Items[] inv = game.getInventory();
        DragonControl control = new DragonControl();
        double newStat = control.actionResult(dragon.getMood(), 1);
        dragon.setMood(newStat);
        control.older(dragon);
        control.getTired(dragon);
        if(control.ifdead(dragon)){
        this.console.println("You just Killed your dragon");
        
    }

    private void numbers() {
        this.console.println("*** numbers function called ***");
        Game game = Dragon.getCurrentGame();
        DragonC dragon = game.getDragon();
        Items[] inv = game.getInventory();
        DragonControl control = new DragonControl();
        double newStat = control.actionResult(dragon.getMood(), 1);
        dragon.setBrain(newStat);
        control.older(dragon);
        control.getTired(dragon);
        if(control.ifdead(dragon)){
        this.console.println("You just Killed your dragon");
       
    }
  }
}
