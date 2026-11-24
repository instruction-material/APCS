import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class Deck {
    private final ArrayList<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = new ArrayList<>(cards);
    }

    public static Deck shuffled(Random random) {
        ArrayList<Card> stock = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (int rank = 1; rank <= 13; rank++) {
                stock.add(new Card(rank, suit));
            }
        }
        Collections.shuffle(stock, random);
        return new Deck(stock);
    }

    public int size() {
        return cards.size();
    }

    public Card draw() {
        return cards.remove(cards.size() - 1);
    }
}
