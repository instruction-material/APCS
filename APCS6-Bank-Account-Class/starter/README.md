# Bank Account Class starter

Run `javac Main.java BankAccount.java && java Main` from this folder.

Open both Java files. The constructors create two independent accounts and update the shared total. Implement deposit and withdrawal. Reject zero, negative, non-finite, and excessive withdrawals before updating. Use the supplied amount predicate and reject a deposit if the new bank total would overflow.

Balances use `BigDecimal` for exact decimal arithmetic. Its `add` and `subtract` methods return new values, and `compareTo` is positive when the first value is larger. The display getters return `double` for the supplied console examples.
