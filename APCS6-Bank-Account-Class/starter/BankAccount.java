import java.math.BigDecimal;

public class BankAccount {
    private static final BigDecimal MAX_TOTAL = BigDecimal.valueOf(Double.MAX_VALUE);
    private static int numAccounts;
    private static BigDecimal bankTotal = BigDecimal.ZERO;
    private static double interestRate = 0.07;

    private final String name;
    private BigDecimal balance;

    public BankAccount(String name) {
        this(name, 0);
    }

    public BankAccount(String name, double openingBalance) {
        if (!Double.isFinite(openingBalance) || openingBalance < 0) {
            throw new IllegalArgumentException("Invalid opening balance");
        }
        BigDecimal opening = BigDecimal.valueOf(openingBalance);
        BigDecimal total = bankTotal.add(opening);
        if (total.compareTo(MAX_TOTAL) > 0) {
            throw new IllegalArgumentException("Invalid bank total");
        }
        this.name = name;
        balance = opening;
        bankTotal = total;
        numAccounts++;
    }

    public boolean deposit(double amount) {
        // Convert a valid amount and delegate to credit.
        return false;
    }

    public boolean deposit(int numberOfBills, double valuePerBill) {
        if (numberOfBills <= 0 || !validAmount(valuePerBill)) {
            return false;
        }
        return credit(BigDecimal.valueOf(valuePerBill).multiply(BigDecimal.valueOf(numberOfBills)));
    }

    public boolean withdraw(double amount) {
        // Reject an invalid amount or insufficient funds before updating.
        return false;
    }

    public boolean withdraw() {
        if (balance.signum() == 0) {
            return false;
        }
        bankTotal = bankTotal.subtract(balance);
        balance = BigDecimal.ZERO;
        return true;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance.doubleValue();
    }

    public static int getNumAccounts() {
        return numAccounts;
    }

    public static double getBankTotal() {
        return bankTotal.doubleValue();
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double rate) {
        if (Double.isFinite(rate) && rate >= 0 && rate <= 1) {
            interestRate = rate;
        }
    }

    private boolean credit(BigDecimal amount) {
        BigDecimal total = bankTotal.add(amount);
        if (total.compareTo(MAX_TOTAL) > 0) {
            return false;
        }
        balance = balance.add(amount);
        bankTotal = total;
        return true;
    }

    private static boolean validAmount(double amount) {
        return Double.isFinite(amount) && amount > 0;
    }
}
