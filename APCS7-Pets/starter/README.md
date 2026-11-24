# Pet Class and More Pets

Run the sample and keep its inputs. Complete the marked methods, then compare the result with the checks.

1. Keep the name and age in Pet. Trace the Dog constructor through super().
   Override Dog's kind(), food(), and play() to produce the first row.
2. Continue in the same project for More Pets. Override the corresponding
   methods of Cat and Fish to produce the last two rows.
3. Trace the calls in Main. The Pet reference uses the same describe() method
   for each object. Inside describe(), kind() runs the subclass override.

Run from the project directory with JDK 17 or later.

```sh
javac Main.java Pet.java Dog.java Cat.java Fish.java
java Main
```

## Checks

```text
Maple (4) is a dog. Food: kibble. Maple plays fetch.
Moss (2) is a cat. Food: cat food. Moss chases a toy.
Bubbles (1) is a fish. Food: flakes. Bubbles swims past a hoop.
```

Change the name or age in one constructor call. Only that object's output
changes. Keep the age and name fields in Pet.
