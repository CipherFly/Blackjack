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
public class ScoreTest {
    
    public ScoreTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of determineScore method, of class Score.
     */
    @Test
    public void testDetermineScoreGood() {
        System.out.println("determineScoreGood");
        ArrayList<Integer> cards = new ArrayList();
        cards.add(5);
        cards.add(10);
        Score instance = new Score();
        int expResult = 15;
        int result = instance.determineScore(cards);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of determineScore method, of class Score.
     */
    @Test
    public void testDetermineScoreBad() {
        System.out.println("determineScoreBad");
        ArrayList<Integer> cards = new ArrayList();
        Score instance = new Score();
        int expResult = 0;
        int result = instance.determineScore(cards);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of determineScore method, of class Score.
     */
    @Test
    public void testDetermineScoreBoundary() {
        System.out.println("determineScoreBoundary");
        ArrayList<Integer> cards = new ArrayList();
        cards.add(10);
        cards.add(1);
        Score instance = new Score();
        int expResult = 21;
        int result = instance.determineScore(cards);
        assertEquals(expResult, result);
    }
    
   

    /**
     * Test of hitOrStand method, of class Score.
     */
    @Test
    public void testHitOrStandGood() {
        System.out.println("hitOrStandGood");
        String input = "HiT";
        Score instance = new Score();
        boolean expResult = true;
        boolean result = instance.hitOrStand(input);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of hitOrStand method, of class Score.
     */
    @Test
    public void testHitOrStandBad() {
        System.out.println("hitOrStandBad");
        String input = "stand";
        Score instance = new Score();
        boolean expResult = false;
        boolean result = instance.hitOrStand(input);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of hitOrStand method, of class Score.
     */
    @Test
    public void testHitOrStandBoundary() {
        System.out.println("hitOrStandBoundary");
        String input = "hit";
        Score instance = new Score();
        boolean expResult = true;
        boolean result = instance.hitOrStand(input);
        assertEquals(expResult, result);
    }
    
}
