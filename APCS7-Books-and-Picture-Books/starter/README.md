# Book and PictureBook

Run the sample and keep its inputs. Complete the marked methods, then compare the result with the checks.

Trace title, author, and page from PictureBook's constructor through super()
into Book. Keep the illustrator in PictureBook. Extend the inherited
description with ", illustrated by " and the illustrator's name. Implement
hasSameIllustrator by comparing the two names by value.

Run from the project directory with JDK 17 or later.

```sh
javac Main.java Book.java PictureBook.java
java Main
```

## Checks

```text
Harbor Notes by Asha Lee (page 12)
Bright Boats by Asha Lee (page 5), illustrated by Sam Ortiz
Same author: true
Same illustrator: true
Same illustrator: false
```

Call the inherited author comparison on books with different authors. It
returns false. A picture book that starts on page 0 retains page 0.
