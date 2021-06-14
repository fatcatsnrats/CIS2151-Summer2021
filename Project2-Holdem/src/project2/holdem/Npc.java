/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2.holdem;

/**
 *
 * @author omara
 */
public class Npc {
    int money;
    Card deck;
    int pot;

    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }
    
    public Npc() {
        money = 100;
        pot = 0;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Card getDeck() {
        return deck;
    }

    public void setDeck(Card deck) {
        this.deck = deck;
    }
    
}
