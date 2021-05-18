
package chapter6examples;

import java.util.Scanner;

public class Chapter6Examples {

    public static void main(String[] args) {
        System.out.println("How high of a number do you want to guess?");
        Scanner keyboard = new Scanner(System.in);
        
        int maxNumber = Integer.parseInt(keyboard.nextLine());
        
        MagicNumber magicNumber = new MagicNumber(maxNumber);
        
        while ( !magicNumber.hasGuessedCorrectly()){
            System.out.println("guess a number");
            int number = Integer.parseInt(keyboard.nextLine());
            System.out.println(magicNumber.guess(number));
        }
        
        
    }
    
}
