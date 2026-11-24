import java.util.List;
import java.util.Locale;

public final class Suit implements Comparable<Suit> {
    private static final List<String> ORDER = List.of("clubs", "spades", "hearts", "diamonds");
    private final int rank;

    public Suit(String name) {
        int found = ORDER.indexOf(name.toLowerCase(Locale.ROOT));
        if (found < 0) {
            throw new IllegalArgumentException("Unknown suit: " + name);
        }
        rank = found;
    }

    public String getType() {
        String name = ORDER.get(rank);
        return name.substring(0, 1).toUpperCase(Locale.ROOT) + name.substring(1);
    }

    public String getColor() {
        return rank < 2 ? "Black" : "Red";
    }

    @Override
    public int compareTo(Suit other) {
        return Integer.compare(rank, other.rank);
    }

    @Override
    public boolean equals(Object value) {
        return value instanceof Suit suit && rank == suit.rank;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(rank);
    }

    @Override
    public String toString() {
        return getType();
    }
}
