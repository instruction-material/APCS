import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        Spaceship first = new Spaceship();
        Spaceship second = new Spaceship();
        Room cabin = new Room();
        Room lab = new Room();
        Passenger passenger = new Passenger("Ada");
        cabin.addPassenger(passenger);
        cabin.addPassenger(new Passenger("Ada"));
        lab.addPassenger(new Passenger("Lin"));
        first.addRoom(cabin);
        second.addRoom(lab);
        fleet.addSpaceship(first);
        fleet.addSpaceship(second);
        System.out.println(fleet);
        System.out.println("Removed first passenger: " + cabin.removePassenger(passenger));
        System.out.println("Removed again: " + cabin.removePassenger(passenger));
        System.out.println(fleet);

        System.out.println("Seeded example: " + makeFleet(17));
    }

    public static Fleet makeFleet(int seed) {
        Random random = new Random(seed);
        Fleet fleet = new Fleet();
        for (int i = 0; i < 2; i++) {
            Spaceship ship = new Spaceship();
            int roomCount = 1 + random.nextInt(2);
            for (int j = 0; j < roomCount; j++) {
                Room room = new Room();
                int passengerCount = random.nextInt(4);
                for (int k = 0; k < passengerCount; k++) {
                    room.addPassenger(new Passenger("Guest " + (k + 1)));
                }
                ship.addRoom(room);
            }
            fleet.addSpaceship(ship);
        }
        return fleet;
    }
}
