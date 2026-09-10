import java.io.IOException;

public class ThrowsDemo
{
    static void readData() throws IOException
    {
        throw new IOException("Unable to read the data.");
    }

    public static void main(String[] args)
    {
        try
        {
            readData();
        }
        catch (IOException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
