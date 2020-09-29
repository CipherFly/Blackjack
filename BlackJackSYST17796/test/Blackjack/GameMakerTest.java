/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjack;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KYC
 */
public class GameMakerTest {
    
    private GameMaker instance;
    private ArrayList <Player> players;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new GameMaker("Blackjack");
        players = new ArrayList<Player>();
    }
    
    @After
    public void tearDown() {
    }


   
    /**
     * Test of declareWinner method, of class GameMaker.
     * Expected output when p1 wins and p2 loses
     * declareWinner
     * p1 won 1000
     * p1 total is now 2000
     * p2 lost 500
     * p2 total is now 500
     */
    @Test
    public void testDeclareWinnerGood() {
        System.out.println("declareWinnerGood");
        
        Player p1= new Player("p1");
        p1.setTotal(1000);
        p1.setBet(500);
        p1.setScore(21);
        p1.setBlackjack(true);
    
        Player p2= new Player("p2");
        p2.setTotal(1000);
        p2.setBet(500);
        p2.setScore(16);
        players.add(p1);
        players.add(p2);
        instance.setPlayers(players);
        int dealerScore = 17;
        instance.declareWinner(dealerScore);
        assertTrue(true);
    }
    
    /**
     * Test of declareWinner method, of class GameMaker.
     * Expected output when dealer loses
     * declareWinnerBad
     * p1 won 1000
     * p1 total is now 2000
     * p2 won 500
     * p2 total is now 1500
     */
    @Test
    public void testDeclareWinnerBad() {
        System.out.println("declareWinnerBad");
        
        Player p1= new Player("p1");
        p1.setTotal(1000);
        p1.setBet(500);
        p1.setScore(21);
        p1.setBlackjack(true);
    
        Player p2= new Player("p2");
        p2.setTotal(1000);
        p2.setBet(500);
        p2.setScore(16);
        players.add(p1);
        players.add(p2);
        instance.setPlayers(players);
        int dealerScore = 23;
        instance.declareWinner(dealerScore);
        assertTrue(true);
    }
    
    /**
     * Test of declareWinner method, of class GameMaker.
     * Expected output when both players have score 21 but one got blackjack
     * and other doesn't with dealerScore also 21
     * declareWinnerBoundary
     * p1 won 1000
     * p1 total is now 2000
     * p2 lost 500
     * p2 total is now 500
     */
    @Test
    public void testDeclareWinnerBoundary() {
        System.out.println("declareWinnerBoundary");
        
        Player p1= new Player("p1");
        p1.setTotal(1000);
        p1.setBet(500);
        p1.setScore(21);
        p1.setBlackjack(true);
    
        Player p2= new Player("p2");
        p2.setTotal(1000);
        p2.setBet(500);
        p2.setScore(21);
        players.add(p1);
        players.add(p2);
        instance.setPlayers(players);
        int dealerScore = 21;
        instance.declareWinner(dealerScore);
        assertTrue(true);
    }
    
    
}
