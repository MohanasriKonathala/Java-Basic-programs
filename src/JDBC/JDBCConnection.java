 import java.sql.Connection;
import java.sql.DriverManager;

    public class JDBCConnection {

        public static void main(String[] args) {

            String url = "jdbc:mysql://localhost:3306/jdbc_demo";
            String username = "root";
            String password = "mohanasri";

            try {
                Connection con = DriverManager.getConnection(url, username, password);

                System.out.println("Database connected successfully!");

                con.close();

            } catch (Exception e) {
                System.out.println("Connection failed!");
                e.printStackTrace();
            }
        }
    }
