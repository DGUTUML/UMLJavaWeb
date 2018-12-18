package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil{
	static Connection conn = null;
	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String ip ="jdbc:oracle:thin:@118.89.60.90:1521:orcl";
	static String userName ="uml";
	static String password = "123456";
	public JDBCUtil() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 连接数据库方法,返回Connection对象
	 */
	public static Connection getConnection() {
		System.out.println("driver:"+driver);
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(ip, userName, password);
			System.out.println("连接成功!");
		} catch ( SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 * 关闭数据库方法，无返回值
	 */
	public static void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
				System.out.println("关闭成功!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
