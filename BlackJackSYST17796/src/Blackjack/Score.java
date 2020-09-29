package Blackjack;

import java.util.ArrayList;

/**
 *
 * @author Kyro, 2020
 * @author Harshil, 2020
 * @author Rishav, 2020
 */
public class Score {
    
    //Calculates the score based on the cards in arraylist.
    public int determineScore(ArrayList<Integer> cards){
        int score = 0;
        for (int i = 0; i < cards.size(); i++){
            int num = cards.get(i);
            if(num == 1 && score+11 <= 21){
                score += 11;
            }
            else{
                score += num;
            }
        }
        return score;
    }
    
    //Checks user inputs hit to draw or anything else to stand
    public boolean hitOrStand(String input){
        if (input.equalsIgnoreCase("hit")){
            return true;
        }
        else{
            return false;
        }
    }
}