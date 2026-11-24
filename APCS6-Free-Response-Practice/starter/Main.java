public class Main {
    public static void main(String[] args) {
        System.out.println("Leap years 1999–2004: " + APCalendar.numberOfLeapYears(1999, 2004));
        System.out.println("Leap years in 1900: " + APCalendar.numberOfLeapYears(1900, 1900));
        System.out.println("2024-01-01: " + APCalendar.dayOfWeek(1, 1, 2024));
        System.out.println("2024-02-29: " + APCalendar.dayOfWeek(2, 29, 2024));
    }
}
