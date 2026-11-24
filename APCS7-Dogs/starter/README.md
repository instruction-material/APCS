# Pet Special Methods

Run the sample and keep its inputs. Complete the marked methods, then compare the result with the checks.

Trace the constructor chain for MiniPoodle. Dog supplies bark() and chooses
the sound's case from the size: lower case below 15, upper case at 15 and
above. Extend the check-in message in Poodle by calling super.checkIn().
Pug overrides play() and reuses bark() to add three sounds to its tug message.

Run from the project directory with JDK 17 or later.

```sh
javac Main.java Dog.java Poodle.java MiniPoodle.java Pug.java
java Main
```

## Checks

Juniper barks WOOF at size 15. Pepper barks BOOF at size 20 and Pixel barks
boof at size 10. Both poodles append " Stays with the group." to the
check-in message. Pip barks snorfle and prints the following play line.

```text
Pip plays tug. snorfle snorfle snorfle
```
