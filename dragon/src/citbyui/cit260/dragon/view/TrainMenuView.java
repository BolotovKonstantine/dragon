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
public class TrainMenuView {

    private String menu;

    public TrainMenuView() {
        this.menu = "\n"
                + "\n----------------------------------------"
                + "\n| Train Menu                            |"
                + "\n----------------------------------------"
                + "\nB - Brain"
                + "\nT - Tail"
                + "\nL - Legs"
                + "\nW - Wings"
                + "\nQ - Quit"
                + "\n----------------------------------------";
    }

    public void displayTrainMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        while (!valid) {
            System.out.println("\n" + this.menu);
            value = keyboard.nextLine();
            value = value.trim();
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break;
        }
        return value;
    }

    private boolean doAction(String choice) {
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
