package tasks;

import java.util.Scanner;

// Main class
public class StudentUtilityProgram
{
    // Method to calculate factorial of a number
    int factorial(int g)
    {
        int fact = 1;

        // Loop from 1 to g
        for(int i = 1; i <= g; i++)
        {
            fact = fact * i;
        }

        // Return the factorial value
        return fact;
    }

    // Method to calculate area of a circle
    double areaOfCircle(double radius)
    {
        // Formula: Area = π × r × r
        return 3.14 * radius * radius;
    }

    // Method to check whether a number is prime
    boolean isPrime(int j)
    {
        // Numbers less than or equal to 1 are not prime
        if(j <= 1)
        {
            return false;
        }

        // Check divisibility from 2 to j/2
        for(int i = 2; i <= j / 2; i++)
        {
            // If j is divisible by i, it is not prime
            if(j % i == 0)
            {
                return false;
            }
        }

        // If no divisor is found, the number is prime
        return true;
    }

    // Method to find maximum of two numbers
    int maximum(int a, int b)
    {
        // Check whether a is greater than b
        if(a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    // Main method
    public static void main(String[] args)
    {
        // Creating an object of StudentUtilityProgram
        // This object is used to call the methods
        StudentUtilityProgram su = new StudentUtilityProgram();

        // Creating Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Variable to store user's menu choice
        int choice;

        // do-while loop displays the menu at least once
        do
        {
            // Displaying the menu
            System.out.println("\n===== STUDENT UTILITY PROGRAM =====");
            System.out.println("1. Student Information");
            System.out.println("2. Even or Odd");
            System.out.println("3. Largest of Three Numbers");
            System.out.println("4. Grade");
            System.out.println("5. Day of Week");
            System.out.println("6. numbers from 1toN");
            System.out.println("7. sum of n natural numbers");
            System.out.println("8. multiplication table");
            System.out.println("9. fibonacci");
            System.out.println("10. Factorial");
            System.out.println("11. Prime Number");
            System.out.println("12. Maximum of Two Numbers");
            System.out.println("13. Area of Circle");
            System.out.println("14. Exit");

            // Asking the user to enter a choice
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            // switch is used to execute the selected operation
            switch(choice)
            {
                // ---------------- CASE 1 ----------------
                case 1:

                    // Student details
                    String name = "Mohana";
                    int roll = 101;

                    // Marks of three subjects
                    int marks1 = 80;
                    int marks2 = 90;
                    int marks3 = 85;

                    // Calculating total marks
                    int total = marks1 + marks2 + marks3;

                    // Calculating percentage
                    double percentage = total / 3.0;

                    // Displaying student information
                    System.out.println("Name: " + name);
                    System.out.println("Roll Number: " + roll);
                    System.out.println("Total: " + total);
                    System.out.println("Percentage: " + percentage);

                    break;

                // ---------------- CASE 2 ----------------
                case 2:

                    // Reading a number from the user
                    int number = sc.nextInt();

                    // Checking whether the number is divisible by 2
                    if(number % 2 == 0)
                    {
                        System.out.println("Even");
                    }
                    else
                    {
                        System.out.println("Odd");
                    }

                    break;

                // ---------------- CASE 3 ----------------
                case 3:

                    // Reading three numbers
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();

                    // Finding the largest number
                    if(a > b && a > c)
                    {
                        System.out.println(a);
                    }
                    else if(b > c)
                    {
                        System.out.println(b);
                    }
                    else
                    {
                        System.out.println(c);
                    }

                    break;

                // ---------------- CASE 4 ----------------
                case 4:

                    // Reading percentage
                    int per = sc.nextInt();

                    // Checking the grade
                    if(per >= 90)
                    {
                        System.out.println("Grade A");
                    }
                    else if(per >= 75)
                    {
                        System.out.println("Grade B");
                    }
                    else if(per >= 50)
                    {
                        System.out.println("Grade C");
                    }
                    else
                    {
                        System.out.println("Fail");
                    }

                    break;

                // ---------------- CASE 5 ----------------
                case 5:

                    // Reading day number
                    int day = sc.nextInt();

                    // Switch to find the day
                    switch(day)
                    {
                        case 1:
                            System.out.println("Monday");
                            break;

                        case 2:
                            System.out.println("Tuesday");
                            break;

                        case 3:
                            System.out.println("wednesday");
                            break;

                        case 4:
                            System.out.println("Thursday");
                            break;

                        case 5:
                            System.out.println("friday");
                            break;

                        case 6:
                            System.out.println("saturday");
                            break;

                        case 7:
                            System.out.println("sunday");
                            break;

                        // If the number is not between 1 and 7
                        default:
                            System.out.println("Invalid");
                    }

                    break;

                // ---------------- CASE 6 ----------------
                case 6:

                    // Reading the limit
                    int l = sc.nextInt();

                    // Printing numbers from 1 to l
                    for(int i = 1; i <= l; i++)
                    {
                        System.out.println(i);
                    }

                    break;

                // ---------------- CASE 7 ----------------
                case 7:

                    // Reading n
                    int n = sc.nextInt();

                    // Variable to store the sum
                    int sum = 0;

                    // Adding numbers from 1 to n
                    for(int i = 1; i <= n; i++)
                    {
                        sum = sum + i;
                    }

                    // Displaying the sum
                    System.out.println(sum);

                    break;

                // ---------------- CASE 8 ----------------
                case 8:

                    // Reading the number for multiplication table
                    int num = sc.nextInt();

                    // Printing table from 1 to 10
                    for(int i = 1; i <= 10; i++)
                    {
                        System.out.println(num + " x " + i + " = " + num * i);
                    }

                    break;

                // ---------------- CASE 9 ----------------
                case 9:

                    // Reading the number of Fibonacci terms
                    int k = sc.nextInt();

                    // First two Fibonacci numbers
                    int d = 0;
                    int e = 1;

                    // Printing Fibonacci series
                    for(int i = 1; i <= k; i++)
                    {
                        System.out.print(d + " ");

                        // Calculate next Fibonacci number
                        int f = d + e;

                        // Move values forward
                        d = e;
                        e = f;
                    }

                    break;

                // ---------------- CASE 10 ----------------
                case 10:

                    // Calling factorial() method
                    // Here factorial of 5 is calculated
                    System.out.println(su.factorial(5));

                    break;

                // ---------------- CASE 11 ----------------
                case 11:

                    // Calling isPrime() method
                    // Here we check whether 5 is prime
                    System.out.println(su.isPrime(5));

                    break;

                // ---------------- CASE 12 ----------------
                case 12:

                    // Calling maximum() method
                    // Finding maximum between 5 and 6
                    System.out.println(su.maximum(5, 6));

                    break;

                // ---------------- CASE 13 ----------------
                case 13:

                    // Calling areaOfCircle() method
                    // Finding area for radius 2.3
                    System.out.println(su.areaOfCircle(2.3));

                    break;

                // ---------------- CASE 14 ----------------
                case 14:

                    // Exit message
                    System.out.println("Thank You");

                    break;

                // If user enters a number other than 1-14
                default:

                    System.out.println("Invalid Choice");
            }

        // Continue the menu until user chooses 14
        } while(choice != 14);

        // Closing the Scanner object
        sc.close();
    }
}
