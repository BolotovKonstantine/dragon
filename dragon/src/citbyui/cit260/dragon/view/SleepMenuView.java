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

/**
 *
 * @author Bolotoff
 */
public class SleepMenuView extends View{
    public SleepMenuView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n| Sleep Menu                            |"
                + "\n----------------------------------------"
                + "\nR -Rest"
                + "\nL -Light sleep"
                + "\nD -Deep Sleep"
                + "\nQ - Quit"
                + "\n----------------------------------------");
    }
    
@Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "R":
                this.giveRest();
                break;
            case "L":
                this.lightSleep();
                break;
            case "D":
                this.deepSleep();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void giveRest() {
        this.console.println("*** You gave rest to your Dragon ***");
        Game game = Dragon.getCurrentGame();
        DragonC dragon = game.getDragon();
        Items[] inv = game.getInventory();
        DragonControl control = new DragonControl();
        double newStat = dragon.getTired() + 0.1;
        dragon.setTired(newStat);
        control.older(dragon);
        if(control.ifdead(dragon)){
        this.console.println("You just Killed your dragon");
        }
    }
    private void lightSleep() {
        this.console.println("*** You gave rest to your Dragon ***");
        Game game = Dragon.getCurrentGame();
        DragonC dragon = game.getDragon();
        Items[] inv = game.getInventory();
        DragonControl control = new DragonControl();
        double newStat = dragon.getTired() + 0.35;
        dragon.setTired(newStat);
        control.older(dragon);
        control.older(dragon);
        control.older(dragon);
        control.older(dragon);
        if(control.ifdead(dragon)){
        this.console.println("You just Killed your dragon");
        }
    }

    private void deepSleep() {
        this.console.println("*** You gave rest to your Dragon ***");
        Game game = Dragon.getCurrentGame();
        DragonC dragon = game.getDragon();
        Items[] inv = game.getInventory();
        DragonControl control = new DragonControl();
        double newStat = dragon.getTired() + 0.65;
        dragon.setTired(newStat);
        control.older(dragon);
        control.older(dragon);
        control.older(dragon);
        control.older(dragon);
        control.older(dragon);
        control.older(dragon);
        control.older(dragon);
        control.older(dragon);
        if(control.ifdead(dragon)){
        this.console.println("You just Killed your dragon");
        }
    }
}
