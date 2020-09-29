package Blackjack;

/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */


import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 * @modifer Kyro, 2020
 * @modifer Harshil, 2020
 * @modifer Rishav, 2020
 */
public class GroupOfCards extends Card 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Integer> cards;
    private int size;//the size of the grouping
    
    public GroupOfCards()
    {
        size = 0;
        cards = new ArrayList<Integer>();
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Integer> showCards()
    {
        return cards;
    }
    
    public ArrayList<Integer> makeDeck(){
        for (int i=0; i<suits; i++){
            for (int j=0; j<value.length; j++){
                cards.add(value[j]);
                size++;
            }
        }
        return cards;
    }
    
    public int addCard(){
        size--;
        return cards.remove(0);
        
    }
    
    public void putCard(int card){
        size++;
        cards.add(card);
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
}//end class