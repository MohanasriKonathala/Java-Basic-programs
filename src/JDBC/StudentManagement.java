import java.sql.*;
import java.util.Scanner;

public class StudentManagement {

    static String url = "jdbc:mysql://localhost:3306/jdbc_demo";
    static String username = "root";
    static String password = "mohanasri";


    // Database Connection
    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }


    // INSERT - Add Student
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

        String sql = "INSERT INTO students (id, name, branch, marks) VALUES (?, ?, ?, ?)";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, branch);
            ps.setInt(4, marks);

            int rows = ps.executeUpdate();

            System.out.println(rows + " student inserted successfully!");

        } catch (SQLException e) {
            System.out.println("Insert failed!");
            e.printStackTrace();
        }
    }


    // SELECT - View Students
    static void viewStudents() {

        String sql = "SELECT * FROM students";

        try (Connection con = getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n========== STUDENT RECORDS ==========");

            while (rs.next()) {

                System.out.println("ID     : " + rs.getInt("id"));
                System.out.println("Name   : " + rs.getString("name"));
                System.out.println("Branch : " + rs.getString("branch"));
                System.out.println("Marks  : " + rs.getInt("marks"));
                System.out.println("-------------------------------------");
            }

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

        String sql = "UPDATE students SET marks = ? WHERE id = ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, marks);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

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


    // DELETE - Delete Student
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
