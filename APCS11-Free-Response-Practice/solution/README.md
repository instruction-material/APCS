# ArrayList Practice: Delimiters

Given distinct opening and closing tokens, extract exact matches from a non-null array into a new list in the same order. A list is balanced when each closing token matches an earlier unmatched opening token and none remains open. The balance method receives a list containing only the two configured tokens.

Compare the reference against the prompt and explain each result.

Use JDK 17 or later. Compile with `javac Main.java Delimiters.java`, then run `java Main`.

## Checks

Two opening parentheses followed by two closing parentheses are balanced. A closing parenthesis followed by an opening parenthesis is not balanced even though the totals match. An empty delimiter list is balanced. Text containing part of a token is ignored.
