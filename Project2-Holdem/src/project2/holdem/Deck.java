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
    ArrayList<Card> twoDeckPlayer;
    ArrayList<Card> twoDeckNpc;
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

    public ArrayList<Card> getTwoDeckPlayer() {
        return twoDeckPlayer;
    }

    public void setTwoDeckPlayer(ArrayList<Card> twoDeckPlayer) {
        this.twoDeckPlayer = twoDeckPlayer;
    }

    public ArrayList<Card> getTwoDeckNpc() {
        return twoDeckNpc;
    }

    public void setTwoDeckNpc(ArrayList<Card> twoDeckNpc) {
        this.twoDeckNpc = twoDeckNpc;
    }

    public Deck() {
        countOfFaces = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        fullDeck = new ArrayList<>();
        fiveDeck = new ArrayList<>();
        twoDeckPlayer = new ArrayList<>();
        twoDeckNpc = new ArrayList<>();
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
            int randInt = rand.nextInt(51) + 1;
            while (fiveDeck.contains(fullDeck.get(randInt))) {
                randInt = rand.nextInt(51) + 1;
            }
            fiveDeck.add(fullDeck.get(randInt));
            //      System.out.println(fullDeck.get(randInt));
        }
        return fiveDeck;
    }

    public ArrayList<Card> deckMakerTwoPlayer() {
        twoDeckPlayer = new ArrayList<>();
        rand = new Random();
        for (int i = 0; i <= 1; i++) {
            int randInt = rand.nextInt(51) + 1;
            while (fiveDeck.contains(fullDeck.get(randInt))
                    || twoDeckPlayer.contains(fullDeck.get(randInt))) {
                randInt = rand.nextInt(51) + 1;
            }
            twoDeckPlayer.add(fullDeck.get(randInt));
            //     System.out.println(fullDeck.get(randInt));
        }
        return twoDeckPlayer;
    }

    public ArrayList<Card> deckMakerTwoNpc() {
        twoDeckNpc = new ArrayList<>();
        rand = new Random();
        for (int i = 0; i <= 1; i++) {
            int randInt = rand.nextInt(51) + 1;
            while (fiveDeck.contains(fullDeck.get(randInt))
                    || twoDeckPlayer.contains(fullDeck.get(randInt))
                    || twoDeckNpc.contains(fullDeck.get(randInt))) {
                randInt = rand.nextInt(51) + 1;
            }
            twoDeckNpc.add(fullDeck.get(randInt));
            //     System.out.println(fullDeck.get(randInt));
        }
        return twoDeckNpc;
    }
}
