# Blob erase starter

Run `javac Main.java Image.java && java Main`. A hash represents a filled cell and a dot represents an empty cell. The before and after grids match until you implement `eraseBlob`.

Use zero-based row and column coordinates. Stop outside the grid or at an empty cell. Erase the current cell before recursively visiting up, down, left, and right. The new dot acts as the visited marker.

From the given start at `(0, 0)`, the resulting rows are `....#`, `....#`, and `.....`. Starting on a dot or outside the grid leaves it unchanged. Try a separate grid with `#.` and `.#`. Erasing `(0, 0)` leaves the diagonally adjacent cell filled.
