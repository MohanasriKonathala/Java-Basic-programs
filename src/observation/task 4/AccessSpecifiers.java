class Student
{
    // Public variable
    public String name = "Ravi";

    // Private variable
    private int marks = 90;

    // Protected variable
    protected String branch = "CSE";

    // Default variable
    String college = "ABC College";

    // Public method to access private variable
    public void showPrivateData()
    {
        System.out.println("Private Marks = " + marks);
    }
}

public class AccessSpecifierDemo
{
    public static void main(String[] args)
    {
        Student s = new Student();

        // Accessing public member
        System.out.println("Public Name = " + s.name);

        // Accessing protected member
        System.out.println("Protected Branch = " + s.branch);

        // Accessing default member
        System.out.println("Default College = " + s.college);

        // Accessing private member through method
        s.showPrivateData();
    }
}
