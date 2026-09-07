package Demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class StudentApp {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/college";
		String username = "root";
		String password = "Mercy@0000";
		try {
			Connection con = DriverManager.getConnection(
					url, username, password
					);
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM student";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String email = rs.getString("email");
				System.out.println(id+" "+name+" "+age+" "+email);
			}
					
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
