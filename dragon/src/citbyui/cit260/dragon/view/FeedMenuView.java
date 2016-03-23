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
public class FeedMenuView extends View {

    public FeedMenuView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n| Feed Menu                            |"
                + "\n----------------------------------------"
                + "\nS - Sweets"
                + "\nM - Meat"
                + "\nV - Vegetables"
                + "\nG - Grass"
                + "\nQ - Quit"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "S":
                this.foodSweets();
                break;
            case "M":
                this.foodMeat();
                break;
            case "V":
                this.foodVegetables();
                break;
            case "G":
                this.foodGrass();
                break;

            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void foodSweets() {
        this.console.println("*** foodSweets function called ***");
    }

    private void foodMeat() {
        this.console.println("*** foodMeat function called ***");
    }

    private void foodVegetables() {
        this.console.println("*** foodVegetables function called ***");
    }

    private void foodGrass() {
        this.console.println("*** foodGrass function called ***");
    }
}
