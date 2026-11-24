import java.util.ArrayList;

public class Fleet {
    private final ArrayList<Spaceship> ships = new ArrayList<>();

    public void addSpaceship(Spaceship item) {
        if (item != null) {
            ships.add(item);
        }
    }

    public boolean removeSpaceship(Spaceship item) {
        return ships.remove(item);
    }

    public int size() {
        return ships.size();
    }

    @Override
    public String toString() {
        return "Fleet (" + size() + "): " + ships;
    }
}
