package Models.Sites;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Connect.QLBanHangConnect;

public class detailHome {
	Connection conn = null;

	public List<detailModel> queryAnh(String product_id) throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select * from imgProduct where Product_id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		List<detailModel> list = new ArrayList<>();
		ps.setString(1, product_id);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			detailModel detail = new detailModel();
			detail.setName_img(rs.getString("name_img"));
			detail.setImg(rs.getString("img"));
			detail.setProduct_id(product_id);

			list.add(detail);

		}
		return list;

	}

	public List<productModel> queryProductSame(String product_id) throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select top 4* from Product where Category_id=(select Category_id from Product where  Product_id=?) order by newid()";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, product_id);
		ResultSet rs = ps.executeQuery();
		List<productModel> list = new ArrayList<>();
		while (rs.next()) {
			@SuppressWarnings("unused")
			NumberFormat currentLocale = NumberFormat.getInstance();
			Locale localeEN = new Locale("en", "EN");
			NumberFormat en = NumberFormat.getInstance(localeEN);

			String name_Product = rs.getString("nameProduct");
			int price = rs.getInt("price");
			String str1 = en.format(price);
			int sale = rs.getInt("sale");
			String str2 = en.format(sale);
			String img = rs.getString("img");
			productModel prModel = new productModel();
			prModel.setName_product(name_Product);
			prModel.setSale(sale);
			prModel.setStr1(str1);
			prModel.setStr2(str2);
			prModel.setImg(img);
			prModel.setCategory_id(rs.getString("Category_id"));
			prModel.setProduct_id(rs.getString("Product_id"));

			list.add(prModel);
		}
		return list;

	}
	public List<productModel> queryProductSale(String Str2) throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select top 6* from Product where sale>0 order by newid()";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<productModel> list = new ArrayList<>();
		while (rs.next()) {
			@SuppressWarnings("unused")
			NumberFormat currentLocale = NumberFormat.getInstance();
			Locale localeEN = new Locale("en", "EN");
			NumberFormat en = NumberFormat.getInstance(localeEN);

			String name_Product = rs.getString("nameProduct");
			int price = rs.getInt("price");
			String str1 = en.format(price);
			int sale = rs.getInt("sale");
			String str2 = en.format(sale);
			String img = rs.getString("img");
			productModel prModel = new productModel();
			prModel.setName_product(name_Product);
			prModel.setSale(sale);
			prModel.setStr1(str1);
			prModel.setStr2(str2);
			prModel.setImg(img);
			prModel.setCategory_id(rs.getString("Category_id"));
			prModel.setProduct_id(rs.getString("Product_id"));

			list.add(prModel);
		}
		return list;

	}
}
