import java.util.ArrayList;

public class Room {
    private final ArrayList<Passenger> passengers = new ArrayList<>();

    public void addPassenger(Passenger item) {
        if (item != null) {
            passengers.add(item);
        }
    }

    public boolean removePassenger(Passenger item) {
        return passengers.remove(item);
    }

    public int size() {
        return passengers.size();
    }

    @Override
    public String toString() {
        return "Room (" + size() + "): " + passengers;
    }
}
