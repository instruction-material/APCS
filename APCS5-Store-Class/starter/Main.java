public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        System.out.println("Initial pears: " + store.quantity("pear"));
        System.out.println("Buy five pears: " + store.buy("pear", 5));
        System.out.println("Pears left: " + store.quantity("pear"));
        System.out.println("Buy too many pears: " + store.buy("pear", 96));
        System.out.println("Buy a negative quantity: " + store.buy("pear", -1));
        System.out.println("Buy unknown item: " + store.buy("x", 2));
        System.out.println("Pears after rejected orders: " + store.quantity("pear"));
        System.out.println("Buy remaining apples: " + store.buy("apple", 20));
        System.out.println("Apples left: " + store.quantity("apple"));
        System.out.println("Buy one hose: " + store.buy("hose", 1));
        System.out.println("Hoses left: " + store.quantity("hose"));
    }
}
