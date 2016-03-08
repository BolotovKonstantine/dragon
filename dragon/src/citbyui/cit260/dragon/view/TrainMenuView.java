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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void dragonBrain() {
        System.out.println("*** dragonBrain function called ***");
    }

    private void dragonTail() {
        System.out.println("*** dragonTail function called ***");
    }

    private void dragonLegs() {
        System.out.println("*** dragonLegs function called ***");
    }

    private void dragonWings() {
        System.out.println("*** dragonWings function called ***");
    }
}
