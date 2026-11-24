import java.util.ArrayList;

public class Spaceship {
    private final ArrayList<Room> rooms = new ArrayList<>();

    public void addRoom(Room item) {
        // Store a non-null item in this object's collection.
    }

    public boolean removeRoom(Room item) {
        // Return whether this collection contained the supplied object.
        return false;
    }

    public int size() {
        return rooms.size();
    }

    @Override
    public String toString() {
        return "Spaceship (" + size() + "): " + rooms;
    }
}
