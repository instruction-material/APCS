public class Card {
    private final Suit suit;
    private final int number;

    public Card(String suit, int number) {
        if (number < 1 || number > 13) {
            throw new IllegalArgumentException("Card ranks are 1 through 13.");
        }
        this.suit = new Suit(suit);
        this.number = number;
    }

    public int greaterThan(Card other) {
        if (number == other.number) {
            return suit.compareTo(other.suit);
        }
        return Integer.compare(number, other.number);
    }

    @Override
    public String toString() {
        return number + " of " + suit;
    }
}
