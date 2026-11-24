import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Card> supplied = new ArrayList<>();
        supplied.add(new Card("clubs", 12));
        supplied.add(new Card("diamonds", 12));
        Deck deck = new Deck(supplied);

        System.out.println("After construction: " + deck.size());
        supplied.clear();
        System.out.println("After caller clears its list: " + deck.size());
        System.out.println("Invalid index: " + deck.remove(-1));
        System.out.println("First card: " + deck.remove(0));
        System.out.println("Diamond ranks above club: "
            + (new Suit("Diamonds").compareTo(new Suit("Clubs")) > 0));
    }
}
