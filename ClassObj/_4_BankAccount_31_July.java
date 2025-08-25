package ClassObj;

class BankAccount {
    String accountHolderName;
    int accountNumber;
    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void showDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class _4_BankAccount_31_July {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountHolderName = "Pooja";
        acc.accountNumber = 1234;
        acc.balance = 2345;

        acc.deposit(567);     // 2345 + 567 = 2912
        acc.withdraw(200);    // 2912 - 200 = 2712
        acc.showDetails();    // final balance: 2712
    }
}
