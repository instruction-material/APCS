public class Main {
    public static void main(String[] args) {
        Tower sender = new Tower(5);
        Tower matching = new Tower(5);
        Tower different = new Tower(2);
        Message original = new Message("Az za! 2");
        Message encoded = sender.transmit(original);
        System.out.println("Original: " + original);
        System.out.println("Encoded: " + encoded);
        System.out.println("Matching receiver: " + matching.receive(encoded));
        System.out.println("Different receiver: " + different.receive(encoded));
        System.out.println("Encoded remains: " + encoded);
    }
}
