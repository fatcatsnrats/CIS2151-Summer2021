package project2.holdem;

import java.util.ArrayList;

public class Project2Holdem {

    private ArrayList<Card> one;
    private ArrayList<Card> two;
    private ArrayList<Card> three;
    private ArrayList<Card> four;
    private ArrayList<Card> five;
    private ArrayList<Card> six;
    private ArrayList<Card> seven;
    private ArrayList<Card> eight;
    private ArrayList<Card> nine;
    private ArrayList<Card> ten;
    private ArrayList<Card> eleven;
    private ArrayList<Card> twelve;
    private ArrayList<Card> thirteen;
    private ArrayList<Card> fourteen;
    private ArrayList<Card> fifteen;
    private ArrayList<Card> sixteen;
    private ArrayList<Card> seventeen;
    private ArrayList<Card> eighteen;
    private ArrayList<Card> nineteen;
    private ArrayList<Card> twenty;
    private ArrayList<Card> twentyOne;

    public static void main(String[] args) {
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

    public static void cardMaker() {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Face face : Card.Face.values()) {
                Card newCard = new Card(face, suit);
            }
        }
    }

    public static void computerPossibilities(ArrayList<Card> cardOne, ArrayList<Card> cardTwo) {
       // Card one = new Card(car);
       ArrayList<Card> one = new ArrayList<>();
       one(0) = cardOne(0);
       

    }

}
