/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.dragon.view;

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
        this.console.println("*** Ball function called ***");
    }

    private void tickleDragon() {
        this.console.println("*** tickleDragon function called ***");
    }

    private void hugDragon() {
        this.console.println("*** hugDragon function called ***");
    }

    private void numbers() {
        this.console.println("*** numbers function called ***");
    }
}
