 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

    public class JDBCDemo {

        public static void main(String[] args) {

            String url = "jdbc:mysql://localhost:3306/jdbc_demo";
            String username = "root";
            String password = "mohanasri";

            try {
                Connection con = DriverManager.getConnection(url, username, password);

                System.out.println("Database connected successfully!");

                String sql = "INSERT INTO students (id, name, branch, marks) VALUES (?, ?, ?, ?)";

                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, 101);
                ps.setString(2, "Mohana");
                ps.setString(3, "CSE-AIML");
                ps.setInt(4, 92);

                int rows = ps.executeUpdate();

                System.out.println(rows + " student record inserted successfully!");

                ps.close();
                con.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
