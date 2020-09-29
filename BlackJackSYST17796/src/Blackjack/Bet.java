/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjack;

import java.util.Scanner;

/**
 *
 * @author Kyro, 2020
 */
public class Bet {
    private Player p;
    public Bet(Player p){
        this.p = p;
    }
    
    public void makeBet(){
            Scanner sc = new Scanner(System.in);
            int num = 1;
            do{
            boolean checker = true;
            if (p.getTotal() <= 0){
                System.out.println(p.getPlayerID()+" gets a pity chip to play");
                p.setTotal(1);
                num = 1;
            }
            else{
                System.out.println("Enter your bet " + p.getPlayerID());
                System.out.println("You have " + p.getTotal());
                while(checker){ //Exception handler
                    checker = false;
                    try{
                        num = sc.nextInt();  
                        }catch(Exception e){
                            System.out.println("Invalid input");
                            System.out.println("You have " + p.getTotal());
                            checker = true;
                        }
                    sc.nextLine(); //clears buffer
                }
            }
            }while(p.getTotal() < num);
            p.setBet(num);
    }
}