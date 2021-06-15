package project2.holdem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Project2Holdem {

    private static ArrayList<Card> fiveCards;
    private static ArrayList<Card> twoCards;
    private static ArrayList<Card> fiveCardArray;
    private static ArrayList<Card> fiveCardArray1;
    private static ArrayList<ArrayList<Card>> arrayOfArray;
    private static ArrayList<ArrayList<Card>> otherArrayOfArray;
    private static boolean playerTurn;
    private static Player player;
    private static Npc npc;
    private static int tempMoney;
    private static Random rand;
    private static boolean raise;
    private static Deck deck;
    private static PokerHand pokerHand;
    private static PokerHand otherhand;
    private static ArrayList<Results> resultArray;
    private static ArrayList<Results> otherResultArray;
    private static int winStatus;
    private static int playerIndex;
    private static int otherIndex;
    private static int playerRank;
    private static int otherRank;

    public Project2Holdem() {
        player = new Player();
        npc = new Npc();
        playerTurn = true;
        raise = false;
        fiveCards = new ArrayList<>();
    }

    public static void main(String[] args) {
        player = new Player();
        npc = new Npc();
        playerTurn = true;
        rand = new Random();
        start();
    }

    public static void start() {
        deck = new Deck();
//        ArrayList<Card> testing = new ArrayList<>();
//        testing = deck.getFullDeck();
//        System.out.println(testing.get(51));
//        System.out.println(testing.get(1));
//        System.out.println(testing.get(2));
//        System.out.println(testing.get(3));
//        System.out.println(testing.get(4));
//        System.out.println(testing.get(5));
//        System.out.println(testing.get(12));
//        
//        
        deck.deckMakerFive();
        deck.deckMakerTwoPlayer();
        deck.deckMakerTwoNpc();
        bettingOne();
        otherHand();
        playerHand();
        possibilities(arrayOfArray, otherArrayOfArray);
        callPokerhand(arrayOfArray, otherArrayOfArray);

        switch (winStatus) {
            case 1:
                System.out.println("You got a " + getRank(playerRank)
                        + " while your opponent got a " + getRank(otherRank));
                System.out.println("Your cards were: "
                        + arrayOfArray.get(playerIndex));
                System.out.println("Your opponents cards were: "
                        + otherArrayOfArray.get(otherIndex));
                print("You have just won this game!");
                int moneyPlayer = player.getMoney();
                int potPlayer = player.getPot();
                int potNpc = npc.getPot();
                player.setMoney(moneyPlayer + potNpc + potPlayer);
                print("You won the $" + (potNpc + potPlayer) + " pot!!!");
                gameover();
                break;
            // bettingOne();
            case -1:
                System.out.println("You got a " + getRank(playerRank)
                        + " while your opponent got a " + getRank(otherRank));
                System.out.println("Your cards were: "
                        + arrayOfArray.get(playerIndex));
                System.out.println("Your opponents cards were: "
                        + otherArrayOfArray.get(otherIndex));
                print("You have just lost this game!");
                int moneyNpc = npc.getMoney();
                potPlayer = player.getPot();
                potNpc = npc.getPot();
                npc.setMoney(moneyNpc + potNpc + potPlayer);
                print("You lost the $" + (potNpc + potPlayer) + " pot!!!");
                gameover();
                break;
            default:
                System.out.println("You got a " + getRank(playerRank)
                        + " while your opponent got a " + getRank(otherRank));
                System.out.println("Your cards were: "
                        + arrayOfArray.get(playerIndex));
                System.out.println("Your opponents cards were: "
                        + otherArrayOfArray.get(otherIndex));
                print("You and your opponent have come to a draw!");
                moneyPlayer = player.getMoney();
                moneyNpc = npc.getMoney();
                potPlayer = player.getPot();
                potNpc = npc.getPot();
                player.setMoney(moneyPlayer + ((potNpc + potPlayer) / 2));
                npc.setMoney(moneyNpc + ((potNpc + potPlayer) / 2));
                print("You won $" + (potPlayer) + "!!!");
                gameover();
                break;
        }
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void playerHand() {
        ArrayList<Card> sevenCards = new ArrayList<>();
        arrayOfArray = new ArrayList<>();
        for (Card card : deck.getFiveDeck()) {
            sevenCards.add(new Card(card));
        }
        for (Card card : deck.getTwoDeckPlayer()) {
            sevenCards.add(new Card(card));
        }
        //  System.out.println(sevenCards);
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
                        }
                    }
                }
            }
        }
