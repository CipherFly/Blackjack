package Blackjack;

/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 * @modifer Kyro, 2020
 * @modifer Harshil, 2020
 * @modifer Rishav, 2020
 */
public abstract class Card 
{
    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    protected int[] value = {1,2,3,4,5,6,7,8,9,10,10,10,10};
    protected int suits = 4;
    
    
    //@Override
    //public abstract String toString();
    
}