package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Register {

	public static void dangki(Connection conn, UserModel register) {
		String sql="insert into UserSite(fullname, username, password, email, phone) values (?,?,?,?,?)";
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setString(1, register.getFullname());
			ps.setString(2, register.getUsername());
			ps.setString(3,register.getPassword());
			ps.setString(4,register.getEmail());
			ps.setString(5,register.getPhone());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static UserModel Login(Connection conn, String username, String password) throws SQLException {
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
			
	}
}
