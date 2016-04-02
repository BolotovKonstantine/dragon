/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.dragon.view;

import dragon.Dragon;
import java.io.PrintWriter;

/**
 *
 * @author Karina
 */
public class ErrorView {

    private static final PrintWriter errorFile = Dragon.getOutFile();
    private static final PrintWriter logFile = Dragon.getLogFile();

    public static void display(String className, String errorMessage) {
        errorFile.println(
                "-----------------------------------------"
                + "\n- ERROR - " + errorMessage
                + "\n---------------------------------------");
        logFile.println(className + " - " + errorMessage);
    }

}
