package chapter6examples;

import java.util.Random;

public class MagicNumber {

    private int number;
    private int maxNumberToGuess;
    private int numberOfGuesses;
    private boolean guessedCorrectly;

    public MagicNumber(int maxNumberToGuess) {
        this.maxNumberToGuess = maxNumberToGuess;

        Random random = new Random();
        number = random.nextInt(maxNumberToGuess) + 1;

        numberOfGuesses = 0;
        guessedCorrectly = false;
    }

    public boolean hasGuessedCorrectly() {
        return guessedCorrectly;
    }

    public String guess(int numberToGuess) {
        numberOfGuesses++;

        if (numberToGuess == number) {
            guessedCorrectly = true;
            return String.format(
                    "You guessed it correctly in %d guesses!", numberOfGuesses);
        } else if (numberToGuess < number) {
            return "Too low!";
        } else {
            return "Too high!";
        }

    }
}
