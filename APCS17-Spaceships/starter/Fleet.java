import java.util.ArrayList;

public class Fleet {
    private final ArrayList<Spaceship> ships = new ArrayList<>();

    public void addSpaceship(Spaceship item) {
        // Store a non-null item in this object's collection.
    }

    public boolean removeSpaceship(Spaceship item) {
        // Return whether this collection contained the supplied object.
        return false;
    }

    public int size() {
        return ships.size();
    }

    @Override
    public String toString() {
        return "Fleet (" + size() + "): " + ships;
    }
}
