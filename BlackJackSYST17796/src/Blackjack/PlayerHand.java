/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjack;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kyro, 2020
 * @author Harshil, 2020
 * @author Rishav, 2020
 */
public class PlayerHand {
    private Player p;
    private GroupOfCards g;
    
    public PlayerHand(Player p, GroupOfCards g){
        this.p = p;
        this.g = g;
    }
    //Prompts player to either hit or stand based on their hand
    public void dealPlayer(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> playerCards = new ArrayList<>();
        String input;
        boolean play;
        Score score = new Score();
        playerCards.add(g.addCard());
        do{
            playerCards.add(g.addCard());
            System.out.println(p.getPlayerID()+"'s hand: "+score.determineScore(playerCards));
            p.setScore(score.determineScore(playerCards));
            
            //If player's hand has blackjack
            if(p.getScore()==21){
                System.out.println("Blackjack!");
                //If player's inital hand has blackjack, player wins 2 times their bet.
                if(playerCards.size() == 2){
                    p.setBlackjack(true);
                    System.out.println(p.getPlayerID() +" won 2 times their bet!");
                }
                play = false;
            }
            //Player can hit or stand
            else if (p.getScore() < 21){
            System.out.println(p.getPlayerID() + ": Type hit to draw or anything to stand");
            input = sc.nextLine();
            play = score.hitOrStand(input);
            }
            //Player busts if their hand is greater than 21
            else{
                System.out.println("Bust");
                play = false;
            }
        }while(play);
    }
    
}