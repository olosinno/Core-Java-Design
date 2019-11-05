public class Assertion_Test {
// Run main method using terminal syntax java -ea [main class name] to check assertions
    public static void main(String[] args) {
		System.out.println(withdraw(-1000));
	}

	public static double deposit(double amount) {
		double balance = 10000;
		double oldBalance = balance;
        balance += amount;
        /* Enclosed boolean expression represents condition that must be true if
        code is working correctly; If false, an Assertion Error (Error subclass) is thrown */
		assert (balance > oldBalance) : "Error, balance did not increase";
		return balance;
	}

	public static double withdraw (double amount) {
		double balance = 10000;
		double oldBalance = balance;
		balance -= amount;
		assert balance < oldBalance : "Error, balance did not decrease";
		return balance;
	}
}
