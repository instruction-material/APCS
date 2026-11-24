import java.util.ArrayList;

public class Deck {
    private final ArrayList<Card> cards;

    public Deck(ArrayList<Card> cards) {
        // TODO: Give the deck independent storage for the supplied cards.
        this.cards = cards;
    }

    public int size() {
        return cards.size();
    }

    public Card remove(int index) {
        if (index < 0 || index >= cards.size()) {
            return null;
        }
        return cards.remove(index);
    }
}
