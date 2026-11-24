import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private final ArrayList<Card> cards = new ArrayList<>();
    private final Random random;

    public Deck() {
        this(new Random());
    }

    public Deck(Random random) {
        this.random = random;
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        for (String suit : suits) {
            for (int rank = 1; rank <= 13; rank++) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public int size() {
        return cards.size();
    }

    public Card removeRandom() {
        if (cards.isEmpty()) {
            return null;
        }
        // TODO: Choose and remove one card at a valid random index.
        return null;
    }
}
