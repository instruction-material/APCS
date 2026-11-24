import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevens game = args.length == 1 && args[0].equals("--demo")
            ? demo() : new Elevens(Deck.shuffled(new Random()));
        try (Scanner input = new Scanner(System.in)) {
            run(game, input);
        }
    }

    static Elevens demo() {
        return new Elevens(new Deck(List.of(
            new Card(5, Suit.CLUBS),
            new Card(6, Suit.HEARTS),
            new Card(11, Suit.SPADES),
            new Card(12, Suit.DIAMONDS),
            new Card(13, Suit.SPADES)
        )));
    }

    static void run(Elevens game, Scanner input) {
        System.out.println("Enter displayed slot numbers separated by spaces, or quit.");
        while (game.status() == Elevens.Status.PLAYING) {
            printHand(game);
            if (!input.hasNextLine()) {
                System.out.println("End of input.");
                return;
            }
            String line = input.nextLine().trim();
            if (line.equalsIgnoreCase("quit")) {
                System.out.println("Game ended.");
                return;
            }
            if (game.play(parseSlots(line))) {
                System.out.println("Move accepted.");
            } else {
                System.out.println("Choose a legal move.");
            }
        }
        printHand(game);
        System.out.println(game.status() == Elevens.Status.WON ? "Won" : "No moves left");
    }

    private static int[] parseSlots(String text) {
        String[] tokens = text.split("\\s+");
        if (tokens.length < 2 || tokens.length > 3) {
            return new int[0];
        }
        int[] slots = new int[tokens.length];
        try {
            for (int i = 0; i < tokens.length; i++) {
                int number = Integer.parseInt(tokens[i]);
                if (number < 1) {
                    return new int[0];
                }
                slots[i] = number - 1;
            }
        } catch (NumberFormatException invalid) {
            return new int[0];
        }
        return slots;
    }

    private static void printHand(Elevens game) {
        List<Card> hand = game.getHand();
        StringBuilder summary = new StringBuilder("Hand:");
        for (int i = 0; i < hand.size(); i++) {
            summary.append(" ").append(i + 1).append("=").append(hand.get(i));
        }
        System.out.println(summary + " | Stock: " + game.getStockSize());
    }
}
