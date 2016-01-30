/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragon;

import byui.cit260.dragon.model.Activity;
import byui.cit260.dragon.model.Player;

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
    
    }
    
}
