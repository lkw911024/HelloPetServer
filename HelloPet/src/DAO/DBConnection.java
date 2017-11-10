/**
 * 
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 * @author ael
 *
 */
public class DBConnection {
	private Connection conn;
	private String url;
	private String dbId;
	private String dbPwd;
	private static DBConnection instance = new DBConnection();
	
	private DBConnection()
	{
		this.url = "jdbc:mysql://localhost:3306/hellopet";
		this.dbId = "helloadmin";
		this.dbPwd = "hellopet";
		connect();
	}
	
	private void connect()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, dbId, dbPwd);
			
			System.out.println("Database 연결성공!!!!!!!!!!!!!");
		}
		catch(ClassNotFoundException ce){
			System.out.println(ce.getMessage());
		}
		catch(SQLException se){
			System.out.println(se.getMessage());
		}
	}

	public Connection getConn()
	{
		return this.conn;
	}
	
	public static DBConnection getInstance()
	{
		return instance;
	}
}
