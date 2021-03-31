package day21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;

public class TransactionDemo {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		// step 2 - Establish a connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/<dbname>", "<username>", "<password>");

		System.out.println(con);

		con.setAutoCommit(false);

		Statement st = con.createStatement();
		Savepoint spFirst = null;
		try {
			st.executeUpdate("update users set flag=1 where uid=1");
			spFirst = con.setSavepoint("first");
			st.executeUpdate("update users set flag=1 where uuid=2");
			con.commit();
		} catch (Exception e) {
			con.rollback(spFirst);
			con.commit();
		}

	}
}
