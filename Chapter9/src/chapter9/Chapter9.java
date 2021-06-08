package chapter9;

import java.util.Scanner;

public class Chapter9 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int favoriteNumber = Integer.parseInt(keyboard.nextLine());

        //int otherNumber = new Integer(42);
        Integer myNumber = 42;

        String myName = "Eric";
        String upperCaseName = "";

        
        // this is really slow, it builds a new string each time it is changed ( every letter )
        for (char letter : myName.toCharArray()) {
            if (Character.isLowerCase(letter)) {
                upperCaseName += Character.toUpperCase(letter);
            }
            else{
                upperCaseName += letter;
            }
        }
        
        StringBuilder builder = new StringBuilder();
        
        for (char letter : myName.toCharArray()) {
            if (Character.isLowerCase(letter)) {
                builder.append( Character.toUpperCase(letter));
            }
            else{
                builder.append(letter);
            }
        }
        
        System.out.println(builder.toString());
        
        System.out.println(upperCaseName);

        System.out.println(myName);
        // strings are immuatable, they don't change
        myName = myName.toLowerCase();
        System.out.println(myName);
        
        
        System.out.println("Please enter a sentence with mulitple words");
        
        String input = keyboard.nextLine();
        
        for( String word : input.split(" ")){
            System.out.println(word);
        }
        
        int previousIndex = 0;
        int indexOfPeriod = input.indexOf(".");
        
        while ( indexOfPeriod != -1){
            String token = input.substring(previousIndex, indexOfPeriod);
            System.out.println(token);
            previousIndex = indexOfPeriod+1;
            indexOfPeriod = input.indexOf(".", indexOfPeriod+1);
        }
        System.out.println(input.substring(previousIndex+1));

        
        
        for ( int number = 0; number < 256; number++){
            String original = Integer.toBinaryString(number);
            String binaryString = String.format("%8s", original).replace(" ", "0");
            
            System.out.println(String.format("%d in binary: %s", number, binaryString));
        }
    }

}
