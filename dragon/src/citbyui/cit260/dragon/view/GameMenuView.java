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
class GameMenuView {

    private String menu;

    public GameMenuView() {
        this.menu = "\n"
                + "\n----------------------------------------"
                + "\n| Game Menu                            |"
                + "\n----------------------------------------"
                + "\nS - View detailed statistics"
                + "\nI - View list of items in inventory"
                + "\nP- Play"
                + "\nT- Teach"
                + "\nG - Heal"
                + "\nW - Wash"
                + "\nF - Feed"
                + "\nL - Sleep"
                + "\nM - Send a photo to the newspaper"
                + "\nB - Go shoping"
                + "\nJ - Try to make dragon flying"
                + "\nH - Help"
                + "\nQ - Quit"
                + "\n----------------------------------------";
    }

    public void displayGameMenu() {
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
            case "S":
                this.showStat();
                break;
            case "I":
                this.showInv();
                break;
            case "P":
                this.playMenu();
                break;
            case "T":
                this.teachMenu();
                break;
            case "G":
                this.healMenu();
                break;
            case "W":
                this.washMenu();
                break;
            case "F":
                this.feedMenu();
                break;
            case "L":
                this.sleepMenu();
                break;
            case "M":
                this.sendPhoto();
                break;
            case "B":
                this.shopingMenu();
                break;
            case "J":
                this.flyDragon();
                break;
            case "H":
                this.helpMenu();
                break;

            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void showStat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void showInv() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void playMenu() {
        PlayMenuView playMenu = new PlayMenuView();
        playMenu.displayPlayMenuView();
    }

    private void teachMenu() {
      TrainMenuView trainMenu = new TrainMenuView();
        trainMenu.displayTrainMenuView();
    }

    private void healMenu() {
        HealMenuView healMenu = new HealMenuView();
        healMenu.displayHealMenuView();
    }

    private void washMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void feedMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void sleepMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void sendPhoto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void shopingMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void flyDragon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();

    }
}
