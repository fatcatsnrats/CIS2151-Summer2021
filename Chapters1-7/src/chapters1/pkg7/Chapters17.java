
package chapters1.pkg7;

import java.util.ArrayList;

public class Chapters17 {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<String> friends;
        friends = new ArrayList<>();
        
        friends.add("Larry");
        
        friends.add("Vlad");
        
        friends.add("Alan");
        
        for ( int index = 0; index < friends.size(); index++ ){
            System.out.println(friends.get(index));
        }
        
        for ( String friend : friends ){
            System.out.println(friend);
        }
        
        String[] friendsArray = new String[3];
        friendsArray[0] = "Larry";
        friendsArray[1] = "Vlad";
        friendsArray[2] = "Alan";
        
        for ( int index = 0; index < friendsArray.length; index++ ){
            System.out.println(friendsArray[index]);
        }
        
        for ( String friend : friendsArray ){
            System.out.println(friend);
        }
        
        
    }
    
}
