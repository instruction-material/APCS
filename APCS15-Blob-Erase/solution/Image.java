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
        if (row < 0 || row >= cells.length || col < 0 || col >= cells[row].length
                || cells[row][col] != '#') {
            return;
        }
        cells[row][col] = '.';
        eraseBlob(row - 1, col);
        eraseBlob(row + 1, col);
        eraseBlob(row, col - 1);
        eraseBlob(row, col + 1);
    }
}
