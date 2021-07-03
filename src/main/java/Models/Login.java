package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
	
/*public static UserModel Login(Connection conn, String username, String password) throws SQLException {
	String sql="Select username, password, fullname, email, phone from UserSite where username=? and password=?";
	
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, password);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			UserModel user=new UserModel();
			user.setUsername(username);
			user.setPassword(password);
			
			return user;
		}
		return null;
		
}*/
public static UserModel LoginUser(Connection conn, String username) throws SQLException {
	String sql="Select * from UserSite where username=? ";
	
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, username);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			 String password = rs.getString("password");
			 String fullname=rs.getString("fullname");
			UserModel user=new UserModel();
			user.setUsername(username);
			user.setPassword(password);
			user.setFullname(fullname);
			
			return user;
		}
		return null;
		
}
public static UserModel LoginPass(Connection conn, String password) throws SQLException {
	String sql="Select * from UserSite where password=? ";
	
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, password);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			String fullname=rs.getString("fullname");
			String username=rs.getString("username");
			UserModel user=new UserModel();
			user.setPassword(password);
			user.setUsername(username);
			user.setFullname(fullname);
			
			return user;
		}
		return null;
		
}
}
