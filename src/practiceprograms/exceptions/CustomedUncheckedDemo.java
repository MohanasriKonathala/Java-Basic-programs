class BalanceException extends RuntimeException
{
    BalanceException(String message)
    {
        super(message);
    }
}

public class CustomUncheckedDemo
{
    public static void main(String[] args)
    {
        double balance = 500;
        double amount = 800;

        try
        {
            if (amount > balance)
            {
                throw new BalanceException(
                    "Insufficient balance."
                );
            }

            System.out.println("Transaction successful.");
        }
        catch (BalanceException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
