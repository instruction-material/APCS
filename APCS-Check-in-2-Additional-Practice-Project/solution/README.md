# Animal Kingdom

Run the reference and compare the calls in Main with the checks below.

Model three selected classification levels. Animal stores the name and supplies
Animalia. Mammal extends Animal and appends Mammalia. Primate extends Mammal
and appends Primates. Use super.classification() to reuse the preceding levels.
Keep describe() in Animal so one method formats all three kinds.

Run from the project directory with JDK 17 or later.

```sh
javac Main.java Animal.java Mammal.java Primate.java
java Main
```

## Checks

```text
Robin: Animalia
Seal: Animalia > Mammalia
Orangutan: Animalia > Mammalia > Primates
```

Create a second Primate with a different name. Its name changes and its
classification remains Animalia > Mammalia > Primates.
