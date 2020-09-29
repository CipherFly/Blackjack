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
public class GameMaker extends Game{
    private GroupOfCards g;
    
    public GameMaker(String givenName)
    {
        super(givenName);
        g = new GroupOfCards();
    }
    //Makes a player with inital total 1000 and adds the player to arraylist
    public void makePlayer(String playerName){
        Player p= new Player(playerName);
        p.setTotal(1000);
        p.setScore(0);
        ArrayList <Player> players = super.getPlayers();
        players.add(p);
        super.setPlayers(players);
    }
    
    @Override
    public ArrayList <Player> getPlayers() 
    {
        return super.getPlayers();
    }
    
    @Override
    public void setPlayers(ArrayList <Player> players) 
    {
        super.setPlayers(players);
    }

    @Override
    //Calculate which players win their bet and who loses their bet against dealer
    public void declareWinner(int dealerScore) {
        ArrayList <Player> players = getPlayers();
        for (Player p : players){
            if(p.hasBlackjack()){
                p.setTotal(p.getTotal()+p.getBet()*2);
                System.out.println(p.getPlayerID()+" won "+p.getBet()*2);
                p.setBlackjack(false);
            }
            else if((p.getScore()>dealerScore || dealerScore>21) && p.getScore()<=21){
                p.setTotal(p.getTotal()+p.getBet());
                System.out.println(p.getPlayerID()+" won "+p.getBet());
            }
            else{
                p.setTotal(p.getTotal()-p.getBet());
                System.out.println(p.getPlayerID()+" lost "+p.getBet());
            }
            System.out.println(p.getPlayerID()+" total is now " + p.getTotal());
        }
    }

    @Override
    //Starts the game
    public void play() {
        g.makeDeck();
        g.shuffle();
        ArrayList<Integer> playerCards = new ArrayList<>();
        ArrayList<Player> players = getPlayers();
        for(Player p: players){
            Bet bet = new Bet(p);
            bet.makeBet();
        }
        for(Player p: players){
            PlayerHand pHand = new PlayerHand(p, g);
            pHand.dealPlayer();
            playerCards.clear();
        }
        DealerHand dealer = new DealerHand(g);
        int dealerScore = dealer.dealDealer();
        declareWinner(dealerScore);
    }
    
    //Asks the user how many players and enter each player's name
    public void start(){
        Scanner sc = new Scanner(System.in);
        String input;
        int num = 0;
        boolean checker = true;
        System.out.println("Welcome to " + getGameName());
        while(checker){ //Exception handler
            checker = false;
            System.out.println("How many players?");
            try{
            num = sc.nextInt();
            }catch(Exception e){
                checker = true;
            }
            sc.nextLine(); //clears buffer
        }
        for (int i=0; i<num; i++){
            System.out.println("Enter your name player"+(i+1));
            input = sc.nextLine();
            makePlayer(input);
        }
    }
}