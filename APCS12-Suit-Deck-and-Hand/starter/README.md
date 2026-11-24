# Suit, Deck, and Hand

A suit holds thirteen cards in rank order, a deck holds all 52 cards, and a hand keeps its cards in insertion order. Follow the two transfers in Main.

1. In Suit.remove, return and remove the card at the supplied zero-based index. An out-of-range index returns null and preserves the suit.
2. In Deck.removeRandom, choose an index within the current list and remove that card. An empty deck returns null.
3. In Hand.removeFirst, remove the earliest remaining card. An empty hand returns null.

Compile with JDK 17 or later using `javac Main.java Card.java Deck.java Hand.java Suit.java` and run `java Main`. The completed sample selects the 6 of Clubs, leaves 12 cards in the suit and 51 in the deck, builds a two-card hand, and removes the 6 of Clubs first. Run again to confirm these checks hold for different random draws.
