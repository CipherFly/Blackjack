/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjack;

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
public class DealerHandTest {
    
    public DealerHandTest() {
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
     * Test of dealDealer method, of class DealerHand.
     * Deck of cards has cards 10,10,5,3
     * Expected dealer hand to draw is 20 and stop drawing
     */
    @Test
    public void testDealDealerGood() {
        System.out.println("dealDealerGood");
        GroupOfCards g = new GroupOfCards();
        g.putCard(10);
        g.putCard(10);
        g.putCard(5);
        g.putCard(3);
        DealerHand instance = new DealerHand(g);
        int expResult = 20;
        int result = instance.dealDealer();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of dealDealer method, of class DealerHand.
     * Expected dealer hand to draw to 26 and stop.
     */
    @Test
    public void testDealDealerBad() {
        System.out.println("dealDealerBad");
        GroupOfCards g = new GroupOfCards();
        g.putCard(10);
        g.putCard(6);
        g.putCard(10);
        g.putCard(6);
        DealerHand instance = new DealerHand(g);
        int expResult = 26;
        int result = instance.dealDealer();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of dealDealer method, of class DealerHand.
     * Expected dealer hand to draw to 17 and stop.
     */
    @Test
    public void testDealDealerBoundary() {
        System.out.println("dealDealerBoundary");
        GroupOfCards g = new GroupOfCards();
        g.putCard(10);
        g.putCard(7);
        g.putCard(3);
        DealerHand instance = new DealerHand(g);
        int expResult = 17;
        int result = instance.dealDealer();
        assertEquals(expResult, result);
    }
    
}
