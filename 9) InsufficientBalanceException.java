import java.util.Scanner;

// Custom exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// ATM class
class ATM {
    private double balance;

    ATM(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance! Available balance: ₹" + balance
            );
        }

        balance -= amount;
        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance: ₹" + balance);
    }
}

// Main class
public class ATMProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM(5000);

        System.out.print("Enter amount to withdraw: ₹");
        double amount = sc.nextDouble();

        try {
            atm.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }

        sc.close();
    }
}
