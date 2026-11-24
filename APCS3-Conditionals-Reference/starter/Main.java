public class Main {
    public static void main(String[] args) {
        System.out.println("9: " + status(9));
        System.out.println("10: " + status(10));
    }

    static String status(int reservations) {
        if (reservations < 10) {
            return "Seats available";
        } else if (reservations == 10) {
            return "Full";
        } else {
            if (reservations == 11) {
                return "One extra seat needed";
            }
            return "Multiple extra seats needed";
        }
    }
}
