public class Main {
    public static void main(String[] args) {
        SupplyBin bin = new SupplyBin(5, 2);
        SupplyBin alias = bin;
        SupplyBin separate = new SupplyBin(5, 2);
        System.out.println("Fill: " + bin.add(3));
        System.out.println("Overfill: " + bin.add(1));
        System.out.println("Take four: " + bin.take(4));
        System.out.println("Alias sees: " + alias.getQuantity());
        System.out.println("Separate sees: " + separate.getQuantity());
    }
}
