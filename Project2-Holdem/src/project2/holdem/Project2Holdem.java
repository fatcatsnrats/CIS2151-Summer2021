
package project2.holdem;


public class Project2Holdem {

    public static void main(String[] args) {
        for( Card.Suit suit : Card.Suit.values() ){
            for ( Card.Face face : Card.Face.values() ){
                System.out.println(new Card(face, suit));
            }
        }
    }
    
}
