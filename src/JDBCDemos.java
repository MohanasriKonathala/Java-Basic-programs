 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

    public class JDBCDemos {

        public static void main(String[] args) {

            String url = "jdbc:mysql://localhost:3306/jdbc_demo";
            String username = "root";
            String password = "mohanasri";

            try {
                Connection con = DriverManager.getConnection(url, username, password);

                System.out.println("Database connected successfully!");

                String sql = "SELECT * FROM students";

                Statement stmt = con.createStatement();

                ResultSet rs = stmt.executeQuery(sql);

                System.out.println("\nStudent Records:");
                System.out.println("-------------------------");

                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("Name: " + rs.getString("name"));
                    System.out.println("Branch: " + rs.getString("branch"));
                    System.out.println("Marks: " + rs.getInt("marks"));
                    System.out.println("-------------------------");
                }

                rs.close();
                stmt.close();
                con.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
