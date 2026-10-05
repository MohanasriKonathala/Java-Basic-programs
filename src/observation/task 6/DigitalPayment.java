// Digital Payment System using Interface and Custom Exceptions

// Interface: defines common payment operations
interface PaymentService {

    // Makes a payment using the given UPI ID
    void pay(String upiId, double amount)
            throws InvalidUPIException, InvalidAmountException,
                   InsufficientBalanceException;

    // Returns the current wallet balance
    double checkBalance();
}


// Custom exception: thrown when wallet balance is insufficient
class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}


// Custom exception: thrown when UPI ID is invalid
class InvalidUPIException extends Exception {

    InvalidUPIException(String message) {
        super(message);
    }
}


// Custom exception: thrown for zero or negative amounts
class InvalidAmountException extends Exception {

    InvalidAmountException(String message) {
        super(message);
    }
}


// Wallet class: stores user details and money securely
class Wallet {

    // Private data members demonstrate encapsulation
    private String userName;
    private String mobileNumber;
    private String upiId;
    private double balance;

    // Constructor initializes the wallet
    Wallet(String name, String mobile, String upi, double balance) {
        this.userName = name;
        this.mobileNumber = mobile;
        this.upiId = upi;
        this.balance = balance;
    }

    // Adds money only when the amount is positive
    void addMoney(double amount) {
        if (amount > 0)
            balance += amount;
    }

    // Returns balance without directly exposing the variable
    double getBalance() {
        return balance;
    }

    // Deducts money after successful payment validation
    void deduct(double amount) {
        balance -= amount;
    }

    // Gives the wallet's registered UPI ID for validation
    String getUpiId() {
        return upiId;
    }

    // Displays complete wallet information
    void displayWalletDetails() {
        System.out.println("\n===== WALLET DETAILS =====");
        System.out.println("User Name  : " + userName);
        System.out.println("Mobile     : " + mobileNumber);
        System.out.println("UPI ID     : " + upiId);
        System.out.println("Balance    : ₹" + balance);
    }
}


// UPIPayment implements the PaymentService interface
class UPIPayment implements PaymentService {

    private Wallet wallet;

    // Connects the payment service with a wallet
    UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    // Validates UPI, amount and balance before payment
    @Override
    public void pay(String upiId, double amount)
            throws InvalidUPIException, InvalidAmountException,
                   InsufficientBalanceException {

        // UPI must contain '@' and match the wallet's registered UPI
        if (!upiId.contains("@") || !upiId.equals(wallet.getUpiId()))
            throw new InvalidUPIException("Invalid UPI ID!");

        // Payment amount must be greater than zero
        if (amount <= 0)
            throw new InvalidAmountException("Invalid payment amount!");

        // Payment is stopped when wallet balance is insufficient
        if (amount > wallet.getBalance())
            throw new InsufficientBalanceException(
                    "Insufficient wallet balance!");

        // Deduct money only after all validations succeed
        wallet.deduct(amount);

        System.out.println("Payment of ₹" + amount + " successful!");
    }

    // Returns the wallet's available balance
    @Override
    public double checkBalance() {
        return wallet.getBalance();
    }
}


// Main class: demonstrates the complete payment process
public class DigitalPayment {

    public static void main(String[] args) {

        // Creating a wallet with initial balance
        Wallet wallet = new Wallet(
                "Mohana",
                "9876543210",
                "mohana@upi",
                2000
        );

        // Connecting wallet with UPI payment service
        PaymentService payment = new UPIPayment(wallet);

        // Adding money to the wallet
        wallet.addMoney(1000);

        try {

            // Processing a valid UPI payment
            payment.pay("mohana@upi", 1500);

        } catch (InvalidUPIException |
                 InvalidAmountException |
                 InsufficientBalanceException e) {

            // Displays the reason when a transaction fails
            System.out.println("Transaction Failed: " + e.getMessage());

        } finally {

            // Executes whether payment succeeds or fails
            System.out.println("Transaction process completed.");
        }

        // Displaying final wallet information and balance
        wallet.displayWalletDetails();
        System.out.println("Final Balance : ₹" + payment.checkBalance());
    }
}
