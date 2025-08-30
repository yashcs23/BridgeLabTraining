package stringpracticelevel2;

import java.util.Scanner;

class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of games to play:");
        int games = scanner.nextInt();
        int userWins = 0;
        int compWins = 0;
        int draws = 0;
        for (int i = 0; i < games; i++) {
            System.out.println("Enter your choice (rock, paper, or scissors):");
            String userChoice = scanner.next().toLowerCase();
            int compRandom = (int)(Math.random() * 3);
            String compChoice = "";
            if (compRandom == 0) {
                compChoice = "rock";
            } else if (compRandom == 1) {
                compChoice = "paper";
            } else {
                compChoice = "scissors";
            }
            String result = "";
            if (userChoice.equals(compChoice)) {
                result = "Draw";
                draws++;
            } else if ((userChoice.equals("rock") && compChoice.equals("scissors")) ||
                       (userChoice.equals("paper") && compChoice.equals("rock")) ||
                       (userChoice.equals("scissors") && compChoice.equals("paper"))) {
                result = "You Win!";
                userWins++;
            } else {
                result = "Computer Wins!";
                compWins++;
            }
            System.out.println("You chose: " + userChoice);
            System.out.println("Computer chose: " + compChoice);
            System.out.println("Result: " + result);
        }
        System.out.println("\nGame Stats");
        System.out.println("Player Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + draws);
        double userPercentage = (double)userWins / games * 100;
        double compPercentage = (double)compWins / games * 100;
        System.out.println("User Win %: " + userPercentage + "%");
        System.out.println("Computer Win %: " + compPercentage + "%");
    }
}
