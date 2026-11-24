# Card and Deck Classes

Build an ArrayList containing one card of every rank and suit. Draw without replacement and compare cards by rank, then by alphabetical suit for equal ranks.

Run the reference and use the checks to explain how it works. Compile with `javac Main.java Card.java Deck.java LuckGame.java`, then run `java Main` using JDK 17 or later.

Each new deck has 52 distinct cards. Draw all 52 once, then verify another draw returns `null`. An equal rank and suit ties the round. A round with either deck empty leaves both decks as they were.
