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
public class HealMenuView extends View {

    public HealMenuView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n| Heal Menu                            |"
                + "\n----------------------------------------"
                + "\nD - Doctor"
                + "\nH - Hug"
                + "\nI - Ibprofen"
                + "\nX - Xanax"
                + "\nQ - Quit"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
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
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void dragonDoctor() {
        this.console.println("*** dragonDoctor function called ***");
    }

    private void hugDragon() {
        this.console.println("*** hugDragon function called ***");
    }

    private void takeIbprofen() {
        this.console.println("*** takeIbprofen function called ***");
    }

    private void takeXanax() {
        this.console.println("*** takeXanax function called ***");
    }
}
