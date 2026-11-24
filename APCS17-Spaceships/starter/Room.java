import java.util.ArrayList;

public class Room {
    private final ArrayList<Passenger> passengers = new ArrayList<>();

    public void addPassenger(Passenger item) {
        // Store a non-null item in this object's collection.
    }

    public boolean removePassenger(Passenger item) {
        // Return whether this collection contained the supplied object.
        return false;
    }

    public int size() {
        return passengers.size();
    }

    @Override
    public String toString() {
        return "Room (" + size() + "): " + passengers;
    }
}
