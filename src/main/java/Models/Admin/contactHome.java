package Models.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connect.QLBanHangConnect;
import Models.Sites.contactModel;

public class contactHome {
	Connection conn = null;

	public List<contactModel> listProduct() throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();

		String sql = "select * from Contact";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<contactModel> list = new ArrayList<contactModel>();
		while (rs.next()) {
			contactModel product = new contactModel();
			String fullname = rs.getString("fullname");
			product.setFullname(fullname);
			product.setEmail(rs.getString("email"));
			product.setPhone(rs.getString("phone"));
			product.setContent(rs.getString("content"));
			product.setStatus(rs.getInt("statuss"));
			list.add(product);
		}
		return list;

	}
	public int kqContact() throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();

		String sql = "select count(fullname) as kq from Contact where statuss=1";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		int count = 0;
		while (rs.next()) {
			count = rs.getInt(1);
		}
		return count;

	}

}
