package stringpracticelevel3;

import java.util.Scanner;

class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = ranks[i] + " of " + suits[j];
            }
        }
        for (int i = 0; i < numOfCards; i++) {
            int randomCardNumber = i + (int) (Math.random() * (numOfCards - i));
            String temp = deck[randomCardNumber];
            deck[randomCardNumber] = deck[i];
            deck[i] = temp;
        }
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards to distribute to each player: ");
        int cardsPerPlayer = sc.nextInt();
        if (players * cardsPerPlayer > numOfCards) {
            System.out.println("Cannot distribute " + cardsPerPlayer + " cards to " + players + " players. Not enough cards in the deck.");
        } else {
            String[][] distributedCards = new String[players][cardsPerPlayer];
            for (int i = 0; i < players; i++) {
                for (int j = 0; j < cardsPerPlayer; j++) {
                    distributedCards[i][j] = deck[i * cardsPerPlayer + j];
                }
            }
            for (int i = 0; i < players; i++) {
                System.out.println("Player " + (i + 1) + " cards:");
                for (int j = 0; j < cardsPerPlayer; j++) {
                    System.out.println(distributedCards[i][j]);
                }
                System.out.println();
            }
        }
    }
}
