# Bank Account Class worked reference

Run `javac Main.java BankAccount.java && java Main` from this folder.

A deposit of 25 and withdrawal of 10 leave Fern with 15 and Moss with 100. The shared total is 115 across two accounts. Rejected operations leave both the balance and shared total unchanged.

Balances use `BigDecimal` for exact decimal arithmetic. Its `add` and `subtract` methods return new values, and `compareTo` is positive when the first value is larger. The display getters return `double` for the supplied console examples.
