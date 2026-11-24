# Spaceship fleet reference

Run `javac *.java && java Main`.

Give each class one responsibility. Fleet contains ships, Spaceship contains rooms, Room contains passengers, and Passenger stores a name. Each collection belongs to the object that contains it.

Start with Main's two ships and three passengers. Two passengers can share a name and still be distinct objects. Preview the record after each add, then remove the stored object once and check that removing it a second time returns false. Ignore null additions. For the last checkpoint, construct and print a small seeded fleet whose counts can be predicted or checked.
