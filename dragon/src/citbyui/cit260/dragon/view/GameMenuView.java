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
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
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
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
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
                this.console.println("\n*** Invalid selection *** Try again");
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
        playMenu.display();
    }

    private void teachMenu() {
        TrainMenuView trainMenu = new TrainMenuView();
        trainMenu.display();
    }

    private void healMenu() {
        HealMenuView healMenu = new HealMenuView();
        healMenu.display();
    }

    private void washMenu() {
        HygeneMenuView hygeneMenu = new HygeneMenuView();
        hygeneMenu.display();
    }

    private void feedMenu() {
        FeedMenuView feedMenu = new FeedMenuView();
        feedMenu.display();
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
        helpMenu.display();

    }
}
