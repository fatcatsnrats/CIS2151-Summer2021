/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2.holdem;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author omara
 */
public class Deck {

    ArrayList<Card> fullDeck;
    ArrayList<Card> fiveDeck;
    ArrayList<Card> twoDeck;
    Random rand;
    int[] countOfFaces;

    public ArrayList<Card> getFullDeck() {
        return fullDeck;
    }

    public void setFullDeck(ArrayList<Card> fullDeck) {
        this.fullDeck = fullDeck;
    }

    public ArrayList<Card> getFiveDeck() {
        return fiveDeck;
    }

    public void setFiveDeck(ArrayList<Card> fiveDeck) {
        this.fiveDeck = fiveDeck;
    }

    public ArrayList<Card> getTwoDeck() {
        return twoDeck;
    }

    public void setTwoDeck(ArrayList<Card> twoDeck) {
        this.twoDeck = twoDeck;
    }

    public Deck() {
        countOfFaces = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        fullDeck = new ArrayList<>();
        fiveDeck = new ArrayList<>();
        twoDeck = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Face face : Card.Face.values()) {
                fullDeck.add(new Card(face, suit));
                  // System.out.println(fullDeck);

                //   countOfFaces[card.getFace().ordinal()]++;
            }
        }
        
     //   deckMakerFive();
     //   deckMakerTwo();
    }

    public ArrayList<Card> deckMakerFive() {
        fiveDeck = new ArrayList<>();
        rand = new Random();
        for (int i = 0; i <= 4; i++) {
            int randInt = rand.nextInt(51);
            fiveDeck.add(fullDeck.get(randInt));
      //      System.out.println(fullDeck.get(randInt));
        }
        return fiveDeck;
    }
    public ArrayList<Card> deckMakerTwo() {
        twoDeck = new ArrayList<>();
        rand = new Random();
        for (int i = 0; i <= 1; i++) {
            int randInt = rand.nextInt(51);
            twoDeck.add(fullDeck.get(randInt));
       //     System.out.println(fullDeck.get(randInt));
        }
        return twoDeck;
    }
}
