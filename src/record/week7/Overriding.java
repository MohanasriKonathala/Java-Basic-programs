import java.util.Scanner;

// Customer class
class Customer
{
    String name;
    int customerId;

    // Constructor
    Customer(String name, int customerId)
    {
        this.name = name;
        this.customerId = customerId;
    }

    // Display customer details
    void displayCustomer()
    {
        System.out.println("Customer Name : " + name);
        System.out.println("Customer ID   : " + customerId);
    }
}


// Account class
class Account
{
    int accountNumber;
    double balance;

    // Constructor
    Account(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Display account details
    void displayAccount()
    {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
    }
}


// RBI is the Base Class
class RBI
{
    // Minimum interest rate fixed by RBI
    double getRateOfInterest()
    {
        return 4.0;
    }
}


// SBI inherits RBI
class SBI extends RBI
{
    // SBI provides its own interest rate
    @Override
    double getRateOfInterest()
    {
        return 7.0;
    }
}


// ICICI inherits RBI
class ICICI extends RBI
{
    // ICICI provides its own interest rate
    @Override
    double getRateOfInterest()
    {
        return 6.5;
    }
}


// PNB inherits RBI
class PNB extends RBI
{
    // PNB provides its own interest rate
    @Override
    double getRateOfInterest()
    {
        return 6.0;
    }
}


// Main class
public class BankDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Taking bank name from user
        System.out.print("Enter the Bank name to find the rate of Interest : ");
        String bankName = sc.nextLine();

        // RBI reference variable
        RBI rbi;

        // Dynamic polymorphism
        // The RBI reference can refer to different child objects
        if(bankName.equalsIgnoreCase("RBI"))
        {
            rbi = new RBI();
        }
        else if(bankName.equalsIgnoreCase("SBI"))
        {
            rbi = new SBI();
        }
        else if(bankName.equalsIgnoreCase("ICICI"))
        {
            rbi = new ICICI();
        }
        else if(bankName.equalsIgnoreCase("PNB"))
        {
            rbi = new PNB();
        }
        else
        {
            System.out.println("Invalid Bank Name");
            sc.close();
            return;
        }

        // Calling overridden method
        // Method is decided at runtime based on the object
        System.out.println("RBI rate of interest is : "
                           + rbi.getRateOfInterest() + "%");

        sc.close();
    }
}
