# Elevens Card-State Project

Deal up to nine cards. Select two cards whose ranks sum to eleven, or select one jack, one queen, and one king. Ace is 1, jack 11, queen 12, and king 13. Suits have no effect on move legality. Select distinct displayed slots. Remove matching cards and refill when stock remains. Win when the stock and hand are empty. Stop with no move when a nonempty hand contains no legal selection.

Complete the marked tasks before comparing with the reference.

Compile with `javac Main.java Card.java Deck.java Elevens.java Suit.java` on JDK 17 or later, then run `java Main`.

## Checks

Run `java Main --demo` for a five-card hand. Enter `4 5` to remove the 6 and 5. Then enter `1 2 3` to remove king, queen and jack. A move such as `4 4`, a nonexistent slot, or invalid text must not change a card. Type `quit` to finish early.
