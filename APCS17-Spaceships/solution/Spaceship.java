import java.util.ArrayList;

public class Spaceship {
    private final ArrayList<Room> rooms = new ArrayList<>();

    public void addRoom(Room item) {
        if (item != null) {
            rooms.add(item);
        }
    }

    public boolean removeRoom(Room item) {
        return rooms.remove(item);
    }

    public int size() {
        return rooms.size();
    }

    @Override
    public String toString() {
        return "Spaceship (" + size() + "): " + rooms;
    }
}
