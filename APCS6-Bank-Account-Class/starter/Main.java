public class Main {
    public static void main(String[] args) {
        BankAccount first = new BankAccount("Fern");
        BankAccount second = new BankAccount("Moss", 100);
        System.out.println("Empty withdrawal: " + first.withdraw(10));
        System.out.println("Deposit: " + first.deposit(25));
        System.out.println("Withdrawal: " + first.withdraw(10));
        System.out.println("Rejected negative withdrawal: " + first.withdraw(-5));
        System.out.println("Fern balance: " + first.getBalance());
        System.out.println("Moss balance: " + second.getBalance());
        System.out.println("Bank total: " + BankAccount.getBankTotal());
        System.out.println("Account count: " + BankAccount.getNumAccounts());
    }
}
