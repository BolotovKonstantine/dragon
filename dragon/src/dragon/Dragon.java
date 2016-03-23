/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragon;

import byui.cit260.dragon.model.Activity;
import byui.cit260.dragon.model.Actor;
import byui.cit260.dragon.model.DragonC;
import byui.cit260.dragon.model.Inventory;
import byui.cit260.dragon.model.Player;
import byui.cit260.dragon.model.Items;
import byui.cit260.dragon.model.Game;
import byui.cit260.dragon.model.Shop;
import byui.cit260.dragon.model.Department;
import citbyui.cit260.dragon.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Finke
 */
public class Dragon {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Dragon.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Dragon.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Dragon.inFile = inFile;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Dragon.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Dragon.player = player;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        try{
        Dragon.inFile = new BufferedReader(new InputStreamReader(System.in));
        Dragon.outFile = new PrintWriter(System.out, true);
        String filePath = "log.txt";
        Dragon.logFile = new PrintWriter(filePath);
        
            startProgramView.displayStartProgramView();
        } catch (Throwable te){
        System.out.println(te.getMessage());
        te.printStackTrace();
        startProgramView.displayStartProgramView();
              }  
     finally {
            try {
                if (Dragon.inFile != null)
                Dragon.inFile.close();
                if (Dragon.outFile != null)
                Dragon.outFile.close();
                if (Dragon.logFile != null)
                    Dragon.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
            return;
            }
        }   
    }

}
