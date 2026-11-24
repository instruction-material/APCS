public class Main {
    public static void main(String[] args) {
        Suit suit = new Suit("Clubs");
        Deck deck = new Deck();
        Hand hand = new Hand();

        Card selected = suit.remove(5);
        System.out.println("Selected: " + selected);
        if (selected != null) {
            hand.addCard(selected);
        }
        Card drawn = deck.removeRandom();
        if (drawn != null) {
            hand.addCard(drawn);
        }

        System.out.println("Cards left in suit: " + suit.size());
        System.out.println("Cards left in deck: " + deck.size());
        System.out.println("Hand size: " + hand.size());
        System.out.println("First card: " + hand.removeFirst());
    }
}
