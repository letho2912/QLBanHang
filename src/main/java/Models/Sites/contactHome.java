package Models.Sites;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Connect.QLBanHangConnect;

public class contactHome {
	public static void insertContact(contactModel contact) throws SQLException {
		new QLBanHangConnect();
		Connection conn = QLBanHangConnect.getJDBCConnection();

		String sql = "Insert into Contact(fullname ,email ,phone ,content)  values (?,?,?,?)";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, contact.getFullname());
		pstm.setString(2, contact.getEmail());
		pstm.setString(3, contact.getPhone());
		pstm.setString(4, contact.getContent());
		

		pstm.executeUpdate();
	}
}
