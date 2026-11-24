# Vending machine class reference

Run `javac *.java && java Main`.

Keep three independent stock counts between 0 and 100 inclusive. A rejected change leaves the previous count in place.

Stock begins at 3 peanuts, 8 pretzels, and 20 candy. The two rejected candy changes, −1 and 101, leave it at 20. After five rounds, the counts are 0, 3, and 15. Check 0 and 100 as accepted quantities, and call vend while empty.
