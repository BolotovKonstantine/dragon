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
 * Heal dragon: Then your pet is sick you need to heal him
 */
public class HealMenuView {

    private String menu;

    public HealMenuView() {
        this.menu = "\n"
                + "\n----------------------------------------"
                + "\n| Heal Menu                            |"
                + "\n----------------------------------------"
                + "\nD - Doctor"
                + "\nH - Hug"
                + "\nI - Ibprofen"
                + "\nX - Xanax"
                + "\nQ - Quit"
                + "\n----------------------------------------";
    }

    public void displayHealMenuView() {
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
            case "D":
                this.dragonDoctor();
                break;
            case "H":
                this.hugDragon();
                break;
            case "I":
                this.takeIbprofen();
                break;
            case "X":
                this.takeXanax();
                break;

            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void dragonDoctor() {
        System.out.println("*** dragonDoctor function called ***");
    }

    private void hugDragon() {
        System.out.println("*** hugDragon function called ***");
    }

    private void takeIbprofen() {
        System.out.println("*** takeIbprofen function called ***");
    }

    private void takeXanax() {
        System.out.println("*** takeXanax function called ***");
    }
}
