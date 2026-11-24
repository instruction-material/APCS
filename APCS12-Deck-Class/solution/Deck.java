import java.util.ArrayList;

public class Deck {
    private final ArrayList<Card> cards;

    public Deck(ArrayList<Card> cards) {
        this.cards = new ArrayList<>(cards);
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
