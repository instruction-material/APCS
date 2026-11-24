# Deck Class

Wrap a supplied list in a Deck with its own storage. Use a comparable Suit value to make the suit hierarchy explicit. Keep the deck usable when a requested draw index is invalid.

Complete the TODOs before comparing results with the checks. Compile with `javac Main.java Card.java Deck.java Luck.java Suit.java`, then run `java Main` using JDK 17 or later.

Use ranks Ace (1) through King (13) and the order Clubs, Spades, Hearts, Diamonds from low to high. Clearing or adding to the supplied list must not change the deck. Out-of-range draws return `null` and leave the deck intact.
