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
 *//** Play with dragon(games):
This screen allows user to play with dragon 
 games avialibility depends on players inventory.
*/
 
public class PlayMenuView {
private String menu;

    public PlayMenuView() {
        this.menu = "\n"
                + "\n----------------------------------------"
                + "\n| Play Menu                            |"
                + "\n----------------------------------------"
                + "\nB -Ball"
                + "\nT -Tickle"
                + "\nH -Hug"
                + "\nN - Numbers"
                + "\nQ - Quit"
                + "\n----------------------------------------";
       }
    
    public void displayPlayMenuView() {
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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;    
    }

    private void ball() {
        System.out.println("*** Ball function called ***");  
    }

    private void tickleDragon() {
        System.out.println("*** tickleDragon function called ***");  
    }

    private void hugDragon() {
        System.out.println("*** hugDragon function called ***");  
    }

    private void numbers() {
       System.out.println("*** numbers function called ***");  
    }
}
