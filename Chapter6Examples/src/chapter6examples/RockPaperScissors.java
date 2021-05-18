package chapter6examples;

public class RockPaperScissors {

    private String choice;

    public RockPaperScissors(String choice) {
        
        // should do some sanity checking on choice
        this.choice = choice;
        
    }

    public String fight(RockPaperScissors other) {
        if (choice.equalsIgnoreCase(other.choice)) {
            return "Tie!";
        }
        if (choice.equalsIgnoreCase("rock") && other.choice.equalsIgnoreCase("scissors")
            || choice.equalsIgnoreCase("scissors") && other.choice.equalsIgnoreCase("paper")
            || choice.equalsIgnoreCase("paper") && other.choice.equalsIgnoreCase("rock")) {
            return "You Win!";
        }
        return "you Lose!";
    }
}
