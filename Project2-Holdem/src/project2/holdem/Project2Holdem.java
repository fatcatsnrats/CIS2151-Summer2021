package project2.holdem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Project2Holdem {

    private static ArrayList<Card> one;
    private static ArrayList<Card> two;
    private static ArrayList<Card> fiveCardArray;
    private static ArrayList<ArrayList<Card>> arrayOfArray;
    private static ArrayList<Card> five;
    private static ArrayList<Card> six;
    private static ArrayList<Card> seven;
    private static ArrayList<Card> eight;
    private static ArrayList<Card> nine;
    private static ArrayList<Card> ten;
    private static ArrayList<Card> eleven;
    private static ArrayList<Card> twelve;
    private static ArrayList<Card> thirteen;
    private static ArrayList<Card> fourteen;
    private static ArrayList<Card> fifteen;
    private static ArrayList<Card> sixteen;
    private static ArrayList<Card> seventeen;
    private static ArrayList<Card> eighteen;
    private static ArrayList<Card> nineteen;
    private static ArrayList<Card> twenty;
    private static ArrayList<Card> twentyOne;
    private static boolean playerTurn;
    private static int pot;
    //  private static Player player;
    private static Npc npc;
    private static int tempMoney;
    private static Random rand;
    private static boolean raise;
    private static Deck deck;
    private static Player player;

    public Project2Holdem() {
        player = new Player();
        npc = new Npc();
        playerTurn = true;
        raise = false;
        one = new ArrayList<>();
//        Deck deck = new Deck();
//        Player player = new Player();
    }

    public static void main(String[] args) {
        deck = new Deck();
        player = new Player();
        npc = new Npc();
        //call();
        // deck.deckMakerFive();
        start();
        //  bettingThree();
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        int l = 0;
//        int m = 0;

//        for (int index = 0; i <= 20; i++) {
//            
//            
//            if (i == 7) {
//                i = 0;
//                j++;
//            }
//            if (j == 7) {
//                j=0;
//                k++;
//            }
//            if (k == 7) {
//                k = 0;
//                l++;
//            }
//            if (l == 7) {
//                l = 0;
//                m++;
//            }
//        }
//        for( Card.Suit suit : Card.Suit.values() ){
//            for ( Card.Face face : Card.Face.values() ){
//                System.out.println(new Card(face, suit));
//            }
//        }
    }

    public static void start() {
        call();
       // bettingOne();
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void call() {
        PokerHand pokerHand;
        ArrayList<Card> sevenCards = new ArrayList<>();
        fiveCardArray = new ArrayList<>();
        arrayOfArray = new ArrayList<>();
        deck.deckMakerFive();
        deck.deckMakerTwo();
        for (Card card : deck.getFiveDeck()) {
            sevenCards.add(new Card(card));
        }
        for (Card card : deck.getTwoDeck()) {
            sevenCards.add(new Card(card));
        }
        System.out.println(sevenCards);
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray.add(sevenCards.get(i));
                            fiveCardArray.add(sevenCards.get(j));
                            fiveCardArray.add(sevenCards.get(k));
                            fiveCardArray.add(sevenCards.get(l));
                            fiveCardArray.add(sevenCards.get(m));
                            //  arrayOfArray.add(fiveCardArray);
                            pokerHand = new PokerHand(fiveCardArray);
                        }
                    }
                }
            }
        }
        //  System.out.println(arrayOfArray.get(20));

    }
        public static void otherHand() {
        PokerHand pokerHand;
        ArrayList<Card> sevenCards1 = new ArrayList<>();
        deck = new Deck();
        ArrayList<Card> fiveCardArray1 = new ArrayList<>();
        deck.deckMakerFive();
        deck.deckMakerTwo();
        for (Card card : deck.getFiveDeck()) {
            sevenCards1.add(new Card(card));
        }
        for (Card card : deck.getTwoDeck()) {
            sevenCards1.add(new Card(card));
        }
        System.out.println(sevenCards1);
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        for (int m = l + 1; m < 7; m++) {
                            fiveCardArray1.add(sevenCards1.get(i));
                            fiveCardArray1.add(sevenCards1.get(j));
                            fiveCardArray1.add(sevenCards1.get(k));
                            fiveCardArray1.add(sevenCards1.get(l));
                            fiveCardArray1.add(sevenCards1.get(m));
                            //  arrayOfArray.add(fiveCardArray);
                            pokerHand = new PokerHand(fiveCardArray1);
                        }
                    }
                }
            }
        }
        
        //  System.out.println(arrayOfArray.get(20));

    }

    public static void bettingOne() {
        playerTurn = true;
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
            deck.deckMakerTwo();
            two = new ArrayList<>();
            for (Card card : deck.getTwoDeck()) {
                two.add(new Card(card));
            }
            print("Your cards are:");
            print("");
            System.out.println(two.get(0));
            System.out.println(two.get(1));
            print("");
            ///display personal 2 cards
            CallPutRaise();
            playerTurn = true;
        }
        bettingThree();
    }

    public static void bettingThree() {
        one = new ArrayList<>();
        deck.deckMakerFive();
        for (Card card : deck.getFiveDeck()) {
            one.add(new Card(card));
        }

//        for (int i = 0; i <= 2; i++) {
//        one.add(deck.getFiveDeck().get(i));
//        }
        print("Your cards are:");
        print("");
        System.out.println(two.get(0));
        System.out.println(two.get(1));
        print("");
        print("The community cards are:");
        print("");
        System.out.println(one.get(0));
        System.out.println(one.get(1));
        System.out.println(one.get(2));
        print("");

        //print(text);
        //display 3 cards
        bettingThreeThroughFive();
        bettingFour();
    }

    public static void bettingFour() {
        //display 1 card
        print("Your cards are:");
        print("");
        System.out.println(two.get(0));
        System.out.println(two.get(1));
        print("");
        print("The community cards are:");
        print("");
        System.out.println(one.get(0));
        System.out.println(one.get(1));
        System.out.println(one.get(2));
        System.out.println(one.get(3));
        print("");
        bettingThreeThroughFive();
        bettingFive();
    }

    public static void bettingFive() {
        //display 1 card
        print("Your cards are:");
        print("");
        System.out.println(two.get(0));
        System.out.println(two.get(1));
        print("");
        print("The community cards are:");
        print("");
        System.out.println(one.get(0));
        System.out.println(one.get(1));
        System.out.println(one.get(2));
        System.out.println(one.get(3));
        System.out.println(one.get(4));
        print("");
        bettingThreeThroughFive();

    }

    public static void bettingThreeThroughFive() {
        if (playerTurn) {
            print("How much do you want to bet? ($0 or more)");
            Scanner keyboard = new Scanner(System.in);
            int bet = Integer.parseInt(keyboard.nextLine());
            int tempPlayerMoney = player.getMoney();
            int tempPlayerPot = player.getPot();
            player.setMoney(tempPlayerMoney - bet);
            player.setPot(tempPlayerPot + bet);
            playerTurn = false;
            print("You have put $" + bet + " into the pot");
            print("Your balance is now $" + player.getMoney());
            callOrFold();
        } else {
            rand = new Random();
            int temp = rand.nextInt(9);
            int tempNpcMoney = npc.getMoney();
            int tempNpcPot = npc.getPot();
            npc.setMoney(tempNpcMoney - temp);
            npc.setPot(tempNpcPot + temp);
            raise = true;
            playerTurn = true;
            CallPutRaise();

        }
    }

    public static void callOrFold() {
        rand = new Random();
        int temp = rand.nextInt(2);
        if (temp == 1) {
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
    }

    public static void CallPutRaise() {
        print("Do you want to call, raise, or fold?");
        Scanner keyboard = new Scanner(System.in);
        String answer = keyboard.nextLine();
        if (answer.equalsIgnoreCase("call")) {

//            if (playerTurn) {
//                tempMoney = npc.getMoney();
//                ///// only works when $1
//                npc.setMoney(tempMoney - 1);
//                pot += 1;
//            } else {
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
            //  }

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
                // pot += answerNum;
//                int tempPotNpc = npc.getPot();
                int tempPotPlayer = player.getPot();
//                int total = tempPotPlayer - tempPotNpc;
//
//                npc.setPot(tempPotNpc + total);
//                npc.setMoney(npcMoney - total);
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
        player.setPot(0);
        npc.setPot(0);
        print("Do you want to play again?");
        int playerMoney = player.getMoney();
        print("Your balance is now at $" + playerMoney);
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
