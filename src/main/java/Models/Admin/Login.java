package Models.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
	
public static UserAdmin LoginUser(Connection conn, String username) throws SQLException {
	String sql="Select * from admins where username=? ";
	
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, username);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			 String password = rs.getString("password");
			 String fullname=rs.getString("fullname");
			 UserAdmin user=new UserAdmin();
			user.setUsername(username);
			user.setPassword(password);
			user.setFullname(fullname);
			
			return user;
		}
		return null;
		
}
public static UserAdmin LoginPass(Connection conn, String password) throws SQLException {
	String sql="Select * from admins where password=? ";
	
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, password);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			String fullname=rs.getString("fullname");
			String username=rs.getString("username");
			UserAdmin user=new UserAdmin();
			user.setPassword(password);
			user.setUsername(username);
			user.setFullname(fullname);
			
			return user;
		}
		return null;
		
}
}
