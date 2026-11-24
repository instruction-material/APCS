public class Main {
    public static void main(String[] args) {
        Counter standard = new Counter(4);
        Counter custom = new Counter(10, 3);
        System.out.println("Standard start: " + standard.value());
        System.out.println("Custom start: " + custom.value());
        custom.advance();
        System.out.println("Custom after one step: " + custom.value());
        System.out.println("Standard after custom changes: " + standard.value());
    }
}
