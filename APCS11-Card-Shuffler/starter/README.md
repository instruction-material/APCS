# Card Shuffler

Start with the thirteen hearts in rank order. Build a new list by repeatedly choosing a random index from the remaining cards, removing that card, and appending it to the result. The original list passed to shuffle should keep its order. Copy it into a working list first.

Use Random.nextInt(remaining.size()) only while the working list has cards. After each draw, its size plus the result size should still equal the input size. Independent runs can give the same ordering. Look for all thirteen different hearts exactly once rather than expecting a particular first card. Also try an empty list and a single card.

Download and extract the ZIP. Run `javac Main.java Card.java` then `java Main`. The starter prints the original suit and an empty result until the draw loop is completed.
