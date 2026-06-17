import java.util.*;

public class DeckOfCards {

    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {
            "2","3","4","5","6","7","8","9","10",
            "Jack","Queen","King","Ace"
    };

    // Create deck
    static String[] createDeck() {
        String[] deck = new String[52];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Shuffle deck
    static void shuffle(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomIndex = i + (int)(Math.random() * (n - i));

            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    // Distribute cards
    static String[][] distribute(String[] deck, int players, int cardsEach) {

        if (players * cardsEach > deck.length) {
            System.out.println("Not enough cards!");
            return null;
        }

        String[][] result = new String[players][cardsEach];

        int index = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsEach; j++) {
                result[i][j] = deck[index++];
            }
        }

        return result;
    }

    // Print players cards
    static void print(String[][] playersCards) {

        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + ":");

            for (int j = 0; j < playersCards[i].length; j++) {
                System.out.println(playersCards[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] deck = createDeck();
        shuffle(deck);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter cards per player: ");
        int cardsEach = sc.nextInt();

        String[][] result = distribute(deck, players, cardsEach);

        if (result != null) {
            print(result);
        }
    }
}