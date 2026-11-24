public class Main {
    public static void main(String[] args) {
        Time clock = new Time(10, 15, 20);
        System.out.println("Initial: " + clock);
        clock.setHours(11);
        clock.setMins(25);
        clock.setSecs(30);
        System.out.println("After valid setters: " + clock);
        clock.setHours(24);
        clock.setMins(-1);
        clock.setSecs(60);
        System.out.println("After invalid setters: " + clock);
        System.out.println("Invalid reset: " + clock.resetTime(9, 80, 0));
        System.out.println("After invalid reset: " + clock);
        Time endOfDay = new Time(23, 59, 59);
        endOfDay.increment();
        System.out.println("After midnight: " + endOfDay);
    }
}
