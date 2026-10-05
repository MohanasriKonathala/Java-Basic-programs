 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

    public class JDBCUpdate {

        public static void main(String[] args) {

            String url = "jdbc:mysql://localhost:3306/jdbc_demo";
            String username = "root";
            String password = "mohanasri";

            try {
                Connection con = DriverManager.getConnection(url, username, password);

                String sql = "UPDATE students SET marks = ? WHERE id = ?";

                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, 95);
                ps.setInt(2, 101);

                int rows = ps.executeUpdate();

                System.out.println(rows + " student record updated successfully!");

                ps.close();
                con.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
