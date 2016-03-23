/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.dragon.view;

import buyi.cit260.dragon.control.GameControl;
import byui.cit260.dragon.model.Player;
import java.util.Scanner;
import java.io.IOException;/**
 *
 * @author Karina
 */
public class StartProgramView extends View {

    private String promptMessage;

    public StartProgramView() {
        // promptMessage = "Please enter your name"
        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                "\n*****************************************************"
                + "\n*                                                   *"
                + "\n* This game about a dragon that was lost by his mom.*"
                + "\n* She was flying with the egg to another island and *"
                + "\n* accidentally dropped it. She was so sad and       *"
                + "\n* thought that egg was broken and her baby died.    *"
                + "\n* She of course spend some time to find it, but it  *"
                + "\n* was in vain. Mother-dragon left to the new island *"
                + "\n* alone, the whole way she was crying. But this     *"
                + "\n* little egg was so lucky. He fell in the water and *"
                + "\n* didn't broke. Anyways, now his adventures just    *"
                + "\n* started. So, you have to help this little dragon  *"
                + "\n* to grow up properly and be able fly away to find  *"
                + "\n* his mom. You need to feed him right food in right *"
                + "\n* amount, train him to certain level, wash him,     *"
                + "\n* teach him, play with him, heal him if he getting  *"
                + "\n* sick. He really need you! Remember, he lost his   *"
                + "\n* own mom and now someone need to take care about   *"
                + "\n* him. This little dragon was so lucky to find you! *"
                + "\n* So, try to do your best and help him!             *"
                + "\n* You can do it!                                    *"
                + "\n*                                                   *"
                + "\n*****************************************************"
        );
    }

    public void displayStartProgramView() throws IOException {
        /*
         do
         Prompt for and get the players name
         if (playersName == “Q”) then
         exit

         do the action and display the next view
         while the action is not successful 
         */

        boolean done = false;
        do {
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(playersName);
        } while (!done);
    }

    private String getPlayersName() throws IOException {
        
        String value = "";
        boolean valid = false;
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
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

    public boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in lenth");
            return false;
        }
        Player player = GameControl.createPlayer(playersName);
        if (player == null) {
            System.out.println("\nError creating the player.");

            return false;
        }
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        this.console.println(
                "\n====================================="
                + "\n Welcome to the game " + player.getName()
                + "\n We hope you have a lot of fun!"
                + "\n===================================="
        );
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();

    }

}
