/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2.holdem;

import java.util.ArrayList;

/**
 *
 * @author omara
 */
public class Player {
    int money;
    ArrayList<Card> deck;
    int pot;
    

    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }
    
    public Player() {
        money = 100;
        pot = 0;
        //System.out.println(deck);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
}
