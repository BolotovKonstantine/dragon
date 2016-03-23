/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.dragon.view;

import dragon.Dragon;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Karina
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;
    
    protected final BufferedReader keyboard = Dragon.getInFile();
    protected final PrintWriter console = Dragon.getOutFile();
    

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        boolean done = false;
        do {
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(value);
        } while (!done);
    }

    @Override
    public String getInput() {
        
        String value = "";
        boolean valid = false;
        while (!valid) {
            this.console.println("\n" + this.displayMessage);
            value = this.keyboard.readLine();
            value = value.trim();
            if (value.length() < 1) {
                this.console.println("\nInvalid value: value can not be blank");
                continue;
            }
            break;
        }
        return value;
    }

}
