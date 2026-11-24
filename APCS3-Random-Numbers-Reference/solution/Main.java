public class Main {
    public static void main(String[] args) {
        System.out.println("0 through 9, first: " + fromDraw(0.0, 0, 9));
        System.out.println("1 through 10, last: " + fromDraw(0.9999, 1, 10));
        System.out.println("99 through 199, first: " + fromDraw(0.0, 99, 199));
        System.out.println("99 through 199, last: " + fromDraw(0.9999, 99, 199));
    }

    static int fromDraw(double draw, int low, int high) {
        int count = high - low + 1;
        return low + (int) (draw * count);
    }

    static int randomInRange(int low, int high) {
        return fromDraw(Math.random(), low, high);
    }
}
