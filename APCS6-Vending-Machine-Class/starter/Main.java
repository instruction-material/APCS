public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.setPeanuts(3);
        machine.setPretzels(8);
        machine.setMAndMs(20);
        machine.setMAndMs(-1);
        machine.setMAndMs(101);
        printStock("Loaded", machine);
        for (int round = 0; round < 5; round++) {
            machine.vendPeanuts();
            machine.vendPretzels();
            machine.vendMAndMs();
        }
        printStock("After vending", machine);
    }

    private static void printStock(String label, VendingMachine machine) {
        System.out.println(label + ": " + machine.getPeanuts() + ", "
                + machine.getPretzels() + ", " + machine.getMAndMs());
    }
}
