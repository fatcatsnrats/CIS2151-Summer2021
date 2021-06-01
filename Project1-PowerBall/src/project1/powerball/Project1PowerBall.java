package project1.powerball;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

public class Project1PowerBall {

    public static void main(String[] args) {
        int totalWon = 0;
        int totalSpent = 0;

        Scanner keyboard = new Scanner(System.in);

        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {
            System.out.println("Do you want to pick your lotto numbers or buy easy pick tickets? (pick/easy)");
            String choice = keyboard.nextLine();

            PowerBallTicket winningTicket = new PowerBallTicket();

            if (choice.equalsIgnoreCase("pick")) {
                ArrayList<Integer> whiteNumbers = new ArrayList<Integer>(5);
                for (int numberToPick = 0; numberToPick < 5; numberToPick++) {
                    System.out.println("Enter a number 1-69");
                    int number = Integer.parseInt(keyboard.nextLine());
                    while (whiteNumbers.contains(number)) {
                        System.out.println("You already picked that one, no duplicates dummy!");
                        System.out.println("Enter a number 1-69");
                        number = Integer.parseInt(keyboard.nextLine());
                    }
                    whiteNumbers.add(number);
                }

                System.out.println("Enter a PowerBall number 1-26");
                int redNumber = Integer.parseInt(keyboard.nextLine());

                PowerBallTicket usersTicket = new PowerBallTicket(whiteNumbers, redNumber);
                int winnings = usersTicket.getWinnings(winningTicket);
                totalWon += winnings;
                totalSpent += 2;

                System.out.println(String.format("You won $%,d", winnings));

            } else {
                System.out.println("How many easy picks do you want to buy?");
                int numberOfTicketsToBuy = Integer.parseInt(keyboard.nextLine());

                totalSpent += numberOfTicketsToBuy * 2;

                System.out.println("Do you want to see all your tickets or just the winning ones?(yes/no)");
                String allOrWinning = keyboard.nextLine();

                for (int ticketToBuy = 0; ticketToBuy < numberOfTicketsToBuy; ticketToBuy++) {
                    PowerBallTicket myTicket = new PowerBallTicket();
                    int winnings = myTicket.getWinnings(winningTicket);
                    totalWon += winnings;
                    if (allOrWinning.equalsIgnoreCase("yes")) {
                        System.out.println(String.format("Ticket: %s won $%,d", myTicket, winnings));
                    } else {
                        if (winnings > 0) {
                            System.out.println(String.format("Ticket: %s won $%,d", myTicket, winnings));
                        }
                    }

                }

            }

            System.out.println("Winning Ticket: " + winningTicket);

            System.out.println(String.format(
                    "Total Won: $%d - Total Spent: $%d - Net Loss: $%d",
                    totalWon, totalSpent, (totalSpent - totalWon)));

            System.out.println("Do you want to buy more tickets?");
            playAgain = keyboard.nextLine();
        }

    }

}
