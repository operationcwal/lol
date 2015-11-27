package Date;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAction {
	private static DBAction instance;
	private Connection con;

	public DBAction() {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "hr" , "hr");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public static DBAction getInstance(){
		if(instance == null)
			instance = new DBAction();
		return instance;
	}
	public Connection getConnection(){
		return con;
	}
}
