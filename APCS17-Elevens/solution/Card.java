import java.util.Objects;

public final class Card {
    private final int rank;
    private final Suit suit;

    public Card(int rank, Suit suit) {
        if (rank < 1 || rank > 13) {
            throw new IllegalArgumentException("Rank must be 1 through 13.");
        }
        this.rank = rank;
        this.suit = Objects.requireNonNull(suit);
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank + " " + suit;
    }
}
