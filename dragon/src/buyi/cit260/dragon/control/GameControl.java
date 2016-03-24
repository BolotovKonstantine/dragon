/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.dragon.control;

import byui.cit260.dragon.model.DragonC;
import byui.cit260.dragon.model.Player;
import buyi.cit260.dragon.control.DragonControl;
import byui.cit260.dragon.exceptions.GameControlException;
import byui.cit260.dragon.model.Game;
import byui.cit260.dragon.model.Inventory;
import byui.cit260.dragon.model.Items;
import byui.cit260.dragon.model.Shop;
import dragon.Dragon;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Karina
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        Dragon.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player) {
        Game game = new Game();
        Dragon.setCurrentGame(game);
        game.setPlayer(player);
        Items[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        DragonC dragon = new DragonC();
        game.setDragon(dragon);
        //DragonControl.initDragon(dragon);

        Shop shop = new Shop();
        game.setShop(shop);
    }

    private static Items[] createInventoryList() {
        Items[] inventory = new Items[16];
        //Ball, blocks, book, skipping rope, dumbbells, 

        Items ball = new Items();
        ball.setName("ball");
        ball.setBrain(0);
        ball.setCost(5);
        ball.setDepartment("sport");
        ball.setHygene(0);
        ball.setLegs(2);
        ball.setTail(2);
        ball.setMood(1);
        ball.setTired(1);
        ball.setWings(0);
        ball.setShape(2);
        ball.setSick(false);
        inventory[0] = ball;

        Items blocks = new Items();
        blocks.setName("blocks");
        blocks.setBrain(0);
        blocks.setCost(5);
        blocks.setDepartment("sport");
        blocks.setHygene(0);
        blocks.setLegs(2);
        blocks.setTail(2);
        blocks.setMood(1);
        blocks.setTired(1);
        blocks.setWings(0);
        blocks.setShape(2);
        blocks.setSick(false);
        inventory[0] = blocks;

        Items book = new Items();
        book.setName("book");
        book.setBrain(0);
        book.setCost(5);
        book.setDepartment("sport");
        book.setHygene(0);
        book.setLegs(2);
        book.setTail(2);
        book.setMood(1);
        book.setTired(1);
        book.setWings(0);
        book.setShape(2);
        book.setSick(false);
        inventory[0] = book;

        Items skippingRope = new Items();
        skippingRope.setName("skipping rope");
        skippingRope.setBrain(0);
        skippingRope.setCost(5);
        skippingRope.setDepartment("sport");
        skippingRope.setHygene(0);
        skippingRope.setLegs(2);
        skippingRope.setTail(2);
        skippingRope.setMood(1);
        skippingRope.setTired(1);
        skippingRope.setWings(0);
        skippingRope.setShape(2);
        skippingRope.setSick(false);
        inventory[0] = skippingRope;

        Items dumbbells = new Items();
        dumbbells.setName("dumbbells");
        dumbbells.setBrain(0);
        dumbbells.setCost(5);
        dumbbells.setDepartment("sport");
        dumbbells.setHygene(0);
        dumbbells.setLegs(2);
        dumbbells.setTail(2);
        dumbbells.setMood(1);
        dumbbells.setTired(1);
        dumbbells.setWings(0);
        dumbbells.setShape(2);
        dumbbells.setSick(false);
        inventory[0] = dumbbells;
        //rubber band, Ibprofen, Xanax, foam bath, shampoo, 

        Items rubberBand = new Items();
        rubberBand.setName("rubberBand");
        rubberBand.setBrain(0);
        rubberBand.setCost(5);
        rubberBand.setDepartment("sport");
        rubberBand.setHygene(0);
        rubberBand.setLegs(2);
        rubberBand.setTail(2);
        rubberBand.setMood(1);
        rubberBand.setTired(1);
        rubberBand.setWings(0);
        rubberBand.setShape(2);
        rubberBand.setSick(false);
        inventory[0] = rubberBand;

        Items Ibprofen = new Items();
        Ibprofen.setName("Ibprofen");
        Ibprofen.setBrain(0);
        Ibprofen.setCost(5);
        Ibprofen.setDepartment("health");
        Ibprofen.setHygene(0);
        Ibprofen.setLegs(2);
        Ibprofen.setTail(2);
        Ibprofen.setMood(1);
        Ibprofen.setTired(1);
        Ibprofen.setWings(0);
        Ibprofen.setShape(2);
        Ibprofen.setSick(false);
        inventory[0] = Ibprofen;

        Items Xanax = new Items();
        Xanax.setName("Xanax");
        Xanax.setBrain(0);
        Xanax.setCost(5);
        Xanax.setDepartment("health");
        Xanax.setHygene(0);
        Xanax.setLegs(2);
        Xanax.setTail(2);
        Xanax.setMood(1);
        Xanax.setTired(1);
        Xanax.setWings(0);
        Xanax.setShape(2);
        Xanax.setSick(false);
        inventory[0] = Xanax;

        Items bathFoam = new Items();
        bathFoam.setName("bath Foam");
        bathFoam.setBrain(0);
        bathFoam.setCost(5);
        bathFoam.setDepartment("hygiene");
        bathFoam.setHygene(0);
        bathFoam.setLegs(2);
        bathFoam.setTail(2);
        bathFoam.setMood(1);
        bathFoam.setTired(1);
        bathFoam.setWings(0);
        bathFoam.setShape(2);
        bathFoam.setSick(false);
        inventory[0] = bathFoam;

        Items shampoo = new Items();
        shampoo.setName("shampoo");
        shampoo.setBrain(0);
        shampoo.setCost(5);
        shampoo.setDepartment("hygiene");
        shampoo.setHygene(0);
        shampoo.setLegs(2);
        shampoo.setTail(2);
        shampoo.setMood(1);
        shampoo.setTired(1);
        shampoo.setWings(0);
        shampoo.setShape(2);
        shampoo.setSick(false);
        inventory[0] = shampoo;

        //toothbrush, Sweets, Meat, Vegetables, pillow, blanket.  
        Items toothbrush = new Items();
        toothbrush.setName("toothbrush");
        toothbrush.setBrain(0);
        toothbrush.setCost(5);
        toothbrush.setDepartment("hygiene");
        toothbrush.setHygene(0);
        toothbrush.setLegs(2);
        toothbrush.setTail(2);
        toothbrush.setMood(1);
        toothbrush.setTired(1);
        toothbrush.setWings(0);
        toothbrush.setShape(2);
        toothbrush.setSick(false);
        inventory[0] = toothbrush;

        Items sweets = new Items();
        sweets.setName("sweets");
        sweets.setBrain(0);
        sweets.setCost(5);
        sweets.setDepartment("food");
        sweets.setHygene(0);
        sweets.setLegs(2);
        sweets.setTail(2);
        sweets.setMood(1);
        sweets.setTired(1);
        sweets.setWings(0);
        sweets.setShape(2);
        sweets.setSick(false);
        inventory[0] = sweets;

        Items meat = new Items();
        meat.setName("meat");
        meat.setBrain(0);
        meat.setCost(5);
        meat.setDepartment("food");
        meat.setHygene(0);
        meat.setLegs(2);
        meat.setTail(2);
        meat.setMood(1);
        meat.setTired(1);
        meat.setWings(0);
        meat.setShape(2);
        meat.setSick(false);
        inventory[0] = meat;

        Items vegetables = new Items();
        vegetables.setName("vegetables");
        vegetables.setBrain(0);
        vegetables.setCost(5);
        vegetables.setDepartment("food");
        vegetables.setHygene(0);
        vegetables.setLegs(2);
        vegetables.setTail(2);
        vegetables.setMood(1);
        vegetables.setTired(1);
        vegetables.setWings(0);
        vegetables.setShape(2);
        vegetables.setSick(false);
        inventory[0] = vegetables;

        Items pillow = new Items();
        pillow.setName("pillow");
        pillow.setBrain(0);
        pillow.setCost(5);
        pillow.setDepartment("sleep");
        pillow.setHygene(0);
        pillow.setLegs(2);
        pillow.setTail(2);
        pillow.setMood(1);
        pillow.setTired(1);
        pillow.setWings(0);
        pillow.setShape(2);
        pillow.setSick(false);
        inventory[0] = pillow;

        Items blanket = new Items();
        blanket.setName("blanket");
        blanket.setBrain(0);
        blanket.setCost(5);
        blanket.setDepartment("sleep");
        blanket.setHygene(0);
        blanket.setLegs(2);
        blanket.setTail(2);
        blanket.setMood(1);
        blanket.setTired(1);
        blanket.setWings(0);
        blanket.setShape(2);
        blanket.setSick(false);
        inventory[0] = blanket;

        return inventory;
    }

    public static void saveGame(Game currentGame, String filePath) {
    throws GameControlException {
    try( FileOutputStream fops = new FileOutputStream(filePath)) {
    ObjectOutputStream output = new ObjectOutputStream(fops);
    output.writeObject(currentGame);
       } 
         catch(Exception e) {
          throw new GameControlException(e.getMessage());
          }
        }
    
    }

    public void startNewGame(String playerName, String dragonName) {
        DragonC newDragon = new DragonC();
        newDragon.setName(dragonName);
        DragonControl drC = new DragonControl();
        drC.initDragon(newDragon);
        DragonC oldDragon = new DragonC();
        oldDragon.setName("Old Dragon");
        drC.initDragon(oldDragon);

    }
        public boolean retriveGame(boolean retrGame) {
        return retrGame;
    }

    public Player createNewPlayer(String playerName) {
        Player newPlayer = new Player();
        newPlayer.setName(playerName);
        return newPlayer;
    }

    public static void getSavedGame(String filePath)
            throws GameControlException {
    Game game = null;
    try(FileInputStream fips = new FileInputStream(filePath)) {
    ObjectInputStream input = new ObjectInputStream(fips);
    game = (Game) input.readObject();
        }
    catch(Exception e) {
    throw new GameControlException(e.getMessage());
    }
    Dragon.setCurrentGame(game);
    }
}
