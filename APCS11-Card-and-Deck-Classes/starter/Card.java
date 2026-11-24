public class Card {
    private final String suit;
    private final int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public boolean greaterThan(Card other) {
        if (value == other.value) {
            // TODO: Break equal-rank ties by comparing suit names.
            return false;
        }
        return value > other.value;
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public String getColor() {
        return suit.equals("Clubs") || suit.equals("Spades") ? "Black" : "Red";
    }

    @Override
    public String toString() {
        String rank = switch (value) {
            case 1 -> "Ace";
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            default -> Integer.toString(value);
        };
        return rank + " of " + suit;
    }
}
