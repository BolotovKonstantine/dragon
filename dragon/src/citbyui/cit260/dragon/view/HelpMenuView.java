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
public class HelpMenuView {
 
     private String menu;

    public HelpMenuView() {
        this.menu = "\n"
                + "\n----------------------------------------"
                + "\n| Help Menu                            |"
                + "\n----------------------------------------"
                + "\nG - What is the goal of the game?"
                + "\nD - What to do?"
                + "\nE - Dragon status"
                + "\nI - Items help "
                + "\nQ - Quit"
                + "\n----------------------------------------";
       }
    public void displayHelpMenuView() {
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
            case "G":
                this.goalOfTheGame();
                break;
            case "D":
                this.whatToDo();
                break;
            case "E":
                this.dragonStatus();
                break;
            case "I":
                this.itemHelp();
                break;
                         
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void goalOfTheGame() {
        System.out.println("*** So, you have to help this "
                + "\nlittle dragon to grow up properly and be "
                + "\nable fly away to find his mom. "
                + "\nRemember, "
                + "\nhe lost his own mom and now someone "
                + "\nneed to take care about him. "
                + "\nThis little dragon was so lucky to find you! "
                + "\nSo, try to do your best and help him! "
                + "\nYou can do it! ***");
    }

    private void whatToDo() {
        System.out.println("*** So, you have to do this: "
                + "\nYou need to feed him right food in "
                + "\nright amount, train him to certain level, "
                + "\nwash him, teach him, play with him, "
                + "\nheal him if he getting sick. "
                + "\nHe really need you! ***");
    }

    private void dragonStatus() {
      System.out.println("*** showDragonStatus function called ***");  
    }

    private void itemHelp() {
        System.out.println("*** showItemHelps function called ***");
    }

    }