//          System.out.println(arrayOfArray.get(20));
//          System.out.println(arrayOfArray.get(19));
//          System.out.println(arrayOfArray.get(18));

    }

    public static void otherHand() {
        ArrayList<Card> sevenCards1 = new ArrayList<>();
        otherArrayOfArray = new ArrayList<>();
        for (Card card : deck.getFiveDeck()) {
            sevenCards1.add(new Card(card));
        }
        for (Card card : deck.getTwoDeckNpc()) {
            sevenCards1.add(new Card(card));
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
                        }
                    }
                }
            }
        }

    }

    public static ArrayList<Results> getResultArray() {
        return resultArray;
    }

    public static void setResultArray(ArrayList<Results> resultArray) {
        Project2Holdem.resultArray = resultArray;
    }

    public static ArrayList<Results> getOtherResultArray() {
        return otherResultArray;
    }

    public static void setOtherResultArray(ArrayList<Results> otherResultArray) {
        Project2Holdem.otherResultArray = otherResultArray;
    }

    public static void possibilities(ArrayList<ArrayList<Card>> arrayOfArray,
            ArrayList<ArrayList<Card>> otherArrayOfArray) {
        resultArray = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            pokerHand = new PokerHand(arrayOfArray.get(i));
            int handRank = pokerHand.getHandRank().ordinal();
            resultArray.add(new Results(handRank, i));
        }
        Collections.sort(resultArray);

