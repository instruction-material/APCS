# Reading a gate log

The file `gates.txt` records observations in order. Each observation is either `open` or `closed`, in lowercase. Spaces and line breaks separate observations. An empty file contains zero observations. An unrecognized word invalidates the whole log.

Complete `GateLog.countOpen(Scanner input)`. The loop reads one token per iteration and already rejects an invalid token by returning -1. Count only the open observations. Main opens the file, reports the result, and closes the scanner. Run from the extracted project folder with `javac Main.java GateLog.java` and then `java Main`.

The supplied log has three open observations. Try a file containing only `closed`, an empty file, and `open unknown open`. Expect zero, zero, and `Invalid observation.` respectively. To check the file precondition, rename gates.txt temporarily. Java reports that the file could not be opened. Restore its name and compare this with a present but empty file.
