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

/**
 *
 * @author Finke
 */
public class Dragon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
    Player playerOne = new Player();    
    
    playerOne.setName("Karina");
    playerOne.setBestTime(7.00);
    
    String playerInfo = playerOne.toString();
    System.out.println(playerInfo);
      
    Activity feed = new Activity();
    
    feed.setName("Feed");
    feed.setProbability(0);
    feed.setMood(2);
    feed.setHygene(1);
    feed.setSick(false);
    feed.setSickType("none");
    feed.setWings(1);
    feed.setBrain(1);
    feed.setLegs(1);
    feed.setTail(1);
    feed.setShape(1);
    feed.setTired(2);
    
    String activityInfo = feed.toString();
    System.out.println(activityInfo);
    
    DragonC friend;
        friend = new DragonC();
    
    friend.setName("Friend");
    friend.setMood(2);
    friend.setHygene(1);
    friend.setSick(false);
    friend.setSickType("none");
    friend.setWings(1);
    friend.setBrain(1);
    friend.setLegs(1);
    friend.setTail(1);
    friend.setShape(1);
    friend.setTired(2);
    friend.setAge(1);
     String dragonInfo = friend.toString();
    System.out.println(dragonInfo);
    
    
    Actor actorOne;
     actorOne = new Actor();
     
     actorOne.setName("Kostya");
     actorOne.setScore(0);
     
        
        Inventory playerOneInv;
    playerOneInv = new Inventory();
    playerOneInv.setMoney(100000);
    
     String playerInvInfo = playerOneInv.toString();
        System.out.println(playerOneInv);
        
        Items buy = new Items();
    buy.setCost(1);
    buy.setBrain(1);
    buy.setActivityType("Buy new item");
    buy.setDepartment("Shop");
    buy.setName("Max");
    buy.setHygene(1);
    buy.setLegs(1);
    buy.setWings(1);
    buy.setTail(1);
    buy.setSick(false);
    buy.setMood(2);
    buy.setShape(2);
    buy.setTired(1);
    
    String itemsInfo = buy.toString();
    System.out.println(itemsInfo);
    
    Game bestTime = new Game();
        bestTime.setTime(10);
     String timeInfo = bestTime.toString();
    System.out.println(timeInfo); 
    
    Shop heal = new Shop();
    heal.setBalance(1);
        String healthInfo = heal.toString();
    System.out.println(healthInfo);
    
    Department eat = new Department(); 
    eat.setFood(1);
    eat.setPharmacy(2);
    eat.setSport(2);
    eat.setName("Kind Of Food");
    String eatMeal = eat.toString();
    System.out.println(eatMeal);
    }
    
    
}
