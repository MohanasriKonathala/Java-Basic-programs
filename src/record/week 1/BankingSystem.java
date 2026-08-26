// Parent class
class Account
{
    // Data members of Account class
    int accountNumber;
    String accountHolder;
    double balance;

    // Constructor of Account class
    Account(int accountNumber, String accountHolder, double balance)
    {
        // Assigning parameter values to instance variables
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount)
    {
        // Adding the deposited amount to balance
        balance += amount;
    }

    // Method to withdraw money
    void withdraw(double amount)
    {
        // Subtracting the withdrawn amount from balance
        balance -= amount;
    }

    // Method to display account details
    void displayDetails()
    {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }
}

// SavingsAccount inherits Account
class SavingsAccount extends Account
{
    // Interest rate for savings account
    double interestRate = 5;

    // Constructor of SavingsAccount
    SavingsAccount(int accountNumber, String accountHolder, double balance)
    {
        // Calling the constructor of parent class Account
        super(accountNumber, accountHolder, balance);
    }

    // Method to calculate interest
    void calculateInterest()
    {
        // Calculating interest
        double interest = (balance * interestRate) / 100;

        // Displaying the interest
        System.out.println("Interest = " + interest);
    }
}

// CurrentAccount inherits Account
class CurrentAccount extends Account
{
    // Maximum overdraft limit
    double overdraftLimit = 10000;

    // Constructor of CurrentAccount
    CurrentAccount(int accountNumber, String accountHolder, double balance)
    {
        // Calling the constructor of parent class Account
        super(accountNumber, accountHolder, balance);
    }
}

// Main class
public class BankingSystem
{
    public static void main(String[] args)
    {
        // Creating a SavingsAccount object
        SavingsAccount s =
            new SavingsAccount(101, "Rahul", 50000);

        // Depositing 5000 into savings account
        s.deposit(5000);

        // Withdrawing 2000 from savings account
        s.withdraw(2000);

        // Displaying savings account details
        s.displayDetails();

        // Calculating and displaying interest
        s.calculateInterest();

        // Creating a CurrentAccount object
        CurrentAccount c =
            new CurrentAccount(102, "Anjali", 30000);

        // Depositing 4000 into current account
        c.deposit(4000);

        // Withdrawing 1000 from current account
        c.withdraw(1000);

        // Displaying current account details
        c.displayDetails();
    }
}
