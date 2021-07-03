package Models.Sites;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connect.QLBanHangConnect;

public class menuHome {
	Connection conn = null;

	public List<menuModel> queryPrCategory() throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select * from prCategory";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<menuModel> list = new ArrayList<>();
		while (rs.next()) {
			menuModel menu = new menuModel();
			menu.setPrCategory_id(rs.getString("prCategory_id"));
			menu.setName_prCategory(rs.getString("name_prCategory"));
			list.add(menu);

		}
		return list;

	}

	public List<categoryModel> queryCategory(String prCategory_id) {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select nameCategory,Category_id,Category.prCategory_id from Category, prCategory where prCategory.prCategory_id=Category.prCategory_id and prCategory.prCategory_id='"+prCategory_id+"'";
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
