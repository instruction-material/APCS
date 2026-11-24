import java.time.LocalDate;
import java.time.Year;

public class APCalendar {
    public static int numberOfLeapYears(int first, int last) {
        int count = 0;
        // TODO: Count leap years, including both limits.
        return count;
    }

    public static int dayOfWeek(int month, int day, int year) {
        // TODO: Offset the weekday of January 1, then wrap after Saturday.
        return 0;
    }

    private static boolean isLeapYear(int year) {
        return Year.isLeap(year);
    }

    private static int firstDayOfYear(int year) {
        return LocalDate.of(year, 1, 1).getDayOfWeek().getValue() % 7;
    }

    private static int dayOfYear(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfYear();
    }
}
