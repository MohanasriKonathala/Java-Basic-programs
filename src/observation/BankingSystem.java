package tasks;
import java.util.Scanner;

public class StudentUtilityProgram {
    int factorial(int g){
        int fact=1;

        for(int i=1;i<=g;i++)
        {
            fact=fact*i;
        }

        return fact;
    }
    double areaOfCircle(double radius)
    {
        return 3.14 * radius * radius;
    }
    boolean isPrime(int j)
    {
        if(j <= 1)
        {
            return false;
        }

        for(int i = 2; i <= j / 2; i++)
        {
            if(j % i == 0)
            {
                return false;
            }
        }

        return true;
    }
    int maximum(int a, int b)
    {
        if(a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public static void main(String[] args) {
        StudentUtilityProgram su=new StudentUtilityProgram();

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

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

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    String name = "Mohana";
                    int roll = 101;
                    int marks1 = 80;
                    int marks2 = 90;
                    int marks3 = 85;

                    int total = marks1 + marks2 + marks3;
                    double percentage = total / 3.0;

                    System.out.println("Name: " + name);
                    System.out.println("Roll Number: " + roll);
                    System.out.println("Total: " + total);
                    System.out.println("Percentage: " + percentage);
                    break;

                case 2:
                    int number= sc.nextInt();
                    if(number % 2 == 0)
                    {
                        System.out.println("Even");
                    }
                    else
                    {
                        System.out.println("Odd");
                    }
                    break;

                case 3:
                    int a=sc.nextInt();
                    int b= sc.nextInt();
                    int c=sc.nextInt();
                    if(a>b && a>c){
                        System.out.println(a);
                    }
                    else if(b>c)
                    {
                        System.out.println(b);
                    }
                    else
                    {
                        System.out.println(c);
                    }
                    break;

                case 4:
                    int per= sc.nextInt();
                    if(per>=90)
                    {
                        System.out.println("Grade A");
                    }
                    else if(per>=75)
                    {
                        System.out.println("Grade B");
                    }
                    else if(per>=50)
                    {
                        System.out.println("Grade C");
                    }
                    else {
                        System.out.println("Fail");
                    }
                    break;
                case 5:
                    int day= sc.nextInt();
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
                        default:
                            System.out.println("Invalid");
                    }
                    break;
                case 6:
                    int l= sc.nextInt();

                    for (int i=1;i<=l;i++)
                    {
                        System.out.println(i);
                    }
                    break;
                case 7:
                    int n= sc.nextInt();
                    int sum=0;

                    for(int i=1;i<=n;i++)
                    {
                        sum=sum+i;
                    }

                    System.out.println(sum);
                    break;
                case 8:
                    int num= sc.nextInt();
                    for(int i=1;i<=10;i++)
                    {
                        System.out.println(num+" x "+i+" = "+num*i);
                    }
                    break;
                case 9:
                    int k=sc.nextInt();
                    int d=0,e=1;

                    for(int i=1;i<=k;i++)
                    {
                        System.out.print(d+" ");
                        int f=d+e;
                        d=e;
                        e=f;
                    }
                    break;
                case 10:
                    System.out.println(su.factorial(5));
                    break;
                case 11:
                    System.out.println(su.isPrime(5));
                    break;
                case 12:
                    System.out.println(su.maximum(5,6));
                    break;
                case 13:
                    System.out.println(su.areaOfCircle(2.3));
                    break;

                case 14:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

        } while(choice != 14);

        sc.close();
    }
}
