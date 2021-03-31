package day21;

import java.sql.*;

public class Demo2 {
	public static void main(String[] args) throws Exception {
		// Step 1: Load or register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2: Establish a connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/<dbname>", "<username>", "<password>");

		System.out.println("Connection: " + conn);

		// Step 3: Create a statement
		Statement statement = conn.createStatement();

		// Step 4: Write SQL query
		String query = "insert into users values(1, 'ramu', 'somu', 0);";

		// Step 5: Execute query
		int rowsInserted = statement.executeUpdate(query);

		System.out.println("Number of rows inserted: " + rowsInserted);

		String query1 = "select * from users;";
		boolean b = statement.execute(query1);
		System.out.println(query1 + " query returned result set: " + b);

		String query2 = "select username from users;";
		boolean b2 = statement.execute(query2);
		System.out.println(query2 + " query returned result set: " + b2);

		String query3 = "update users set flag = 1;";
		boolean b3 = statement.execute(query3);
		System.out.println(query3 + " query returned result set: " + b3);
	}
}
