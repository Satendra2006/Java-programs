import java.util.Scanner;

class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String message) {
        super(message);
    }
}

class Account {
    String name;
    int acc_no;
    double balance;

    Account(String name, int acc_no, double balance) {
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Amount deposited successfully. Current balance: " + balance);
    }

    void withdraw(double amt) throws MinimumBalanceException {
        if (balance - amt < 500) {
            throw new MinimumBalanceException("Withdrawal denied. Minimum balance of 500 must be maintained.");
        } else {
            balance -= amt;
            System.out.println("Amount withdrawn successfully. Current balance: " + balance);
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        int acc_no = sc.nextInt();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        Account acc = new Account(name, acc_no, balance);

        System.out.print("Enter amount to deposit: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);

        System.out.print("Enter amount to withdraw: ");
        double wd = sc.nextDouble();

        try {
            acc.withdraw(wd);
        } catch (MinimumBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}