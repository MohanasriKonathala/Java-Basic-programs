class Account {

    int accountNumber;
    String accountHolder;
    double balance;

    Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }
}

class SavingsAccount extends Account {

    double interestRate = 5;

    SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest = " + interest);
    }
}

class CurrentAccount extends Account {

    double overdraftLimit = 10000;

    CurrentAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(101, "Rahul", 50000);

        s.deposit(5000);
        s.withdraw(2000);
        s.displayDetails();
        s.calculateInterest();

        CurrentAccount c = new CurrentAccount(102, "Anjali", 30000);

        c.deposit(4000);
        c.withdraw(1000);
        c.displayDetails();
    }
}
