package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

	public static final String url="jdbc:mysql://localhost:3306/myy";
	public static final String un="root";
	public static final String pw="root";
	public static Connection con=null;
	private DAO(){
	//private constructor for singleton	
	}
	
	public static Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			return con=DriverManager.getConnection(url, un, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}
