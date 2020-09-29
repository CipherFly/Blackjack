/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjack;

/**
 *
 * @author Kyro, 2020
 * @author Harshil, 2020
 * @author Rishav, 2020
 */
public class GamePlayer {
    
    public static void main(String[] args) {
        GameMaker game = new GameMaker("Blackjack");
        //Introduction of the game
        game.start();
        //Start of the game with four rounds
        int rounds = 4;
        for(int i=0;i<rounds;i++){
            game.play();
       }
    }
}