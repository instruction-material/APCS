class Main {
    public static void main(String[] args) {
        Farm farm = new Farm(2, 1);
        Farm neighbor = new Farm(0, 1);
        System.out.println("Feed cows: " + farm.feedCows());
        System.out.println("Feed cows again: " + farm.feedCows());
        System.out.println("Feed goat: " + farm.feedGoats());
        System.out.println("Feed goat again: " + farm.feedGoats());
        System.out.println("Sell goat: " + farm.sellGoat());
        System.out.println("Sell goat again: " + farm.sellGoat());
        System.out.println("Goats remaining: " + farm.getNumGoats());
        System.out.println("Neighbor's goats: " + neighbor.getNumGoats());
        System.out.println("Neighbor's goats fed: " + neighbor.getGoatsFed());
    }
}
