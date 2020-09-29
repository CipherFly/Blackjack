/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjack;

import java.util.ArrayList;

/**
 *
 * @author Kyro, 2020
 * @author Harshil, 2020
 * @author Rishav, 2020
 */
public class DealerHand {
    private GroupOfCards g;
    public DealerHand(GroupOfCards g){
        this.g = g;
    }
    //Dealer draws cards until their score is at least 17 and returns their score
    public int dealDealer(){
        Score score = new Score();
        ArrayList<Integer> dealerCards = new ArrayList<>();
        int dealerScore = 0;
        while (dealerScore >=0 && dealerScore <17){
            dealerCards.add(g.addCard());
            dealerScore = score.determineScore(dealerCards);
            System.out.println("Dealer's hand: "+score.determineScore(dealerCards));
        }
        System.out.println("Dealer's final hand: "+score.determineScore(dealerCards));
        return dealerScore;
    }
    
}