package Models.Sites;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connect.QLBanHangConnect;

public class categoryHome {
	Connection conn = null;

	public List<categoryModel> queryProductCategory(String Category_id) {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select * from Category where prCategory_id='" + Category_id + "'";
		ArrayList<categoryModel> list = new ArrayList<>();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				categoryModel category = new categoryModel();
				category.setCategory_id(rs.getString("Category_id"));
				category.setNameCategory(rs.getString("nameCategory"));
				category.setPrCategory_id(rs.getString("prCategory_id"));

				list.add(category);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
}
