package day7;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class MySQLConnection {
	    public static void main(String[] args) {
	        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database_name";
	        String username = "your_username";
	        String password = "your_password";

	        try {
	            // Load MySQL JDBC Driver (optional for newer JDBC versions)
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Establish the connection
	            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

	            System.out.println("Connected to MySQL database!");

	            // Always close the connection
	            connection.close();

	        } catch (ClassNotFoundException e) {
	            System.out.println("MySQL JDBC Driver not found.");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.out.println("Connection failed.");
	            e.printStackTrace();
	        }
	    }
	}


}
