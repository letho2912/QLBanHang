package Models.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connect.QLBanHangConnect;
import Models.Sites.categoryModel;
import Models.Sites.productModel;

public class categoryHome {
	public List<categoryModel> queryCategory() throws SQLException {
		new QLBanHangConnect();
		Connection conn = QLBanHangConnect.getJDBCConnection();

		String sql = "select * from Category";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<categoryModel> list = new ArrayList<>();
		while (rs.next()) {
			categoryModel category = new categoryModel();
			category.setId(rs.getInt("id"));
			category.setCategory_id(rs.getString("Category_id"));
			category.setNameCategory(rs.getString("nameCategory"));
			category.setPrCategory_id(rs.getString("prCategory_id"));

			list.add(category);
		}

		return list;

	}

	/*public static void updateCategory(Connection conn, categoryModel category, String category_id) throws SQLException {

		String sql = "Update Category set nameCategory=?, prCategory_id=?,statuss=? where Category_id=? ";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, category.getNameCategory());
		pstm.setString(2, category.getPrCategory_id());
		pstm.setInt(3, category.getStatus());
		pstm.setString(4, category.getCategory_id());

		

		pstm.executeUpdate();
	}
	public static categoryModel findCategory(Connection conn, String category_id) throws SQLException {

		String sql = "select * from Category where Category_id=?";
		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, category_id);
		ResultSet rs = pstm.executeQuery();
		while (rs.next()) {
			String prCategory_id = rs.getString("prCategory_id");
			categoryModel product = new categoryModel();
		
			product.setNameCategory(rs.getString("nameCategory"));
			product.setCategory_id(category_id);
			product.setPrCategory_id(prCategory_id);
			product.setStatus(rs.getInt("status"));

			return product;
		}
		return null;

	}*/
}
