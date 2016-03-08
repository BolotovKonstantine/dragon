/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.dragon.view;

/**
 *
 * @author Bolotoff
 */
public class SleepMenuView {

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "R":
                this.giveRest();
                break;
            case "L":
                this.lightSleep();
                break;
            case "D":
                this.deepSleep();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void giveRest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void lightSleep() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void deepSleep() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
