/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.dragon.view;

import buyi.cit260.dragon.control.DragonControl;
import byui.cit260.dragon.model.DragonC;
import byui.cit260.dragon.model.Game;
import byui.cit260.dragon.model.Inventory;
import byui.cit260.dragon.model.Items;
import dragon.Dragon;

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
        StringBuilder line;
        Game game = Dragon.getCurrentGame();
        DragonC dragon = game.getDragon();
        this.console.println("\nDragon current stat");
        line = new StringBuilder("                            ");
        line.insert(0, "CHARACTERISTIC");
        line.insert(26, "NUMBER");
        this.console.println(line.toString());
        line = new StringBuilder("                             ");
        line.insert(0, "AGE");
        line.insert(27, dragon.getAge());
        this.console.println(line.toString());
        line = new StringBuilder("                             ");
        line.insert(0, "MOOD");
        line.insert(27, dragon.getMood());
        this.console.println(line.toString());
        line = new StringBuilder("                             ");
        line.insert(0, "HYGENE");
        line.insert(27, dragon.getHygene());
        this.console.println(line.toString());
        line = new StringBuilder("                             ");
        line.insert(0, "WINGS");
        line.insert(27, dragon.getWings());
        this.console.println(line.toString());
        line = new StringBuilder("                             ");
        line.insert(0, "LEGS");
        line.insert(27, dragon.getLegs());
        this.console.println(line.toString());
        line = new StringBuilder("                             ");
        line.insert(0, "TAIL");
        line.insert(27, dragon.getTail());
        this.console.println(line.toString());
        line = new StringBuilder("                             ");
        line.insert(0, "SHAPE");
        line.insert(27, dragon.getShape());
        this.console.println(line.toString());
        line = new StringBuilder("                             ");
        line.insert(0, "TIRED");
        line.insert(27, dragon.getTired());
        this.console.println(line.toString());
        line = new StringBuilder("                             ");
        line.insert(0, "BRAIN");
        line.insert(27, dragon.getBrain());
        this.console.println(line.toString());
        line = new StringBuilder("                             ");
        line.insert(0, "SICKTYPE");
        line.insert(27, dragon.getSickType());
        this.console.println(line.toString());
        
try{System.in.read();}
catch(Exception e){}
    }

    private void showInv() {
     StringBuilder line;
     Game game = Dragon.getCurrentGame();
     Items[] inv = game.getInventory();
     
     
     try{System.in.read();}
     catch(Exception e){}
    }
    /*public static InventoryItem[] createInventoryList(){
    InventoryItem[] inventory = new InventoryItem[14];
    InventoryItem meat = new InventoryItem();
    meat.setDescription("Meat");
    meat.setQuantityStoke(0);
    meat.setRequiredAmount(0);
    inventory[0] = meat;
    
    return inventory;
    }*/
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
    SleepMenuView sleepMenu = new SleepMenuView();
    sleepMenu.display();
    }

    private void sendPhoto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void shopingMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void flyDragon() {
     this.console.println("*** You throw your Dragon out the window ***");
        Game game = Dragon.getCurrentGame();
        DragonC dragon = game.getDragon();
        Items[] inv = game.getInventory();
        DragonControl control = new DragonControl();
        if (dragon.getSickType() == 0){
            if (dragon.getWings() == 10){
                if(dragon.getBrain() >8){
                    if (dragon.getLegs() > 7){
                        if (dragon.getTail() > 7){
                            if (dragon.getShape() == 5){
                               this.console.println("Your dragon will see his mommy. Bye-Bye!");
                               return;
                            }
                        }
                    }
                }
            } } this.console.println("Your dragon don't fly yet");
            dragon.setSickType(4);
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();

    }
}
