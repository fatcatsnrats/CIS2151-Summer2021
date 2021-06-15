/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2.holdem;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author omara
 */
public class Project2HoldemTest {

    public Project2HoldemTest() {
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

    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////                                                                                                        ////////////////////////////////////////////////////
    /////////////////////////////   Each of these methods test for the best possible hand and compare the two hands to find the winner   ////////////////////////////////////////////////////
    /////////////////////////////                                                                                                        ////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    @Test
    public void testPossibilitiesStraightFlush() {
        Deck deck = new Deck();
        ArrayList<Card> fiveCardArray;
        ArrayList<Card> sevenCards = new ArrayList<>();
        ArrayList<ArrayList<Card>> arrayOfArray = new ArrayList<>();

        ArrayList<Card> fiveCardArray1;
        ArrayList<Card> sevenCards1 = new ArrayList<>();
        ArrayList<ArrayList<Card>> otherArrayOfArray = new ArrayList<>();

        deck.deckMakerFive();
        deck.deckMakerTwoPlayer();
        deck.deckMakerTwoNpc();

        ArrayList<Card> testing;
        testing = deck.getFullDeck();

        sevenCards.add(testing.get(0));
        sevenCards.add(testing.get(1));
        sevenCards.add(testing.get(2));
        sevenCards.add(testing.get(3));
        sevenCards.add(testing.get(4));
        sevenCards.add(testing.get(23));
        sevenCards.add(testing.get(45));

        sevenCards1.add(testing.get(10));
        sevenCards1.add(testing.get(13));
        sevenCards1.add(testing.get(22));
        sevenCards1.add(testing.get(34));
        sevenCards1.add(testing.get(41));
        sevenCards1.add(testing.get(2));
        sevenCards1.add(testing.get(5));

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray = new ArrayList<>();
                            fiveCardArray.add(sevenCards.get(i));
                            fiveCardArray.add(sevenCards.get(j));
                            fiveCardArray.add(sevenCards.get(k));
                            fiveCardArray.add(sevenCards.get(l));
                            fiveCardArray.add(sevenCards.get(m));
                            arrayOfArray.add(fiveCardArray);
                            // pokerHand = new PokerHand(fiveCardArray);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray1 = new ArrayList<>();
                            fiveCardArray1.add(sevenCards1.get(i));
                            fiveCardArray1.add(sevenCards1.get(j));
                            fiveCardArray1.add(sevenCards1.get(k));
                            fiveCardArray1.add(sevenCards1.get(l));
                            fiveCardArray1.add(sevenCards1.get(m));
                            otherArrayOfArray.add(fiveCardArray1);
                            // otherhand = new PokerHand(fiveCardArray1);
                        }
                    }
                }
            }
        }

        Project2Holdem.possibilities(arrayOfArray, otherArrayOfArray);
        Project2Holdem.callPokerhand(arrayOfArray, otherArrayOfArray);
        int playerRank = Project2Holdem.getPlayerRank();
        String resultString = Project2Holdem.getRank(playerRank);

        String expected = "Straight Flush";

        int winner = Project2Holdem.getWinStatus();
        int expectedWinner = 1;
        String expectedNpc = "Pair";
        int npcRank = Project2Holdem.getOtherRank();
        String npcResultString = Project2Holdem.getRank(npcRank);

        assertEquals(expectedWinner, winner);
        assertEquals(expectedNpc, npcResultString);
        assertEquals(expected, resultString);

        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testPossibilitiesFourOfAKind() {
        Deck deck = new Deck();
        ArrayList<Card> fiveCardArray;
        ArrayList<Card> sevenCards = new ArrayList<>();
        ArrayList<ArrayList<Card>> arrayOfArray = new ArrayList<>();

        ArrayList<Card> fiveCardArray1;
        ArrayList<Card> sevenCards1 = new ArrayList<>();
        ArrayList<ArrayList<Card>> otherArrayOfArray = new ArrayList<>();

        deck.deckMakerFive();
        deck.deckMakerTwoPlayer();
        deck.deckMakerTwoNpc();

        ArrayList<Card> testing;
        testing = deck.getFullDeck();

        sevenCards.add(testing.get(0));
        sevenCards.add(testing.get(13));
        sevenCards.add(testing.get(26));
        sevenCards.add(testing.get(39));
        sevenCards.add(testing.get(4));
        sevenCards.add(testing.get(23));
        sevenCards.add(testing.get(45));

        sevenCards1.add(testing.get(10));
        sevenCards1.add(testing.get(13));
        sevenCards1.add(testing.get(22));
        sevenCards1.add(testing.get(34));
        sevenCards1.add(testing.get(41));
        sevenCards1.add(testing.get(2));
        sevenCards1.add(testing.get(5));

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray = new ArrayList<>();
                            fiveCardArray.add(sevenCards.get(i));
                            fiveCardArray.add(sevenCards.get(j));
                            fiveCardArray.add(sevenCards.get(k));
                            fiveCardArray.add(sevenCards.get(l));
                            fiveCardArray.add(sevenCards.get(m));
                            arrayOfArray.add(fiveCardArray);
                            // pokerHand = new PokerHand(fiveCardArray);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray1 = new ArrayList<>();
                            fiveCardArray1.add(sevenCards1.get(i));
                            fiveCardArray1.add(sevenCards1.get(j));
                            fiveCardArray1.add(sevenCards1.get(k));
                            fiveCardArray1.add(sevenCards1.get(l));
                            fiveCardArray1.add(sevenCards1.get(m));
                            otherArrayOfArray.add(fiveCardArray1);
                            // otherhand = new PokerHand(fiveCardArray1);
                        }
                    }
                }
            }
        }

        Project2Holdem.possibilities(arrayOfArray, otherArrayOfArray);
        Project2Holdem.callPokerhand(arrayOfArray, otherArrayOfArray);
        int playerRank = Project2Holdem.getPlayerRank();
        String resultString = Project2Holdem.getRank(playerRank);

        String expected = "Four of a Kind";

        int winner = Project2Holdem.getWinStatus();
        int expectedWinner = 1;
        String expectedNpc = "Pair";
        int npcRank = Project2Holdem.getOtherRank();
        String npcResultString = Project2Holdem.getRank(npcRank);

        assertEquals(expectedWinner, winner);
        assertEquals(expectedNpc, npcResultString);
        assertEquals(expected, resultString);

        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testPossibilitiesFullHouse() {
        Deck deck = new Deck();
        ArrayList<Card> fiveCardArray;
        ArrayList<Card> sevenCards = new ArrayList<>();
        ArrayList<ArrayList<Card>> arrayOfArray = new ArrayList<>();

        ArrayList<Card> fiveCardArray1;
        ArrayList<Card> sevenCards1 = new ArrayList<>();
        ArrayList<ArrayList<Card>> otherArrayOfArray = new ArrayList<>();

        deck.deckMakerFive();
        deck.deckMakerTwoPlayer();
        deck.deckMakerTwoNpc();

        ArrayList<Card> testing;
        testing = deck.getFullDeck();

        sevenCards.add(testing.get(0));
        sevenCards.add(testing.get(13));
        sevenCards.add(testing.get(26));
        sevenCards.add(testing.get(1));
        sevenCards.add(testing.get(14));
        sevenCards.add(testing.get(23));
        sevenCards.add(testing.get(45));

        sevenCards1.add(testing.get(10));
        sevenCards1.add(testing.get(13));
        sevenCards1.add(testing.get(22));
        sevenCards1.add(testing.get(34));
        sevenCards1.add(testing.get(41));
        sevenCards1.add(testing.get(2));
        sevenCards1.add(testing.get(5));

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray = new ArrayList<>();
                            fiveCardArray.add(sevenCards.get(i));
                            fiveCardArray.add(sevenCards.get(j));
                            fiveCardArray.add(sevenCards.get(k));
                            fiveCardArray.add(sevenCards.get(l));
                            fiveCardArray.add(sevenCards.get(m));
                            arrayOfArray.add(fiveCardArray);
                            // pokerHand = new PokerHand(fiveCardArray);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray1 = new ArrayList<>();
                            fiveCardArray1.add(sevenCards1.get(i));
                            fiveCardArray1.add(sevenCards1.get(j));
                            fiveCardArray1.add(sevenCards1.get(k));
                            fiveCardArray1.add(sevenCards1.get(l));
                            fiveCardArray1.add(sevenCards1.get(m));
                            otherArrayOfArray.add(fiveCardArray1);
                            // otherhand = new PokerHand(fiveCardArray1);
                        }
                    }
                }
            }
        }

        Project2Holdem.possibilities(arrayOfArray, otherArrayOfArray);
        Project2Holdem.callPokerhand(arrayOfArray, otherArrayOfArray);
        int playerRank = Project2Holdem.getPlayerRank();
        String resultString = Project2Holdem.getRank(playerRank);

        String expected = "Full House";

        int winner = Project2Holdem.getWinStatus();
        int expectedWinner = 1;
        String expectedNpc = "Pair";
        int npcRank = Project2Holdem.getOtherRank();
        String npcResultString = Project2Holdem.getRank(npcRank);

        assertEquals(expectedWinner, winner);
        assertEquals(expectedNpc, npcResultString);
        assertEquals(expected, resultString);

        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testPossibilitiesFlush() {
        Deck deck = new Deck();
        ArrayList<Card> fiveCardArray;
        ArrayList<Card> sevenCards = new ArrayList<>();
        ArrayList<ArrayList<Card>> arrayOfArray = new ArrayList<>();

        ArrayList<Card> fiveCardArray1;
        ArrayList<Card> sevenCards1 = new ArrayList<>();
        ArrayList<ArrayList<Card>> otherArrayOfArray = new ArrayList<>();

        deck.deckMakerFive();
        deck.deckMakerTwoPlayer();
        deck.deckMakerTwoNpc();

        ArrayList<Card> testing;
        testing = deck.getFullDeck();

        sevenCards.add(testing.get(0));
        sevenCards.add(testing.get(3));
        sevenCards.add(testing.get(6));
        sevenCards.add(testing.get(9));
        sevenCards.add(testing.get(4));
        sevenCards.add(testing.get(23));
        sevenCards.add(testing.get(45));

        sevenCards1.add(testing.get(10));
        sevenCards1.add(testing.get(13));
        sevenCards1.add(testing.get(22));
        sevenCards1.add(testing.get(34));
        sevenCards1.add(testing.get(41));
        sevenCards1.add(testing.get(2));
        sevenCards1.add(testing.get(5));

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray = new ArrayList<>();
                            fiveCardArray.add(sevenCards.get(i));
                            fiveCardArray.add(sevenCards.get(j));
                            fiveCardArray.add(sevenCards.get(k));
                            fiveCardArray.add(sevenCards.get(l));
                            fiveCardArray.add(sevenCards.get(m));
                            arrayOfArray.add(fiveCardArray);
                            // pokerHand = new PokerHand(fiveCardArray);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray1 = new ArrayList<>();
                            fiveCardArray1.add(sevenCards1.get(i));
                            fiveCardArray1.add(sevenCards1.get(j));
                            fiveCardArray1.add(sevenCards1.get(k));
                            fiveCardArray1.add(sevenCards1.get(l));
                            fiveCardArray1.add(sevenCards1.get(m));
                            otherArrayOfArray.add(fiveCardArray1);
                            // otherhand = new PokerHand(fiveCardArray1);
                        }
                    }
                }
            }
        }

        Project2Holdem.possibilities(arrayOfArray, otherArrayOfArray);
        Project2Holdem.callPokerhand(arrayOfArray, otherArrayOfArray);
        int playerRank = Project2Holdem.getPlayerRank();
        String resultString = Project2Holdem.getRank(playerRank);

        String expected = "Flush";

        int winner = Project2Holdem.getWinStatus();
        int expectedWinner = 1;
        String expectedNpc = "Pair";
        int npcRank = Project2Holdem.getOtherRank();
        String npcResultString = Project2Holdem.getRank(npcRank);

        assertEquals(expectedWinner, winner);
        assertEquals(expectedNpc, npcResultString);
        assertEquals(expected, resultString);

        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testPossibilitiesStraight() {
        Deck deck = new Deck();
        ArrayList<Card> fiveCardArray;
        ArrayList<Card> sevenCards = new ArrayList<>();
        ArrayList<ArrayList<Card>> arrayOfArray = new ArrayList<>();

        ArrayList<Card> fiveCardArray1;
        ArrayList<Card> sevenCards1 = new ArrayList<>();
        ArrayList<ArrayList<Card>> otherArrayOfArray = new ArrayList<>();

        deck.deckMakerFive();
        deck.deckMakerTwoPlayer();
        deck.deckMakerTwoNpc();

        ArrayList<Card> testing;
        testing = deck.getFullDeck();

        sevenCards.add(testing.get(0));
        sevenCards.add(testing.get(14));
        sevenCards.add(testing.get(2));
        sevenCards.add(testing.get(16));
        sevenCards.add(testing.get(4));
        sevenCards.add(testing.get(23));
        sevenCards.add(testing.get(45));

        sevenCards1.add(testing.get(10));
        sevenCards1.add(testing.get(13));
        sevenCards1.add(testing.get(22));
        sevenCards1.add(testing.get(34));
        sevenCards1.add(testing.get(41));
        sevenCards1.add(testing.get(2));
        sevenCards1.add(testing.get(5));

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray = new ArrayList<>();
                            fiveCardArray.add(sevenCards.get(i));
                            fiveCardArray.add(sevenCards.get(j));
                            fiveCardArray.add(sevenCards.get(k));
                            fiveCardArray.add(sevenCards.get(l));
                            fiveCardArray.add(sevenCards.get(m));
                            arrayOfArray.add(fiveCardArray);
                            // pokerHand = new PokerHand(fiveCardArray);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray1 = new ArrayList<>();
                            fiveCardArray1.add(sevenCards1.get(i));
                            fiveCardArray1.add(sevenCards1.get(j));
                            fiveCardArray1.add(sevenCards1.get(k));
                            fiveCardArray1.add(sevenCards1.get(l));
                            fiveCardArray1.add(sevenCards1.get(m));
                            otherArrayOfArray.add(fiveCardArray1);
                            // otherhand = new PokerHand(fiveCardArray1);
                        }
                    }
                }
            }
        }

        Project2Holdem.possibilities(arrayOfArray, otherArrayOfArray);
        Project2Holdem.callPokerhand(arrayOfArray, otherArrayOfArray);
        int playerRank = Project2Holdem.getPlayerRank();
        String resultString = Project2Holdem.getRank(playerRank);

        String expected = "Straight";

        int winner = Project2Holdem.getWinStatus();
        int expectedWinner = 1;
        String expectedNpc = "Pair";
        int npcRank = Project2Holdem.getOtherRank();
        String npcResultString = Project2Holdem.getRank(npcRank);

        assertEquals(expectedWinner, winner);
        assertEquals(expectedNpc, npcResultString);
        assertEquals(expected, resultString);

        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testPossibilitiesThreeOfAKind() {
        Deck deck = new Deck();
        ArrayList<Card> fiveCardArray;
        ArrayList<Card> sevenCards = new ArrayList<>();
        ArrayList<ArrayList<Card>> arrayOfArray = new ArrayList<>();

        ArrayList<Card> fiveCardArray1;
        ArrayList<Card> sevenCards1 = new ArrayList<>();
        ArrayList<ArrayList<Card>> otherArrayOfArray = new ArrayList<>();

        deck.deckMakerFive();
        deck.deckMakerTwoPlayer();
        deck.deckMakerTwoNpc();

        ArrayList<Card> testing;
        testing = deck.getFullDeck();

        sevenCards.add(testing.get(0));
        sevenCards.add(testing.get(13));
        sevenCards.add(testing.get(26));
        sevenCards.add(testing.get(3));
        sevenCards.add(testing.get(4));
        sevenCards.add(testing.get(23));
        sevenCards.add(testing.get(45));

        sevenCards1.add(testing.get(10));
        sevenCards1.add(testing.get(13));
        sevenCards1.add(testing.get(22));
        sevenCards1.add(testing.get(34));
        sevenCards1.add(testing.get(41));
        sevenCards1.add(testing.get(2));
        sevenCards1.add(testing.get(5));

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray = new ArrayList<>();
                            fiveCardArray.add(sevenCards.get(i));
                            fiveCardArray.add(sevenCards.get(j));
                            fiveCardArray.add(sevenCards.get(k));
                            fiveCardArray.add(sevenCards.get(l));
                            fiveCardArray.add(sevenCards.get(m));
                            arrayOfArray.add(fiveCardArray);
                            // pokerHand = new PokerHand(fiveCardArray);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray1 = new ArrayList<>();
                            fiveCardArray1.add(sevenCards1.get(i));
                            fiveCardArray1.add(sevenCards1.get(j));
                            fiveCardArray1.add(sevenCards1.get(k));
                            fiveCardArray1.add(sevenCards1.get(l));
                            fiveCardArray1.add(sevenCards1.get(m));
                            otherArrayOfArray.add(fiveCardArray1);
                            // otherhand = new PokerHand(fiveCardArray1);
                        }
                    }
                }
            }
        }

        Project2Holdem.possibilities(arrayOfArray, otherArrayOfArray);
        Project2Holdem.callPokerhand(arrayOfArray, otherArrayOfArray);
        int playerRank = Project2Holdem.getPlayerRank();
        String resultString = Project2Holdem.getRank(playerRank);

        String expected = "Three of a Kind";

        int winner = Project2Holdem.getWinStatus();
        int expectedWinner = 1;
        String expectedNpc = "Pair";
        int npcRank = Project2Holdem.getOtherRank();
        String npcResultString = Project2Holdem.getRank(npcRank);

        assertEquals(expectedWinner, winner);
        assertEquals(expectedNpc, npcResultString);
        assertEquals(expected, resultString);

        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testPossibilitiesTwoPair() {
        Deck deck = new Deck();
        ArrayList<Card> fiveCardArray;
        ArrayList<Card> sevenCards = new ArrayList<>();
        ArrayList<ArrayList<Card>> arrayOfArray = new ArrayList<>();

        ArrayList<Card> fiveCardArray1;
        ArrayList<Card> sevenCards1 = new ArrayList<>();
        ArrayList<ArrayList<Card>> otherArrayOfArray = new ArrayList<>();

        deck.deckMakerFive();
        deck.deckMakerTwoPlayer();
        deck.deckMakerTwoNpc();

        ArrayList<Card> testing;
        testing = deck.getFullDeck();

        sevenCards.add(testing.get(0));
        sevenCards.add(testing.get(13));
        sevenCards.add(testing.get(27));
        sevenCards.add(testing.get(40));
        sevenCards.add(testing.get(4));
        sevenCards.add(testing.get(23));
        sevenCards.add(testing.get(45));

        sevenCards1.add(testing.get(10));
        sevenCards1.add(testing.get(13));
        sevenCards1.add(testing.get(22));
        sevenCards1.add(testing.get(34));
        sevenCards1.add(testing.get(41));
        sevenCards1.add(testing.get(2));
        sevenCards1.add(testing.get(5));

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray = new ArrayList<>();
                            fiveCardArray.add(sevenCards.get(i));
                            fiveCardArray.add(sevenCards.get(j));
                            fiveCardArray.add(sevenCards.get(k));
                            fiveCardArray.add(sevenCards.get(l));
                            fiveCardArray.add(sevenCards.get(m));
                            arrayOfArray.add(fiveCardArray);
                            // pokerHand = new PokerHand(fiveCardArray);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray1 = new ArrayList<>();
                            fiveCardArray1.add(sevenCards1.get(i));
                            fiveCardArray1.add(sevenCards1.get(j));
                            fiveCardArray1.add(sevenCards1.get(k));
                            fiveCardArray1.add(sevenCards1.get(l));
                            fiveCardArray1.add(sevenCards1.get(m));
                            otherArrayOfArray.add(fiveCardArray1);
                            // otherhand = new PokerHand(fiveCardArray1);
                        }
                    }
                }
            }
        }

        Project2Holdem.possibilities(arrayOfArray, otherArrayOfArray);
        Project2Holdem.callPokerhand(arrayOfArray, otherArrayOfArray);
        int playerRank = Project2Holdem.getPlayerRank();
        String resultString = Project2Holdem.getRank(playerRank);

        String expected = "Two Pair";

        int winner = Project2Holdem.getWinStatus();
        int expectedWinner = 1;
        String expectedNpc = "Pair";
        int npcRank = Project2Holdem.getOtherRank();
        String npcResultString = Project2Holdem.getRank(npcRank);

        assertEquals(expectedWinner, winner);
        assertEquals(expectedNpc, npcResultString);
        assertEquals(expected, resultString);

        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testPossibilitiesPair() {
        Deck deck = new Deck();
        ArrayList<Card> fiveCardArray;
        ArrayList<Card> sevenCards = new ArrayList<>();
        ArrayList<ArrayList<Card>> arrayOfArray = new ArrayList<>();

        ArrayList<Card> fiveCardArray1;
        ArrayList<Card> sevenCards1 = new ArrayList<>();
        ArrayList<ArrayList<Card>> otherArrayOfArray = new ArrayList<>();

        deck.deckMakerFive();
        deck.deckMakerTwoPlayer();
        deck.deckMakerTwoNpc();

        ArrayList<Card> testing;
        testing = deck.getFullDeck();

        sevenCards.add(testing.get(0));
        sevenCards.add(testing.get(13));
        sevenCards.add(testing.get(2));
        sevenCards.add(testing.get(9));
        sevenCards.add(testing.get(4));
        sevenCards.add(testing.get(23));
        sevenCards.add(testing.get(45));

        sevenCards1.add(testing.get(10));
        sevenCards1.add(testing.get(13));
        sevenCards1.add(testing.get(22));
        sevenCards1.add(testing.get(34));
        sevenCards1.add(testing.get(41));
        sevenCards1.add(testing.get(2));
        sevenCards1.add(testing.get(5));

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray = new ArrayList<>();
                            fiveCardArray.add(sevenCards.get(i));
                            fiveCardArray.add(sevenCards.get(j));
                            fiveCardArray.add(sevenCards.get(k));
                            fiveCardArray.add(sevenCards.get(l));
                            fiveCardArray.add(sevenCards.get(m));
                            arrayOfArray.add(fiveCardArray);
                            // pokerHand = new PokerHand(fiveCardArray);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray1 = new ArrayList<>();
                            fiveCardArray1.add(sevenCards1.get(i));
                            fiveCardArray1.add(sevenCards1.get(j));
                            fiveCardArray1.add(sevenCards1.get(k));
                            fiveCardArray1.add(sevenCards1.get(l));
                            fiveCardArray1.add(sevenCards1.get(m));
                            otherArrayOfArray.add(fiveCardArray1);
                            // otherhand = new PokerHand(fiveCardArray1);
                        }
                    }
                }
            }
        }

        Project2Holdem.possibilities(arrayOfArray, otherArrayOfArray);
        Project2Holdem.callPokerhand(arrayOfArray, otherArrayOfArray);
        int playerRank = Project2Holdem.getPlayerRank();
        String resultString = Project2Holdem.getRank(playerRank);

        String expected = "Pair";

        int winner = Project2Holdem.getWinStatus();
        //// they have the higher pair
        int expectedWinner = -1;
        String expectedNpc = "Pair";
        int npcRank = Project2Holdem.getOtherRank();
        String npcResultString = Project2Holdem.getRank(npcRank);

        assertEquals(expectedNpc, npcResultString);
        assertEquals(expectedWinner, winner);
        assertEquals(expected, resultString);

        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testPossibilitiesHighCard() {
        Deck deck = new Deck();
        ArrayList<Card> fiveCardArray;
        ArrayList<Card> sevenCards = new ArrayList<>();
        ArrayList<ArrayList<Card>> arrayOfArray = new ArrayList<>();

        ArrayList<Card> fiveCardArray1;
        ArrayList<Card> sevenCards1 = new ArrayList<>();
        ArrayList<ArrayList<Card>> otherArrayOfArray = new ArrayList<>();

        deck.deckMakerFive();
        deck.deckMakerTwoPlayer();
        deck.deckMakerTwoNpc();

        ArrayList<Card> testing;
        testing = deck.getFullDeck();

        sevenCards.add(testing.get(0));
        sevenCards.add(testing.get(12));
        sevenCards.add(testing.get(2));
        sevenCards.add(testing.get(21));
        sevenCards.add(testing.get(4));
        sevenCards.add(testing.get(23));
        sevenCards.add(testing.get(45));

        sevenCards1.add(testing.get(10));
        sevenCards1.add(testing.get(13));
        sevenCards1.add(testing.get(22));
        sevenCards1.add(testing.get(34));
        sevenCards1.add(testing.get(41));
        sevenCards1.add(testing.get(2));
        sevenCards1.add(testing.get(5));

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray = new ArrayList<>();
                            fiveCardArray.add(sevenCards.get(i));
                            fiveCardArray.add(sevenCards.get(j));
                            fiveCardArray.add(sevenCards.get(k));
                            fiveCardArray.add(sevenCards.get(l));
                            fiveCardArray.add(sevenCards.get(m));
                            arrayOfArray.add(fiveCardArray);
                            // pokerHand = new PokerHand(fiveCardArray);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray1 = new ArrayList<>();
                            fiveCardArray1.add(sevenCards1.get(i));
                            fiveCardArray1.add(sevenCards1.get(j));
                            fiveCardArray1.add(sevenCards1.get(k));
                            fiveCardArray1.add(sevenCards1.get(l));
                            fiveCardArray1.add(sevenCards1.get(m));
                            otherArrayOfArray.add(fiveCardArray1);
                            // otherhand = new PokerHand(fiveCardArray1);
                        }
                    }
                }
            }
        }

        Project2Holdem.possibilities(arrayOfArray, otherArrayOfArray);
        Project2Holdem.callPokerhand(arrayOfArray, otherArrayOfArray);
        int playerRank = Project2Holdem.getPlayerRank();
        String resultString = Project2Holdem.getRank(playerRank);

        String expected = "High Card";

        int winner = Project2Holdem.getWinStatus();
        int expectedWinner = -1;
        String expectedNpc = "Pair";
        int npcRank = Project2Holdem.getOtherRank();
        String npcResultString = Project2Holdem.getRank(npcRank);

        assertEquals(expectedWinner, winner);
        assertEquals(expectedNpc, npcResultString);
        assertEquals(expected, resultString);

        // TODO review the generated test code and remove the default call to fail.
    }
}