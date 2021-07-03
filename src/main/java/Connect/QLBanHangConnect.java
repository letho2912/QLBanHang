package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class QLBanHangConnect {
	 public static Connection getJDBCConnection() {
	        Connection connection = null;
	        try {
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            String user = "sa";
	            String pass = "2912";
	            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=QLBanHang";
	            connection = DriverManager.getConnection(url, user, pass);
	            
	        } catch (ClassNotFoundException | SQLException ex) {
	            ex.printStackTrace();
	        }

	        return connection;
	    
	    }
	 public static Connection getConnection() 
	            throws ClassNotFoundException, SQLException {

	      // Ở đây tôi kết nối tới Oracle Database.
	      // (Bạn có thể thay đổi sử dụng database khác).
	      //return OracleConnUtils.getOracleConnection();
	       
	      // return OracleConnUtils.getOracleConnection();
	      // return MySQLConnUtils.getMySQLConnection();
	      // return SQLServerConnUtils_JTDS.getSQLServerConnection_JTDS();
	      return QLBanHangConnect.getJDBCConnection();
	      // return PostGresConnUtils.getPostGresConnection();
	  }
	   
	 public static void closeQuietly(Connection conn) {
	      try {
	          conn.close();
	      } catch (Exception e) {
	      }
	  }

	  public static void rollbackQuietly(Connection conn) {
	      try {
	          conn.rollback();
	      } catch (Exception e) {
	      }
	  }
	 
}
