# Blob erase reference

Run `javac Main.java Image.java && java Main`. The branching region on the left disappears and the separate two-cell region on the right remains.

The guard checks bounds before indexing the cell. Each recursive visit changes a filled cell to a dot before visiting neighbors. This lets later visits stop on a cell that has already been erased.
