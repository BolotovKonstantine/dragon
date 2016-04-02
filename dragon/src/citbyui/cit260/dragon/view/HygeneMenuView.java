/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.dragon.view;

import java.util.ArrayList;

/**
 *
 * @author Bolotoff
 */
public class HygeneMenuView extends View {

    public HygeneMenuView() {
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
            case "C":
                this.cleanDragon();
                break;
            case "B":
                this.takeBath();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void cleanDragon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void takeBath() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    public void printInventoryReport (ArrayList<Item> inventoryItems, String outputLocation) {
//    try (printWriter out = new PrintWriter(outputLocation)) {
//    out.println("\n\n      Inventory Report       ");
//    out.printf("%n%20s%10s%10s", "Description", "Quantity", "Price");
//    out.printf("%n%20s%10s%10s", "-----------", "---------", "--------");
//    
//    for (Item item : inventoryItems) {
//    out.printf("%n%-20s%7d%13.2f", item.getDescription()
//                                 , item.getQuantity()
//                                 , item.getPrice());
//    }
//    } catch (IOException ex) {
//    System.out.println("I/O Error: " + ex.getMessage());
//    }
//        }
}