//        for (Results res : resultArray) {
//            System.out.println(res);
//        }
        otherResultArray = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            otherhand = new PokerHand(otherArrayOfArray.get(i));
            int handRank = otherhand.getHandRank().ordinal();
            otherResultArray.add(new Results(handRank, i));
        }
        Collections.sort(otherResultArray);

    }

    public static void callPokerhand(ArrayList<ArrayList<Card>> arrayOfArray, ArrayList<ArrayList<Card>> otherArrayOfArray) {
        Results playerResult = resultArray.get(0);
        Results otherResult = otherResultArray.get(0);
        playerIndex = playerResult.getIndex();
        playerRank = playerResult.getRank();
        otherIndex = otherResult.getIndex();
        otherRank = otherResult.getRank();
        otherhand = new PokerHand(otherArrayOfArray.get(otherIndex));
        pokerHand = new PokerHand(arrayOfArray.get(playerIndex));
        winStatus = pokerHand.compareTo(otherhand);

    }

    public static int getOtherRank() {
        return otherRank;
    }

    public static int getWinStatus() {
        return winStatus;
    }

    public static String getRank(int rankToString) {
        deck.deckMakerTwoPlayer();
        deck.deckMakerTwoNpc();
        switch (rankToString) {
            case 8:
                return "Straight Flush";
            case 7:
                return "Four of a Kind";
            case 6:
                return "Full House";
            case 5:
                return "Flush";
            case 4:
                return "Straight";
            case 3:
                return "Three of a Kind";
            case 2:
                return "Two Pair";
            case 1:
                return "Pair";
        }
        return "High Card";
    }

    public static int getPlayerRank() {
        return playerRank;
    }

    public static void bettingOne() {
        deck.deckMakerTwoPlayer();
        deck.deckMakerTwoNpc();
        if (player.getMoney() > 2) {
            if (npc.getMoney() > 2) {
                if (playerTurn) {
                    tempMoney = player.getMoney();
                    player.setMoney(tempMoney - 1);
                    int playerPot = player.getPot();
                    player.setPot(playerPot + 1);
                    tempMoney = npc.getMoney();
                    int npcPot = npc.getPot();
                    npc.setPot(npcPot + 2);
                    npc.setMoney(tempMoney - 2);
                    playerTurn = false;
                    print("You have put $1 into the pot, while your opponent"
                            + " has put $2");
                    print("Your balance is now $" + player.getMoney());
                } else {
                    tempMoney = npc.getMoney();
                    int npcPot = npc.getPot();
                    npc.setPot(npcPot + 1);
                    npc.setMoney(tempMoney - 1);
                    tempMoney = player.getMoney();
                    int playerPot = player.getPot();
                    player.setPot(playerPot + 2);
                    player.setMoney(tempMoney - 2);
                    playerTurn = true;
                    print("You have put $2 into the pot, while your opponent"
                            + " has put $1");
                    print("Your balance is now $" + player.getMoney());
                }
            } else {
                gameoverNpc();
            }
        } else {
            gameoverPlayer();
        }
        bettingTwo();
    }

    public static void bettingTwo() {
        if (playerTurn) {
            callOrFold();
            playerTurn = false;
        } else {
            twoCards = new ArrayList<>();
            for (Card card : deck.getTwoDeckPlayer()) {
                twoCards.add(new Card(card));
            }
            print("Your cards are:");
            System.out.println(twoCards.get(0));
            System.out.println(twoCards.get(1));
            print("");
            CallPutRaise();
            playerTurn = true;
        }
        bettingThree();
    }

    public static void bettingThree() {
        fiveCards = new ArrayList<>();
        for (Card card : deck.getFiveDeck()) {
            fiveCards.add(new Card(card));
        }
        print("Your cards are:");
        System.out.println(twoCards.get(0));
        System.out.println(twoCards.get(1));
        print("");
        print("The community cards are:");
        System.out.println(fiveCards.get(0));
        System.out.println(fiveCards.get(1));
        System.out.println(fiveCards.get(2));
        print("");
        bettingThreeThroughFive();
        bettingFour();
    }

    public static void bettingFour() {
        print("Your cards are:");
        System.out.println(twoCards.get(0));
        System.out.println(twoCards.get(1));
        print("");
        print("The community cards are:");
        System.out.println(fiveCards.get(0));
        System.out.println(fiveCards.get(1));
        System.out.println(fiveCards.get(2));
        System.out.println(fiveCards.get(3));
        print("");
        bettingThreeThroughFive();
        bettingFive();
    }

    public static void bettingFive() {
        print("Your cards are:");
        System.out.println(twoCards.get(0));
        System.out.println(twoCards.get(1));
        print("");
        print("The community cards are:");
        System.out.println(fiveCards.get(0));
        System.out.println(fiveCards.get(1));
        System.out.println(fiveCards.get(2));
        System.out.println(fiveCards.get(3));
        System.out.println(fiveCards.get(4));
        print("");
        bettingThreeThroughFive();

    }

    public static void bettingThreeThroughFive() {
        if (playerTurn) {
            print("How much do you want to bet? ($0 or more)");
            Scanner keyboard = new Scanner(System.in);
            int bet = Integer.parseInt(keyboard.nextLine());
            int tempPlayerMoney = player.getMoney();
            if (bet > tempPlayerMoney) {
                print("You dont have enough money to do that!");
                bettingThreeThroughFive();
            } else {
                int tempPlayerPot = player.getPot();
                player.setMoney(tempPlayerMoney - bet);
                player.setPot(tempPlayerPot + bet);
                playerTurn = false;
                print("You have put $" + bet + " into the pot");
                print("Your balance is now $" + player.getMoney());
                callOrFold();
            }
        } else {
            int betOrFold = rand.nextInt(6) + 1;

            if (!(betOrFold == 3)) {
                int temp = rand.nextInt(9) + 1;
                int tempNpcMoney = npc.getMoney();
                int tempNpcPot = npc.getPot();
                npc.setMoney(tempNpcMoney - temp);
                npc.setPot(tempNpcPot + temp);
                print("Your opponent has bet $" + temp);
                raise = true;
                playerTurn = true;
                CallPutRaise();
            } else {
                print("Your opponent has just folded, you win!!!");
                int moneyPlayer = player.getMoney();
                int potPlayer = player.getPot();
                int potNpc = npc.getPot();
                player.setMoney(moneyPlayer + potNpc + potPlayer);
                print("You won $" + (potNpc + potPlayer) + "!!!");
                gameover();
            }

        }
    }

    public static void callOrFold() {
        int temp = rand.nextInt(6) + 1;
        if (!(temp == 4)) {
            tempMoney = npc.getMoney();
            int tempPotNpc = npc.getPot();
            int tempPotPlayer = player.getPot();
            int total = tempPotPlayer - tempPotNpc;
            if ((tempMoney - total) < 0) {
                print("Your opponent has just folded, you win!!!");
                int moneyPlayer = player.getMoney();
                int potPlayer = player.getPot();
                int potNpc = npc.getPot();
                player.setMoney(moneyPlayer + potNpc + potPlayer);
                print("You won $" + (potNpc + potPlayer) + "!!!");
                gameover();
            }
            npc.setMoney(tempMoney - total);
            npc.setPot(tempPotNpc + total);
            print("Your opponent has called, the pot now contains $"
                    + ((tempPotNpc + total) * 2));
        } else {
            print("Your opponent has just folded, you win!!!");
            int moneyPlayer = player.getMoney();
            int potPlayer = player.getPot();
            int potNpc = npc.getPot();
            player.setMoney(moneyPlayer + potNpc + potPlayer);
            print("You won $" + (potNpc + potPlayer) + "!!!");
            gameover();
        }
        playerTurn = true;
    }

    public static void CallPutRaise() {
        print("Do you want to call, raise, or fold?");
        Scanner keyboard = new Scanner(System.in);
        String answer = keyboard.nextLine();
        if (answer.equalsIgnoreCase("call")) {
            tempMoney = player.getMoney();
            int tempPotNpc = npc.getPot();
            int tempPotPlayer = player.getPot();
            int total = tempPotNpc - tempPotPlayer;
            if ((tempMoney - total) < 0) {
                print("You dont have enough money to do that! You are"
                        + " forced to fold");
                int playerMoney = player.getMoney();
                print("Your current balance is $" + playerMoney);
                gameover();
            }
            player.setMoney(tempMoney - total);
            player.setPot(tempPotPlayer + total);
            print("You have put $" + total + " into the pot");
            print("Your balance is now $" + player.getMoney());
            callOrFold();

        } else if (answer.equalsIgnoreCase("raise")) {
            print("How much do you want to put in?");
            int answerNum = Integer.parseInt(keyboard.nextLine());
            int npcMoney = npc.getMoney();
            int playerMoney = player.getMoney();
            if (answerNum > npcMoney) {
                print("Your opponent does not have that much money!");
                CallPutRaise();
            } else if (answerNum > playerMoney) {
                print("You dont have enough money!");
                CallPutRaise();
            } else {
                int tempPotPlayer = player.getPot();
                player.setPot(tempPotPlayer + answerNum);
                player.setMoney(playerMoney - answerNum);

                print("You have put $" + answerNum + " into the pot");
                print("Your balance is now $" + player.getMoney());
                callOrFold();
//                if (raise) {
//                    playerTurn = false;
//                    callOrFold();
//                }
            }
        } else if (answer.equalsIgnoreCase("fold")) {
            print("You have just folded");
            int playerMoney = player.getMoney();
            print("Your current balance is $" + playerMoney);
            deck.deckMakerTwoPlayer();
        deck.deckMakerTwoNpc();
            gameover();
        } else {
            print("We didn't understand what you said, please try again");
            CallPutRaise();
        }
    }

    public static void gameoverPlayer() {
        print("Game Over! You dont have enough money to keep playing!");
        gameover();
    }

    public static void gameoverNpc() {
        print("Game Over! Your opponent doesn't have enough money to keep playing!");
        gameover();
    }

    public static void gameover() {
        deck = new Deck();
        deck.deckMakerTwoPlayer();
        deck.deckMakerTwoNpc();
        player.setPot(0);
        npc.setPot(0);
        int playerMoney = player.getMoney();
        print("Your balance is now at $" + playerMoney);
        print("Do you want to play again?");
        Scanner keyboard = new Scanner(System.in);
        String answer = keyboard.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            start();
        } else {
            print("We hope to see you soon!");
            System.exit(0);
        }
    }

}
