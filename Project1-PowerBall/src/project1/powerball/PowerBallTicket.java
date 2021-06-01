package project1.powerball;

import java.util.ArrayList;
import java.util.Random;

public class PowerBallTicket {

    private static Random random = new Random();

    private ArrayList<Integer> whiteNumbers;
    private int redNumber;

    public PowerBallTicket() {
        whiteNumbers = new ArrayList<>(5);

        for (int numbersToAdd = 0; numbersToAdd < 5; numbersToAdd++) {
            int numberToAdd = random.nextInt(69) + 1;
            while (whiteNumbers.contains(numberToAdd)) {
                numberToAdd = random.nextInt(69) + 1;
            }
            whiteNumbers.add(numberToAdd);
        }

        redNumber = random.nextInt(26) + 1;

    }

    public PowerBallTicket(ArrayList<Integer> whiteNumbers, int redNumber) {
        this.whiteNumbers = new ArrayList<>(5);

        // THIS IS BAD!!! DANGER ZONE!!! - shallow copy
        // this.whiteNumbers = whiteNumbers;
        for (int number : whiteNumbers) {
            this.whiteNumbers.add(number);
            // feeling bad we didn't check for duplicates
        }

        this.redNumber = redNumber;

    }

    public int getRedNumber() {
        return redNumber;
    }

    // returns a copy, not the reference our private variable
    public ArrayList<Integer> getWhiteNumbers() {
        ArrayList<Integer> result = new ArrayList<>(5);
        for (int number : whiteNumbers) {
            result.add(number);
        }
        return result;
    }

    public int getWinnings(PowerBallTicket winningTicket) {
        int numberOfWhiteMatches = 0;
        boolean redMatches = redNumber == winningTicket.redNumber;

        for (int myWhiteNumber : whiteNumbers) {
            if (winningTicket.whiteNumbers.contains(myWhiteNumber)) {
//                for ( int winningWhiteNumber : winningTicket.whiteNumbers ){
//                    if ( myWhiteNumber == winningWhiteNumber ){
//                        numberOfWhiteMatches++;
//                    }
//                }
                numberOfWhiteMatches++;
            }
        }

        if (numberOfWhiteMatches == 5 && redMatches) {
            return 1_000_000_000;
        }
        if (numberOfWhiteMatches == 5) {
            return 1_000_000;
        }
        if (numberOfWhiteMatches == 4 && redMatches) {
            return 50_000;
        }
        if (numberOfWhiteMatches == 4) {
            return 100;
        }
        if (numberOfWhiteMatches == 3 && redMatches) {
            return 100;
        }
        if (numberOfWhiteMatches == 3) {
            return 7;
        }
        if (numberOfWhiteMatches == 2 && redMatches) {
            return 7;
        }
        if (redMatches) {
            return 4;
        }
        return 0;
    }

    @Override
    public String toString() {
        // string builder would be better, feeling bad
        String result = "";
        for (int number : whiteNumbers) {
            result += number + " ";
        }
        result += "PowerBall: " + redNumber;
        return result;
    }

}
