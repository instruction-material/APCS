public final class Time {
    private int hrs;
    private int mins;
    private int secs;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hours, int minutes, int seconds) {
        if (!resetTime(hours, minutes, seconds)) {
            throw new IllegalArgumentException("Invalid time");
        }
    }

    public boolean resetTime(int hours, int minutes, int seconds) {
        if (!inRange(hours, 24) || !inRange(minutes, 60) || !inRange(seconds, 60)) {
            return false;
        }
        hrs = hours;
        mins = minutes;
        secs = seconds;
        return true;
    }

    public int getHours() {
        return hrs;
    }

    public int getMins() {
        return mins;
    }

    public int getSecs() {
        return secs;
    }

    public void setHours(int hours) {
        if (inRange(hours, 24)) {
            hrs = hours;
        }
    }

    public void setMins(int minutes) {
        // Guard the minute range before writing to mins.
    }

    public void setSecs(int seconds) {
        // Guard the second range before writing to secs.
    }

    public void increment() {
        int next = (secondsSinceMidnight() + 1) % 86400;
        resetTime(next / 3600, next / 60 % 60, next % 60);
    }

    public boolean sameTime(Time other) {
        return other != null && secondsSinceMidnight() == other.secondsSinceMidnight();
    }

    public boolean lessThan(Time other) {
        return secondsSinceMidnight() < other.secondsSinceMidnight();
    }

    @Override
    public String toString() {
        return String.format(java.util.Locale.ROOT, "%02d:%02d:%02d", hrs, mins, secs);
    }

    private int secondsSinceMidnight() {
        return 3600 * hrs + 60 * mins + secs;
    }

    private static boolean inRange(int value, int limit) {
        return value >= 0 && value < limit;
    }
}
