import java.util.StringJoiner;

class Image {
    private final char[][] cells;

    Image(String... rows) {
        cells = new char[rows.length][];
        for (int row = 0; row < rows.length; row++) {
            cells[row] = rows[row].toCharArray();
        }
    }

    String render() {
        StringJoiner rows = new StringJoiner("\n");
        for (char[] row : cells) {
            rows.add(new String(row));
        }
        return rows.toString();
    }

    public void eraseBlob(int row, int col) {
        // Stop for invalid coordinates or an empty cell.
        // Erase a filled cell before visiting its four neighbors.
    }
}
