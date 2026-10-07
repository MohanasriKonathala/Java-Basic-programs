//to import database related classes & Scannerclass for input from java library

import java.sql.*;
import java.util.Scanner;

// public so it can be accessed anywhere irrespective of class,package

public class StudentManagement {

    // url is the databse address jdbc-javadatabase, mysql- mysql databse used, localhost- my computer, 3306-default port,database name-jdbc_name
    //static variable to use variable or method without creating object
    //different port no used for different programs so default one for mysql is 3306

    static String url = "jdbc:mysql://localhost:3306/jdbc_demo";

    //mysql login username and password if we give this then only we can have the access to connect to our database

    static String username = "root";
    static String password = "mohanasri";

    // connection is jdbc interface to get connection we use this if not it throws exception

    static Connection getConnection() throws SQLException {

       //driver manager is the class manges connections and get connection() establish connection

        return DriverManager.getConnection(url, username, password);
    }
    // INSERT - Add Student to add student in the record Scanner sc to input student records

    static void insertStudent(Scanner sc) {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        //sql query to insert new student '?' represents value are given later

        String sql = "INSERT INTO students (id, name, branch, marks) VALUES (?, ?, ?, ?)";

        //database connection and preparedstatement object created to execute sql query used to set safely the '?' values

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

           //gives values to variables

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, branch);
            ps.setInt(4, marks);

            //used to execute queries insert/delete/update and returns number of affected rows

            int rows = ps.executeUpdate();

            System.out.println(rows + " student inserted successfully!");

            //if any errors comes in database operation it comes here

        } catch (SQLException e) {
            System.out.println("Insert failed!");

            //shows actual error details console


            e.printStackTrace();
        }
    }

    // SELECT - View Students and display students

    static void viewStudents() {

        //to retreive data from all columns from table called students

        String sql = "SELECT * FROM students";

        try (Connection con = getConnection();

             // to execute sql query view students and result show the results from the database

             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n========== STUDENT RECORDS ==========");

            //rs.next() row by row checking

            while (rs.next()) {
                System.out.println("ID     : " + rs.getInt("id"));
                System.out.println("Name   : " + rs.getString("name"));
                System.out.println("Branch : " + rs.getString("branch"));
                System.out.println("Marks  : " + rs.getInt("marks"));
                System.out.println("-------------------------------------");
            }

            // if any errors exception is handled here for view students

        } catch (SQLException e) {
            System.out.println("Unable to fetch records!");
            e.printStackTrace();
        }
    }

    // UPDATE - Update Marks
    static void updateStudent(Scanner sc) {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        System.out.print("Enter New Marks: ");
        int marks = sc.nextInt();

        // update marks using student id

        String sql = "UPDATE students SET marks = ? WHERE id = ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, marks);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            // if  execution happens successfully rows update will become 1 if not that means rows are not executed

            if (rows > 0) {
                System.out.println("Student marks updated successfully!");
            } else {
                System.out.println("Student not found!");
            }

        } catch (SQLException e) {
            System.out.println("Update failed!");
            e.printStackTrace();
        }
    }

    // DELETE - Delete Student from id
    static void deleteStudent(Scanner sc) {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        String sql = "DELETE FROM students WHERE id = ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Student not found!");
            }

        } catch (SQLException e) {
            System.out.println("Delete failed!");
            e.printStackTrace();
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        //do while loop so it executes atleat one time

        do {
            System.out.println("\n======================================");
            System.out.println("       STUDENT MANAGEMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("1. INSERT Student");
            System.out.println("2. SELECT / View Students");
            System.out.println("3. UPDATE Marks");
            System.out.println("4. DELETE Student");
            System.out.println("5. EXIT");
            System.out.println("======================================");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    insertStudent(sc);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent(sc);
                    break;
                case 4:
                    deleteStudent(sc);
                    break;
                case 5:
                    System.out.println("Program exited successfully!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
        sc.close();
    }
}
