/**
 * @brief Solve the lesson problem using the provided input and output format
 */
class Main {
    //Most questions refer to the Bank, CheckingAccount, or SavingAccount classes
    //The Class1 class is independent
    /**
	 * @brief Read input, compute the answer, and write output
	 *
	 * @param args Command-line arguments
	 */
    public static void main(String[] args) {
        BankAccount b = new BankAccount(1400);
        BankAccount s = new SavingsAccount(1000, .04);
        BankAccount c = new CheckingAccount(500);
    }
}
