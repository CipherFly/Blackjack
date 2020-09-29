package Blackjack;

import java.util.ArrayList;

/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */


/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 * @modifer Kyro, 2020
 * @modifer Harshil, 2020
 * @modifer Rishav, 2020
 */
public class Player 
{
    private String playerID; //the unique ID for this player
    private int score;
    private int bet;
    private int total;
    private boolean blackjack = false;

   
    
    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Player(String name)
    {
        playerID= name;
        
    }
    
    /**
     * @return the playerID
     */
    public String getPlayerID() 
    {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) 
    {
        playerID = givenID;
    }
    public void setScore(int score) 
    {
        this.score = score;
    }
    public int getScore() 
    {
        return score;
    }
    public void setBet(int bet) 
    {
        this.bet = bet;
    }
    public int getBet() 
    {
        return bet;
    }
    
     public void setTotal(int total) {
        this.total = total;
    }
     
     public int getTotal() {
        return total;
    }
    
     public boolean hasBlackjack(){
         return blackjack;
     }
     
     public void setBlackjack(boolean bj){
         blackjack = bj;
     }
    /**
     * The method to be instantiated when you subclass the Player class
     * with your specific type of Player and filled in with logic to play your game.
     */
    //public abstract void play();
    
}