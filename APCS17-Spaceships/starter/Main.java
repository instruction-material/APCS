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

        // Add a call to a seeded fleet generator after the fixed example passes.
    }
}
